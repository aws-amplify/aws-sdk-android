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
 *
 * For subsequent calls to getKey, if a key is present
 * in SharedPreferences, load and use the key, otherwise
 * generate a new key.
 */
class KeyProvider10 implements KeyProvider {

    private static final Log logger = LogFactory.getLog(KeyProvider10.class.getSimpleName());

    static final String AES_KEY_ALGORITHM = "AES";
    static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    static final String SHARED_PREFERENCES_KEY_NAME_FOR_ENCRYPTION_KEY = "AesGcmNoPaddingEncryption10-encryption-key";

    private SecureRandom secureRandom = new SecureRandom();

    private static final Object LOCK = new Object();

    @Override
    public Key getKey(SharedPreferences sharedPreferences, String keyAlias, Context context) {
        synchronized (LOCK) {
            try {
                // If SharedPreferences contains the key, load it.
                if (sharedPreferences.contains(SHARED_PREFERENCES_KEY_NAME_FOR_ENCRYPTION_KEY)) {
                    final String keyInStringFormat = sharedPreferences
                            .getString(SHARED_PREFERENCES_KEY_NAME_FOR_ENCRYPTION_KEY, null);
                    return new SecretKeySpec(Base64.decode(keyInStringFormat), AES_KEY_ALGORITHM);
                } else {
                    // Generate the key
                    KeyGenerator generator = KeyGenerator.getInstance(AES_KEY_ALGORITHM);
                    generator.init(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS, secureRandom);
                    final SecretKey secretKey = generator.generateKey();

                    // Save the key to SharedPreferences
                    sharedPreferences.edit()
                            .putString(SHARED_PREFERENCES_KEY_NAME_FOR_ENCRYPTION_KEY,
                                    Base64.encodeAsString(secretKey.getEncoded()))
                            .apply();
                    return secretKey;
                }
            } catch (Exception ex) {
                logger.error("Error occurred while getting the key." + ex);
                return null;
            }
        }
    }
}
