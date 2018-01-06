/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource already exists.
 * </p>
 */
public class ResourceAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the resource that caused the exception.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The ARN of the resource that caused the exception.
     * </p>
     */
    private String resourceArn;

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of the resource that caused the exception.
     * </p>
     *
     * @return <p>
     *         The ID of the resource that caused the exception.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource that caused the exception.
     * </p>
     *
     * @param resourceId <p>
     *            The ID of the resource that caused the exception.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ARN of the resource that caused the exception.
     * </p>
     *
     * @return <p>
     *         The ARN of the resource that caused the exception.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that caused the exception.
     * </p>
     *
     * @param resourceArn <p>
     *            The ARN of the resource that caused the exception.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }
}
