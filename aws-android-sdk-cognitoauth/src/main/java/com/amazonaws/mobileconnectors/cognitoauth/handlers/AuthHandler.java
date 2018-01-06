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

package com.amazonaws.mobileconnectors.cognitoauth.handlers;

import android.net.Uri;
import android.util.Log;

import com.amazonaws.mobileconnectors.cognitoauth.Auth;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;

/**
 * Callback handler for {@link com.amazonaws.mobileconnectors.cognitoauth.Auth}.
 */

public interface AuthHandler {

    /**
     * Invoked after successful authentication or when valid cached tokens are available.
     * <p>
     *     <b>Note:</b> When the Cognito Web login screen is presented, the users can use any
     *     username to authenticate. To get the username used for authentication,
     *     Alternatively,the username can also be found with the key
     *     {@code cognito:username} in the PAYLOAD section of the Cognito Id and Access JWT.
     * </p>
     * @param session Required: {@link AuthUserSession}.
     */
    public void onSuccess(final AuthUserSession session);

    /**
     * This method is invoked when a user has successfully signed-out, invoked as a response to
     * {@link Auth#signOut()}.
     */
    public void onSignout();

    /**
     * Invoked to report errors during interaction with Cognito Auth Server.
     * @param e Required: Indicates the cause of the failure.
     */
    public void onFailure(final Exception e);
}
