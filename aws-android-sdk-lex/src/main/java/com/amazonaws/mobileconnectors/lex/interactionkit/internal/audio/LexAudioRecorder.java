/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio;

import android.content.Context;
import android.media.AudioRecord;
import android.os.SystemClock;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.VoiceActivityDetector;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.VoiceActivityDetector.VADState;
import com.google.common.base.Preconditions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.TimeUnit;

/**
 * An AudioRecorder used to record audio and write audio data to an OutputStream
 * that also supports voice activity detection and timeouts.
 */
public class LexAudioRecorder extends AudioRecorder implements ChunkedAudioSource {

    /**
     * The size of the each sample in bit.
     */
    public static final int SAMPLE_SIZE = 16;
    /**
     * Audio encoder for compression.
     */
    private final AudioEncoder mAudioEncoder;
    /**
     * Voice Activity Detector instance.
     */
    private final VoiceActivityDetector mVAD;
    /**
     * Stream timeout.
     */
    private final AudioTimeouts mAudioTimeouts;
    /**
     * Time when the recorder started recording.
     */
    private long mRecordStartTime;

    /**
     * Stream to be read by wake word service.
     */
    private PipedInputStream mConsumerStream;

    /**
     * Stream used to output recorded audio.
     */
    private PipedOutputStream mProducerStream;

    /**
     * The state of the audio recorder before recording the next sample.
     */
    private VADState state;

    /**
     * The state of the audio recorder after recording a sample.
     */
    private VADState currentState;

    /**
     * Fired when no speech have been detected for the timeout duration set.
     */
    private boolean noSpeechTimeoutFired;

    /**
     * Fired when speech is ongoing for longer than the timeout duration set.
     */
    private boolean maxSpeechTimeoutFired;

    /**
     * The time the last state event occurred.
     */
    private long lastEventTime;

    /**
     * Create a new recorder with given context, media type, sample rate,
     * channel configuration, audio format, buffer size. VAD and stream timeout.
     *
     * @param context the context used to access the AudioRecord framework.
     * @param audioEncoder the audio encoder to use for compression.
     * @param vad the VAD used for startpointing and endpointing.
     * @param audioTimeouts the audio timeouts used while recording audio.
     * @param recorderPositionNotificationPeriod the notification period for
     *            updating the recorder position in milliseconds.
     * @throws Exception if failed to create audio recorder instance.
     */
    LexAudioRecorder(final Context context, final AudioEncoder audioEncoder,
            final VoiceActivityDetector vad, final AudioTimeouts audioTimeouts,
            final int recorderPositionNotificationPeriod) throws Exception {
        this(context, audioEncoder, vad, audioTimeouts,
                AudioRecord.getMinBufferSize(AudioRecorder.DEFAULT_SAMPLE_RATE,
                        AudioRecorder.DEFAULT_CHANNELS,
                        AudioRecorder.DEFAULT_FORMAT),
                recorderPositionNotificationPeriod);
    }

    /**
     * Create a new audio recorder with a custom record buffer size. Used for
     * testing.
     *
     * @param context the Context used to access the AudioRecord framework.
     * @param audioEncoder the audio encoder to use for compression.
     * @param vad the VAD to be used for startpointing and endpointing.
     * @param audioTimeouts the audio timeouts used while recording audio.
     * @param numSamplesPerRead the number of samples to request when recording
     *            audio.
     * @param recorderPositionNotificationPeriod the notification period for
     *            updating the recorder position in milliseconds.
     * @throws Exception if failed to create audio recorder instance.
     */
    protected LexAudioRecorder(final Context context, final AudioEncoder audioEncoder,
            final VoiceActivityDetector vad, final AudioTimeouts audioTimeouts,
            final int numSamplesPerRead, final int recorderPositionNotificationPeriod)
            throws Exception {
        super(context, audioEncoder.getMediaType(), recorderPositionNotificationPeriod,
                AudioRecorder.DEFAULT_SAMPLE_RATE, AudioRecorder.DEFAULT_CHANNELS,
                AudioRecorder.DEFAULT_FORMAT);

        mAudioEncoder = Preconditions.checkNotNull(audioEncoder, "AudioEncoder cannot be null");
        mVAD = Preconditions.checkNotNull(vad, "VAD cannot be null");
        mAudioTimeouts = Preconditions.checkNotNull(audioTimeouts, "Audio timeouts cannot be null");

        setupStreamPipe();
    }

    /**
     * Create a new audio recorder with an existing AudioRecord object.
     *
     * @param context the Context used to access the AudioRecord framework.
     * @param audioEncoder the audio encoder to use for compression.
     * @param vad the VAD to be used for startpointing and endpointing.
     * @param audioTimeouts the audio timeouts used while recording audio.
     * @param numSamplesPerRead the number of samples to request when recording
     *            audio.
     * @param recorderPositionNotificationPeriod the notification period for
     *            updating the recorder position in milliseconds.
     * @param audioRecord the AudioRecord to use for audio recording.
     * @throws Exception if failed to create audio recorder instance.
     */
    public LexAudioRecorder(final Context context, final AudioEncoder audioEncoder,
            final VoiceActivityDetector vad, final AudioTimeouts audioTimeouts,
            final int numSamplesPerRead, final int recorderPositionNotificationPeriod,
            final AudioRecord audioRecord) throws Exception {
        super(context, audioEncoder.getMediaType(), numSamplesPerRead,
                recorderPositionNotificationPeriod, audioRecord);
        mAudioEncoder = Preconditions.checkNotNull(audioEncoder, "AudioEncoder cannot be null");
        mVAD = Preconditions.checkNotNull(vad, "VAD cannot be null");
        mAudioTimeouts = Preconditions.checkNotNull(audioTimeouts, "Audio timeouts cannot be null");

        setupStreamPipe();
    }

    @Override
    public int getChunkSize() {
        return mAudioEncoder.getPacketSize();
    }

    @Override
    public InputStream getConsumerStream() {
        return mConsumerStream;
    }

    /**
     * Set up the producer and consumer stream.
     *
     * @throws AudioSourceException thrown if failed to open consumer stream.
     */
    protected void setupStreamPipe() throws AudioSourceException {
        // Calculate pipe size.
        final int maxTotalAudioLengthInMills = mAudioTimeouts.getNoSpeechTimeout()
                + mAudioTimeouts.getMaxSpeechTimeout();
        final int pipeSize = AudioRecorder.DEFAULT_SAMPLE_RATE
                * (int) TimeUnit.MILLISECONDS.toSeconds(maxTotalAudioLengthInMills)
                * (SAMPLE_SIZE / Byte.SIZE);

        // Set up the audio stream pipe.
        mProducerStream = new PipedOutputStream();
        try {
            mConsumerStream = new PipedInputStream(mProducerStream, pipeSize);
        } catch (final IOException e) {
            throw new AudioSourceException("Error openning consumer stream", e);
        }
    }

    /**
     * Method to setup, start the recorder, and read data. When silence is
     * detected or the recorder is stopped by the user, clean up resources.
     *
     * @throws Exception when there are problems while recording audio.
     */
    @Override
    public void startRecording() throws Exception {
        state = VADState.NOT_STARTPOINTED;
        noSpeechTimeoutFired = false;
        maxSpeechTimeoutFired = false;
        mRecordStartTime = SystemClock.elapsedRealtime();
        lastEventTime = mRecordStartTime;

        super.startRecording();
    }

    /**
     * Determine whether recording should continue.
     *
     * @return whether recording should continue.
     */
    @Override
    protected boolean isInValidStateToContinueRecording() {
        return !isCancelled() && state != VADState.ENDPOINTED;
    }

    /**
     * Set the current audio recording state.
     */
    @Override
    protected void setPostRecordingFields() {
        currentState = state;
    }

    /**
     * Performs additional audio processing after a sample has been recorded.
     * Compress audio samples and send to output stream. Update recorder state
     * based on audio sample recorded.
     *
     * @param numSamplesRead number of samples read.
     * @param buffer stores the audio samples.
     * @param listener listens to audio recording events.
     * @throws BluefrontAndroidException when there is a problem pushing to
     *             output stream.
     */
    @Override
    protected void postAudioRecordingProcessing(final int numSamplesRead,
            final short[] buffer, final AudioSourceListener listener) throws AmazonClientException {
        if (numSamplesRead > 0) {
            // Process the samples through the VAD and get current VAD state.
            currentState = mVAD.processSamples(buffer, numSamplesRead);

            // Encode audio for sending to service.
            final byte[] compressedBuffer = mAudioEncoder.encode(buffer, numSamplesRead);

            try {
                mProducerStream.write(compressedBuffer, 0, compressedBuffer.length);
                mProducerStream.flush();
            } catch (final IOException e) {
                throw new AudioSourceException(
                        "Error writing to audio upload output stream", e);
            }
        }

        // Use VAD state to determine which callbacks need to be invoked on the
        // listener.
        // And also the logic here about timeouts will also impact the pipe
        // size.
        final long timeSinceLastEvent = SystemClock.elapsedRealtime() - lastEventTime;
        if (state == VADState.NOT_STARTPOINTED) {
            if (currentState == VADState.STARTPOINTED) {
                Log.v(TAG, "Speech detected");
                listener.onBeginningOfSpeech();
            } else if (!noSpeechTimeoutFired
                    && timeSinceLastEvent >= mAudioTimeouts.getNoSpeechTimeout()) {
                Log.i(TAG, "No speech timeout fired");
                noSpeechTimeoutFired = true;
                listener.onNoSpeechTimeout();
            }
        } else if (state == VADState.STARTPOINTED) {
            if (currentState == VADState.ENDPOINTED) {
                Log.v(TAG, "Silence detected");
                listener.onSilenceDetected();
            } else if (!maxSpeechTimeoutFired
                    && timeSinceLastEvent >= mAudioTimeouts.getMaxSpeechTimeout()) {
                Log.i(TAG, "Max speech timeout fired");
                maxSpeechTimeoutFired = true;
                listener.onMaxSpeechTimeout();
            }
        } else {
            // This should never be reached, and if it is, it indicates a
            // logical problem in the while loop.
            throw new AudioSourceException("Invalid VAD state transition while processing audio");
        }

        // Update state if the endpointer state has changed.
        if (state != currentState) {
            lastEventTime = SystemClock.elapsedRealtime();
            state = currentState;
        }
    }

    /**
     * Clean up the resources of components used by the audio recorder.
     *
     * @throws IOException when there is a problem closing the input stream.
     */
    @Override
    protected void cleanUpUtilityComponents() throws IOException {
        mProducerStream.close();
        Log.v(TAG, "Released producer stream");

        mAudioEncoder.close();
        Log.v(TAG, "Clean up audio encoder");
    }

    /**
     * Return the producer stream.
     *
     * @return the producer stream.
     */
    PipedOutputStream getProducerStream() {
        return mProducerStream;
    }

    /**
     * Get the state of the VAD.
     *
     * @return the state.
     */
    VADState getState() {
        return state;
    }

    /**
     * Get the current state of the VAD.
     *
     * @return the current state.
     */
    VADState getCurrentState() {
        return currentState;
    }

    // TODO: Remove setters and replace with constructors.

    /**
     * Set the state.
     *
     * @param testState the state to set to.
     */
    void setState(final VADState testState) {
        state = testState;
    }

    /**
     * Set the current state.
     *
     * @param testCurrentState the state to set to.
     */
    void setCurrentState(final VADState testCurrentState) {
        currentState = testCurrentState;
    }
}
