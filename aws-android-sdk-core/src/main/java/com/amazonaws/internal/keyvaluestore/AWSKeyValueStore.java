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
import android.os.Build;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;

import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

public class AWSKeyValueStore {
    private static final Log logger = LogFactory.getLog(AWSKeyValueStore.class);

    // Map of in-memory maps
    static Map<String, HashMap<String, String>> cacheFactory = new HashMap<String, HashMap<String, String>>();

    // In-memory store operates on the key passed in and does not use the suffixes.
    private Map<String, String> cache;

    boolean isPersistenceEnabled;
    Context context;
    SharedPreferences sharedPreferences;
    final String sharedPreferencesName;
    SharedPreferences sharedPreferencesForEncryptionKey;

    private KeyProvider keyProvider;
    private Key encryptionKey;
    private SecureRandom secureRandom;
    private String keyAlias;

    private static final int ANDROID_API_LEVEL_23 = 23;
    private static final int ANDROID_API_LEVEL_18 = 18;
    private static final int ANDROID_API_LEVEL_10 = 10;

    static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    static final String CHARSET_NAME = "UTF-8";

    static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";
    static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";
    static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";
    static final String SHARED_PREFERENCES_ENCRYPTION_KEY_NAMPESPACE_SUFFIX = ".encryptionkey";
    static final String KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";
    static final String KEY_STORE_ALIAS_FOR_RSA_SUFFIX = ".rsaKeyStoreAlias";

    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;

    private static final Object LOCK = new Object();

    private int apiLevel;

    private static Map<String, String> getCacheForKey(String key) {
        if (cacheFactory.containsKey(key)) {
            return cacheFactory.get(key);
        } else {
            HashMap<String, String> cache = new HashMap<String, String>();
            cacheFactory.put(key, cache);
            return cache;
        }
    }

    /**
     * Constructor.
     * @param context the Android application context
     * @param sharedPreferencesName the name of the preferences
     *                              that namespaces the information to be stored
     * @param isPersistenceEnabled flag if disabled does not store the
     *                         data in SharedPreferences.
     *                         enabled (set to true) by default
     */
    public AWSKeyValueStore(final Context context,
                            final String sharedPreferencesName,
                            final boolean isPersistenceEnabled) {
        synchronized (LOCK) {
            this.secureRandom = new SecureRandom();
            this.cache = getCacheForKey(sharedPreferencesName);
            this.sharedPreferencesName = sharedPreferencesName;
            this.apiLevel = Build.VERSION.SDK_INT;
            this.context = context;
            setPersistenceEnabled(isPersistenceEnabled);
        }
    }

    public void setPersistenceEnabled(boolean isPersistenceEnabled) {
        synchronized (LOCK) {
            if (isPersistenceEnabled && !this.isPersistenceEnabled) {
                this.sharedPreferences = context.getSharedPreferences(sharedPreferencesName,
                        Context.MODE_PRIVATE);
                this.sharedPreferencesForEncryptionKey = context.getSharedPreferences(
                        sharedPreferencesName + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMPESPACE_SUFFIX,
                        Context.MODE_PRIVATE);

                logger.info("Detected Android API Level = " + apiLevel);

                if (apiLevel >= ANDROID_API_LEVEL_23) {
                    //@apiLevel23Start
                    this.keyAlias = sharedPreferencesName + KEY_STORE_ALIAS_FOR_AES_SUFFIX;
                    logger.info("Using keyAlias = " + keyAlias);
                    keyProvider = new KeyProvider23();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, keyAlias, context);
                    //@apiLevel23End
                } else if (apiLevel >= ANDROID_API_LEVEL_18) {
                    //@apiLevel18Start
                    this.keyAlias = sharedPreferencesName + KEY_STORE_ALIAS_FOR_RSA_SUFFIX;
                    logger.info("Using keyAlias = " + keyAlias);
                    keyProvider = new KeyProvider18();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, keyAlias, context);
                    //@apiLevel18End
                } else if (apiLevel >= ANDROID_API_LEVEL_10) {
                    //@apiLevel10Start
                    keyProvider = new KeyProvider10();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, null, context);
                    //@apiLevel10End
                } else {
                    logger.error("API Level " +
                            String.valueOf(Build.VERSION.SDK_INT) +
                            " not supported by the SDK. " +
                            "Setting persistence to false.");
                    this.isPersistenceEnabled = false;
                }

                logger.info("Creating the AWSKeyValueStore with key for " +
                        "sharedPreferences = " + sharedPreferencesName);

                onMigrateFromNoEncryption();
            } else if (!isPersistenceEnabled) {
                logger.info("Persistence is disabled. Data will be accessed from memory.");
            }

            // Clear the data stored in SharedPreferences.
            if (!isPersistenceEnabled && this.isPersistenceEnabled) {
                sharedPreferences.edit()
                        .clear()
                        .apply();
            }

            this.isPersistenceEnabled = isPersistenceEnabled;
        }
    }

    public boolean contains(String key) {
        synchronized (LOCK) {
            if (isPersistenceEnabled) {
                final String actualKey = key + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
                return sharedPreferences.contains(actualKey);
            } else {
                return cache.containsKey(key);
            }
        }
    }

    public synchronized String get(String key) {
        synchronized (LOCK) {
            if (isPersistenceEnabled) {
                final String actualKey = key + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;

                // If data not found for the key, return null.
                if (!sharedPreferences.contains(actualKey)) {
                    return null;
                }

                try {
                    // If the version of data stored mismatches with the version of the store,
                    // return null.
                    final int keyValueStoreVersion = Integer.parseInt(
                            sharedPreferences
                                    .getString(actualKey + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));
                    if (keyValueStoreVersion != AWS_KEY_VALUE_STORE_VERSION) {
                        logger.error("The version of the data read from SharedPreferences for " +
                                key + " does not match the version of the store.");
                        return null;
                    }

                    // Read from store -> Base64 decode -> decrypt -> convert to string
                    final String encryptedData = sharedPreferences.getString(actualKey, null);
                    byte[] iv = getInitializationVector(actualKey);
                    String decryptedDataInString = decrypt(
                            //@apiLevel23Start
                            apiLevel >= ANDROID_API_LEVEL_23 ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv) :
                            //@apiLevel23End
                            new IvParameterSpec(iv), encryptedData);
                    cache.put(key, decryptedDataInString);
                    return decryptedDataInString;
                } catch (Exception ex) {
                    logger.error("Error in decrypting data. ", ex);
                    return null;
                }
            } else {
                return cache.get(key);
            }
        }
    }

    public void put(String key, String value) {
        synchronized (LOCK) {
            if (key == null) {
                throw new IllegalArgumentException("Key cannot be null");
            }

            // Irrespective of persistence is enabled or not, store in memory.
            cache.put(key, value);

            // Persistence
            // Convert string to bytes -> Encrypt -> Base64 encode -> Store
            if (isPersistenceEnabled) {
                if (value == null) {
                    logger.debug("Value is null. Removing the data, IV and version from SharedPreferences");
                    remove(key);
                    return;
                }

                final String actualKey = key + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
                try {
                    // Encrypt
                    byte[] iv = generateInitializationVector();
                    String encryptedData = encrypt(
                            //@apiLevel23Start
                            apiLevel >= ANDROID_API_LEVEL_23 ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv) :
                            //@apiLevel23End
                            new IvParameterSpec(iv), value);

                    // Persist
                    sharedPreferences
                            .edit()
                            .putString(actualKey, encryptedData) // Data
                            .putString(actualKey + SHARED_PREFERENCES_IV_SUFFIX, Base64.encodeAsString(iv)) // IV
                            .putString(actualKey + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, String.valueOf(AWS_KEY_VALUE_STORE_VERSION)) // KeyValueStore Version
                            .apply();
                } catch (Exception ex) {
                    logger.error("Error in encrypting data. ", ex);
                }
            }
        }
    }

    public void remove(String key) {
        synchronized (LOCK) {
            // Irrespective of persistence is enabled or not, mutate in memory.
            cache.remove(key);

            if (isPersistenceEnabled) {
                final String actualKey = key + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
                sharedPreferences.edit()
                        .remove(actualKey)
                        .remove(actualKey + SHARED_PREFERENCES_IV_SUFFIX)
                        .remove(actualKey + SHARED_PREFERENCES_STORE_VERSION_SUFFIX)
                        .apply();
            }
        }
    }

    public void clear() {
        synchronized (LOCK) {
            cache.clear();

            if (isPersistenceEnabled) {
                sharedPreferences.edit()
                        .clear()
                        .apply();
            }
        }
    }

    /**
     * Migrate all the keys in the SharedPreferences namespace
     * except for the encryption metadata
     */
    private void onMigrateFromNoEncryption() {
        Map<String, ?> map = sharedPreferences.getAll();
        for (String spKey : map.keySet()) {
            if (!spKey.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_IV_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {

                // Check if its an instance of the dataType.
                if (map.get(spKey) instanceof Long) {
                    Long longValue = sharedPreferences.getLong(spKey, 0);
                    put(spKey, String.valueOf(longValue));
                } else if (map.get(spKey) instanceof String) {
                    put(spKey, sharedPreferences.getString(spKey, null));
                } else if (map.get(spKey) instanceof Float) {
                    Float floatValue = sharedPreferences.getFloat(spKey, 0);
                    put(spKey, String.valueOf(floatValue));
                } else if (map.get(spKey) instanceof Boolean) {
                    Boolean booleanValue = sharedPreferences.getBoolean(spKey, false);
                    put(spKey, String.valueOf(booleanValue));
                } else if (map.get(spKey) instanceof Integer) {
                    Integer intValue = sharedPreferences.getInt(spKey, 0);
                    put(spKey, String.valueOf(intValue));
                }

                // Remove the key since key.encrypted is written.
                sharedPreferences.edit().remove(spKey).apply();
            }
        }
    }

    private String encrypt(AlgorithmParameterSpec ivSpec, String data) {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(Cipher.ENCRYPT_MODE,
                    encryptionKey,
                    ivSpec);
            byte[] encryptedData = cipher.doFinal(data.getBytes(CHARSET_NAME));
            return Base64.encodeAsString(encryptedData);
        } catch (Exception ex) {
            logger.error("Error in encrypting data. ", ex);
            return null;
        }
    }

    private String decrypt(AlgorithmParameterSpec ivSpec, String encryptedData) {
        try {
            byte[] encryptedDecodedData = Base64.decode(encryptedData);
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(Cipher.DECRYPT_MODE,
                    encryptionKey,
                    ivSpec);
            byte[] decryptedData = cipher.doFinal(encryptedDecodedData);
            return new String(decryptedData, CHARSET_NAME);
        } catch (Exception ex) {
            logger.error("Error in decrypting data. ", ex);
            return null;
        }
    }

    private byte[] getInitializationVector(final String keyOfDataInSharedPreferences) {
        final String keyOfIV = keyOfDataInSharedPreferences + SHARED_PREFERENCES_IV_SUFFIX;

        // If IV is present, load it
        if (sharedPreferences.contains(keyOfIV)) {
            return Base64.decode(sharedPreferences.getString(keyOfIV, null));
        }

        return null;
    }

    private byte[] generateInitializationVector() {
        // Else, generate one and save it in SharedPreferences
        byte[] initializationVector = new byte[CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES];
        secureRandom.nextBytes(initializationVector);
        return initializationVector;
    }
}
