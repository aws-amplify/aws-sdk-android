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

package com.amazonaws.services.lambda.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Lambda has detected your function being invoked in a recursive loop with
 * other Amazon Web Services resources and stopped your function's invocation.
 * </p>
 */
public class RecursiveInvocationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The exception type.
     * </p>
     */
    private String type;

    /**
     * Constructs a new RecursiveInvocationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public RecursiveInvocationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The exception type.
     * </p>
     *
     * @return <p>
     *         The exception type.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The exception type.
     * </p>
     *
     * @param type <p>
     *            The exception type.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }
}
