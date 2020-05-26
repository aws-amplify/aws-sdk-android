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

package com.amazonaws.services.dlm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Bad request. The request is missing required parameters or has invalid
 * parameters.
 * </p>
 */
public class InvalidRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     */
    private java.util.List<String> requiredParameters;

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     */
    private java.util.List<String> mutuallyExclusiveParameters;

    /**
     * Constructs a new InvalidRequestException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRequestException(String message) {
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

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     *
     * @return <p>
     *         The request omitted one or more required parameters.
     *         </p>
     */
    public java.util.List<String> getRequiredParameters() {
        return requiredParameters;
    }

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     *
     * @param requiredParameters <p>
     *            The request omitted one or more required parameters.
     *            </p>
     */
    public void setRequiredParameters(java.util.Collection<String> requiredParameters) {
        this.requiredParameters = requiredParameters == null ? null
                : new java.util.ArrayList<String>(requiredParameters);
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     *
     * @return <p>
     *         The request included parameters that cannot be provided together.
     *         </p>
     */
    public java.util.List<String> getMutuallyExclusiveParameters() {
        return mutuallyExclusiveParameters;
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     *
     * @param mutuallyExclusiveParameters <p>
     *            The request included parameters that cannot be provided
     *            together.
     *            </p>
     */
    public void setMutuallyExclusiveParameters(
            java.util.Collection<String> mutuallyExclusiveParameters) {
        this.mutuallyExclusiveParameters = mutuallyExclusiveParameters == null ? null
                : new java.util.ArrayList<String>(mutuallyExclusiveParameters);
    }
}
