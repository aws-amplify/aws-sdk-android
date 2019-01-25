/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.util.CodecUtils.sanityCheckLastPos;

/**
 * A Base 64 codec implementation.
 *
 * @author Hanson Char
 */
@SuppressWarnings({"checkstyle:constantname", "checkstyle:innerassignment"})
class Base64Codec implements Codec {

    private static final int OFFSET_a_VALUE = 26;
    private static final int OFFSET_0_VALUE = 52;
    private static final int OFFSET_PLUS_VALUE = 62;
    private static final int OFFSET_SLASH_VALUE = 63;

    private static final int OFFSET_OF_a = 'a' - OFFSET_a_VALUE;
    private static final int OFFSET_OF_0 = '0' - OFFSET_0_VALUE;
    private static final int OFFSET_OF_PLUS = '+' - OFFSET_PLUS_VALUE;
    private static final int OFFSET_OF_SLASH = '/' - OFFSET_SLASH_VALUE;

    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_6 = 6;

    private static final int MASK_2BITS = (1 << 2) - 1;
    private static final int MASK_4BITS = (1 << BITS_4) - 1;
    private static final int MASK_6BITS = (1 << BITS_6) - 1;
    // Alphabet as defined at http://www.ietf.org/rfc/rfc4648.txt
    private static final byte PAD = '=';

    private static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private static byte[] decodeTable() {
            final byte[] dest = new byte['z' + 1];

            for (int i = 0; i <= 'z'; i++) {
                if (i >= 'A' && i <= 'Z')
                    dest[i] = (byte) (i - 'A');
                else if (i >= '0' && i <= '9')
                    dest[i] = (byte) (i - OFFSET_OF_0);
                else if (i == '+')
                    dest[i] = (byte) (i - OFFSET_OF_PLUS);
                else if (i == '/')
                    dest[i] = (byte) (i - OFFSET_OF_SLASH);
                else if (i >= 'a' && i <= 'z')
                    dest[i] = (byte) (i - OFFSET_OF_a);
                else
                    dest[i] = -1;
            }
            return dest;
        }
    }

    private final byte[] alpahbets;

    Base64Codec() {
        alpahbets = CodecUtils
                .toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    protected Base64Codec(byte[] alphabets) {
        alpahbets = alphabets;
    }

    @Override
    public byte[] encode(byte[] src) {
        final int num3bytes = src.length / BITS_3;
        final int remainder = src.length % BITS_3;

        if (remainder == 0) {
            byte[] dest = new byte[num3bytes * BITS_4];

            for (int s = 0, d = 0; s < src.length; s += BITS_3, d += BITS_4)
                encode3bytes(src, s, dest, d);
            return dest;
        }

        byte[] dest = new byte[(num3bytes + 1) * BITS_4];
        int s = 0, d = 0;

        for (; s < src.length - remainder; s += BITS_3, d += BITS_4)
            encode3bytes(src, s, dest, d);

        switch (remainder) {
            case 1:
                encode1byte(src, s, dest, d);
                break;
            case 2:
                encode2bytes(src, s, dest, d);
                break;
            default:
                break;
        }
        return dest;
    }

    void encode3bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = alpahbets[(p = src[s++]) >>> 2 & MASK_6BITS]; // 6
        dest[d++] = alpahbets[(p & MASK_2BITS) << BITS_4 | (p = src[s++]) >>> BITS_4 & MASK_4BITS]; // 2
                                                                                          // 4
        dest[d++] = alpahbets[(p & MASK_4BITS) << 2 | (p = src[s]) >>> BITS_6 & MASK_2BITS]; // 4
                                                                                        // 2
        dest[d] = alpahbets[p & MASK_6BITS]; // 6
        return;
    }

    void encode2bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = alpahbets[(p = src[s++]) >>> 2 & MASK_6BITS]; // 6
        dest[d++] = alpahbets[(p & MASK_2BITS) << BITS_4 | (p = src[s]) >>> BITS_4 & MASK_4BITS]; // 2
                                                                                        // 4
        dest[d++] = alpahbets[(p & MASK_4BITS) << 2]; // 4
        dest[d] = PAD;
        return;
    }

    void encode1byte(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = alpahbets[(p = src[s]) >>> 2 & MASK_6BITS]; // 6
        dest[d++] = alpahbets[(p & MASK_2BITS) << BITS_4]; // 2
        dest[d++] = PAD;
        dest[d] = PAD;
        return;
    }

    void decode4bytes(byte[] src, int s, byte[] dest, int d) {
        int p = 0;
        // operator precedence in descending order: >>> or <<, &, |
        dest[d++] = (byte)
                (
                pos(src[s++]) << 2
                | (p = pos(src[s++])) >>> BITS_4 & MASK_2BITS
                ); // 6 2
        dest[d++] = (byte)
                (
                (p & MASK_4BITS) << BITS_4
                | (p = pos(src[s++])) >>> 2 & MASK_4BITS
                ); // 4 4
        dest[d] = (byte)
                (
                (p & MASK_2BITS) << BITS_6
                | pos(src[s])
                ); // 2 6
        return;
    }

    /**
     * @param n the number of final quantum in bytes to decode into. Ranges from
     *            1 to 3, inclusive.
     */
    void decode1to3bytes(int n, byte[] src, int s, byte[] dest, int d) {
        int p = 0;
        // operator precedence in descending order: >>> or <<, &, |
        dest[d++] = (byte)
                (
                pos(src[s++]) << 2
                | (p = pos(src[s++])) >>> BITS_4 & MASK_2BITS
                ); // 6 2
        if (n == 1) {
            sanityCheckLastPos(p, MASK_4BITS);
            return;
        }

        dest[d++] = (byte)
                (
                (p & MASK_4BITS) << BITS_4
                | (p = pos(src[s++])) >>> 2 & MASK_4BITS
                ); // 4 4
        if (n == 2) {
            sanityCheckLastPos(p, MASK_2BITS);
            return;
        }

        dest[d] = (byte)
                (
                (p & MASK_2BITS) << BITS_6
                | pos(src[s])
                ); // 2 6
        return;
    }

    @Override
    public byte[] decode(byte[] src, final int length) {
        if (length % BITS_4 != 0)
            throw new IllegalArgumentException(
                    "Input is expected to be encoded in multiple of 4 bytes but found: " + length);

        int pads = 0;
        int last = length - 1;

        // max possible padding in b64 encoding is 2
        for (; pads < 2 && last > -1; last--, pads++) {
            if (src[last] != PAD)
                break;
        }

        final int fq; // final quantum in unit of bytes

        switch (pads) {
            case 0:
                fq = BITS_3;
                break; // final quantum of encoding input is an integral
                       // multiple of 24 bits
            case 1:
                fq = 2;
                break; // final quantum of encoding input is exactly 16 bits
            case 2:
                fq = 1;
                break; // final quantum of encoding input is exactly 8 bits
            default:
                throw new Error("Impossible");
        }
        final byte[] dest = new byte[length / BITS_4 * BITS_3 - (BITS_3 - fq)];
        int s = 0, d = 0;

        // % has a higher precedence than - than <
        for (; d < dest.length - fq % BITS_3; s += BITS_4, d += BITS_3) {
            decode4bytes(src, s, dest, d);
        }

        if (fq < BITS_3) {
            decode1to3bytes(fq, src, s, dest, d);
        }
        return dest;
    }

    protected int pos(byte in) {
        int pos = LazyHolder.DECODED[in];

        if (pos > -1)
            return pos;
        throw new IllegalArgumentException("Invalid base 64 character: \'" + (char) in + "\'");
    }
}
