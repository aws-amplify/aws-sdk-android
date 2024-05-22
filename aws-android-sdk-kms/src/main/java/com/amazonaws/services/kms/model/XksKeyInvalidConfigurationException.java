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
 * The request was rejected because the external key specified by the
 * <code>XksKeyId</code> parameter did not meet the configuration requirements
 * for an external key store.
 * </p>
 * <p>
 * The external key must be an AES-256 symmetric key that is enabled and
 * performs encryption and decryption.
 * </p>
 */
public class XksKeyInvalidConfigurationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksKeyInvalidConfigurationException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public XksKeyInvalidConfigurationException(String message) {
        super(message);
    }
}
