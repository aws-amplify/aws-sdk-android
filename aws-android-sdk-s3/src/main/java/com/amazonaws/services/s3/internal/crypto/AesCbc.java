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

/**
 * @deprecated See {@link com.amazonaws.services.s3.AmazonS3EncryptionClient}
 *             for further details.
 */
@Deprecated
class AesCbc extends ContentCryptoScheme {

    private static final int DEFAULT_KEY_LENGTH_IN_BITS = 256;
    private static final int DEFAULT_BLOCK_SIZE_IN_BYTES = 16;
    private static final int DEFAULT_IV_LENGTH_IN_BYTES = 16;
    @Override
    String getKeyGeneratorAlgorithm() {
        return "AES";
    }

    @Override
    String getCipherAlgorithm() {
        return "AES/CBC/PKCS5Padding";
    }

    @Override
    int getKeyLengthInBits() {
        return DEFAULT_KEY_LENGTH_IN_BITS;
    }

    @Override
    int getBlockSizeInBytes() {
        return DEFAULT_BLOCK_SIZE_IN_BYTES;
    }

    @Override
    int getIVLengthInBytes() {
        return DEFAULT_IV_LENGTH_IN_BYTES;
    }

    @Override
    long getMaxPlaintextSize() {
        return MAX_CBC_BYTES;
    }
}
