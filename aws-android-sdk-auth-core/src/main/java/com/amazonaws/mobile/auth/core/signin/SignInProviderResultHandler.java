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

package com.amazonaws.mobile.auth.core.signin;

import com.amazonaws.mobile.auth.core.IdentityProvider;

/**
 *  Implement this interface to get callbacks for the results to a sign-in operation.
 */
public interface SignInProviderResultHandler {

    /**
     * Sign-in was successful.
     *
     * @param provider sign-in identity provider
     */
    void onSuccess(IdentityProvider provider);

    /**
     * Sign-in was cancelled by the user.
     *
     * @param provider sign-in identity provider
     */
    void onCancel(IdentityProvider provider);

    /**
     * Sign-in failed.
     *
     * @param provider sign-in identity provider
     * @param ex exception that occurred
     */
    void onError(IdentityProvider provider, Exception ex);
}