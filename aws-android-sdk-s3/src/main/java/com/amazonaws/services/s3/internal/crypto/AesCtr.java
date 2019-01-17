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
class AesCtr extends ContentCryptoScheme {

    private static final int DEFAULT_IV_LENGTH_IN_BYTES = 16;
    private static final int SUPPORTED_IV_LENGTH = 12;
    @Override
    String getKeyGeneratorAlgorithm() {
        return AES_GCM.getKeyGeneratorAlgorithm();
    }

    @Override
    String getCipherAlgorithm() {
        return "AES/CTR/NoPadding";
    }

    @Override
    int getKeyLengthInBits() {
        return AES_GCM.getKeyLengthInBits();
    }

    @Override
    int getBlockSizeInBytes() {
        return AES_GCM.getBlockSizeInBytes();
    }

    @Override
    int getIVLengthInBytes() {
        return DEFAULT_IV_LENGTH_IN_BYTES;
    }

    @Override
    long getMaxPlaintextSize() {
        return MAX_CTR_BYTES;
    }

    @Override
    byte[] adjustIV(byte[] iv, long byteOffset) {
        // currently only support iv of length 12 for AES/GCM.
        // Anything else is quite a bit complicated.
        if (iv.length != SUPPORTED_IV_LENGTH)
            throw new UnsupportedOperationException();
        final int blockSize = getBlockSizeInBytes();
        final long blockOffset = byteOffset / blockSize;
        if (blockOffset * blockSize != byteOffset) {
            throw new IllegalArgumentException(
                    "Expecting byteOffset to be multiple of 16, but got blockOffset="
                            + blockOffset + ", blockSize=" + blockSize
                            + ", byteOffset=" + byteOffset);
        }
        byte[] j0 = computeJ0(iv);
        return incrementBlocks(j0, blockOffset);
    }

    /**
     * See <a href=
     * "http://csrc.nist.gov/publications/nistpubs/800-38D/SP-800-38D.pdf"> NIST
     * Special Publication 800-38D.</a> for the definition of J0, the
     * "pre-counter block".
     * <p>
     * Reference: <a href=
     * "https://github.com/bcgit/bc-java/blob/master/core/src/main/java/org/bouncycastle/crypto/modes/GCMBlockCipher.java"
     * >GCMBlockCipher.java</a>
     */
    private byte[] computeJ0(byte[] nonce) {
        final int blockSize = getBlockSizeInBytes();
        byte[] j0 = new byte[blockSize];
        System.arraycopy(nonce, 0, j0, 0, nonce.length);
        j0[blockSize - 1] = 0x01;
        return incrementBlocks(j0, 1);
    }
}
