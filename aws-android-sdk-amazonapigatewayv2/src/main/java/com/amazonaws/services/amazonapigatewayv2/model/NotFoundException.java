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

package com.amazonaws.services.amazonapigatewayv2.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource specified in the request was not found. See the message field
 * for more information.
 * </p>
 */
public class NotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new NotFoundException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
