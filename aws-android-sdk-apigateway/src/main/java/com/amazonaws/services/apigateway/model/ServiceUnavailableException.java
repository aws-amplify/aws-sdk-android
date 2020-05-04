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

package com.amazonaws.services.apigateway.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The requested service is not available. For details see the accompanying
 * error message. Retry after the specified time period.
 * </p>
 */
public class ServiceUnavailableException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String retryAfterSeconds;

    /**
     * Constructs a new ServiceUnavailableException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceUnavailableException(String message) {
        super(message);
    }

    /**
     * Returns the value of the retryAfterSeconds property for this object.
     *
     * @return The value of the retryAfterSeconds property for this object.
     */
    public String getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    /**
     * Sets the value of retryAfterSeconds
     *
     * @param retryAfterSeconds The new value for the retryAfterSeconds property
     *            for this object.
     */
    public void setRetryAfterSeconds(String retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }
}
