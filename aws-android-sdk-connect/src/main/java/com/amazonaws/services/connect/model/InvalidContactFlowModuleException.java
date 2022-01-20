/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The problems with the module. Please fix before trying again.
 * </p>
 */
public class InvalidContactFlowModuleException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private java.util.List<ProblemDetail> problems;

    /**
     * Constructs a new InvalidContactFlowModuleException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidContactFlowModuleException(String message) {
        super(message);
    }

    /**
     * Returns the value of the problems property for this object.
     *
     * @return The value of the problems property for this object.
     */
    public java.util.List<ProblemDetail> getProblems() {
        return problems;
    }

    /**
     * Sets the value of problems
     *
     * @param problems The new value for the problems property for this object.
     */
    public void setProblems(java.util.Collection<ProblemDetail> problems) {
        this.problems = problems == null ? null : new java.util.ArrayList<ProblemDetail>(problems);
    }
}
