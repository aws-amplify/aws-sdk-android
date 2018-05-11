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

/**
 * Interface for handling permissions
 */
public interface SignInPermissionsHandler {
    /**
     * @return the permission request code that will be used by this provider.
     */
    int getPermissionRequestCode();

    /**
     * Handler for permissions results.
     *
     * @param requestCode the permissions request code
     * @param permissions the permissions requested
     * @param grantResults the results.
     */
    void handleRequestPermissionsResult(int requestCode, String permissions[],
                                        int[] grantResults);
}
