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

import com.google.common.base.Preconditions;
import com.google.common.net.MediaType;

import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * A buffering audio encoder that buffers audio and only encodes full frames of
 * audio.
 */
public class BufferedAudioEncoder implements AudioEncoder {

    private final AudioEncoder mEncoder;
    private final ShortBuffer mSamplesBuffer;

    /**
     * Create a BufferedAudioEncoder that wraps an underlying AudioEncoder.
     *
     * @param encoder the underlying audio encoder.
     */
    public BufferedAudioEncoder(final AudioEncoder encoder) {
        Preconditions.checkNotNull(encoder, "AudioEncoder cannot be null");
        mEncoder = encoder;
        mSamplesBuffer = ShortBuffer.wrap(new short[mEncoder.getFrameSize()]);
    }

    @Override
    public byte[] encode(final short[] samples, final int numSamples)
            throws AudioEncoderException {
        Preconditions.checkArgument(samples.length >= numSamples,
                "Number of samples cannot exceed buffer size");

        int samplesProcessed = 0;
        int toWrite = 0;

        final List<byte[]> encodedBytesList = new ArrayList<byte[]>();
        final short[] buffer = new short[mSamplesBuffer.capacity()];

        // Loop while there are enough samples to fill the buffer.
        while (mSamplesBuffer.remaining() <= numSamples - samplesProcessed) {
            // Copy samples into buffer.
            toWrite = mSamplesBuffer.remaining();
            System.arraycopy(samples, samplesProcessed, buffer, 0, toWrite);

            mSamplesBuffer.put(buffer, 0, toWrite);
            samplesProcessed += toWrite;

            // Process samples.
            encodedBytesList
                    .add(mEncoder.encode(mSamplesBuffer.array(), mSamplesBuffer.capacity()));
            mSamplesBuffer.clear();
        }

        // If any samples remain, copy into buffer.
        mSamplesBuffer.put(samples, samplesProcessed, numSamples - samplesProcessed);
        return concatenateBytes(encodedBytesList);
    }

    /**
     * Concatenate a list of byte arrays into one array.
     *
     * @param byteList the list of byte arrays.
     * @return the concatenated byte array.
     */
    private byte[] concatenateBytes(final List<byte[]> byteList) {
        int size = 0;
        for (final byte[] byteArray : byteList) {
            size += byteArray.length;
        }

        final byte[] concatenatedByteArray = new byte[size];
        int offset = 0;
        for (final byte[] byteArray : byteList) {
            System.arraycopy(byteArray, 0, concatenatedByteArray, offset, byteArray.length);
            offset += byteArray.length;
        }
        return concatenatedByteArray;
    }

    @Override
    public MediaType getMediaType() {
        return mEncoder.getMediaType();
    }

    @Override
    public int getFrameSize() {
        return mEncoder.getFrameSize();
    }

    @Override
    public int getPacketSize() {
        return mEncoder.getPacketSize();
    }

    @Override
    public void close() {
        mEncoder.close();
    }

    /**
     * Make a copy of the encoder.
     *
     * @return a copy of the encoder.
     */
    @Override
    public final BufferedAudioEncoder newEncoder() {
        return new BufferedAudioEncoder(mEncoder.newEncoder());
    }
}
