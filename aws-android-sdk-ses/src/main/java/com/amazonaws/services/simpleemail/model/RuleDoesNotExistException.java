/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that the provided receipt rule does not exist.
 * </p>
 */
public class RuleDoesNotExistException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * Constructs a new RuleDoesNotExistException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public RuleDoesNotExistException(String message) {
        super(message);
    }

    /**
     * Returns the value of the name property for this object.
     *
     * @return The value of the name property for this object.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of name
     *
     * @param name The new value for the name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
}
