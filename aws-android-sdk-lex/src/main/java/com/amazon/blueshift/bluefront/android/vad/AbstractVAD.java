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

package com.amazon.blueshift.bluefront.android.vad;

import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.VADException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.VoiceActivityDetector;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.config.VADConfig;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/**
 * Abstract Voice Activity Detector class.
 * @param <T> typed class.
 */
public abstract class AbstractVAD<T extends VADConfig> implements VoiceActivityDetector {

    private static final int VAD_FRAMES_PER_SEC = 100;

    /**
     * Load the library.
     */
    static {
        System.loadLibrary("blueshift-audioprocessing");
    }

    private final int mStartpointingThreshold;
    private final int mEndpointingThreshold;
    private final int mSampleRate;
    private int mConsecutiveSpeechFrames;
    private int mConsecutiveNonSpeechFrames;
    private final ShortBuffer mSamplesBuffer;
    private ByteBuffer mVAD;
    private VADState mVADState;

    /**
     * Create a VAD with given audio sample rate and configuration.
     * @param sampleRate audio sample rate.
     * @param vadConfig configuration used to set up the VAD.
     */
    protected AbstractVAD(final int sampleRate, final T vadConfig) {
        mSampleRate = sampleRate;
        mStartpointingThreshold = vadConfig.getStartpointingThreshold();
        mEndpointingThreshold = vadConfig.getEndpointingThreshold();

        mConsecutiveSpeechFrames = 0;
        mConsecutiveNonSpeechFrames = 0;
        mVAD = setupVAD(vadConfig);
        mVADState = VADState.NOT_STARTPOINTED;
        mSamplesBuffer = ShortBuffer.wrap(new short[mSampleRate / VAD_FRAMES_PER_SEC]);
    }

    /**
     * Abstract method to setup the VAD.
     * @param vadConfig the configuration used to set up the VAD.
     * @return created VAD.
     */
    protected abstract ByteBuffer setupVAD(final T vadConfig);

    @Override
    public final synchronized VADState processSamples(final short[] samples, final int samplesRead)
            throws VADException {
        if (mVAD == null) {
            throw new VADException("VAD is not initialized");
        }

        int samplesProcessed = 0;
        int toWrite = 0;

        // Loop while there are enough samples to fill the buffer.
        while (mSamplesBuffer.remaining() <= samplesRead - samplesProcessed) {
            // Copy samples into buffer.
            toWrite = mSamplesBuffer.remaining();
            mSamplesBuffer.put(samples, samplesProcessed, toWrite);
            samplesProcessed += toWrite;

            // Process samples.
            final int result = isSpeech(mVAD, mSamplesBuffer.array(), mSampleRate);
            mSamplesBuffer.clear();

            // Update internal state.
            if (result == 1) {
                mConsecutiveSpeechFrames++;
                mConsecutiveNonSpeechFrames = 0;
            } else if (result == 0) {
                mConsecutiveNonSpeechFrames++;
                mConsecutiveSpeechFrames = 0;
            } else {
                throw new VADException("Error processing speech frames");
            }

            // Update VAD state.
            updateVADState();
        }

        // If any samples remain, copy into buffer.
        mSamplesBuffer.put(samples, samplesProcessed, samplesRead - samplesProcessed);
        return mVADState;
    }

    /**
     * Update internal VAD state.
     */
    private void updateVADState() {
        if (mVADState == VADState.NOT_STARTPOINTED && mConsecutiveSpeechFrames >= mStartpointingThreshold) {
            mVADState = VADState.STARTPOINTED;
        } else if (mVADState == VADState.STARTPOINTED && mConsecutiveNonSpeechFrames >= mEndpointingThreshold) {
            mVADState = VADState.ENDPOINTED;
        }
    }

    @Override
    public synchronized void close() {
        if (mVAD != null) {
            destroyVAD(mVAD);
            mVAD = null;
        }
    }

    /**
     * Create VAD..
     * @param useDNN flag to indicate whether use DNN implementation or WebRtc implementation.
     * @return the handle to the VAD structure.
     */
    protected native ByteBuffer createVAD(final boolean useDNN);

    /**
     * Set the aggression mode for the WebRtc VAD.
     * @param vadInstance the WebRtc VAD.
     * @param aggressionMode the aggression mode.
     * @return 0 if success, -1 if error.
     */
    protected native int setWebRtcMode(final ByteBuffer vadInstance, final int aggressionMode);

    /**
     * Set the customized aggression mode for the WebRtc VAD.
     * @param vadInstance the WebRtc VAD.
     * @param overHangMax1 the 1st max over hang value.
     * @param overHangMax2 the 2nd max over hang value.
     * @param localThreshold the local threshold.
     * @param globalThreshold the global threshold.
     * @return 0 if success, -1 if error.
     */
    protected native int setWebRtcCustomizedMode(final ByteBuffer vadInstance, final int overHangMax1,
            final int overHangMax2, final int localThreshold, final int globalThreshold);

    /**
     * Set the specific threshold for the DNN VAD.
     * @param vadInstance the DNN VAD.
     * @param threshold the LRT threshold value.
     * @return 0 if success, -1 if error.
     */
    protected native int setDNNThreshold(final ByteBuffer vadInstance, final float threshold);

    /**
     * Free VAD memory.
     * @param vadInstance the VAD instance.
     * @return 0 if success, -1 if error.
     */
    protected native int destroyVAD(final ByteBuffer vadInstance);

    /**
     * Check if audio contains speech.
     * @param vadInstance the native VAD instance.
     * @param samples the audio buffer.
     * @param sampleRate the sample rate of the audio.
     * @return 1 if speech, 0 if non-speech, and -1 if error.
     */
    protected native int isSpeech(final ByteBuffer vadInstance, final short[] samples, final int sampleRate);
}
