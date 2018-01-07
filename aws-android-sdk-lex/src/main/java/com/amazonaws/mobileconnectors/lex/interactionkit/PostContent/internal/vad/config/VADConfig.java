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

/**
 * Abstract VAD configuration class.
 */
public abstract class VADConfig {

    /**
     * Default number of consecutive speech frames.
     */
    public static final int DEFAULT_STARTPOINTING_THRESHOLD = 26;
    /**
     * Default number of consecutive no speech frames.
     */
    public static final int DEFAULT_ENDPOINTING_THRESHOLD = 50;

    /**
     * Number of consecutive speech frames based on which the VAD will detect
     * start point.
     */
    private final int mStartpointingThreshold;

    /**
     * Number of consecutive no speech frames based on which the VAD will try to
     * detect silence.
     */
    private final int mEndpointingThreshold;

    /**
     * Constructor.
     *
     * @param startpointingThreshold number of consecutive speech frames for
     *            startpointing.
     * @param endpointingThreshold number of consecutive non speech frames for
     *            endpointing.
     */
    public VADConfig(final int startpointingThreshold, final int endpointingThreshold) {
        mStartpointingThreshold = startpointingThreshold;
        mEndpointingThreshold = endpointingThreshold;
    }

    /**
     * Getter for startpointing threshold.
     *
     * @return startpointing threshold
     */
    public int getStartpointingThreshold() {
        return mStartpointingThreshold;
    }

    /**
     * Getter for endpointing threshold.
     *
     * @return endpointing threshold.
     */
    public int getEndpointingThreshold() {
        return mEndpointingThreshold;
    }
}
