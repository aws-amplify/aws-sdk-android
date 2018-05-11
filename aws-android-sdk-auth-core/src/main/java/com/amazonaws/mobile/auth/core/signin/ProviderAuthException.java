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
 * Thrown when there is an error with a provider during the start-up authentication
 * flow or when signing in with a provider.
 */
public class ProviderAuthException extends AuthException {
    /**
     * Constructor.
     * @param provider the provider that was used while attempting to obtain a Cognito identity.
     * @param ex the exception that occurred while attempting to obtain the Cognito identity.
     */
    public ProviderAuthException(final IdentityProvider provider, final Exception ex) {
        super(provider, ex);
    }
}
