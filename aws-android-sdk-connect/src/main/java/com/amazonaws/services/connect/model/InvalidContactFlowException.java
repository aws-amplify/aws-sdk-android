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
 * The contact flow is not valid.
 * </p>
 */
public class InvalidContactFlowException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The problems with the contact flow. Please fix before trying again.
     * </p>
     */
    private java.util.List<ProblemDetail> problems;

    /**
     * Constructs a new InvalidContactFlowException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidContactFlowException(String message) {
        super(message);
    }

    /**
     * <p>
     * The problems with the contact flow. Please fix before trying again.
     * </p>
     *
     * @return <p>
     *         The problems with the contact flow. Please fix before trying
     *         again.
     *         </p>
     */
    public java.util.List<ProblemDetail> getProblems() {
        return problems;
    }

    /**
     * <p>
     * The problems with the contact flow. Please fix before trying again.
     * </p>
     *
     * @param problems <p>
     *            The problems with the contact flow. Please fix before trying
     *            again.
     *            </p>
     */
    public void setProblems(java.util.Collection<ProblemDetail> problems) {
        this.problems = problems == null ? null : new java.util.ArrayList<ProblemDetail>(problems);
    }
}
