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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource you are attempting to create already exists.
 * </p>
 */
public class ResourceAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String resourceArn;

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the resourceArn property for this object.
     *
     * @return The value of the resourceArn property for this object.
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * Sets the value of resourceArn
     *
     * @param resourceArn The new value for the resourceArn property for this
     *            object.
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }
}
