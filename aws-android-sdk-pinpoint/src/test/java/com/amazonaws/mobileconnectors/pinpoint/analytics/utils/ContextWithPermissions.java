/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.analytics.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

public class ContextWithPermissions extends ContextWrapper {
    public ContextWithPermissions(Context base) {
        super(base);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        if (permission.equalsIgnoreCase("android.permission.INTERNET")
                    || permission
                               .equalsIgnoreCase("android.permission.ACCESS_NETWORK_STATE")) {
            return PackageManager.PERMISSION_GRANTED;
        } else {
            return super.checkCallingOrSelfPermission(permission);
        }
    }
}
