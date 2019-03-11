package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/**
 * This provider is used on API Levels 18 through 23.
 * It generates a AES 256-bit symmetric key which is
 * used to encrypt the data. It also generates a master
 * key using RSA provided by AndroidKeyStore and uses
 * the RSA key to encrypt the AES key.
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
    static final int RSA_KEY_SIZE = 2048;

    static final String ENCRYPTED_AES_KEY = "AesGcmNoPadding18-encrypted-encryption-key";

    private static final Object LOCK = new Object();

    private SecureRandom secureRandom;

    @Override
    public Key getKey(SharedPreferences sharedPreferences,
                      String keyAlias,
                      Context context) {
        synchronized (LOCK) {
            try {
                // Load the RSA key from the keystore.
                KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
                keyStore.load(null);
                initializeRSAKeyFromKeyStore(context, keyStore, keyAlias);

                // Check if SharedPreferences has the encrypted AES key
                if (sharedPreferences.contains(ENCRYPTED_AES_KEY)) {
                    String encryptedAesEncryptionKey = sharedPreferences
                            .getString(ENCRYPTED_AES_KEY, null);
                    return new SecretKeySpec(
                            rsaDecrypt(keyAlias, Base64.decode(encryptedAesEncryptionKey)),
                            KEY_ALGORITHM_AES);
                } else {
                    this.secureRandom = new SecureRandom();
                    KeyGenerator generator = KeyGenerator.getInstance(KEY_ALGORITHM_AES);
                    generator.init(CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS, secureRandom);
                    SecretKey aesEncryptionKey = generator.generateKey();

                    sharedPreferences.edit()
                            .putString(ENCRYPTED_AES_KEY,
                                    Base64.encodeAsString(rsaEncrypt(keyAlias, aesEncryptionKey.getEncoded())))
                            .apply();
                    return aesEncryptionKey;
                }
            } catch (Exception ex) {
                logger.error("Error in getting the key.", ex);
                return null;
            }
        }
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

    private void initializeRSAKeyFromKeyStore(Context context,
                                              KeyStore keyStore,
                                              String keyAlias) throws Exception {
        if (!keyStore.containsAlias(keyAlias)) {
            Calendar start = Calendar.getInstance();
            Calendar end = Calendar.getInstance();
            end.add(Calendar.YEAR, 30);
            KeyPairGeneratorSpec spec = new KeyPairGeneratorSpec.Builder(context)
                    .setAlias(keyAlias)
                    .setSubject(new X500Principal("CN=" + keyAlias))
                    .setSerialNumber(BigInteger.TEN)
                    .setStartDate(start.getTime())
                    .setEndDate(end.getTime())
                    .setKeySize(RSA_KEY_SIZE)
                    .build();
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(
                    KEY_ALGORITHM_RSA,
                    ANDROID_KEY_STORE_NAME);
            kpg.initialize(spec);
            kpg.generateKeyPair();
        } else {
            logger.info("Android KeyStore contains the alias: " + keyAlias);
        }
    }
}
