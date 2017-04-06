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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.config;

import com.google.common.base.Optional;

/**
 * Configuration for the DNN VAD.
 */
public final class DnnVADConfig extends VADConfig {

    /**
     * Default number of consecutive speech frames.
     */
    public static final int DEFAULT_STARTPOINTING_THRESHOLD = 15;
    /**
     * Default number of consecutive no speech frames.
     */
    public static final int DEFAULT_ENDPOINTING_THRESHOLD = 60;

    // LRT threshold, initialized to absent value.
    private Optional<Float> mThreshold = Optional.absent();

    /**
     * Create a DNN VAD configuration with default values.
     */
    public DnnVADConfig() {
        super(DEFAULT_STARTPOINTING_THRESHOLD, DEFAULT_ENDPOINTING_THRESHOLD);
    }

    /**
     * Create a DNN VAD configuration.
     *
     * @param threshold the LRT threshold value.
     * @param startpointingThreshold the startpointing threshold in the number
     *            of speech frames (10ms each frame).
     * @param endpointingThreshold the endpointing threshold in the number of
     *            non-speech frames (10ms each frame).
     */
    public DnnVADConfig(final Float threshold, final int startpointingThreshold,
            final int endpointingThreshold) {
        super(startpointingThreshold, endpointingThreshold);

        mThreshold = Optional.fromNullable(threshold);
    }

    /**
     * Getter for the LRT threshold value.
     *
     * @return the LRT threshold value.
     */
    public Optional<Float> getThreshold() {
        return mThreshold;
    }
}
