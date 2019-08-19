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

import android.content.Context;
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

    static final String AES_KEY_ALGORITHM = "AES";
    static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String KEY_ALIAS = "AesGcmNoPaddingEncryption10-encryption-key";

    private SecureRandom secureRandom = new SecureRandom();
    private Context context;
    private SharedPreferences sharedPreferences;

    /**
     * Construct the KeyProvider object for Android API levels
     * 10 through 17.
     *
     * @param context Android application context
     * @param sharedPreferences reference to SharedPreferences
     *                          which holds the encryption key
     */
    public KeyProvider10(final Context context,
                         final SharedPreferences sharedPreferences) {
        this.context = context;
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public synchronized Key generateKey(final String keyAlias) throws KeyNotGeneratedException {
        try {
            // Generate the key
            KeyGenerator generator = KeyGenerator.getInstance(AES_KEY_ALGORITHM);
            generator.init(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS, secureRandom);
            final SecretKey secretKey = generator.generateKey();

            // Save the key to SharedPreferences
            sharedPreferences.edit()
                    .putString(keyAlias,
                            Base64.encodeAsString(secretKey.getEncoded()))
                    .apply();

            logger.info("Generated and saved the encryption key to SharedPreferences");
            return secretKey;
        } catch (Exception ex) {
            logger.error("Error in loading the key from keystore.");
            throw new KeyNotGeneratedException("Encryption key cannot be retrieved.", ex);
        }
    }

    @Override
    public synchronized Key retrieveKey(final String keyAlias) throws KeyNotFoundException {
        try {
            // If SharedPreferences contains the key, load it.
            if (sharedPreferences.contains(keyAlias)) {
                logger.debug("Loading the encryption key from SharedPreferences");
                final String keyInStringFormat = sharedPreferences
                        .getString(keyAlias, null);
                return new SecretKeySpec(Base64.decode(keyInStringFormat), AES_KEY_ALGORITHM);
            } else {
                throw new KeyNotFoundException("Encryption key cannot be found.");
            }
        } catch (Exception ex) {
            logger.error("Error in loading the key from keystore.");
            throw new KeyNotFoundException("Encryption key cannot be found.");
        }
    }

    @Override
    public synchronized void deleteKey(final String keyAlias) {
        sharedPreferences.edit()
                .remove(keyAlias)
                .apply();
    }
}
