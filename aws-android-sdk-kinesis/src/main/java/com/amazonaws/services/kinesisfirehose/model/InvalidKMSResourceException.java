/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Kinesis Data Firehose throws this exception when an attempt to put records or
 * to start or stop delivery stream encryption fails. This happens when the KMS
 * service throws one of the following exception types:
 * <code>AccessDeniedException</code>, <code>InvalidStateException</code>,
 * <code>DisabledException</code>, or <code>NotFoundException</code>.
 * </p>
 */
public class InvalidKMSResourceException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new InvalidKMSResourceException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidKMSResourceException(String message) {
        super(message);
    }

    /**
     * Returns the value of the code property for this object.
     *
     * @return The value of the code property for this object.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of code
     *
     * @param code The new value for the code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }
}
