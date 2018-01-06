/**
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;

/**
 * Class for reading RSA private key from PEM string. It can read PEM files with
 * PKCS#8 or PKCS#1 encodings. It does not support encrypted PEM files.
 */
class PrivateKeyReader {

    /**
     * PEM string to be parsed for a key.
     */
    private final String keyPemString;

    /**
     * Create a PEM private key reader.
     *
     * @param keyPemString The private key in PEM format.
     */
    public PrivateKeyReader(String keyPemString) {
        this.keyPemString = keyPemString;
    }

    /**
     * Get a Private Key from the string.
     *
     * @return Private key
     * @throws IOException if error reading PEM string.
     * @throws InvalidKeySpecException if PKCS#1 key spec unavailable.
     */
    public PrivateKey getPrivateKey() throws IOException, InvalidKeySpecException {

        InputStream keyInputStream = new ByteArrayInputStream(
                keyPemString.getBytes(StringUtils.UTF8));
        return PEM.readPrivateKey(keyInputStream);
    }
}
