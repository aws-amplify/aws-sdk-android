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

package com.amazonaws.mobileconnectors.pinpoint.internal.core;

import java.util.Locale;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.ContextWithPermissions;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.http.SDKInfoHandler;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.idresolver.SharedPrefsUniqueIdService;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidSystem;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpoint.model.ChannelType;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import android.app.Activity;
import android.content.Context;
import org.robolectric.RuntimeEnvironment;

public class MockPinpointContext extends PinpointContext {

    private final AndroidPreferencesConfiguration configuration;
    private final PinpointConfiguration pinpointConfiguration;
    private final SDKInfo sdkInfo;
    private final MockSystem system;
    private final AmazonPinpointAnalyticsClient analyticsServiceClient;
    private final AmazonPinpointClient pinpointServiceClient;
    private final Context applicationContext;
    private final String networkType;
    private String uniqueId;
    private AnalyticsClient analyticsClient;
    private TargetingClient targetingClient;
    private SessionClient sessionClient;
    private NotificationClient notificationClient;

    public MockPinpointContext(final SDKInfo sdkInfo, final String id) {
        this(sdkInfo, id, true, null, true, true, true, "TestNetwork");
    }

    public MockPinpointContext(final SDKInfo sdkInfo, final String id,
                                      RequestHandler2 additionalHandler) {
        this(sdkInfo, id, true, additionalHandler, true, true, true,
                    "TestNetwork");
    }

    public MockPinpointContext(final SDKInfo sdkInfo, final String id,
                                      boolean allowWANDelivery) {
        this(sdkInfo, id, allowWANDelivery, null, true, true, true,
                    "TestNetwork");
    }

    public MockPinpointContext(final SDKInfo sdkInfo, final String id,
                                      boolean allowWANDelivery,
                                      RequestHandler2 additionalHandler,
                                      boolean initConnectivity,
                                      boolean initWifi,
                                      boolean initWAN, String networkType) {

        final SharedPrefsUniqueIdService uniqueIdService = new SharedPrefsUniqueIdService(id, RuntimeEnvironment.application.getApplicationContext());
        this.uniqueId = uniqueIdService.getUniqueId(this);

        this.sdkInfo = sdkInfo;
        this.networkType = networkType;

        final AWSCredentialsProvider provider = new AWSCredentialsProvider() {

            AWSCredentials creds = new AnonymousAWSCredentials();

            @Override
            public AWSCredentials getCredentials() {
                return creds;
            }

            @Override
            public void refresh() {
            }
        };

        this.pinpointConfiguration = new PinpointConfiguration(new ContextWithPermissions(new Activity()
                                                                                                  .getApplicationContext()),
                                                                      getUniqueId(),
                                                                      Regions.US_EAST_1,
                                                                      ChannelType.GCM,
                                                                      provider);
        this.system = new MockSystem(id);
        this.system.getPreferences().putString("UniqueId", id);
        this.setConnectivity(initConnectivity);
        this.setWAN(initWAN);
        this.setWifi(initWifi);
        this.applicationContext = new Activity().getApplicationContext();

        final AmazonPinpointAnalyticsClient analyticsServiceClient = new AmazonPinpointAnalyticsClient();
        analyticsServiceClient.addRequestHandler(additionalHandler);
        analyticsServiceClient.addRequestHandler(new SDKInfoHandler(sdkInfo));
        this.analyticsServiceClient = analyticsServiceClient;

        final AmazonPinpointClient targetingClient = new AmazonPinpointClient();
        this.pinpointServiceClient = targetingClient;

        this.configuration = AndroidPreferencesConfiguration.newInstance(this);

        this.notificationClient = NotificationClient.createClient(this, ChannelType.GCM);
    }

    @Override
    public AndroidPreferencesConfiguration getConfiguration() {
        return configuration;
    }

    @Override
    public PinpointConfiguration getPinpointConfiguration() {
        return pinpointConfiguration;
    }

    @Override
    public NotificationClient getNotificationClient() {
        return notificationClient;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public SDKInfo getSDKInfo() {
        return sdkInfo;
    }

    @Override
    public AndroidSystem getSystem() {
        return system;
    }

    public void setConnectivity(final boolean isConnected) {
        system.setConnectivity(isConnected);
    }

    public void setWifi(final boolean hasWifi) {
        system.setWifi(hasWifi);
    }

    public void setWAN(final boolean hasWAN) {
        system.setWAN(hasWAN);
    }

    public void setLocale(final Locale newLocale) {
        system.setLocale(newLocale);
    }

    @Override
    public AmazonPinpointAnalyticsClient getAnalyticsServiceClient() {
        return analyticsServiceClient;
    }

    @Override
    public AmazonPinpointClient getPinpointServiceClient() {
        return pinpointServiceClient;
    }

    @Override
    public String getNetworkType() {
        return networkType;
    }

}
