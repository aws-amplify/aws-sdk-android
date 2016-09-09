/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * A utility class for device operations.
 */
public final class CognitoDeviceHelper {
    final static private String TAG = "CognitoDeviceHelper";
    final static private String COGNITO_DEVICE_CACHE = "CognitoIdentityProviderDeviceCache";
    final static private String COGNITO_DEVICE_KEY = "DeviceKey";
    final static private String COGNITO_DEVICE_GROUP_KEY = "DeviceGroupKey";
    final static private String COGNITO_DEVICE_SECRET = "DeviceSecret";
    final static public int DEFAULT_DEVICE_PAGINATION_LIMIT = 10;
    static deviceSRP srpCalculator = null;

    /**
     * Uses the Android class {@android.os.build} to return the model of the android device.
     *
     * @return Device model name, which is also the name of the device.
     */
    public static String getDeviceName() {
        return Build.MODEL;
    }

    /**
     * Returns the cached key for this device. Device keys are stored in SharedPreferences and are
     * used to track devices. Returns null if no device key was cached.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the application.
     * @param context           REQUIRED: Application context.
     * @return device key as String, null if the device-key is not available.
     */
    public static String getDeviceKey(String username, String userPoolId, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            if (cipCachedDeviceDetails != null && cipCachedDeviceDetails.contains(COGNITO_DEVICE_KEY)) {
                return cipCachedDeviceDetails.getString(COGNITO_DEVICE_KEY, null);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
        return null;
    }

    /**
     * Returns the cached device secret for this device. Device secret is generated when the device
     * is confirmed and is used for device identification.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the application.
     * @param context           REQUIRED: Application context.
     * @return device secret as String, null if the device-key is not available.
     */
    public static String getDeviceSecret(String username, String userPoolId, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            if (cipCachedDeviceDetails != null && cipCachedDeviceDetails.contains(COGNITO_DEVICE_SECRET)) {
                return cipCachedDeviceDetails.getString(COGNITO_DEVICE_SECRET, null);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
        return null;
    }

    /**
     * Returns the cached device group key for this device. Device secret is generated when the device
     * is confirmed and is used for device identification.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the application.
     * @param context           REQUIRED: Application context.
     * @return device group key as String, null if the device-key is not available.
     */
    public static String getDeviceGroupKey(String username, String userPoolId, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            if (cipCachedDeviceDetails != null && cipCachedDeviceDetails.contains(COGNITO_DEVICE_GROUP_KEY)) {
                return cipCachedDeviceDetails.getString(COGNITO_DEVICE_GROUP_KEY, null);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
        return null;
    }

    /**
     * This method caches the device key. Device key is assigned by the Amazon Cognito service and is
     * used as a device identifier.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the device.
     * @param deviceKey         REQUIRED: Cognito assigned device key.
     * @param context           REQUIRED: App context, needed to access device datastore.
     */
    public static void cacheDeviceKey(String username, String userPoolId, String deviceKey, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            cipCachedDeviceDetails.edit().putString(COGNITO_DEVICE_KEY, deviceKey).apply();
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
    }

    /**
     * This method caches the device verifier. Device verifier is generated locally by the SDK and
     * it is used to authenticate the device through device SRP authentication.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the device.
     * @param deviceSecret      REQUIRED: Cognito assigned device key.
     * @param context           REQUIRED: App context, needed to access device datastore.
     */
    public static void cacheDeviceVerifier(String username, String userPoolId, String deviceSecret, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            cipCachedDeviceDetails.edit().putString(COGNITO_DEVICE_SECRET, deviceSecret).apply();
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
    }

    /**
     * This method caches the device group key. Device verifier is generated locally by the SDK and
     * it is used to authenticate the device through device SRP authentication.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the device.
     * @param deviceGroupKey    REQUIRED: Cognito assigned device group key.
     * @param context           REQUIRED: App context, needed to access device datastore.
     */
    public static void cacheDeviceGroupKey(String username, String userPoolId, String deviceGroupKey, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            cipCachedDeviceDetails.edit().putString(COGNITO_DEVICE_GROUP_KEY, deviceGroupKey).apply();
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
    }

    /**
     * Clears cached device details for this user.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the device.
     * @param context           REQUIRED: App context, needed to access device datastore.
     */
    public static void clearCachedDevice(String username, String userPoolId, Context context) {
        try {
            SharedPreferences cipCachedDeviceDetails = context.getSharedPreferences(getDeviceDetailsCacheForUser(username, userPoolId), 0);
            cipCachedDeviceDetails.edit().clear().apply();
        } catch (Exception e) {
            Log.e(TAG, "Error accessing SharedPreferences" + e.getMessage());
        }
    }

    /**
     * Generates SRP verification parameters for device verification.
     *
     * @param deviceKey          REQUIRED: Username this device belongs to.
     * @param deviceGroup        REQUIRED: This is the device group id returned by the service.
     * @return srp verification details for this device, as a {@link Map}.
     */
    public static Map<String, String> generateVerificationParameters(String deviceKey, String deviceGroup) {
        Map<String, String> devVerfPars = new HashMap<String, String>();
        String deviceSecret = generateRandomString();
        srpCalculator = new deviceSRP(deviceGroup, deviceKey, deviceSecret);
        byte[] salt = srpCalculator.getSalt().toByteArray();
        byte[] srpVerifier = srpCalculator.getVerifier().toByteArray();
        devVerfPars.put("salt", new String(Base64.encode(salt)));
        devVerfPars.put("verifier", new String(Base64.encode(srpVerifier)));
        devVerfPars.put("secret", deviceSecret);
        return devVerfPars;
    }

    /**
     * Generates and returns the key to access device details from shared preferences.
     *
     * @param username          REQUIRED: The current user.
     * @param userPoolId        REQUIRED: Client ID of the device.
     * @return a string which is a key to access the device key from SharedPreferences.
     */
    private static String getDeviceDetailsCacheForUser(String username, String userPoolId) {
        return COGNITO_DEVICE_CACHE + "." + userPoolId + "." + username;
    }

    /**
     * Static class for SRP related calculations for devices.
     */
    public static class deviceSRP {
        private BigInteger salt;
        private BigInteger verifier;
        private static final String HASH_ALGORITHM = "SHA-256";

        private static final ThreadLocal<MessageDigest> THREAD_MESSAGE_DIGEST =
                new ThreadLocal<MessageDigest>() {
                    @Override
                    protected MessageDigest initialValue() {
                        try {
                            return MessageDigest.getInstance(HASH_ALGORITHM);
                        } catch (NoSuchAlgorithmException e) {
                            throw new ExceptionInInitializerError(e);
                        }
                    }
                };

        private static final String HEX_N = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD1"
                + "29024E088A67CC74020BBEA63B139B22514A08798E3404DD"
                + "EF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245"
                + "E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7ED"
                + "EE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3D"
                + "C2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F"
                + "83655D23DCA3AD961C62F356208552BB9ED529077096966D"
                + "670C354E4ABC9804F1746C08CA18217C32905E462E36CE3B"
                + "E39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9"
                + "DE2BCBF6955817183995497CEA956AE515D2261898FA0510"
                + "15728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64"
                + "ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7"
                + "ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6B"
                + "F12FFA06D98A0864D87602733EC86A64521F2B18177B200C"
                + "BBE117577A615D6C770988C0BAD946E208E24FA074E5AB31"
                + "43DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";

        private static final BigInteger N = new BigInteger(HEX_N, 16);
        private static final BigInteger g = BigInteger.valueOf(2);

        private static final SecureRandom SECURE_RANDOM;

        static {
            try {
                SECURE_RANDOM = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException e) {
                throw new ExceptionInInitializerError(e);
            }
        }

        private static final int SALT_LENGTH_BITS = 128;

        public BigInteger getSalt() {
            return salt;
        }

        public BigInteger getVerifier() {
            return verifier;
        }

        public deviceSRP(String deviceGroupKey, String deviceKey, String password) {
            byte[] deviceKeyHash = getUserIdHash(deviceGroupKey, deviceKey, password);

            salt = new BigInteger(SALT_LENGTH_BITS, SECURE_RANDOM);
            verifier = calcVerifier(salt, deviceKeyHash);
        }

        private static BigInteger calcVerifier(BigInteger salt, byte[] userIdHash) {
            begin();
            update(salt);
            update(userIdHash);
            byte[] digest = end();

            BigInteger x = new BigInteger(1, digest);
            return g.modPow(x, N);
        }

        private byte[] getUserIdHash(String poolName, String userName, String password) {
            begin();
            update(poolName, userName, ":", password);
            return end();
        }

        public static void begin() {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            md.reset();
        }

        public static byte[] end() {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            return md.digest();
        }

        public static void update(String... strings) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            for (String s : strings) {
                if (s != null) {
                    md.update(s.getBytes(StringUtils.UTF8));
                }
            }
        }

        public static void update(String s) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            if (s != null) {
                md.update(s.getBytes(StringUtils.UTF8));
            }
        }

        public static void update(BigInteger... bigInts) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            for (BigInteger n : bigInts) {
                if (n != null) {
                    md.update(n.toByteArray());
                }
            }
        }

        public static void update(BigInteger n) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            if (n != null) {
                md.update(n.toByteArray());
            }
        }

        public static void update(ByteBuffer b) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            if (b != null) {
                md.update(b.array());
            }
        }

        public static void update(byte[] b) {
            MessageDigest md = THREAD_MESSAGE_DIGEST.get();
            if (b != null) {
                md.update(b);
            }
        }
    }

    /**
     * Returns a string with random characters.
     *
     * @return a string with random alpha-numeric characters.s
     */
    public static String generateRandomString() {
        UUID uuid = UUID.randomUUID();
        return String.valueOf(uuid);
    }
}
