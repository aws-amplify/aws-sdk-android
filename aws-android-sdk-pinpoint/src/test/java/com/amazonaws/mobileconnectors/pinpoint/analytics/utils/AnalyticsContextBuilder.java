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

import org.mockito.internal.util.MockUtil;

import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidAppDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidConnectivity;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidPreferences;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidSystem;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.FileManager;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockAppDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import android.content.Context;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnalyticsContextBuilder {

    private NotificationClient mockNotificationClient;
    private final TargetingClient mockTargetingClient = mock(TargetingClient.class);
    private final PinpointConfiguration mockPinpointConfig = mock(PinpointConfiguration.class);
    private String sdkName = "";
    private String sdkVersion = "";
    private String mockUniqueIdValue = "";
    private Context context = null;
    private AndroidPreferencesConfiguration mockConfig = mock(AndroidPreferencesConfiguration.class);
    private FileManager mockFileManager = mock(FileManager.class);
    private AndroidPreferences mockPreferences = mock(AndroidPreferences.class);
    private AndroidConnectivity mockConnectivity = mock(AndroidConnectivity.class);
    private AndroidDeviceDetails mockDeviceDetails = new MockDeviceDetails();
    private AmazonPinpointAnalyticsClient mockERS = mock(AmazonPinpointAnalyticsClient.class);
    private AndroidSystem mockSystem = mock(AndroidSystem.class);
    private AmazonPinpointClient mockPinpointService = mock(AmazonPinpointClient.class);

    public PinpointContext build() {

        final SDKInfo mockSDKInfo = mock(SDKInfo.class);
        when(mockSDKInfo.getName()).thenReturn(sdkName);
        when(mockSDKInfo.getVersion()).thenReturn(sdkVersion);

        final MockUtil mockUtil = new MockUtil();
        if (mockUtil.isMock(mockSystem)) {
            when(mockSystem.getPreferences()).thenReturn(mockPreferences);
            when(mockSystem.getConnectivity()).thenReturn(mockConnectivity);
            final AndroidAppDetails mockAppDetails = new MockAppDetails();
            when(mockSystem.getAppDetails()).thenReturn(mockAppDetails);

            when(mockSystem.getDeviceDetails()).thenReturn(mockDeviceDetails);
        }

        final PinpointContext mockContext = mock(PinpointContext.class);
        when(mockContext.getSDKInfo()).thenReturn(mockSDKInfo);
        when(mockContext.getConfiguration()).thenReturn(mockConfig);
        when(mockContext.getUniqueId()).thenReturn(mockUniqueIdValue);
        when(mockContext.getAnalyticsServiceClient()).thenReturn(mockERS);
        when(mockContext.getPinpointServiceClient())
                .thenReturn(mockPinpointService);
        when(mockContext.getSystem()).thenReturn(mockSystem);
        // Notification client must be constructed after mock system is set
        mockNotificationClient = new NotificationClient(mockContext);
        when(mockContext.getNotificationClient())
                .thenReturn(mockNotificationClient);
        when(mockContext.getApplicationContext()).thenReturn(context);
        when(mockContext.getConfiguration()).thenReturn(mockConfig);
        when(mockContext.getNetworkType()).thenCallRealMethod();
        when(mockContext.getTargetingClient()).thenReturn(mockTargetingClient);
        when(mockContext.getPinpointConfiguration()).thenReturn(mockPinpointConfig);


        return mockContext;
    }

    public AnalyticsContextBuilder withConfiguration(AndroidPreferencesConfiguration mockConfig) {
        this.mockConfig = mockConfig;
        return this;
    }

    public AnalyticsContextBuilder withERSClient(AmazonPinpointAnalyticsClient mockERS) {
        this.mockERS = mockERS;
        return this;
    }

    public AnalyticsContextBuilder withPinpointServiceClient(
                                                                    AmazonPinpointClient mockPinpointService) {
        this.mockPinpointService = mockPinpointService;
        return this;
    }

    public AnalyticsContextBuilder withUniqueIdValue(String id) {
        this.mockUniqueIdValue = id;
        return this;
    }

    public AnalyticsContextBuilder withSdkInfo(String sdkName,
                                                      String sdkVersion) {
        this.sdkName = sdkName;
        this.sdkVersion = sdkVersion;
        return this;
    }

    public AnalyticsContextBuilder withPreferences(AndroidPreferences prefs) {
        this.mockPreferences = prefs;
        return this;
    }

    public AnalyticsContextBuilder withFileManager(FileManager fileManager) {
        this.mockFileManager = fileManager;
        return this;
    }

    public AnalyticsContextBuilder withConnectivity(AndroidConnectivity connectivity) {
        this.mockConnectivity = connectivity;
        return this;
    }

    public AnalyticsContextBuilder withDeviceDetails(AndroidDeviceDetails deviceDetails) {
        this.mockDeviceDetails = deviceDetails;
        return this;
    }

    public AnalyticsContextBuilder withSystem(AndroidSystem system) {
        this.mockSystem = system;
        return this;
    }

    public AnalyticsContextBuilder withContext(Context context) {
        this.context = context;
        return this;
    }

}
