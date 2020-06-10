/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.codeartifact.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation did not succeed because a parameter in the request was sent
 * with an invalid value.
 * </p>
 */
public class ValidationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANNOT_PARSE, ENCRYPTION_KEY_ERROR,
     * FIELD_VALIDATION_FAILED, UNKNOWN_OPERATION, OTHER
     */
    private String reason;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANNOT_PARSE, ENCRYPTION_KEY_ERROR,
     * FIELD_VALIDATION_FAILED, UNKNOWN_OPERATION, OTHER
     *
     * @return <p>
     *         </p>
     * @see ValidationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANNOT_PARSE, ENCRYPTION_KEY_ERROR,
     * FIELD_VALIDATION_FAILED, UNKNOWN_OPERATION, OTHER
     *
     * @param reason <p>
     *            </p>
     * @see ValidationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
