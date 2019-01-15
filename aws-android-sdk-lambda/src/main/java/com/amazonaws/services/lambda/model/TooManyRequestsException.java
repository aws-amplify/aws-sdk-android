/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lambda.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Request throughput limit exceeded
 * </p>
 */
public class TooManyRequestsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The number of seconds the caller should wait before retrying.
     * </p>
     */
    private String retryAfterSeconds;

    private String type;

    private String reason;

    /**
     * Constructs a new TooManyRequestsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TooManyRequestsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The number of seconds the caller should wait before retrying.
     * </p>
     *
     * @return <p>
     *         The number of seconds the caller should wait before retrying.
     *         </p>
     */
    public String getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds the caller should wait before retrying.
     * </p>
     *
     * @param retryAfterSeconds <p>
     *            The number of seconds the caller should wait before retrying.
     *            </p>
     */
    public void setRetryAfterSeconds(String retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
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
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConcurrentInvocationLimitExceeded,
     * FunctionInvocationRateLimitExceeded,
     * ReservedFunctionConcurrentInvocationLimitExceeded,
     * ReservedFunctionInvocationRateLimitExceeded, CallerRateLimitExceeded
     *
     * @return The value of the reason property for this object.
     * @see ThrottleReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConcurrentInvocationLimitExceeded,
     * FunctionInvocationRateLimitExceeded,
     * ReservedFunctionConcurrentInvocationLimitExceeded,
     * ReservedFunctionInvocationRateLimitExceeded, CallerRateLimitExceeded
     *
     * @param reason The new value for the reason property for this object.
     * @see ThrottleReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
