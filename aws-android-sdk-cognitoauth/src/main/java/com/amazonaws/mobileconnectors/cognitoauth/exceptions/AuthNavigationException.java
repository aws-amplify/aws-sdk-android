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
 * Thrown for navigation errors during user interaction with the Cognito Auth hosted page.
 */

public class AuthNavigationException extends AuthClientException {
	/**
	 * Exception unique id.
	 */
	private static final long serialVersionUID = -7116786198762963314L;
	
	/**
     * Constructs an exception with the specified message, and root cause.
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public AuthNavigationException(final String message, final Throwable t) {
        super(message, t);
    }

    /**
     * Constructs an exception with the specified message, and root cause.
     * @param message An error message describing why this exception was thrown.
     */
    public AuthNavigationException(final String message) {
        super(message);
    }
}
