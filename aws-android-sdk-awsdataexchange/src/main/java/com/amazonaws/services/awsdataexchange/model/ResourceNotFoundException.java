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

package com.amazonaws.services.awsdataexchange.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource couldn't be found.
 * </p>
 */
public class ResourceNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The type of resource that couldn't be found.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     */
    private String resourceType;

    /**
     * Constructs a new ResourceNotFoundException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the resource that couldn't be found.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     *
     * @param resourceId <p>
     *            The unique identifier for the resource that couldn't be found.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The type of resource that couldn't be found.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     *
     * @return <p>
     *         The type of resource that couldn't be found.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource that couldn't be found.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     *
     * @param resourceType <p>
     *            The type of resource that couldn't be found.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
