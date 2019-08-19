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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

public class AWSKeyValueStore {
    private static final Log logger = LogFactory.getLog(AWSKeyValueStore.class);

    // Map of in-memory maps
    // Scenario: Two CognitoCachingCredentialsProvider objects which have the same
    // SharedPreferences Name, which means they operate on the same persistent store
    // This cacheFactory will maintain a reference to the same cache for the same
    // SharedPreferences Name thus producing a 1:1 mapping between a in-memory cache
    // and the SharedPreferences.
    static Map<String, HashMap<String, String>> cacheFactory = new HashMap<String, HashMap<String, String>>();

    // In-memory store operates on the key passed in and does not use the suffixes.
    Map<String, String> cache;

    boolean isPersistenceEnabled;
    Context context;
    SharedPreferences sharedPreferencesForData;
    final String sharedPreferencesName;
    SharedPreferences sharedPreferencesForEncryptionMaterials;

    KeyProvider keyProvider;
    SecureRandom secureRandom;

    static final int ANDROID_API_LEVEL_23 = 23;
    static final int ANDROID_API_LEVEL_18 = 18;
    static final int ANDROID_API_LEVEL_10 = 10;

    static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    static final String CHARSET_NAME = "UTF-8";

    /**
     * The data key in SharedPreferences will have this suffix.
     *
     * For example: if the key to access data is "accessKey", the SharedPreferences
     * key will be "accessKey.encrypted"
     */
    static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";

    /**
     * The IV used to encrypt data will be stored under the key
     * "accessKey.encrypted.iv"
     */
    static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";

    /**
     * The version of the KeyValueStore will be stored under the key
     * "accessKey.encrypted.keyvaluestoreversion"
     */
    static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";

    /**
     * If the SharedPreferences name is "com.amazonaws.android.auth" where the data will be persisted,
     * then an additional SharedPreferences with name "com.amazonaws.android.auth.encryptionkey" will be
     * created to store the encryption materials.
     *
     * Currently this is used only by the implementations in API Levels
     * (10-17 - KeyProvider10 and 18-22 - KeyProvider18).
     */
    static final String SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX = ".encryptionkey";

    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;

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
        this.secureRandom = new SecureRandom();
        this.cache = getCacheForKey(sharedPreferencesName);
        this.sharedPreferencesName = sharedPreferencesName;
        this.apiLevel = Build.VERSION.SDK_INT;
        this.context = context;
        setPersistenceEnabled(isPersistenceEnabled);
    }

    public synchronized void setPersistenceEnabled(boolean isPersistenceEnabled) {
        try {
            boolean previousIsPersistenceEnabled = this.isPersistenceEnabled;
            this.isPersistenceEnabled = isPersistenceEnabled;
            // Transitioning from false to true for isPersistenceEnabled
            if (isPersistenceEnabled && !previousIsPersistenceEnabled) {
                this.sharedPreferencesForData = context.getSharedPreferences(sharedPreferencesName,
                        Context.MODE_PRIVATE);
                this.sharedPreferencesForEncryptionMaterials = context.getSharedPreferences(
                        sharedPreferencesName + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX,
                        Context.MODE_PRIVATE);

                initKeyProviderBasedOnAPILevel();

                logger.info("Detected Android API Level = " + apiLevel);
                logger.info("Creating the AWSKeyValueStore with key for " +
                        "sharedPreferencesForData = " + sharedPreferencesName);

                onMigrateFromNoEncryption();
            } else if (!isPersistenceEnabled) {
                logger.info("Persistence is disabled. Data will be accessed from memory.");
            }

            // Transitioning from true to false for isPersistenceEnabled
            // Clear the data stored in SharedPreferences.
            if (!isPersistenceEnabled && previousIsPersistenceEnabled) {
                sharedPreferencesForData.edit()
                        .clear()
                        .apply();
            }
        } catch (Exception ex) {
            logger.error("Error in enabling persistence for Cognito UserPools. " + ex);
        }
    }

    /**
     * Check if there is a key-value pair for the key
     * passed in.
     *
     * @param key that identifies the key-value pair.
     * @return true if a key-value pair exists for the key
     *         passed in.
     */
    public synchronized boolean contains(final String key) {
        if (isPersistenceEnabled) {
            return sharedPreferencesForData.contains(getKeyUsedInPersistentStore(key));
        } else {
            return cache.containsKey(key);
        }
    }

    /**
     * Retrieve the value for the given key from the key-value store.
     *
     * First, retrieve the data from in-memory cache always.
     * Only if the in-memory cache does not contain the data,
     * go to the persistent store, read the data and return.
     *
     * @param dataKey key that identifies the value to be retrieved.
     * @return the value corresponding to the key.
     */
    public synchronized String get(final String dataKey) {
        if (isPersistenceEnabled) {
            if (dataKey == null) {
                return null;
            }

            // Retrieve the decryption key used for decrypting the data.

            // dataKey becomes dataKey.encrypted
            String dataKeyInPersistentStore = getKeyUsedInPersistentStore(dataKey);

            // Get the encryption key alias
            String encryptionKeyAlias = getEncryptionKeyAlias();

            // Based on the encryption key alias, retrieve the encryption key
            // If the encryption key cannot be retrieved, return null and
            // the consumer of get would treat it as if this data is not present
            // on the persistent store.
            Key decryptionKey = retrieveEncryptionKey(encryptionKeyAlias);
            if (decryptionKey == null) {
                logger.error("Error in retrieving the decryption key " +
                        "used to decrypt the data from the persistent store. " +
                        "Returning null for the requested dataKey = " + dataKey);
                return null;
            }

            // If the key-value pair is not found in the SharedPreferences,
            // return null.
            if (!sharedPreferencesForData.contains(dataKeyInPersistentStore)) {
                return null;
            }

            try {
                // If the version of data stored mismatches with the version of the store,
                // return null.
                final int keyValueStoreVersion = Integer.parseInt(
                        sharedPreferencesForData
                                .getString(dataKeyInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));
                if (keyValueStoreVersion != AWS_KEY_VALUE_STORE_VERSION) {
                    logger.error("The version of the data read from SharedPreferences for " +
                            dataKey + " does not match the version of the store.");
                    return null;
                }

                // Read from the SharedPreferences and decrypt
                final String encryptedData = sharedPreferencesForData.getString(dataKeyInPersistentStore, null);
                byte[] iv = getInitializationVector(dataKeyInPersistentStore);
                String decryptedDataInString = decrypt(decryptionKey,
                        //@apiLevel23Start
                        apiLevel >= ANDROID_API_LEVEL_23 ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv) :
                        //@apiLevel23End
                        new IvParameterSpec(iv), encryptedData);

                // Update the in-memory cache after read from disk.
                cache.put(dataKey, decryptedDataInString);
                return decryptedDataInString;
            } catch (Exception ex) {
                logger.error("Error in retrieving value for dataKey = " + dataKey, ex);

                // Remove the dataKey and its associated value if there is an exception in decryption
                remove(dataKey);
                return null;
            }
        } else {
            return cache.get(dataKey);
        }
    }

    /**
     * Store the key-value pair in the key-value store.
     *
     * First, store it in-memory.
     * If isPersistenceEnabled is true, store it in the persistent
     * store.
     *
     * In cases of error while persisting to disk, th subsequent read
     * will get null.
     *
     * @param dataKey key that identifies the value
     * @param value data that needs to be stored
     */
    public synchronized void put(final String dataKey, final String value) {
        if (dataKey == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        // Irrespective of persistence is enabled or not, store in memory.
        cache.put(dataKey, value);

        // Persistence
        // Convert string to bytes -> Encrypt -> Base64 encode -> Store
        if (isPersistenceEnabled) {
            if (value == null) {
                logger.debug("Value is null. Removing the data, IV and version from SharedPreferences");
                cache.remove(dataKey);
                remove(dataKey);
                return;
            }

            // dataKey becomes dataKey.encrypted
            String dataKeyInPersistentStore = getKeyUsedInPersistentStore(dataKey);

            // Get the encryption key alias
            String encryptionKeyAlias = getEncryptionKeyAlias();

            // Based on the encryption key alias, retrieve the encryption key
            // If the encryption key cannot be retrieved, create a new encryption key
            // with the encryption key alias.
            Key encryptionKey = retrieveEncryptionKey(encryptionKeyAlias);
            if (encryptionKey == null) {
                // If the encryption key is null, create a new encryption key
                encryptionKey = generateEncryptionKey(encryptionKeyAlias);
                if (encryptionKey == null) {
                    logger.error("Error in generating or retrieving the encryption key " +
                            "used to encrypt the data before storing. Skipping persisting the data " +
                            "in the persistent store.");
                    return;
                }
            }

            try {
                // Encrypt
                byte[] iv = generateInitializationVector();
                String encryptedData = encrypt(encryptionKey,
                        //@apiLevel23Start
                        apiLevel >= ANDROID_API_LEVEL_23 ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv) :
                        //@apiLevel23End
                        new IvParameterSpec(iv), value);

                // Persist
                sharedPreferencesForData
                        .edit()
                        .putString(dataKeyInPersistentStore, encryptedData) // Data
                        .putString(dataKeyInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, Base64.encodeAsString(iv)) // IV
                        .putString(dataKeyInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, String.valueOf(AWS_KEY_VALUE_STORE_VERSION)) // KeyValueStore Version
                        .apply();
            } catch (Exception ex) {
                logger.error("Error in storing value for dataKey = " + dataKey, ex);
            }
        }
    }

    /**
     * Remove the key-value pair identified by the key
     * from the key-value store.
     *
     * remove(key) will remove from in-memory and
     * the persistent store if isPersistenceEnabled is true.
     *
     * @param key identifies the key-value pair to be removed
     */
    public synchronized void remove(String key) {
        // Irrespective of persistence is enabled or not, mutate in memory.
        cache.remove(key);

        if (isPersistenceEnabled) {
            final String keyUsedInPersistentStore = getKeyUsedInPersistentStore(key);

            sharedPreferencesForData.edit()
                    .remove(keyUsedInPersistentStore)
                    .remove(keyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX)
                    .remove(keyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX)
                    .apply();
        }
    }

    /**
     * Clears all the data stored in this key-value store.
     *
     * Clears in-memory. If isPersistenceEnabled is true,
     * clears the data persisted on disk.
     */
    public synchronized void clear() {
        cache.clear();

        if (isPersistenceEnabled) {
            sharedPreferencesForData.edit()
                    .clear()
                    .apply();
        }
    }

    private String encrypt(Key encryptionKey, AlgorithmParameterSpec ivSpec, String data) {
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

    private String decrypt(Key decryptionKey, AlgorithmParameterSpec ivSpec, String encryptedData) {
        try {
            byte[] encryptedDecodedData = Base64.decode(encryptedData);
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(Cipher.DECRYPT_MODE,
                    decryptionKey,
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
        if (sharedPreferencesForData.contains(keyOfIV)) {
            return Base64.decode(sharedPreferencesForData.getString(keyOfIV, null));
        }

        return null;
    }

    private byte[] generateInitializationVector() {
        // Else, generate one and save it in SharedPreferences
        byte[] initializationVector = new byte[CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES];
        secureRandom.nextBytes(initializationVector);
        return initializationVector;
    }

    private synchronized Key retrieveEncryptionKey(final String encryptionKeyAlias) {
        try {
            return keyProvider.retrieveKey(encryptionKeyAlias);
        } catch (KeyNotFoundException keyNotFoundException) {
            // When Key cannot be retrieved, any existing encrypted data
            // cannot be decrypted successfully. Hence, deleting all the
            // existing encrypted data stored in SharedPreferences
            // and any in-memory state stored in the cacheFactory.

            // Clears the encryption keys if stored on SharedPreferences
            keyProvider.deleteKey(encryptionKeyAlias);
            return null;
        }
    }

    synchronized Key generateEncryptionKey(final String encryptionKeyAlias) {
        // Try to generate a new key.
        try {
            return keyProvider.generateKey(encryptionKeyAlias);
        } catch (KeyNotGeneratedException keyNotGeneratedException) {
            logger.error("Encryption Key cannot be generated " +
                            "successfully.",
                    keyNotGeneratedException);
            return null;
        }
    }

    private String getKeyUsedInPersistentStore(final String key) {
        if (key == null) {
            return null;
        }

        return key + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
    }

    private String getEncryptionKeyAlias() {
        if (apiLevel >= ANDROID_API_LEVEL_23) {
            //@apiLevel23Start
            return sharedPreferencesName +
                    KeyProvider23.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX;
            //@apiLevel23End
        } else if (apiLevel >= ANDROID_API_LEVEL_18) {
            //@apiLevel18Start
            return sharedPreferencesName +
                    KeyProvider18.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_RSA_SUFFIX;
            //@apiLevel18End
        } else if (apiLevel >= ANDROID_API_LEVEL_10) {
            //@apiLevel10Start
            return KeyProvider10.KEY_ALIAS;
            //@apiLevel10End
        } else {
            logger.error("API Level " +
                    String.valueOf(Build.VERSION.SDK_INT) +
                    " not supported by the SDK. " +
                    "Setting persistence to false.");
            this.isPersistenceEnabled = false;
        }
        return null;
    }

    void initKeyProviderBasedOnAPILevel() {
        if (apiLevel >= ANDROID_API_LEVEL_23) {
            //@apiLevel23Start
            keyProvider = new KeyProvider23(context, sharedPreferencesForEncryptionMaterials);
            //@apiLevel23End
        } else if (apiLevel >= ANDROID_API_LEVEL_18) {
            //@apiLevel18Start
            keyProvider = new KeyProvider18(context, sharedPreferencesForEncryptionMaterials);
            //@apiLevel18End
        } else if (apiLevel >= ANDROID_API_LEVEL_10) {
            //@apiLevel10Start
            keyProvider = new KeyProvider10(context, sharedPreferencesForEncryptionMaterials);
            //@apiLevel10End
        } else {
            logger.error("API Level " +
                    String.valueOf(Build.VERSION.SDK_INT) +
                    " not supported by the SDK. " +
                    "Setting persistence to false.");
            this.isPersistenceEnabled = false;
        }
    }

    /**
     * Migrate all the keys in the SharedPreferences namespace
     * except for the encryption metadata
     */
    private void onMigrateFromNoEncryption() {
        Map<String, ?> map = sharedPreferencesForData.getAll();
        for (String spKey : map.keySet()) {
            if (!spKey.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_IV_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {

                // Check if its an instance of the dataType.
                if (map.get(spKey) instanceof Long) {
                    Long longValue = sharedPreferencesForData.getLong(spKey, 0);
                    put(spKey, String.valueOf(longValue));
                } else if (map.get(spKey) instanceof String) {
                    put(spKey, sharedPreferencesForData.getString(spKey, null));
                } else if (map.get(spKey) instanceof Float) {
                    Float floatValue = sharedPreferencesForData.getFloat(spKey, 0);
                    put(spKey, String.valueOf(floatValue));
                } else if (map.get(spKey) instanceof Boolean) {
                    Boolean booleanValue = sharedPreferencesForData.getBoolean(spKey, false);
                    put(spKey, String.valueOf(booleanValue));
                } else if (map.get(spKey) instanceof Integer) {
                    Integer intValue = sharedPreferencesForData.getInt(spKey, 0);
                    put(spKey, String.valueOf(intValue));
                } else if (map.get(spKey) instanceof Set) {
                    Set<String> stringSet = (Set<String>) map.get(spKey);
                    StringBuilder stringBuilder = new StringBuilder();
                    Iterator<String> setIterator = stringSet.iterator();
                    while (setIterator.hasNext()) {
                        stringBuilder.append(setIterator.next());
                        if (setIterator.hasNext()) {
                            stringBuilder.append(",");
                        }
                    }
                    put(spKey, stringBuilder.toString());
                }

                // Remove the key since key.encrypted is written.
                sharedPreferencesForData.edit().remove(spKey).apply();
            }
        }
    }
}
