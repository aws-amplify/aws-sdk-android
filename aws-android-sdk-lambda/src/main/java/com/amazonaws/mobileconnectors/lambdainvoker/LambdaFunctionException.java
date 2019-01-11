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

package com.amazonaws.mobileconnectors.lambdainvoker;

import com.amazonaws.AmazonClientException;

/**
 * Lambda exception, thrown when Lambda service has problem evaluating a Lambda
 * function.
 */
public class LambdaFunctionException extends AmazonClientException {

    private static final long serialVersionUID = 6674259958957646199L;

    // -------------------------------------------------------------
    // Variables - Private
    // -------------------------------------------------------------
    private final String details;

    // -------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------

    /**
     * Constructs a LambdaFunctionException.
     *
     * @param message Error message
     * @param details result of Lambda invocation from the service.
     */
    public LambdaFunctionException(String message, String details) {
        super(message);

        this.details = details;
    }

    // -------------------------------------------------------------
    // Methods - Getter/Setter
    // -------------------------------------------------------------

    /**
     * Gets the invocation result from Lambda.
     *
     * @return invocation result
     */
    public String getDetails() {
        return details;
    }
}
