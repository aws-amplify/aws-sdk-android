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

package com.amazonaws.services.ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * A specified parameter argument isn't valid. Verify the available arguments
 * and try again.
 * </p>
 */
public class OpsItemInvalidParameterException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private java.util.List<String> parameterNames;

    /**
     * Constructs a new OpsItemInvalidParameterException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public OpsItemInvalidParameterException(String message) {
        super(message);
    }

    /**
     * Returns the value of the parameterNames property for this object.
     *
     * @return The value of the parameterNames property for this object.
     */
    public java.util.List<String> getParameterNames() {
        return parameterNames;
    }

    /**
     * Sets the value of parameterNames
     *
     * @param parameterNames The new value for the parameterNames property for
     *            this object.
     */
    public void setParameterNames(java.util.Collection<String> parameterNames) {
        this.parameterNames = parameterNames == null ? null : new java.util.ArrayList<String>(
                parameterNames);
    }
}
