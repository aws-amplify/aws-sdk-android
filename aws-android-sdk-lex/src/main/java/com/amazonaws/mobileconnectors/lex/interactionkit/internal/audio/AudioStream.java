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
import com.google.common.net.MediaType;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * An AudioSource that writes a stream of audio to the network connection.
 * Currently only audio/x-l16, audio/x-l16preamble, and
 * audio/x-cbr-opus-preamble are supported.
 */
public class AudioStream implements AudioSource {

    private final MediaType mContentType;

    /**
     * The stream to read from.
     */
    private final InputStream mStream;

    /**
     * Flag to indicate whether the audio source is cancelled or not.
     */
    private final AtomicBoolean mIsCancelled;

    /**
     * Create a new AudioStream with the given ContentType and audio stream.
     *
     * @param contentType the content type of the audio.
     * @param stream the audio stream itself.
     */
    public AudioStream(final MediaType contentType, final InputStream stream) {
        mContentType = Preconditions.checkNotNull(contentType, "ContentType cannot be null");
        mStream = Preconditions.checkNotNull(stream, "Stream cannot be null");
        mIsCancelled = new AtomicBoolean(false);
    }

    @Override
    public void setAudioSourceListener(final AudioSourceListener listener) {
        // Does not make use of a listener.
    }

    @Override
    public MediaType getContentType() {
        return mContentType;
    }

    @Override
    public void cancel() {
        mIsCancelled.set(true);
    }

    @Override
    public boolean isCancelled() {
        return mIsCancelled.get();
    }

    @Override
    public InputStream getConsumerStream() {
        return mStream;
    }
}
