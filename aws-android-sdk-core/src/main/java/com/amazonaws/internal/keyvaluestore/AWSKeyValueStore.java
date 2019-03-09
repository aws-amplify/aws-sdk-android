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

    boolean isPersistenceEnabled = true;
    SharedPreferences sharedPreferences;
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
            this.isPersistenceEnabled = isPersistenceEnabled;
            this.secureRandom = new SecureRandom();
            this.cache = getCacheForKey(sharedPreferencesName);
            this.apiLevel = Build.VERSION.SDK_INT;

            if (this.isPersistenceEnabled) {
                this.sharedPreferences = context.getSharedPreferences(sharedPreferencesName,
                        Context.MODE_PRIVATE);
                this.sharedPreferencesForEncryptionKey = context.getSharedPreferences(
                        sharedPreferencesName + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMPESPACE_SUFFIX,
                        Context.MODE_PRIVATE);

                logger.info("Detected Android API Level = " + apiLevel);
                if (apiLevel >= ANDROID_API_LEVEL_23) {
                    this.keyAlias = sharedPreferencesName + KEY_STORE_ALIAS_FOR_AES_SUFFIX;
                    logger.info("Using keyAlias = " + keyAlias);
                    keyProvider = new KeyProvider23();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, keyAlias, context);
                } else if (apiLevel >= ANDROID_API_LEVEL_18) {
                    this.keyAlias = sharedPreferencesName + KEY_STORE_ALIAS_FOR_RSA_SUFFIX;
                    logger.info("Using keyAlias = " + keyAlias);
                    keyProvider = new KeyProvider18();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, keyAlias, context);
                } else if (apiLevel >= ANDROID_API_LEVEL_10) {
                    keyProvider = new KeyProvider10();
                    encryptionKey = keyProvider.getKey(sharedPreferencesForEncryptionKey, null, context);
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
            } else {
                logger.info("Persistence is disabled. Data will be accessed from memory.");
            }
        }
    }

    public void setPersistenceEnabled(boolean isPersistenceEnabled) {
        synchronized (LOCK) {
            this.isPersistenceEnabled = isPersistenceEnabled;

            // Clear the data stored in SharedPreferences.
            if (!isPersistenceEnabled) {
                sharedPreferences.edit()
                        .clear()
                        .apply();
            }
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
                    String decryptedDataInString = decrypt(apiLevel >= ANDROID_API_LEVEL_23
                            ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv)
                            : new IvParameterSpec(iv), encryptedData);
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
                    String encryptedData = encrypt(apiLevel >= ANDROID_API_LEVEL_23
                            ? new GCMParameterSpec(CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS, iv)
                            : new IvParameterSpec(iv), value);

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
     * Migrate all the keys except for the encryption metadata
     */
    private void onMigrateFromNoEncryption() {
        for (final String spKey: sharedPreferences.getAll().keySet()) {
            if (!spKey.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_IV_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {
                put(spKey, sharedPreferences.getString(spKey, null));
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
