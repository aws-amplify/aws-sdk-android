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

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that the provided AWS Lambda function is invalid, or that Amazon
 * SES could not execute the provided function, possibly due to permissions
 * issues. For information about giving permissions, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class InvalidLambdaFunctionException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the ARN of the function was not found.
     * </p>
     */
    private String functionArn;

    /**
     * Constructs a new InvalidLambdaFunctionException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidLambdaFunctionException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the ARN of the function was not found.
     * </p>
     *
     * @return <p>
     *         Indicates that the ARN of the function was not found.
     *         </p>
     */
    public String getFunctionArn() {
        return functionArn;
    }

    /**
     * <p>
     * Indicates that the ARN of the function was not found.
     * </p>
     *
     * @param functionArn <p>
     *            Indicates that the ARN of the function was not found.
     *            </p>
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }
}
