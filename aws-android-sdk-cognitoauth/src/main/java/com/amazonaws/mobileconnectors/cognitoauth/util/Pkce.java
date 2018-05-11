/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoauth.util;

import android.util.Base64;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;

/**
 * Utility class to generate random string, hash, and encoding.
 */

public final class Pkce {

    /**
     * Generates a unique string.
     * @return the generated unique string.
     */
    public final static String generateRandom() {
        SecureRandom srand = new SecureRandom();
        byte[] randBytes = new byte[32];
        srand.nextBytes(randBytes);
        return Base64.encodeToString(randBytes, Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING);
    }

    /**
     * Converts string into SHA-256 hash.
     * @param data Required: The {@link String} to hash.
     * @return the hash as a {@link String}.
     */
    public final static String generateHash(String data) throws Exception {
        String hashedData = data;
        try {
            byte[] bytes = data.getBytes("US-ASCII");
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(bytes, 0, bytes.length);
            byte[] digestBytes = digest.digest();
            hashedData = Base64.encodeToString(digestBytes, Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING);
        } catch (Exception e) {
            throw e;
        }
        return hashedData;
    }

    /**
     * Encodes a string in Base-64.
     * @param str Required: String to encode.
     * @return Base-64 encoded string.
     */
    public final static String encodeBase64(String str) {
        if (str == null) {
            return null;
        }
        byte[] data = str.getBytes(Charset.forName("ISO-8859-1"));
        return Base64.encodeToString(data, Base64.NO_PADDING | Base64.NO_WRAP);
    }
}
