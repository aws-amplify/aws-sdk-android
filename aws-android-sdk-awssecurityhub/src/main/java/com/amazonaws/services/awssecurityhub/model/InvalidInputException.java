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

package com.amazonaws.services.awssecurityhub.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because you supplied an invalid or out-of-range
 * value for an input parameter.
 * </p>
 */
public class InvalidInputException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * Returns the value of the code property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return The value of the code property for this object.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of code
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param code The new value for the code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }
}
