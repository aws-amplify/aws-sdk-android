/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The sequence token is not valid.
 * </p>
 */
public class InvalidSequenceTokenException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String expectedSequenceToken;

    /**
     * Constructs a new InvalidSequenceTokenException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidSequenceTokenException(String message) {
        super(message);
    }

    /**
     * Returns the value of the expectedSequenceToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the expectedSequenceToken property for this object.
     */
    public String getExpectedSequenceToken() {
        return expectedSequenceToken;
    }

    /**
     * Sets the value of expectedSequenceToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param expectedSequenceToken The new value for the expectedSequenceToken
     *            property for this object.
     */
    public void setExpectedSequenceToken(String expectedSequenceToken) {
        this.expectedSequenceToken = expectedSequenceToken;
    }
}
