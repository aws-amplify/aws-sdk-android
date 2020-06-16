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

package com.amazonaws.services.qldb.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation failed because a condition wasn't satisfied in advance.
 * </p>
 */
public class ResourcePreconditionNotMetException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new ResourcePreconditionNotMetException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public ResourcePreconditionNotMetException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     *
     * @return <p>
     *         The type of resource.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     *
     * @return <p>
     *         The name of the resource.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     *
     * @param resourceName <p>
     *            The name of the resource.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
