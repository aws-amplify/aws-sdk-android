/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.security.Provider;
import java.security.Security;

import javax.crypto.Cipher;

/**
 * The crypto runtime class.
 *
 * @deprecated See {@link com.amazonaws.services.s3.AmazonS3EncryptionClient}
 *             for further details.
 */
@Deprecated
public class CryptoRuntime {
    static final String BOUNCY_CASTLE_PROVIDER = "BC";
    private static final String BC_PROVIDER_FQCN = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    private static final Log LOGGER =  LogFactory.getLog(CryptoRuntime.class);

    /**
     * Returns true if bouncy castle is available.
     * @return true if bouncy castle is available. False otherwise.
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
            LOGGER.debug("Bouncy Castle not available", e);
        }
    }

    /**
     * Check if AES/GCM mode is supported by the crypto provider.
     *
     * @param cryptoProvider The Security Provider instance
     * @return true if AES/GCM is supported by the cryptoProvider
     */
    public static boolean isAesGcmAvailable(Provider cryptoProvider) {
        return AesGcm.check(cryptoProvider != null ? cryptoProvider : Security.getProvider(BOUNCY_CASTLE_PROVIDER));
    }

    static boolean isRsaKeyWrapAvailable(Provider cryptoProvider) {
        return RsaEcbOaepWithSHA256AndMGF1Padding.check(cryptoProvider != null ? cryptoProvider : Security.getProvider(BOUNCY_CASTLE_PROVIDER));
    }

    private static final class AesGcm {
        private static boolean check(Provider cryptoProvider) {
            try {
                Cipher.getInstance(
                        ContentCryptoScheme.AES_GCM.getCipherAlgorithm(),
                        cryptoProvider);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    private static final class RsaEcbOaepWithSHA256AndMGF1Padding {
        private static boolean check(Provider cryptoProvider) {
            try {
                Cipher.getInstance(RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING,
                        cryptoProvider);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }
}
