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

import java.nio.ByteOrder;

/**
 * An L16 PCM encoder that takes raw PCM samples and converts them to the
 * correct byte order.
 */
public class L16PcmEncoder implements AudioEncoder {

    /**
     * Frame size, use 20ms or 320 samples to reduce overhead.
     */
    private static final int FRAME_SIZE = 320;

    /**
     * The MediaType for L16 PCM audio.
     */
    private static final MediaType MEDIA_TYPE = MediaType.parse("audio/x-l16");

    @Override
    public byte[] encode(final short[] samples, final int numSamples)
            throws AudioEncoderException {
        Preconditions.checkArgument(samples.length >= numSamples,
                "Sample buffer length must be at least as long as numSamples");
        final byte[] buffer = new byte[numSamples * 2];
        for (int i = 0; i < numSamples; i++) {
            // One sample is two bytes.
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                buffer[i * 2] = (byte) (samples[i] & 0xff);
                buffer[i * 2 + 1] = (byte) ((samples[i] >> Byte.SIZE) & 0xff);
            } else {
                buffer[i * 2] = (byte) ((samples[i] >> Byte.SIZE) & 0xff);
                buffer[i * 2 + 1] = (byte) (samples[i] & 0xff);
            }
        }
        return buffer;
    }

    @Override
    public MediaType getMediaType() {
        return MEDIA_TYPE;
    }

    @Override
    public int getFrameSize() {
        return FRAME_SIZE;
    }

    @Override
    public int getPacketSize() {
        // Since there is no encoding, packet size is frame size.
        return FRAME_SIZE * 2;
    }

    @Override
    public void close() {
        // Do nothing.
    }

    @Override
    public final L16PcmEncoder newEncoder() {
        return new L16PcmEncoder();
    }
}
