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

/**
 * An AudioSource that writes a stream of audio to the network connection in
 * chunks. Currently only audio/x-l16, audio/x-l16preamble, and
 * audio/x-cbr-opus-preamble are supported.
 */
public class ChunkedAudioStream extends AudioStream implements ChunkedAudioSource {

    private AudioSourceListener mListener;

    /**
     * Buffer size for reading bytes from the stream.
     */
    private static final int CHUNK_SIZE = 320;

    /**
     * Create a new AudioStream with the given ContentType and audio stream.
     *
     * @param contentType the content type of the audio.
     * @param stream the audio stream itself.
     */
    public ChunkedAudioStream(final MediaType contentType, final InputStream stream) {
        super(contentType, stream);
        mListener = new AudioSourceListener.NullListener();
    }

    /**
     * Set a listener for audio source events.
     *
     * @param listener the listener object.
     */
    @Override
    public void setAudioSourceListener(final AudioSourceListener listener) {
        mListener = Preconditions.checkNotNull(listener, "listener cannot be null");
    }

    /**
     * Get the AudioSourceListener for this AudioSource.
     *
     * @return the AudioSourceListener.
     */
    public AudioSourceListener getAudioSourceListener() {
        return mListener;
    }

    /**
     * Get the appropriate chunk size for this AudioSource.
     *
     * @return the chunk size.
     */
    @Override
    public int getChunkSize() {
        return CHUNK_SIZE;
    }
}
