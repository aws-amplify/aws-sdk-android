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

import com.amazonaws.mobile.auth.core.signin.AuthException;

/**
 * Encapsulates errors that may have happened during doStartupAuth().
 */
public class StartupAuthErrorDetails {
    private final AuthException authException;
    private final Exception unauthException;

    public StartupAuthErrorDetails(final AuthException authException,
                                          final Exception unauthException) {
        this.authException = authException;
        this.unauthException = unauthException;
    }

    /**
     * @return true if an error occurred refreshing a previously signed in provider, otherwise false.
     */
    public boolean didErrorOccurRefreshingProvider() {
        return authException != null;
    }

    /**
     * @return the AuthException that occurred while refreshing a provider, otherwise null.
     */
    public AuthException getProviderRefreshException() {
        return authException;
    }

    /**
     * @return true if an error occurred obtaining an unauthenticated identity, otherwise false.
     */
    public boolean didErrorOccurObtainingUnauthenticatedIdentity() {
        return unauthException != null;
    }

    /**
     * @return the exception that occurred while trying to obtain an unauthenticated (guest) identity.
     */
    public Exception getUnauthenticatedErrorException() {
        return unauthException;
    }
}
