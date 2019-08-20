/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal.keyvaluestore;

public class KeyNotFoundException extends Exception {

    /** Default serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new KeyNotFoundException with the specified message, and root
     * cause.
     *
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public KeyNotFoundException(final String message, final Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new KeyNotFoundException with the specified message.
     *
     * @param message An error message describing why this exception was thrown.
     */
    public KeyNotFoundException(final String message) {
        super(message);
    }

    /**
     * Create an KeyNotFoundException with an exception cause.
     *
     * @param throwable the cause of the exception.
     */
    public KeyNotFoundException(final Throwable throwable) {
        super(throwable);
    }
}
