/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The property is not valid.
 * </p>
 */
public class PropertyValidationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private java.util.List<PropertyValidationExceptionProperty> propertyList;

    /**
     * Constructs a new PropertyValidationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public PropertyValidationException(String message) {
        super(message);
    }

    /**
     * Returns the value of the propertyList property for this object.
     *
     * @return The value of the propertyList property for this object.
     */
    public java.util.List<PropertyValidationExceptionProperty> getPropertyList() {
        return propertyList;
    }

    /**
     * Sets the value of propertyList
     *
     * @param propertyList The new value for the propertyList property for this
     *            object.
     */
    public void setPropertyList(
            java.util.Collection<PropertyValidationExceptionProperty> propertyList) {
        this.propertyList = propertyList == null ? null
                : new java.util.ArrayList<PropertyValidationExceptionProperty>(propertyList);
    }
}
