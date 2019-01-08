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

package com.amazonaws;

/**
 * Base exception class for any errors that occur while attempting to use an AWS
 * client to make service calls to Amazon Web Services.
 * <p>
 * Error responses from services will be handled as AmazonServiceExceptions.
 * This class is primarily for errors that occur when unable to get a response
 * from a service, or when the client is unable to understand a response from a
 * service. For example, if a caller tries to use a client to make a service
 * call, but no network connection is present, an AmazonClientException will be
 * thrown to indicate that the client wasn't able to successfully make the
 * service call, and no information from the service is available.
 * <p>
 * Callers should typically deal with exceptions through AmazonServiceException,
 * which represent error responses returned by services. AmazonServiceException
 * has much more information available for callers to appropriately deal with
 * different types of errors that can occur.
 *
 * @see AmazonServiceException
 */
public class AmazonClientException extends RuntimeException {

    /** Default serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new AmazonClientException with the specified message, and root
     * cause.
     *
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public AmazonClientException(final String message, final Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new AmazonClientException with the specified message.
     *
     * @param message An error message describing why this exception was thrown.
     */
    public AmazonClientException(final String message) {
        super(message);
    }

    /**
     * Create an AmazonClientException with an exception cause.
     *
     * @param throwable the cause of the exception.
     */
    public AmazonClientException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Returns a hint as to whether it makes sense to retry upon this exception.
     * Default is true, but subclass may override.
     * @return true if it is retryable.
     */
    public boolean isRetryable() {
        return true;
    }
}
