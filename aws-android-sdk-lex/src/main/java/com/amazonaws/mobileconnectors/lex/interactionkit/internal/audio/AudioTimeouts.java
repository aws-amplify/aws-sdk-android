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

import com.google.common.base.Preconditions;

/**
 * A wrapper for the audio recording related timeouts. The no speech timeout
 * dictates how much silence is allowed before the request times out. The max
 * speech timeout dictates how much speech is allowed before the request times
 * out.
 */
public final class AudioTimeouts {

    private static final int DEFAULT_NO_SPEECH_TIMEOUT = 5000;
    private static final int DEFAULT_MAX_SPEECH_TIMEOUT = 5000;

    private final int mNoSpeechTimeout;
    private final int mMaxSpeechTimeout;

    /**
     * Create a set of AudioTimeouts using the default values.
     */
    public AudioTimeouts() {
        this(DEFAULT_NO_SPEECH_TIMEOUT, DEFAULT_MAX_SPEECH_TIMEOUT);
    }

    /**
     * Create a set of AudioTimeouts.
     *
     * @param noSpeechTimeout the maximum amount of silence before the request
     *            times out in milliseconds.
     * @param maxSpeechTimeout the maximum amount of speech to record in
     *            milliseconds.
     */
    public AudioTimeouts(final int noSpeechTimeout, final int maxSpeechTimeout) {
        Preconditions.checkArgument(noSpeechTimeout > 0, "No input timeout must be greater than 0");
        Preconditions.checkArgument(maxSpeechTimeout > 0,
                "Max speech timeout must be greater than 0");
        mNoSpeechTimeout = noSpeechTimeout;
        mMaxSpeechTimeout = maxSpeechTimeout;
    }

    /**
     * @return the noSpeechTimeout
     */
    public int getNoSpeechTimeout() {
        return mNoSpeechTimeout;
    }

    /**
     * @return the maxSpeechTimeout
     */
    public int getMaxSpeechTimeout() {
        return mMaxSpeechTimeout;
    }
}
