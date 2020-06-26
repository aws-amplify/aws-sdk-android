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

package com.amazonaws.services.quicksight.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * A resource is already in a state that indicates an action is happening that
 * must complete before a new update can be applied.
 * </p>
 */
public class ConcurrentUpdatingException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String requestId;

    /**
     * Constructs a new ConcurrentUpdatingException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ConcurrentUpdatingException(String message) {
        super(message);
    }

    /**
     * Returns the value of the requestId property for this object.
     *
     * @return The value of the requestId property for this object.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of requestId
     *
     * @param requestId The new value for the requestId property for this
     *            object.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
