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

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import androidx.annotation.RequiresApi;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.security.Key;
import java.security.KeyStore;

import javax.crypto.KeyGenerator;

/**
 * This provider generates a AES 256-bit key using
 * AndroidKeyStore.
 */
@RequiresApi(api = Build.VERSION_CODES.M)
class KeyProvider23 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider23.class);

    private static final String AES_KEY_ALGORITHM = "AES";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";

    /**
     * If the SharedPreferences name is "com.amazonaws.android.auth", then the encryption key
     * that is used to encrypt the data is "com.amazonaws.android.auth.aesKeyStoreAlias".
     */
    static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";

    @Override
    public synchronized Key retrieveKey(final String keyAlias) throws KeyNotFoundException {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            // If the keystore does not have keys for this alias, generate a new
            // asymmetric AES/GCM/NoPadding key pair.
            if (keyStore.containsAlias(keyAlias)) {
                logger.debug("AndroidKeyStore contains keyAlias " + keyAlias);
                logger.debug("Loading the encryption key from Android KeyStore.");
                final Key key = keyStore.getKey(keyAlias, null);
                if (key != null) {
                    return key;
                } else {
                    throw new KeyNotFoundException("Key is null even though the keyAlias: " +
                            keyAlias + " is present in " + ANDROID_KEY_STORE_NAME);
                }
            } else {
                throw new KeyNotFoundException(ANDROID_KEY_STORE_NAME + " does not " +
                        "contain the keyAlias: " + keyAlias);
            }
        } catch (Exception ex) {
            throw new KeyNotFoundException("Error occurred while accessing " + ANDROID_KEY_STORE_NAME +
                    " to retrieve the key for keyAlias: " + keyAlias, ex);
        }
    }

    @Override
    public synchronized Key generateKey(final String keyAlias) throws KeyNotGeneratedException {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            // If the keystore does not have keys for this alias, generate a new
            // asymmetric AES/GCM/NoPadding key pair.
            if (!keyStore.containsAlias(keyAlias)) {
                KeyGenerator generator = KeyGenerator.getInstance(
                        AES_KEY_ALGORITHM,
                        ANDROID_KEY_STORE_NAME);

                // setRandomizedEncryptionRequired(false) because Randomized Encryption
                // does not work consistently in API levels 23-28.
                generator.init(
                        new KeyGenParameterSpec.Builder(keyAlias,
                                KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                                .setKeySize(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS)
                                .setRandomizedEncryptionRequired(false)
                                .build());
                Key key = generator.generateKey();
                logger.info("Generated the encryption key identified by the keyAlias: " +
                        keyAlias + " using " + ANDROID_KEY_STORE_NAME);
                return key;
            } else {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " +
                        keyAlias + " in " + ANDROID_KEY_STORE_NAME);
            }
        } catch (Exception ex) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " +
                    keyAlias + " in " + ANDROID_KEY_STORE_NAME, ex);
        }
    }

    @Override
    public synchronized void deleteKey(final String keyAlias) {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            keyStore.deleteEntry(keyAlias);
        } catch (Exception ex) {
            logger.error("Error in deleting the key for keyAlias: " +
                    keyAlias + " from Android KeyStore.", ex);
        }
    }
}
