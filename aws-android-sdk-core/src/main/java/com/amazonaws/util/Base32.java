/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * A Base 32 CODEC API. See http://www.ietf.org/rfc/rfc4648.txt
 *
 * @author Hanson Char
 */
@SuppressWarnings("checkstyle:nowhitespacebefore")
public enum Base32 {
    ;
    private static final Base32Codec CODEC = new Base32Codec();

    /**
     * @param bytes the bytes.
     * @return a base 32 encoded string of the given bytes.
     */
    public static String encodeAsString(byte... bytes) {
        if (bytes == null) {
            return null;
        }
        return bytes.length == 0 ? "" : CodecUtils.toStringDirect(CODEC.encode(bytes));
    }

    /**
     * @param bytes the bytes.
     * @return a 32 encoded byte array of the given bytes. hchar: compared to
     * Base32.encode(byte[]) of JakartaCommons-1.5, this routine is > 20x faster
     * on my MacAir.
     */
    public static byte[] encode(byte[] bytes) {
        return bytes == null || bytes.length == 0 ? bytes : CODEC.encode(bytes);
    }

    /**
     * Decodes the given base 32 encoded string, skipping carriage returns, line
     * feeds and spaces as needed. hchar: compared to Base32.decode(String) of
     * JakartaCommons-1.5, this routine is > 11x faster on my MacAir.
     * @param b32 the base 32 encoded string.
     * @return the decoded result.
     */
    public static byte[] decode(String b32) {
        if (b32 == null) {
            return null;
        }
        if (b32.length() == 0) {
            return new byte[0];
        }
        byte[] buf = new byte[b32.length()];
        int len = CodecUtils.sanitize(b32, buf);
        return CODEC.decode(buf, len);
    }

    /**
     * Decodes the given base 32 encoded bytes.
     * @param b32 the base 32 encoded bytes.
     * @return the decoded result.
     */
    public static byte[] decode(byte[] b32) {
        return b32 == null || b32.length == 0 ? b32 : CODEC.decode(b32, b32.length);
    }
}
