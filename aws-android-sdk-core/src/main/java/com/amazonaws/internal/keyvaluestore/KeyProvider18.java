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
import android.security.KeyPairGeneratorSpec;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;

import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/**
 * This provider is used on API Levels 18 through 23.
 * It generates a AES 256-bit symmetric key which is
 * used to encrypt the data. It also generates a master
 * key using RSA provided by AndroidKeyStore and uses
 * the RSA key to encrypt the AES key. The size of the
 * RSA key is 2048 bits by default.
 *
 * Once the AES key is encrypted with the RSA key, the
 * encrypted AES key is stored in SharedPreferences.
 *
 * For subsequent calls to getKey, if KeyStore contains
 * the RSA key, it is used to decrypt the AES key stored
 * in SharedPreferences. The AES key is returned in the
 * getKey call.
 */
public class KeyProvider18 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider18.class);

    static final String KEY_ALGORITHM_AES = "AES";
    static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";

    static final String KEY_ALGORITHM_RSA = "RSA";
    static final String CIPHER_RSA_MODE = "RSA/ECB/PKCS1Padding";
    static final String CIPHER_PROVIDER_NAME_FOR_RSA = "AndroidOpenSSL";

    static final String ENCRYPTED_AES_KEY = "AesGcmNoPadding18-encrypted-encryption-key";

    /**
     * If the SharedPreferences name is "com.amazonaws.android.auth", then the encryption key
     * that is used to encrypt the data in keyvaluestoreversion 1 is stored in the alias
     * "com.amazonaws.android.auth.rsaKeyStoreAlias".
     */
    static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_RSA_SUFFIX = ".rsaKeyStoreAlias";

    private SecureRandom secureRandom;
    private Context context;
    private SharedPreferences sharedPreferences;

    public KeyProvider18(final Context context,
                         final SharedPreferences sharedPreferences) {
        this.context = context;
        this.sharedPreferences = sharedPreferences;
    }

    private byte[] rsaEncrypt(String keyAlias, byte[] rawData) {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(
                    keyAlias, null);

            Cipher encryptCipher = Cipher.getInstance(CIPHER_RSA_MODE, CIPHER_PROVIDER_NAME_FOR_RSA);
            encryptCipher.init(Cipher.ENCRYPT_MODE,
                    privateKeyEntry.getCertificate().getPublicKey());

            return encryptCipher.doFinal(rawData);
        } catch (Exception ex) {
            logger.error("Exception occurred while encrypting data. " + ex.getMessage());
            return null;
        }
    }

    private byte[] rsaDecrypt(String keyAlias, byte[] encryptedData) {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(
                    keyAlias, null);

            Cipher decryptCipher = Cipher.getInstance(CIPHER_RSA_MODE, CIPHER_PROVIDER_NAME_FOR_RSA);
            decryptCipher.init(Cipher.DECRYPT_MODE,
                    privateKeyEntry.getPrivateKey());

            return decryptCipher.doFinal(encryptedData);
        } catch (Exception ex) {
            logger.error("Exception occurred while decrypting data. " + ex.getMessage());
            return null;
        }
    }

    /**
     * Retrieves the key that is used for encrypting
     * and decrypting data.
     *
     * @param keyAlias The alias of the key held in AndroidKeyStore
     *                 if AndroidKeyStore is used for key generation.
     * @return the symmetric key that can be used to encrypt and
     * decrypt data.
     */
    @Override
    public synchronized Key generateKey(final String keyAlias) throws KeyNotGeneratedException {
        try {
            // K1 - Generate the RSA key from the keystore.
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            Calendar start = Calendar.getInstance();
            Calendar end = Calendar.getInstance();
            end.add(Calendar.YEAR, 30);
            KeyPairGeneratorSpec spec = new KeyPairGeneratorSpec.Builder(context)
                    .setAlias(keyAlias)
                    .setSubject(new X500Principal("CN=" + keyAlias))
                    .setSerialNumber(BigInteger.TEN)
                    .setStartDate(start.getTime())
                    .setEndDate(end.getTime())
                    .build();
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(
                    KEY_ALGORITHM_RSA,
                    ANDROID_KEY_STORE_NAME);
            kpg.initialize(spec);
            kpg.generateKeyPair();

            // K2 - Generate the AES Data Encryption key
            this.secureRandom = new SecureRandom();
            KeyGenerator generator = KeyGenerator.getInstance(KEY_ALGORITHM_AES);
            generator.init(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS, secureRandom);
            SecretKey aesEncryptionKey = generator.generateKey();

            // Encrypt K2 using K1
            sharedPreferences.edit()
                    .putString(ENCRYPTED_AES_KEY,
                            Base64.encodeAsString(rsaEncrypt(keyAlias, aesEncryptionKey.getEncoded())))
                    .apply();

            logger.info("Generated and saved the encryption key to SharedPreferences");
            return aesEncryptionKey;
        } catch (Exception ex) {
            throw new KeyNotGeneratedException("Key already exists for the alias: " +
                    keyAlias + " in " + ANDROID_KEY_STORE_NAME);
        }
    }

    @Override
    public synchronized Key retrieveKey(final String keyAlias) throws KeyNotFoundException {
        try {
            // Load the RSA key from the keystore.
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            if (!keyStore.containsAlias(keyAlias)) {
                throw new KeyNotFoundException("Key identified by the alias: " +
                        keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME);
            }

            // Check if SharedPreferences has the encrypted AES key
            if (sharedPreferences.contains(ENCRYPTED_AES_KEY)) {
                logger.debug("Loading the encryption key from SharedPreferences");
                String encryptedAesEncryptionKey = sharedPreferences
                        .getString(ENCRYPTED_AES_KEY, null);
                return new SecretKeySpec(
                        rsaDecrypt(keyAlias, Base64.decode(encryptedAesEncryptionKey)),
                        KEY_ALGORITHM_AES);
            } else {
                throw new KeyNotFoundException("Key identified by the alias: " +
                        keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME);
            }
        } catch (Exception ex) {
            throw new KeyNotFoundException("Key identified by the alias: " +
                    keyAlias + " cannot be found in " + ANDROID_KEY_STORE_NAME);
        }
    }

    @Override
    public synchronized void deleteKey(final String keyAlias) {
        try {
            sharedPreferences.edit()
                    .remove(ENCRYPTED_AES_KEY)
                    .apply();

            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
            keyStore.load(null);

            keyStore.deleteEntry(keyAlias);
        } catch (Exception ex) {
            logger.error("Error in deleting the key." + ex);
        }
    }
}
