/*
 * Copyright 2017-2018 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.client;

import com.amazonaws.mobile.auth.core.IdentityManager;

/**
 * {@code AWSStartupResult} is the result returned
 * by the {@link AWSStartupResultHandler} callback
 * function of the 
 * {@link com.amazonaws.mobile.client.AWSMobileClient#initialize(Context)}.
 * @deprecated Since 2.8.0 This method will be removed in the next minor version.
 * Please update to use AWSMobileClient using `initialize`.
 * Please visit https://aws-amplify.github.io for the latest Android documentation.
 */
@Deprecated
public class AWSStartupResult {

    private IdentityManager identityManager;
    
    /**
     * Construct the AWSStartupResult object with the IdentityManager passed in
     */
    public AWSStartupResult(final IdentityManager identityManager) {
        this.identityManager = identityManager;
    }

    /**
     * Retrieve the IdentityId from the IdentityManager
     */
    public boolean isIdentityIdAvailable() {
        return this.identityManager.getCachedUserID() != null;
    }
}