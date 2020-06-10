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

package com.amazonaws.services.codeartifact.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation did not succeed because too many requests are sent to the
 * service.
 * </p>
 */
public class ThrottlingException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The time period, in seconds, to wait before retrying the request.
     * </p>
     */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * The time period, in seconds, to wait before retrying the request.
     * </p>
     *
     * @return <p>
     *         The time period, in seconds, to wait before retrying the request.
     *         </p>
     */
    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    /**
     * <p>
     * The time period, in seconds, to wait before retrying the request.
     * </p>
     *
     * @param retryAfterSeconds <p>
     *            The time period, in seconds, to wait before retrying the
     *            request.
     *            </p>
     */
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }
}
