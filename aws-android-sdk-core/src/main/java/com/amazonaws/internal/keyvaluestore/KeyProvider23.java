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
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.security.Key;
import java.security.KeyStore;

import javax.crypto.KeyGenerator;

/**
 * This provider generates a AES 256-bit key using
 * AndroidKeyStore.
 *
 * For subsequent calls, the AndroidKeyStore is checked
 * for the existence of a key. If present, it is returned.
 * Else, a new key is generated using AndroidKeyStore and
 * returned.
 */
class KeyProvider23 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider23.class);

    static final String AES_KEY_ALGORITHM = "AES";
    static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";

    private static final Object LOCK = new Object();

    @Override
    public Key getKey(SharedPreferences sharedPreferences,
                      String keyAlias,
                      Context context) {
        synchronized (LOCK) {
            try {
                KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
                keyStore.load(null);

                // If the keystore does not have keys for this alias, generate a new
                // asymmetric AES/GCM/NoPadding key pair.
                if (!keyStore.containsAlias(keyAlias)) {
                    KeyGenerator generator = KeyGenerator.getInstance(
                            AES_KEY_ALGORITHM,
                            ANDROID_KEY_STORE_NAME);
                    generator.init(
                            new KeyGenParameterSpec.Builder(keyAlias,
                                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM) // GCM Mode
                                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE) // NoPadding
                                    .setKeySize(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS) // 256-bit key
                                    .setRandomizedEncryptionRequired(false)
                                    .build());
                    Key key = generator.generateKey();

                    logger.info("Generated the encryption key using Android KeyStore.");
                    return key;
                } else {
                    logger.debug("AndroidKeyStore contains keyAlias " + keyAlias);
                    logger.debug("Loading the encryption key from Android KeyStore.");
                    return keyStore.getKey(keyAlias, null);
                }
            } catch (Exception ex) {
                logger.error("Error in accessing the Android KeyStore.", ex);
                throw new IllegalStateException(ex);
            }
        }
    }
}
