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
 * Base class for exceptions that occur during auth
 */
public class AuthException extends Exception {
    protected final IdentityProvider provider;

    /**
     * Constructor.
     * @param provider the auth provider that was being used.
     * @param ex the exception that occurred.
     */
    public AuthException(final IdentityProvider provider, final Exception ex) {
        super(ex);
        this.provider = provider;
    }

    /**
     * Constructor.
     * @param ex the exception that occurred.
     */
    public AuthException(final Exception ex) {
        this(null, ex);
    }

    /**
     * @return the provider that was used when the failure occurred, or null if no provider
     *         was being used when the auth exception occurred.
     */
    public IdentityProvider getProvider() {
        return provider;
    }
}
