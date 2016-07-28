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

import com.amazonaws.util.StringUtils;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/**
 * Utility class for all HKDF operations.
 */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private final String algorithm;
    private SecretKey prk = null;

    public static Hkdf getInstance(String algorithm) throws NoSuchAlgorithmException {
        Mac mac = Mac.getInstance(algorithm);
        return new Hkdf(algorithm);
    }

    public void init(byte[] ikm) {
        this.init(ikm, (byte[])null);
    }

    public void init(byte[] ikm, byte[] salt) {
        byte[] realSalt = salt == null?EMPTY_ARRAY:(byte[])salt.clone();
        byte[] rawKeyMaterial = EMPTY_ARRAY;

        try {
            Mac e = Mac.getInstance(this.algorithm);
            if(realSalt.length == 0) {
                realSalt = new byte[e.getMacLength()];
                Arrays.fill(realSalt, (byte)0);
            }

            e.init(new SecretKeySpec(realSalt, this.algorithm));
            rawKeyMaterial = e.doFinal(ikm);
            SecretKeySpec key = new SecretKeySpec(rawKeyMaterial, this.algorithm);
            Arrays.fill(rawKeyMaterial, (byte)0);
            this.unsafeInitWithoutKeyExtraction(key);
        } catch (GeneralSecurityException var10) {
            throw new RuntimeException("Unexpected exception", var10);
        } finally {
            Arrays.fill(rawKeyMaterial, (byte)0);
        }

    }

    public void unsafeInitWithoutKeyExtraction(SecretKey rawKey) throws InvalidKeyException {
        if(!rawKey.getAlgorithm().equals(this.algorithm)) {
            throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + rawKey.getAlgorithm());
        } else {
            this.prk = rawKey;
        }
    }

    private Hkdf(String algorithm) {
        if(!algorithm.startsWith("Hmac")) {
            throw new IllegalArgumentException("Invalid algorithm " + algorithm + ". Hkdf may only be used with Hmac algorithms.");
        } else {
            this.algorithm = algorithm;
        }
    }

    public byte[] deriveKey(String info, int length) throws IllegalStateException {
        return this.deriveKey(info != null?info.getBytes(StringUtils.UTF8):null, length);
    }

    public byte[] deriveKey(byte[] info, int length) throws IllegalStateException {
        byte[] result = new byte[length];

        try {
            this.deriveKey(info, length, result, 0);
            return result;
        } catch (ShortBufferException var5) {
            throw new RuntimeException(var5);
        }
    }

    public void deriveKey(byte[] info, int length, byte[] output, int offset) throws ShortBufferException, IllegalStateException {
        this.assertInitialized();
        if(length < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        } else if(output.length < offset + length) {
            throw new ShortBufferException();
        } else {
            Mac mac = this.createMac();
            if(length > 255 * mac.getMacLength()) {
                throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
            } else {
                byte[] t = EMPTY_ARRAY;

                try {
                    int loc = 0;

                    for(byte i = 1; loc < length; ++i) {
                        mac.update(t);
                        mac.update(info);
                        mac.update(i);
                        t = mac.doFinal();

                        for(int x = 0; x < t.length && loc < length; ++loc) {
                            output[loc] = t[x];
                            ++x;
                        }
                    }
                } finally {
                    Arrays.fill(t, (byte)0);
                }

            }
        }
    }

    private Mac createMac() {
        try {
            Mac ex = Mac.getInstance(this.algorithm);
            ex.init(this.prk);
            return ex;
        } catch (NoSuchAlgorithmException var2) {
            throw new RuntimeException(var2);
        } catch (InvalidKeyException var3) {
            throw new RuntimeException(var3);
        }
    }

    private void assertInitialized() throws IllegalStateException {
        if(this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }
}
