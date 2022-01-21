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
 * That resource is already in use. Please try another.
 * </p>
 */
public class ResourceInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT, CONTACT_FLOW, INSTANCE, PARTICIPANT,
     * HIERARCHY_LEVEL, HIERARCHY_GROUP, USER
     */
    private String resourceType;

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     */
    private String resourceId;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT, CONTACT_FLOW, INSTANCE, PARTICIPANT,
     * HIERARCHY_LEVEL, HIERARCHY_GROUP, USER
     *
     * @return <p>
     *         The type of resource.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT, CONTACT_FLOW, INSTANCE, PARTICIPANT,
     * HIERARCHY_LEVEL, HIERARCHY_GROUP, USER
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     *
     * @return <p>
     *         The identifier for the resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     *
     * @param resourceId <p>
     *            The identifier for the resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
