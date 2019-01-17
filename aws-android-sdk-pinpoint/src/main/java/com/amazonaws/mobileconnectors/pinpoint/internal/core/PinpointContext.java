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

package com.amazonaws.mobileconnectors.pinpoint.internal.core;

import java.io.Serializable;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.http.SDKInfoHandler;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.idresolver.SharedPrefsUniqueIdService;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidSystem;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient;
import com.amazonaws.services.pinpoint.AmazonPinpoint;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class PinpointContext implements Serializable {
    private final AndroidPreferencesConfiguration configuration;
    private final PinpointConfiguration pinpointConfiguration;
    private final SDKInfo sdkInfo;
    private final SharedPrefsUniqueIdService uniqueIdService;
    private final AndroidSystem system;
    private final AmazonPinpointAnalyticsClient analyticsServiceClient;
    private final AmazonPinpointClient pinpointServiceClient;
    private final Context applicationContext;
    private String uniqueId;
    private AnalyticsClient analyticsClient;
    private TargetingClient targetingClient;
    private SessionClient sessionClient;
    private NotificationClient notificationClient;

    public PinpointContext() {
        this.configuration = null;
        this.pinpointConfiguration = null;
        this.sdkInfo = null;
        this.uniqueIdService = null;
        this.system = null;
        this.analyticsServiceClient = null;
        this.pinpointServiceClient = null;
        this.applicationContext = null;
        this.analyticsClient = null;
        this.targetingClient = null;
        this.sessionClient = null;
        this.notificationClient = null;
    }

    public PinpointContext(final AmazonPinpointAnalyticsClient analyticsServiceClient,
                           final AmazonPinpointClient pinpointServiceClient,
                           final Context applicationContext,
                           final String appId,
                           final SDKInfo sdkInfo,
                           final PinpointConfiguration pinpointConfiguration) {
        this.sdkInfo = sdkInfo;
        this.pinpointConfiguration = pinpointConfiguration;
        this.system = new AndroidSystem(applicationContext, appId);
        this.uniqueIdService = new SharedPrefsUniqueIdService(appId,
                                                              applicationContext);
        this.uniqueId = uniqueIdService.getUniqueId(this);
        this.analyticsServiceClient = analyticsServiceClient;
        this.pinpointServiceClient = pinpointServiceClient;
        this.applicationContext = applicationContext;
        this.configuration = AndroidPreferencesConfiguration.newInstance(this);

        analyticsServiceClient.addRequestHandler(new SDKInfoHandler(sdkInfo));
        pinpointServiceClient.addRequestHandler(new SDKInfoHandler(sdkInfo));
    }

    public NotificationClient getNotificationClient() {
        return notificationClient;
    }

    public void setNotificationClient(NotificationClient notificationClient) {
        this.notificationClient = notificationClient;
    }

    public AnalyticsClient getAnalyticsClient() {
        return analyticsClient;
    }

    public void setAnalyticsClient(AnalyticsClient analyticsClient) {
        this.analyticsClient = analyticsClient;
    }

    public SessionClient getSessionClient() {
        return sessionClient;
    }

    public void setSessionClient(SessionClient sessionClient) {
        this.sessionClient = sessionClient;
    }

    public TargetingClient getTargetingClient() {
        return targetingClient;
    }

    public void setTargetingClient(TargetingClient targetingClient) {
        this.targetingClient = targetingClient;
    }

    public AndroidPreferencesConfiguration getConfiguration() {
        return configuration;
    }

    public PinpointConfiguration getPinpointConfiguration() {
        return pinpointConfiguration;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public SDKInfo getSDKInfo() {
        return sdkInfo;
    }

    public AndroidSystem getSystem() {
        return system;
    }

    public AmazonPinpointAnalyticsClient getAnalyticsServiceClient() {
        return analyticsServiceClient;
    }

    public AmazonPinpoint getPinpointServiceClient() {
        return pinpointServiceClient;
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public String getNetworkType() {
        try {
            final ConnectivityManager connectivity = (ConnectivityManager) applicationContext.getSystemService(
                Context.CONNECTIVITY_SERVICE);
            final NetworkInfo networkInfo = connectivity.getActiveNetworkInfo();
            if (null != networkInfo && networkInfo.isConnected() && networkInfo.isAvailable() && networkInfo.getTypeName() != null) {
                return networkInfo.getTypeName();
            } else {
                return "Unknown";
            }
        } catch (final Exception ex) {
            return "Unknown";
        }
    }
}
