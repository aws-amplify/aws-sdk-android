/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SDK operation aborted exception.
 */
public class AbortedException extends AmazonClientException {

    /** Default serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param message the exception message.
     * @param t the throwable.
     */
    public AbortedException(final String message, final Throwable t) {
        super(message, t);
    }

    /**
     * Constructor.
     * @param t the throwable.
     */
    public AbortedException(final Throwable t) {
        super("", t);
    }

    /**
     * Constructor.
     * @param message the exception message.
     */
    public AbortedException(final String message) {
        super(message);
    }

    /**
     * Constructor.
     */
    public AbortedException() {
        super("");
    }

    /**
     * {@inheritDoc} An aborted exception is not intended to be retried.
     * @return true if it is retryable.
     */
    @Override
    public boolean isRetryable() {
        return false;
    }
}
