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

import java.security.Key;
import java.security.Provider;

/**
 * @deprecated See {@link com.amazonaws.services.s3.AmazonS3EncryptionClient}
 *             for further details.
 */
@Deprecated
class S3KeyWrapScheme {
    /**
     * Used for backward compatibility where the encryption only mode has no
     * explicit key wrapping scheme.
     */
    static final S3KeyWrapScheme NONE = new S3KeyWrapScheme() {
        @Override
        String getKeyWrapAlgorithm(Key key, Provider provider) {
            return null;
        }

        @Override
        public String toString() {
            return "NONE";
        }
    };
    public static final String AES_WRAP = "AESWrap";
    public static final String RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /**
     * @param key
     *            the key encrypting key, which is either an AES key or a public
     *            key
     */
    String getKeyWrapAlgorithm(Key key, Provider provider) {
        String algorithm = key.getAlgorithm();
        if (S3CryptoScheme.AES.equals(algorithm)) {
            return AES_WRAP;
        }
        if (S3CryptoScheme.RSA.equals(algorithm)) {
            if (CryptoRuntime.isRsaKeyWrapAvailable(provider))
                return RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING;
        }
        return null;
    }

    @Override public String toString() {
        return "S3KeyWrapScheme";
    }
}
