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

import com.google.common.net.MediaType;

import java.io.InputStream;

/**
 * Interface for AudioSource objects.
 */
public interface AudioSource {

    /**
     * Set a listener for audio source events.
     * @param listener the listener object.
     */
    void setAudioSourceListener(final AudioSourceListener listener);

    /**
     * Get the ContentType of the audio.
     * @return the ContentType of the audio.
     */
    MediaType getContentType();

    /**
     * Get reference to the audio stream where it could be read from.
     * @return audio stream.
     */
    InputStream getConsumerStream();

    /**
    * Cancel an audio source.
    */
    void cancel();

    /**
     * Whether the audio source is cancelled.
     * @return whether the audio source is cancelled.
     */
    boolean isCancelled();
}
