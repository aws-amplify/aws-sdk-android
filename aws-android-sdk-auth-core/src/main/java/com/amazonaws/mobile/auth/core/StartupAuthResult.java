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
 * Callback function result for calling 
 * {@link IdentityManager#resumeSession(Activity, StartupAuthResultHandler, long)}.
 */
public class StartupAuthResult {
    private final IdentityManager identityManager;
    private final StartupAuthErrorDetails errors;

    public StartupAuthResult(final IdentityManager identityManager,
                             final StartupAuthErrorDetails startupAuthErrorDetails) {
        this.identityManager = identityManager;
        this.errors = startupAuthErrorDetails;
    }

    /**
     * return true if signed in with an identity provider, otherwise false if signed in as an
     * unauthenticated (guest) identity or not signed in at all.
     */
    public boolean isUserSignedIn() {
        return identityManager.isUserSignedIn();
    }
    /**
     * @return true if an unauthenticated (guest) identity was obtained, otherwise false.
     */
    public boolean isUserAnonymous() {
        return isIdentityIdAvailable() && !isUserSignedIn();
    }

    /**
     * @return true if an identity was obtained, either unauthenticated (guest) or authenticated with a provider.
     */
    public boolean isIdentityIdAvailable() {
        return identityManager.getCachedUserID() != null;
    }

    /**
     * @return the identity manager.
     */
    public IdentityManager getIdentityManager() {
        return identityManager;
    }

    /**
     * @return StartupAuthErrorDetails object if errors occurred during the StartupAuthResult flow, otherwise null.
     */
    public StartupAuthErrorDetails getErrorDetails() {
        return errors;
    }
}
