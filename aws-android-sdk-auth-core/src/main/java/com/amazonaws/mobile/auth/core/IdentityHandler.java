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

package com.amazonaws.mobile.auth.core;

/**
 * Allows the application to get an asynchronous response with user's
 * unique identifier.
 */
public interface IdentityHandler {
    /**
     * Handles the user's unique identifier.
     * @param identityId Amazon Cognito Identity ID which uniquely identifies
     *                   the user.
     */
    void onIdentityId(final String identityId);

    /**
     * Handles any error that might have occurred while getting the user's
     * unique identifier from Amazon Cognito.
     * @param exception exception
     */
    void handleError(final Exception exception);
}
