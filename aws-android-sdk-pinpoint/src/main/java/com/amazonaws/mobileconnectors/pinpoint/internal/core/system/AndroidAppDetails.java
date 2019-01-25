/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class AndroidAppDetails {
    private static final Log log =
            LogFactory.getLog(AndroidAppDetails.class);

    private Context applicationContext;

    private String appTitle;
    private String packageName;
    private String versionCode;
    private String versionName;
    private String appId;

    public AndroidAppDetails() {

    }

    public AndroidAppDetails(Context context, String appId) {
        this.applicationContext = context.getApplicationContext();
        try {
            PackageManager packageManager = this.applicationContext
                                                    .getPackageManager();
            PackageInfo packageInfo = packageManager
                                                .getPackageInfo(this.applicationContext.getPackageName(), 0);
            ApplicationInfo appInfo = packageManager
                                              .getApplicationInfo(packageInfo.packageName, 0);

            appTitle = (String) packageManager.getApplicationLabel(appInfo);
            packageName = packageInfo.packageName;
            versionCode = String.valueOf(packageInfo.versionCode);
            versionName = packageInfo.versionName;
            this.appId = appId;
        } catch (NameNotFoundException e) {
            log.warn("Unable to get details for package " +
                             this.applicationContext.getPackageName());
            appTitle = "Unknown";
            packageName = "Unknown";
            versionCode = "Unknown";
            versionName = "Unknown";
        }
    }

    public AndroidAppDetails(String packageName, 
                             String versionCode,
                             String versionName,
                             String appTitle,
                             String appId) {
        this.packageName = packageName;
        this.versionCode = versionCode;
        this.versionName = versionName;
        this.appTitle = appTitle;
        this.appId = appId;
    }

    public String packageName() {
        return packageName;
    }

    public String versionName() {
        return versionName;
    }

    public String versionCode() {
        return versionCode;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public String getAppId() {
        return appId;
    }
}
