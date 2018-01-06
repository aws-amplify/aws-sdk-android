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
 * A Base 64 CODEC API. See http://www.ietf.org/rfc/rfc4648.txt
 *
 * @author Hanson Char
 */
@SuppressWarnings("checkstyle:nowhitespacebefore")
public enum Base64 {
    ;
    private static final Base64Codec CODEC = new Base64Codec();

    /**
     * @param bytes the bytes.
     * @return a base 64 encoded string of the given bytes.
     */
    public static String encodeAsString(byte... bytes) {
        if (bytes == null)
            return null;
        return bytes.length == 0 ? "" : CodecUtils.toStringDirect(CODEC.encode(bytes));
    }

    /**
     * @param bytes the bytes.
     * @return a 64 encoded byte array of the given bytes.
     */
    public static byte[] encode(byte[] bytes) {
        return bytes == null || bytes.length == 0 ? bytes : CODEC.encode(bytes);
    }

    /**
     * Decodes the given base 64 encoded string, skipping carriage returns, line
     * feeds and spaces as needed.
     * @param b64 the base 64 encoded string.
     * @return the decoded result.
     */
    public static byte[] decode(String b64) {
        if (b64 == null) {
            return null;
        }
        if (b64.length() == 0) {
            return new byte[0];
        }
        byte[] buf = new byte[b64.length()];
        int len = CodecUtils.sanitize(b64, buf);
        return CODEC.decode(buf, len);
    }

    /**
     * Decodes the given base 64 encoded bytes.
     * @param b64 the base 64 encoded bytes.
     * @return the decoded result.
     */
    public static byte[] decode(byte[] b64) {
        return b64 == null || b64.length == 0 ? b64 : CODEC.decode(b64, b64.length);
    }
}
