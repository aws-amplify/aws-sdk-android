package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.Key;

/**
 * The interface that manages the creation
 * and retrieval of key used for encrypting
 * and decrypting data stored in SharedPreferences.
 */
interface KeyProvider {
    /**
     * Retrieves the key that is used for encrypting
     * and decrypting data.
     *
     * @param sharedPreferences The SharedPreferences instance where
     *                          the encryption key will be persisted.
     * @param keyAlias The alias of the key held in AndroidKeyStore
     *                 if AndroidKeyStore is used for key generation.
     * @param context The Android application context
     * @return the symmetric key that can be used to encrypt and
     *          decrypt data.
     */
    Key getKey(SharedPreferences sharedPreferences,
               String keyAlias,
               Context context);
}
