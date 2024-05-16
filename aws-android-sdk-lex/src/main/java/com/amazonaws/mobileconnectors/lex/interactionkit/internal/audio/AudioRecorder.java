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

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.L16PcmEncoder;
import com.google.common.base.Preconditions;
import com.google.common.net.MediaType;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * An AudioRecorder used to record audio and write audio data to an OutputStream.
 */
public class AudioRecorder implements AudioSource {

    private final MediaType mContentType;
    private AudioSourceListener mListener;

    /**
     * Flag to indicate whether mRecord refers to an object passed in.
     */
    private boolean mAudioRecordIsPassedIn = false;

    /**
     * Flag to indicate whether the audio source is cancelled or not.
     */
    private final AtomicBoolean mIsCancelled;

    /**
     * Default value for how often the recorder position notification goes out.
     */
    public static final int DEFAULT_RECORDER_POSITION_NOTIFICATION_PERIOD = 100;

    /**
     * Default value for the number of channels of the audio format the audio recorder will use.
     */
    public static final int DEFAULT_CHANNELS = AudioFormat.CHANNEL_IN_MONO;

    /**
     * Default value for the number of samples the audio recorder will sample each second.
     */
    public static final int DEFAULT_SAMPLE_RATE = 16000;

    /**
     * Default audio format the audio recorder will use.
     */
    public static final int DEFAULT_FORMAT = AudioFormat.ENCODING_PCM_16BIT;

    /**
     * The TAG used for logging.
     */
    public static final String TAG = AudioRecorder.class.getCanonicalName();

    /**
     * The android permission string for recording audio.
     */
    public static final String ANDROID_PERMISSION_RECORD_AUDIO = "android.permission.RECORD_AUDIO";

    /**
     * Android context.
     */
    private final Context mContext;
    /**
     * The audio record used buffer size.
     */
    private final int mNumSamplesPerRead;
    /**
     * The audio record used for recording.
     */
    private final AudioRecord mRecord;
    /**
     * Number of samples read within in the recorder notification period.
     */
    private int mSamplesCountInRecPosNotificationPeriod;
    /**
     * The sum of the square values of each sample read within in the
     * recorder notification period.
     */
    private double mSumOfSampleSquaresInRecPosNotificationPeriod;

    /**
     * Create a new recorder with given context, media type, sample rate,
     * channel configuration, audio format, and buffer size.
     * @param context the context used to access the AudioRecord framework.
     * @param mediaType the audio media format.
     * @param recorderPositionNotificationPeriod the notification period for updating the recorder
     * position in milliseconds.
     * @param sampleRate the number of samples the audio recorder will sample each second.
     * @param channels the number of channels of the audio format the audio recorder will use.
     * @param format the audio format the audio recorder will use.
     * @throws Exception if failed to create audio recorder instance.
     */
    @SuppressLint("MissingPermission") // App Developer should check for Manifest.permission.RECORD_AUDIO permission
    public AudioRecorder(final Context context, final MediaType mediaType,
            final int recorderPositionNotificationPeriod,
            final int sampleRate, final int channels, final int format) throws Exception {
        this(context, mediaType,
                AudioRecord.getMinBufferSize(sampleRate, channels, format),
                recorderPositionNotificationPeriod,
                new AudioRecord(MediaRecorder.AudioSource.VOICE_RECOGNITION,
                        sampleRate,
                        channels,
                        format,
                        AudioRecord.getMinBufferSize(sampleRate, channels, format)),
                false);
    }

    /**
     * Create a new audio recorder with a custom record buffer size. Used for testing.
     * @param context the Context used to access the AudioRecord framework.
     * @param mediaType the audio media format.
     * @param numSamplesPerRead the number of samples to request when recording audio.
     * @param recorderPositionNotificationPeriod the notification period for updating the recorder
     * position in milliseconds.
     * @param audioRecord the audio recorder used to record audio.
     * @throws Exception if failed to create audio recorder instance.
     */
    public AudioRecorder(final Context context, final MediaType mediaType,
            final int numSamplesPerRead, final int recorderPositionNotificationPeriod,
            final AudioRecord audioRecord) throws Exception {
        this(context, mediaType, numSamplesPerRead, recorderPositionNotificationPeriod,
                audioRecord, true);
    }

    /**
     * Create a new audio recorder with a custom record buffer size. Used for testing.
     * @param context the Context used to access the AudioRecord framework.
     * @param mediaType the audio media format.
     * @param numSamplesPerRead the number of samples to request when recording audio.
     * @param recorderPositionNotificationPeriod the notification period for updating the recorder
     * position in milliseconds.
     * @param audioRecord the audio recorder used to record audio.
     * @param audioRecordIsPassedIn whether an existing AudioRecord was passed in to the
     * constructor.
     * @throws Exception if failed to create audio recorder instance.
     */
    protected AudioRecorder(final Context context, final MediaType mediaType,
        final int numSamplesPerRead, final int recorderPositionNotificationPeriod,
        final AudioRecord audioRecord, final boolean audioRecordIsPassedIn)
                throws Exception {
        mContentType = Preconditions.checkNotNull(mediaType, "mMediaType cannot be null");
        mContext = Preconditions.checkNotNull(context, "Context cannot be null");
        mRecord = Preconditions.checkNotNull(audioRecord, "AudioRecord cannot be null");
        Preconditions.checkArgument(numSamplesPerRead > 0,
            "Num samples per read must be greater than 0");
        Preconditions.checkArgument(recorderPositionNotificationPeriod > 0,
            "Recorder position notification period must be greater than 0");

        mListener = new AudioSourceListener.NullListener();
        mIsCancelled = new AtomicBoolean(false);
        mNumSamplesPerRead = numSamplesPerRead;
        mRecord.setPositionNotificationPeriod(recorderPositionNotificationPeriod);
        mRecord.setRecordPositionUpdateListener(new RecordPositionChangeListener());
        mAudioRecordIsPassedIn = audioRecordIsPassedIn;

        //Check permission.
        checkRecordingPermission(context);
    }

    /**
     * Check for recording permissions.
     * @param context the Context used to check for permissions.
     */
    private void checkRecordingPermission(final Context context) {
        final int permissionResult = context.checkCallingOrSelfPermission(
                ANDROID_PERMISSION_RECORD_AUDIO);
        if (permissionResult == PackageManager.PERMISSION_DENIED) {
            throw new SecurityException("Insufficient permissions to start ASR.");
        }
    }

    /**
     * Set a listener for audio source events.
     * @param listener the listener object.
     */
    @Override
    public void setAudioSourceListener(final AudioSourceListener listener) {
        mListener = Preconditions.checkNotNull(listener, "AudioSourceListener cannot be null");
    }

    /**
     * Get the AudioSourceListener for this AudioSource.
     * @return the AudioSourceListener.
     */
    public AudioSourceListener getAudioSourceListener() {
        return mListener;
    }

    /**
     * Cancel an audio source.
     */
    @Override
    public void cancel() {
        mIsCancelled.set(true);
    }

    /**
     * Get the ContentType of the audio.
     * @return the ContentType of the audio.
     */
    @Override
    public MediaType getContentType() {
        return mContentType;
    }

    /**
     * Get reference to the audio stream where it could be read from.
     * @return audio stream.
     */
    @Override
    public InputStream getConsumerStream() {
        return null;
    }

    /**
     * Whether the AudioSource is cancelled or not.
     * @return whether or not this AudioSource is cancelled.
     */
    @Override
    public boolean isCancelled() {
        return mIsCancelled.get();
    }

    /**
     * Method to setup, start the recorder, and read data.
     * When recorder is stopped by the user, clean up resources.
     * @throws Exception when there are problems while recording audio.
     */
    public void startRecording() throws Exception {
        startAudioRecorder();
        final short[] buffer = new short[mNumSamplesPerRead];
        int numSamplesRead;

        final AudioSourceListener listener = getAudioSourceListener();
        final AudioEncoder pcmEncoder = new L16PcmEncoder();
        try {
            Log.v(TAG, "Starting record loop");
            while (isInValidStateToContinueRecording()) {
                // Make sure recorder is not null before recording.
                if (mRecord == null) {
                    Log.e(TAG, "Recorder is null.");
                    throw new AudioSourceException("Recorder null");
                }

                // Buffer bytes to be sent to callback.
                synchronized (mRecord) {
                    numSamplesRead = mRecord.read(buffer, 0, mNumSamplesPerRead);
                }

                final int invalidOperation = AudioRecord.ERROR_INVALID_OPERATION;
                if (invalidOperation != numSamplesRead) {
                    setPostRecordingFields();
                    if (numSamplesRead > 0) {
                        // Prepare samples for the callback.
                        final byte[] callbackBuffer = pcmEncoder.encode(buffer, numSamplesRead);
                        listener.onBufferReceived(callbackBuffer);

                        updateSumSamplesForRMSCalculations(numSamplesRead, buffer);
                    }
                    postAudioRecordingProcessing(numSamplesRead, buffer, listener);
                } else {
                    Log.v(TAG, "AudioRecord - Invalid Operation");
                    throw new AudioSourceException("AudioRecord - Invalid Operation");
                }
            }
            Log.v(TAG, "Finished record loop");
        } finally {
            cleanUpAfterRecording();
        }
    }

    /**
     * Helper method to start the audio recorder.
     * @throws AudioSourceException thrown while trying to start the audio recorder.
     * @throws IOException when there is a problem in cleaning up the audio recorder's resources.
     */
    protected void startAudioRecorder() throws AudioSourceException, IOException {
        if (mRecord.getState() != AudioRecord.STATE_INITIALIZED) {
            Log.e(TAG, "Failed to initiate recorder.");
            throw new AudioSourceException("Failed to initiate recorder.");
        }

        try {
            if (!mAudioRecordIsPassedIn) {
                setUpAudioRecord();
                mRecord.startRecording();
            }
            getAudioSourceListener().onReadyForSpeech();
        } catch (final IllegalStateException e) {
            Log.e(TAG, "Exception starting recording", e);
            cleanUpAfterRecording();
            throw new AudioSourceException("Exception starting recording", e);
        }
    }

    /**
     * Perform setup for AudioRecord if it is not passed in.
     */
    protected void setUpAudioRecord() {
        final AudioManager am = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
        am.requestAudioFocus(null, AudioManager.STREAM_MUSIC,
                AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
    }

    /**
     * Determine whether recording should continue.
     * @return whether recording should continue.
     */
    protected boolean isInValidStateToContinueRecording() {
        return !isCancelled();
    }

    /**
     * Set fields necessary for additional audio processing.
     */
    protected void setPostRecordingFields() {
        // Used by subclasses to set variables to support additional audio processing.
    }

    /**
     * Perform additional processing after an audio sample has been recorded.
     * @param numSamplesRead number of samples read.
     * @param buffer stores the audio samples.
     * @param listener listens to audio recording events.
     * @throws BluefrontAndroidException when there is a problem pushing to output stream.
     */
    protected void postAudioRecordingProcessing(final int numSamplesRead,
            final short[] buffer, final AudioSourceListener listener) throws AmazonClientException {
        // Used by subclasses for additional audio processing.
    }

    /**
     * Update sum of samples for RMS calculations.
     * @param numSamplesRead number of samples read.
     * @param buffer stores the audio samples.
     */
    protected void updateSumSamplesForRMSCalculations(final int numSamplesRead, final short[] buffer) {
        // Update sum of samples for RMS calculations.
        for (int i = 0; i < numSamplesRead; i++) {
            mSumOfSampleSquaresInRecPosNotificationPeriod += buffer[i] * buffer[i];
        }
        mSamplesCountInRecPosNotificationPeriod += numSamplesRead;
    }

    /**
     * Free resources after recording audio. Only stop and release recorder if the
     * AudioRecord object was not passed in.
     * @throws IOException when there is a problem closing the input stream.
     */
    protected void cleanUpAfterRecording() throws IOException {
        Log.v(TAG, "Cleaning up AudioRecorder");

        if (mRecord != null) {
            if (!mAudioRecordIsPassedIn) {
                Log.v(TAG, "Releasing AudioRecord");
                mRecord.stop();
                mRecord.release();
                final AudioManager am = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
                am.abandonAudioFocus(null);
            }
        } else {
            Log.w(TAG, "AudioRecord is null.");
        }

        cleanUpUtilityComponents();

        Log.v(TAG, "Cleaned up AudioRecorder");
    }

    /**
     * Clean up the resources of components used by the audio recorder.
     * @throws IOException when there is a problem closing IO.
     */
    protected void cleanUpUtilityComponents() throws IOException {
        // Used by subclasses to clean up additional components used.
    }

    /**
     * Listener for Audio recorder's record position update.
     */
    protected class RecordPositionChangeListener implements AudioRecord.OnRecordPositionUpdateListener {

        /**
         * The minimum weight from last record notification period.
         */
        private double min = DEFAULT_WEIGHT;
        /**
         * The maximum weight from last record notification period.
         */
        private double max = DEFAULT_WEIGHT;

        /**
         * The default weight.
         */
        private static final double DEFAULT_WEIGHT = -3.1;

        @Override
        public void onMarkerReached(final AudioRecord recorder) {
        }

        @Override
        public void onPeriodicNotification(final AudioRecord recorder) {
            if (mSamplesCountInRecPosNotificationPeriod <= 0) {
                return;
            }

            final double rms = Math.sqrt(mSumOfSampleSquaresInRecPosNotificationPeriod
                                    / mSamplesCountInRecPosNotificationPeriod);
            double weight = Math.log10(rms / Short.MAX_VALUE);
            mSumOfSampleSquaresInRecPosNotificationPeriod = 0;
            mSamplesCountInRecPosNotificationPeriod = 0;

            if (weight < min && weight > -200000) {
                min = weight;
            }

            if (weight > max) {
                max = weight;
            }

            /*
             * on a HTC something-or-other 'silence' is approximately -3.2,
             * 'maximum' is approximately -1.2
             */
            weight += 3.2;
            weight /= (3.2 - 1.2);

            getAudioSourceListener().onRmsChanged((float) weight);
        }
    }

    /**
     * Get the AudioRecord instance.
     * @return the AudioRecord instance within the audio recorder.
     */
    AudioRecord getAudioRecord() {
        return mRecord;
    }

    /**
     * Get the flag whether the audio record was passed in or not.
     * @return the boolean flag.
     */
    boolean getAudioRecordIsPassedIn() {
        return mAudioRecordIsPassedIn;
    }
}
