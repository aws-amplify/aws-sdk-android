/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request was rejected because the (<code>XksKeyId</code>) is already
 * associated with another KMS key in this external key store. Each KMS key in
 * an external key store must be associated with a different external key.
 * </p>
 */
public class XksKeyAlreadyInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksKeyAlreadyInUseException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public XksKeyAlreadyInUseException(String message) {
        super(message);
    }
}
