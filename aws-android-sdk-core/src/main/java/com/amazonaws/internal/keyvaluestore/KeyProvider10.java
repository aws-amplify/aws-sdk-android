/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.internal.keyvaluestore;

import android.content.SharedPreferences;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * This provider is used on API Levels 10 through 17.
 * It generates a AES 256-bit symmetric key and
 * stores it in a SharedPreferences.
 */
class KeyProvider10 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider10.class.getSimpleName());

    private static final String AES_KEY_ALGORITHM = "AES";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String KEY_ALIAS = "AesGcmNoPaddingEncryption10-encryption-key";

    private SharedPreferences sharedPreferences;

    /**
     * Construct the KeyProvider object for Android API levels
     * 10 through 17.
     *
     * @param sharedPreferences reference to SharedPreferences
     *                          which holds the encryption key
     */
    KeyProvider10(final SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public synchronized Key generateKey(final String aesEncryptionKeyAlias) throws KeyNotGeneratedException {
        try {
            // Generate the AES Encryption key
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator generator = KeyGenerator.getInstance(AES_KEY_ALGORITHM);
            generator.init(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS, secureRandom);
            final SecretKey secretKey = generator.generateKey();

            final SecretKey aesEncryptionKey = generator.generateKey();
            if (aesEncryptionKey == null) {
                throw new KeyNotGeneratedException("Error in generating the AES encryption key " +
                        "identified by the aesEncryptionKeyAlias: " + aesEncryptionKeyAlias);
            }

            byte[] aesEncryptionKeyInBytes = aesEncryptionKey.getEncoded();
            if (aesEncryptionKeyInBytes == null || aesEncryptionKeyInBytes.length == 0) {
                throw new KeyNotGeneratedException("Error in getting the encoded bytes for the AES " +
                        "encryption key identified by the aesEncryptionKeyAlias: " + aesEncryptionKeyAlias);
            }

            String base64EncodedStringOfEncryptedAESKey = Base64.encodeAsString(aesEncryptionKeyInBytes);
            if (base64EncodedStringOfEncryptedAESKey == null) {
                throw new KeyNotGeneratedException("Error in Base64 encoding of the AES encryption " +
                        "key for the aesEncryptionKeyAlias: " + aesEncryptionKeyAlias);
            }

            // Persist the AES Encryption key to SharedPreferences
            sharedPreferences.edit()
                    .putString(aesEncryptionKeyAlias,
                            base64EncodedStringOfEncryptedAESKey)
                    .apply();

            logger.info("Generated and saved the AES encryption key identified by the aesEncryptionKeyAlias: " +
                    aesEncryptionKeyAlias + " to SharedPreferences.");
            return secretKey;
        } catch (Exception ex) {
            throw new KeyNotGeneratedException("Error in generating the AES Encryption key " +
                    "for the aesEncryptionKeyAlias" , ex);
        }
    }

    @Override
    public synchronized Key retrieveKey(final String keyAlias) throws KeyNotFoundException {
        try {
            // If SharedPreferences contains the AES Encryption Key, load it.
            if (sharedPreferences.contains(keyAlias)) {
                logger.debug("Loading the encryption key from SharedPreferences");
                final String keyInStringFormat = sharedPreferences.getString(keyAlias, null);
                if (keyInStringFormat == null) {
                    throw new KeyNotFoundException("SharedPreferences does not " +
                            "have the key for keyAlias: " + keyAlias);
                }

                byte[] base64DecodedAESEncryptionKey = Base64.decode(keyInStringFormat);
                if (base64DecodedAESEncryptionKey == null || base64DecodedAESEncryptionKey.length == 0) {
                    throw new KeyNotFoundException("Error in Base64 decoding the AES encryption key " +
                            "identified by the keyAlias: " + keyAlias);
                }

                return new SecretKeySpec(base64DecodedAESEncryptionKey, AES_KEY_ALGORITHM);
            } else {
                throw new KeyNotFoundException("SharedPreferences does not " +
                        "have the key for keyAlias: " + keyAlias);
            }
        } catch (Exception ex) {
            throw new KeyNotFoundException("Error occurred while retrieving " +
                    "key for keyAlias: " + keyAlias, ex);
        }
    }

    @Override
    public synchronized void deleteKey(final String keyAlias) {
        try {
            sharedPreferences.edit()
                    .remove(keyAlias)
                    .apply();
        } catch (Exception ex) {
            logger.error("Error in deleting the AES key identified by " +
                    keyAlias + " from SharedPreferences.", ex);
        }
    }
}
