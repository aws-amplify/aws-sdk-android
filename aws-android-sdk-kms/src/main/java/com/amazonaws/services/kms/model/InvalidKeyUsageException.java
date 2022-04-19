/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected for one of the following reasons:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>KeyUsage</code> value of the KMS key is incompatible with the API
 * operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * The encryption algorithm or signing algorithm specified for the operation is
 * incompatible with the type of key material in the KMS key
 * <code>(KeySpec</code>).
 * </p>
 * </li>
 * </ul>
 * <p>
 * For encrypting, decrypting, re-encrypting, and generating data keys, the
 * <code>KeyUsage</code> must be <code>ENCRYPT_DECRYPT</code>. For signing and
 * verifying messages, the <code>KeyUsage</code> must be
 * <code>SIGN_VERIFY</code>. For generating and verifying message authentication
 * codes (MACs), the <code>KeyUsage</code> must be
 * <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a KMS
 * key, use the <a>DescribeKey</a> operation.
 * </p>
 * <p>
 * To find the encryption or signing algorithms supported for a particular KMS
 * key, use the <a>DescribeKey</a> operation.
 * </p>
 */
public class InvalidKeyUsageException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidKeyUsageException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidKeyUsageException(String message) {
        super(message);
    }
}
