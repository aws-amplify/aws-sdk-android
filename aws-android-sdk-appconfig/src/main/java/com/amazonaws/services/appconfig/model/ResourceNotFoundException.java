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

package com.amazonaws.services.appconfig.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The requested resource could not be found.
 * </p>
 */
public class ResourceNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String resourceName;

    /**
     * Constructs a new ResourceNotFoundException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * Returns the value of the resourceName property for this object.
     *
     * @return The value of the resourceName property for this object.
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of resourceName
     *
     * @param resourceName The new value for the resourceName property for this
     *            object.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
