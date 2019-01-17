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
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;

public class AndroidConnectivity {
    private static final Log log =
            LogFactory.getLog(AndroidConnectivity.class);

    protected boolean hasWifi;
    protected boolean hasMobile;
    protected boolean inAirplaneMode;
    private Context context;

    public AndroidConnectivity() {

    }

    public AndroidConnectivity(final Context context) {
        this.context = context;
    }

    public boolean isConnected() {
        determineAvailability();
        return hasWifi() || hasWAN();
    }

    public boolean hasWifi() {
        return this.hasWifi;
    }

    public boolean hasWAN() {
        return this.hasMobile && !inAirplaneMode;
    }

    // this method access constants that were added in the HONEYCOMB_MR2 release
    // and is properly guarded from running on older devices.
    private void determineAvailability() {
        ConnectivityManager cm = (ConnectivityManager) context
                                                               .getSystemService(Context.CONNECTIVITY_SERVICE);
        inAirplaneMode = Settings.System.getInt(context.getContentResolver(),
                                                       Settings.System.AIRPLANE_MODE_ON,
                                                       0) != 0;
        log.info("Airplane mode: " + inAirplaneMode);
        final NetworkInfo networkInfo =
                cm != null ? cm.getActiveNetworkInfo() : null;
        int networkType = 0;
        // default state
        hasWifi = false;
        // when we have connectivity manager, we assume we have some sort of
        // connectivity
        hasMobile = cm != null;
        // can we obtain network info?
        if (networkInfo != null) {
            if (networkInfo.isConnectedOrConnecting()) {
                networkType = networkInfo.getType();

                hasWifi = networkType == ConnectivityManager.TYPE_WIFI ||
                                  networkType == ConnectivityManager.TYPE_WIMAX;
                hasMobile = networkType == ConnectivityManager.TYPE_MOBILE ||
                                    networkType ==
                                            ConnectivityManager.TYPE_MOBILE_DUN ||
                                    networkType ==
                                            ConnectivityManager.TYPE_MOBILE_HIPRI ||
                                    networkType ==
                                            ConnectivityManager.TYPE_MOBILE_MMS ||
                                    networkType ==
                                            ConnectivityManager.TYPE_MOBILE_SUPL;
            } else {
                // if neither connected or connecting then hasMobile defaults
                // need to be changed to false
                hasMobile = false;
            }
        }
        log.info(String.format("Device Connectivity (%s)", hasWifi ? "On Wifi"
                                                                   : (hasMobile
                                                                              ? "On Mobile"
                                                                              : "No network connectivity")));
    }

}
