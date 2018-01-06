/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.internal.crypto;

import static com.amazonaws.services.s3.internal.crypto.S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING;

import org.apache.commons.logging.LogFactory;

import java.security.Provider;
import java.security.Security;

import javax.crypto.Cipher;

/**
 * The crypto runtime class.
 */
public class CryptoRuntime {
    static final String BOUNCY_CASTLE_PROVIDER = "BC";
    private static final String BC_PROVIDER_FQCN = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    /**
     * Returns true if bouncy castle is available.
     * @return true if bounch castle is avaiable. False otherwise.
     */
    public static synchronized boolean isBouncyCastleAvailable() {
        return Security.getProvider(BOUNCY_CASTLE_PROVIDER) != null;
    }

    /**
     * Enables bouncy castle.
     */
    public static synchronized void enableBouncyCastle() {
        if (isBouncyCastleAvailable()) {
            return;
        }
        try {
            @SuppressWarnings("unchecked")
            Class<Provider> c = (Class<Provider>) Class.forName(BC_PROVIDER_FQCN);
            Provider provider = c.newInstance();
            Security.addProvider(provider);
        } catch (Exception e) {
            LogFactory.getLog(CryptoRuntime.class).debug(
                    "Bouncy Castle not available", e);
        }
    }

    /**
     * Used only for unit test when the same class loader is used across
     * multiple unit tests.
     */
    static void recheck() {
        recheckAesGcmAvailablility();
        recheckRsaKeyWrapAvailablility();
    }

    public static boolean isAesGcmAvailable() {
        return AesGcm.isAvailable;
    }

    private static void recheckAesGcmAvailablility() {
        AesGcm.recheck();
    }

    static boolean isRsaKeyWrapAvailable() {
        return RsaEcbOaepWithSHA256AndMGF1Padding.isAvailable;
    }

    private static void recheckRsaKeyWrapAvailablility() {
        RsaEcbOaepWithSHA256AndMGF1Padding.recheck();
    }

    private static final class AesGcm {
        static volatile boolean isAvailable = check();

        static boolean recheck() {
            isAvailable = check();
            return isAvailable;
        }

        private static boolean check() {
            try {
                Cipher.getInstance(
                        ContentCryptoScheme.AES_GCM.getCipherAlgorithm(),
                        BOUNCY_CASTLE_PROVIDER);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    private static final class RsaEcbOaepWithSHA256AndMGF1Padding {
        static volatile boolean isAvailable = check();

        static boolean recheck() {
            isAvailable = check();
            return isAvailable;
        }

        private static boolean check() {
            try {
                Cipher.getInstance(RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING,
                        BOUNCY_CASTLE_PROVIDER);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }
}
