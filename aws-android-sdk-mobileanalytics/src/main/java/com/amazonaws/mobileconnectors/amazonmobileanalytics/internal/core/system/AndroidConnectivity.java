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
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.util.Log;
import android.os.Build;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class AndroidConnectivity implements Connectivity {
    private static final String TAG = "AndroidConnectivity";

    protected boolean hasWifi;
    protected boolean hasMobile;
    protected boolean hasWired;
    protected boolean inAirplaneMode;
    private Context context;

    /**
     * Constructor
     *
     * @param context
     */
    public AndroidConnectivity(final Context context) {
        this.context = context;
    }

    // *** getters

    @Override
    public boolean isConnected() {
        determineAvailability();
        return hasWifi() || hasWAN() || hasWired();
    }

    @Override
    public boolean hasWifi() {
        return this.hasWifi;
    }

    @Override
    public boolean hasWAN() {
        return this.hasMobile && !inAirplaneMode;
    }

    @Override
    public boolean hasWired() {
        return this.hasWired;
    }

    // this method access constants that were added in the HONEYCOMB_MR2 release
    // and is properly guarded from running on older devices.
    private void determineAvailability() {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        inAirplaneMode = Settings.System.getInt(context.getContentResolver(),
                Settings.System.AIRPLANE_MODE_ON, 0) != 0;
        Log.v(TAG, "Airplane mode: " + inAirplaneMode);
        final NetworkInfo networkInfo = cm != null ? cm.getActiveNetworkInfo() : null;
        int networkType = 0;
        // default state
        hasWifi = false;
        hasWired = false;
        // when we have connectivity manager, we assume we have some sort of
        // connectivity
        hasMobile = cm != null;
        // can we obtain network info?
        if (networkInfo != null) {
            if (networkInfo.isConnectedOrConnecting()) {
                networkType = networkInfo.getType();

                // Make sure we're running on Honeycomb (SDK 13) or higher to check for Ethernet
                hasWired = networkType == 9; //ConnectivityManager.TYPE_ETHERNET

                hasWifi = networkType == ConnectivityManager.TYPE_WIFI ||
                        networkType == ConnectivityManager.TYPE_WIMAX;
                hasMobile = networkType == ConnectivityManager.TYPE_MOBILE ||
                        networkType == ConnectivityManager.TYPE_MOBILE_DUN ||
                        networkType == ConnectivityManager.TYPE_MOBILE_HIPRI ||
                        networkType == ConnectivityManager.TYPE_MOBILE_MMS ||
                        networkType == ConnectivityManager.TYPE_MOBILE_SUPL;
            } else {
                // if neither connected or connecting then hasMobile defaults
                // need to be changed to false
                hasMobile = false;
            }
        }
        Log.v(TAG, String.format("Device Connectivity (%s)", hasWifi ? "On Wifi"
                : (hasMobile ? "On Mobile" : "No network connectivity")));
    }

}
