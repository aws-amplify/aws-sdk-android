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
 */
class KeyProvider23 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider23.class);

    static final String AES_KEY_ALGORITHM = "AES";
    static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";

    /**
     * If the SharedPreferences name is "com.amazonaws.android.auth", then the encryption key
     * that is used to encrypt the data in {@link AWSKeyValueStoreVersion.VERSION_1} is stored in the alias
     * "com.amazonaws.android.auth.aesKeyStoreAlias".
     */
    static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";

    private Context context;
    private SharedPreferences sharedPreferences;

    public KeyProvider23(final Context context,
                         final SharedPreferences sharedPreferences) {
        this.context = context;
        this.sharedPreferences = sharedPreferences;
    }

    /**
     * Retrieves the key that is used for encrypting
     * and decrypting data.
     *
     * @return the symmetric key that can be used to encrypt and
     * decrypt data.
     */
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
                    throw new KeyNotFoundException("Key identified by the alias: " +
                            keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME);
                }
            } else {
                throw new KeyNotFoundException("Key identified by the alias: " +
                        keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME);
            }
        } catch (Exception ex) {
            throw new KeyNotFoundException("Key identified by the alias: " +
                    keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME, ex);
        }
    }

    /**
     * Generate the key that is used for encrypting
     * and decrypting data.
     */
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
                generator.init(
                        new KeyGenParameterSpec.Builder(keyAlias,
                                KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                                .setBlockModes(KeyProperties.BLOCK_MODE_GCM) // GCM Mode
                                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE) // NoPadding
                                .setKeySize(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS) // 256-bit key
                                .setRandomizedEncryptionRequired(false)
                                .build());
                logger.info("Generated the encryption key using Android KeyStore.");
                return generator.generateKey();
            } else {
                throw new KeyNotGeneratedException("Key already exists for the alias: " +
                        keyAlias + " in " + ANDROID_KEY_STORE_NAME);
            }
        } catch (Exception ex) {
            logger.error("Error in accessing the Android KeyStore.", ex);
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " +
                    keyAlias + " in " + ANDROID_KEY_STORE_NAME, ex);
        }
    }

    /**
     * Delete the key for the keyAlias from the
     * Android KeyStore.
     */
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
