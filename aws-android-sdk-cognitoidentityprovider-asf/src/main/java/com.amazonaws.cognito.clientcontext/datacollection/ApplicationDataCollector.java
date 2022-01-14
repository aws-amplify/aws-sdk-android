/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/**
 * It collects application related data for the device.
 */
public class ApplicationDataCollector extends DataCollector {

    private static final String TAG = ApplicationDataCollector.class.getSimpleName();
    private static final int ALL_FLAGS_OFF = 0;

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        contextData.put(DataRecordKey.APP_NAME, getAppName(context));
        contextData.put(DataRecordKey.APP_TARGET_SDK, getAppTargetSdk(context));
        contextData.put(DataRecordKey.APP_VERSION, getAppVersion(context));
        return contextData;
    }

    private String getAppName(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();

        PackageManager packageManager = context.getPackageManager();
        String appName = (String) packageManager.getApplicationLabel(applicationInfo);
        return appName;
    }

    private String getAppVersion(Context context) {
        PackageManager packageManager = context.getPackageManager();

        String appVersion = "";
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), ALL_FLAGS_OFF);
            appVersion = packageInfo.versionName;
        } catch (NameNotFoundException e) {
            Log.i(TAG, "Unable to get app version. Provided package name could not be found.");
        }
        return appVersion;
    }

    private String getAppTargetSdk(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return String.valueOf(applicationInfo.targetSdkVersion);
    }
}