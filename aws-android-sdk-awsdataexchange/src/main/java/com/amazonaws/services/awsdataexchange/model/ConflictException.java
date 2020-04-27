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
 * The request couldn't be completed because it conflicted with the current
 * state of the resource.
 * </p>
 */
public class ConflictException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     */
    private String resourceType;

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
     * The unique identifier for the resource with the conflict.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the resource with the conflict.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     *
     * @param resourceId <p>
     *            The unique identifier for the resource with the conflict.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     *
     * @return <p>
     *         The type of the resource with the conflict.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_SET, REVISION, ASSET, JOB
     *
     * @param resourceType <p>
     *            The type of the resource with the conflict.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
