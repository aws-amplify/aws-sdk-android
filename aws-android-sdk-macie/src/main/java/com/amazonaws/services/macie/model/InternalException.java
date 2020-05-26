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

package com.amazonaws.services.macie.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Internal server error.
 * </p>
 */
public class InternalException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Error code for the exception
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     */
    private String errorCode;

    /**
     * Constructs a new InternalException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InternalException(String message) {
        super(message);
    }

    /**
     * Error code for the exception
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @return Error code for the exception
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Error code for the exception
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @param errorCode Error code for the exception
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
