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

package com.amazonaws.services.shield.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Exception that indicates that the operation would exceed a limit.
 * </p>
 * <p>
 * <code>Type</code> is the type of limit that would be exceeded.
 * </p>
 * <p>
 * <code>Limit</code> is the threshold that would be exceeded.
 * </p>
 */
public class LimitsExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String type;

    private Long limit;

    /**
     * Constructs a new LimitsExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public LimitsExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the type property for this object.
     *
     * @return The value of the type property for this object.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of type
     *
     * @param type The new value for the type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the value of the limit property for this object.
     *
     * @return The value of the limit property for this object.
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Sets the value of limit
     *
     * @param limit The new value for the limit property for this object.
     */
    public void setLimit(Long limit) {
        this.limit = limit;
    }
}
