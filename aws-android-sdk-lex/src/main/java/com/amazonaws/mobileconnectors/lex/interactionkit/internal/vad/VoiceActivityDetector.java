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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad;

import java.io.Closeable;

/**
 * Interface for Voice Activity Detector.
 */
public interface VoiceActivityDetector extends Closeable {
    /**
     * State of the Voice Activity Detector.
     */
    public static enum VADState {
        /**
         * A state where a startpoint hasn't been detected. Initial state.
         */
        NOT_STARTPOINTED,

        /**
         * A state where a startpoint has been detected, but no endpoint has
         * been detected.
         */
        STARTPOINTED,

        /**
         * A state where an endpoint has been detected. Final state.
         */
        ENDPOINTED
    }

    /**
     * Process audio samples using the Voice Activity Detector.
     *
     * @param samples the samples to process.
     * @param samplesRead the number of samples in the buffer.
     * @return the state of the VAD after processing the samples
     * @throws VADException if there's an error processing the samples.
     */
    VADState processSamples(final short[] samples, final int samplesRead) throws VADException;

    /**
     * Override {@link Closeable#close()} method to ignore the IOException,
     * which is not necessary for our VAD use case.
     */
    @Override
    void close();
}
