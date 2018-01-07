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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder;

import com.google.common.net.MediaType;

import java.io.Closeable;

/**
 * Interface for AudioEncoders.
 */
public interface AudioEncoder extends Closeable {

    /**
     * Encode PCM samples to compressed audio bytes.
     *
     * @param samples the samples to compress.
     * @param numSamples the number of samples int the buffer to compress.
     * @return the compressed audio bytes.
     * @throws AudioEncoderException when there's an error encoding the audio.
     */
    byte[] encode(short[] samples, int numSamples) throws AudioEncoderException;

    /**
     * The MediaType of the compressed audio.
     *
     * @return the media type.
     */
    MediaType getMediaType();

    /**
     * Get the frame size in PCM samples of this audio codec.
     *
     * @return the frame size in PCM samples.
     */
    int getFrameSize();

    /**
     * Get the packet size of this audio codec for optimizing transmission.
     *
     * @return the packet size in bytes.
     */
    int getPacketSize();

    /**
     * Release encoder resources.
     */
    @Override
    void close();

    /**
     * Make a new encoder with the same configuration.
     *
     * @return the new encoder.
     */
    AudioEncoder newEncoder();
}
