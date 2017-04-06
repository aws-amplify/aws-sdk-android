/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request was rejected because the provided import token is expired. Use
 * <a>GetParametersForImport</a> to retrieve a new import token and public key,
 * use the new public key to encrypt the key material, and then try the request
 * again.
 * </p>
 */
public class ExpiredImportTokenException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ExpiredImportTokenException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ExpiredImportTokenException(String message) {
        super(message);
    }
}
