/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Utilities for encoding and decoding binary data to and from different forms.
 */
public class BinaryUtils {

    private static final int HEX_LENGTH_8 = 8;
    private static final int HEX_PARSE_16 = 16;
    private static final int FF_LOCATION = 6;

    /**
     * Converts byte data to a Hex-encoded string.
     *
     * @param data data to hex encode.
     * @return hex-encoded string.
     */
    public static String toHex(byte[] data) {
        final StringBuilder sb = new StringBuilder(data.length * 2);
        for (int i = 0; i < data.length; i++) {
            String hex = Integer.toHexString(data[i]);
            if (hex.length() == 1) {
                // Append leading zero.
                sb.append("0");
            } else if (hex.length() == HEX_LENGTH_8) {
                // Remove ff prefix from negative numbers.
                hex = hex.substring(FF_LOCATION);
            }
            sb.append(hex);
        }
        return StringUtils.lowerCase(sb.toString());
    }

    /**
     * Converts a Hex-encoded data string to the original byte data.
     *
     * @param hexData hex-encoded data to decode.
     * @return decoded data from the hex string.
     */
    public static byte[] fromHex(String hexData) {
        final byte[] result = new byte[(hexData.length() + 1) / 2];
        String hexNumber = null;
        int stringOffset = 0;
        int byteOffset = 0;
        while (stringOffset < hexData.length()) {
            hexNumber = hexData.substring(stringOffset, stringOffset + 2);
            stringOffset += 2;
            result[byteOffset++] = (byte) Integer.parseInt(hexNumber, HEX_PARSE_16);
        }
        return result;
    }

    /**
     * Converts byte data to a Base64-encoded string.
     *
     * @param data data to Base64 encode.
     * @return encoded Base64 string.
     */
    public static String toBase64(byte[] data) {
        return Base64.encodeAsString(data);
    }

    /**
     * Converts a Base64-encoded string to the original byte data.
     *
     * @param b64Data a Base64-encoded string to decode.
     * @return bytes decoded from a Base64 string.
     */
    public static byte[] fromBase64(String b64Data) {
        return b64Data == null ? null : Base64.decode(b64Data);
    }

    /**
     * Wraps a ByteBuffer in an InputStream.
     *
     * @param byteBuffer The ByteBuffer to wrap.
     * @return An InputStream wrapping the ByteBuffer content.
     */
    public static InputStream toStream(ByteBuffer byteBuffer) {
        final byte[] bytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(bytes);
        return new ByteArrayInputStream(bytes);
    }

    /**
     * @param bb the byte buffer.
     * @return a copy of all the bytes from the given <code>ByteBuffer</code>,
     * from the beginning to the buffer's limit; or null if the input is null.
     * <p>
     * The internal states of the given byte buffer will be restored when this
     * method completes execution.
     * <p>
     * When handling <code>ByteBuffer</code> from user's input, it's typical to
     * call the {@link #copyBytesFrom(ByteBuffer)} instead of
     * {@link #copyAllBytesFrom(ByteBuffer)} so as to account for the position
     * of the input <code>ByteBuffer</code>. The opposite is typically true,
     * however, when handling <code>ByteBuffer</code> from within the
     * unmarshallers of the low-level clients.
     */
    public static byte[] copyAllBytesFrom(ByteBuffer bb) {
        if (bb == null) {
            return null;
        }

        if (bb.hasArray()) {
            return Arrays.copyOfRange(
                    bb.array(),
                    bb.arrayOffset(),
                    bb.arrayOffset() + bb.limit());
        }

        final ByteBuffer copy = bb.asReadOnlyBuffer();
        copy.rewind();

        final byte[] dst = new byte[copy.remaining()];
        copy.get(dst);
        return dst;
    }

}
