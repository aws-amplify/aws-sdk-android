/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoauth.exceptions;

/**
 * Base exception class for errors that occur at runtime, during interactions with Amazon Web Services.
 */

public class AuthClientException extends RuntimeException {
	/**
	 * Exception unique id.
	 */
    private static final long serialVersionUID = -2748057344647987093L;

    /**
     * Creates a new AuthClientException with the specified message, and root
     * cause.
     *
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public AuthClientException(String message, Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new AuthClientException with the specified message.
     *
     * @param message An error message describing why this exception was thrown.
     */
    public AuthClientException(String message) {
        super(message);
    }

    /**
     * Returns a hint as to whether it makes sense to retry upon this exception.
     * Default is true, but subclass may override.
     */
    public boolean isRetryable() {
        return true;
    }
}
