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

import com.amazon.blueshift.bluefront.android.audio.encoder.OpusEncoder;
import com.amazon.blueshift.bluefront.android.vad.AbstractVAD;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoderException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.BufferedAudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.DnnVAD;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.config.DnnVADConfig;
import com.google.common.base.Preconditions;

/**
 * Builder class for BluefrontAndroiAudioRecorder.
 */
public final class LexAudioRecorderBuilder {

    private final Context mContext;

    // DNN VAD configuration, initialize to default settings.
    private DnnVADConfig mDnnVADConfig = new DnnVADConfig();
    // Audio related timeouts(no speech and max speech timeout), initiated to
    // default values.
    private AudioTimeouts mAudioTimeouts = new AudioTimeouts();

    private AudioEncoder mAudioEncoder;
    private int mRecorderPositionNotificationPeriod = AudioRecorder.DEFAULT_RECORDER_POSITION_NOTIFICATION_PERIOD;

    /**
     * Create a builder with the mandatory context.
     *
     * @param context the context used for access the AudioRecord framework.
     * @throws AudioEncoderException when there's an error creating the default
     *             AudioEncoder.
     */
    public LexAudioRecorderBuilder(final Context context) throws AudioEncoderException {
        Preconditions.checkNotNull(context, "Context cannot be null.");

        mContext = context;
        mAudioEncoder = new BufferedAudioEncoder(new OpusEncoder());
    }

    /**
     * Set the DNN VAD configuration.
     *
     * @param vadConfig the configuration used to create a DNN VAD.
     * @return updated builder.
     */
    public LexAudioRecorderBuilder dnnVADConfig(final DnnVADConfig vadConfig) {
        Preconditions.checkNotNull(vadConfig, "DnnVadConfig cannot be null.");
        mDnnVADConfig = vadConfig;
        return this;
    }

    /**
     * Set the stream timeout in milliseconds.
     *
     * @param audioTimeouts audio related timeouts.
     * @return updated builder.
     */
    public LexAudioRecorderBuilder audioTimeouts(final AudioTimeouts audioTimeouts) {
        Preconditions.checkNotNull(audioTimeouts, "AudioTimeouts cannot be null.");

        mAudioTimeouts = audioTimeouts;
        return this;
    }

    /**
     * Set the recorder position notification period in milliseconds. The
     * recommended value is 100ms and is the default if this is not set. This
     * can slow down the app if the period is too small. This will send an event
     * to the UI Thread at the rate given.
     *
     * @param recorderPositionNotificationPeriod the period at which to update.
     * @return updated builder.
     */
    public LexAudioRecorderBuilder recorderPositionNotificationPeriod(
            final int recorderPositionNotificationPeriod) {
        Preconditions.checkArgument(recorderPositionNotificationPeriod > 0,
                "recorderPositionNotificationPeriod must be greater than 0.");

        mRecorderPositionNotificationPeriod = recorderPositionNotificationPeriod;
        return this;
    }

    /**
     * Set the audio encoder to use for recognition. This usually won't need to
     * be called because it will default to Opus.
     *
     * @param audioEncoder the audio encoder to use.
     * @return updated Builder.
     */
    public LexAudioRecorderBuilder audioEncoder(final AudioEncoder audioEncoder) {
        Preconditions.checkNotNull(audioEncoder, "AudioEncoder cannot be null.");

        if (audioEncoder instanceof BufferedAudioEncoder) {
            mAudioEncoder = audioEncoder;
        } else {
            mAudioEncoder = new BufferedAudioEncoder(audioEncoder);
        }
        return this;
    }

    /**
     * Builds the audio recorder.
     *
     * @return a audio recorder with the given input.
     * @throws Exception if failed to build audio recorder.
     */
    public LexAudioRecorder build() throws Exception {
        final AbstractVAD<?> vad = new DnnVAD(AudioRecorder.DEFAULT_SAMPLE_RATE, mDnnVADConfig);
        return new LexAudioRecorder(mContext, mAudioEncoder, vad, mAudioTimeouts,
                mRecorderPositionNotificationPeriod);
    }

    /**
     * Constructor used for testing.
     */
    public LexAudioRecorderBuilder() {
        mContext = null;
    }

    /**
     * Get the DNN VAD configuration.
     *
     * @return the configuration.
     */
    DnnVADConfig getDnnVadConfig() {
        return mDnnVADConfig;
    }

    /**
     * Get the time outs.
     *
     * @return the AudioTimeouts instance.
     */
    AudioTimeouts getAudioTimeouts() {
        return mAudioTimeouts;
    }

    /**
     * Get the audio encoder.
     *
     * @return the audio encoder.
     */
    AudioEncoder getAudioEncoder() {
        return mAudioEncoder;
    }

    /**
     * Get the recorder notification period.
     *
     * @return the recorder notification period value.
     */
    int getRecorderPositionNotificationPeriod() {
        return mRecorderPositionNotificationPeriod;
    }
}
