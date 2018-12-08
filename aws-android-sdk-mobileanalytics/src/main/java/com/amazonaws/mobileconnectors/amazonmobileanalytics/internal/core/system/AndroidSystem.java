/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class AndroidSystem implements System {
    private final Preferences preferences;
    private final FileManager fileManager;
    private final Connectivity connectivity;
    private final AppDetails appDetails;
    private final DeviceDetails deviceDetails;

    // UUID to identify a unique shared preferences and directory the library
    // can use, will be concatenated with the appId to ensure no collision
    private final static String PREFERENCES_AND_FILE_MANAGER_SUFFIX = "515d6767-01b7-49e5-8273-c8d11b0f331d";

    public AndroidSystem(final Context context, final String appId) {
        preferences = new AndroidPreferences(context, appId + PREFERENCES_AND_FILE_MANAGER_SUFFIX);
        fileManager = new DefaultFileManager(context.getDir(appId
                + PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE));
        connectivity = new AndroidConnectivity(context);
        appDetails = new AndroidAppDetails(context, appId);
        deviceDetails = new AndroidDeviceDetails(getCarrier(context));
    }

    private String getCarrier(final Context context) {
        try {
            TelephonyManager telephony = (TelephonyManager) context
                    .getSystemService(Context.TELEPHONY_SERVICE);
            if (null != telephony.getNetworkOperatorName()
                    && !telephony.getNetworkOperatorName().equals("")) {
                return telephony.getNetworkOperatorName();
            } else {
                return "Unknown";
            }
        } catch (Exception ex) {
            return "Unknown";
        }
    }

    @Override
    public FileManager getFileManager() {
        return fileManager;
    }

    @Override
    public Preferences getPreferences() {
        return preferences;
    }

    @Override
    public Connectivity getConnectivity() {
        return connectivity;
    }

    @Override
    public AppDetails getAppDetails() {
        return appDetails;
    }

    @Override
    public DeviceDetails getDeviceDetails() {
        return deviceDetails;
    }
}
