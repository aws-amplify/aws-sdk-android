/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A resource with the same name already exists.
 * </p>
 */
public class ConflictException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A resource with the same name already exists.
     * </p>
     */
    private String resourceId;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * A resource with the same name already exists.
     * </p>
     *
     * @return <p>
     *         A resource with the same name already exists.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * A resource with the same name already exists.
     * </p>
     *
     * @param resourceId <p>
     *            A resource with the same name already exists.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
