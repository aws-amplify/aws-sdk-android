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

package com.amazonaws.services.lambda.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The function is inactive and its VPC connection is no longer available. Wait
 * for the VPC connection to reestablish and try again.
 * </p>
 */
public class ResourceNotReadyException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The exception type.
     * </p>
     */
    private String type;

    /**
     * Constructs a new ResourceNotReadyException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceNotReadyException(String message) {
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
