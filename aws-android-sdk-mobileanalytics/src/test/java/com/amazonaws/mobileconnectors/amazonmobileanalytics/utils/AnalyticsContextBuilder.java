/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.utils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockAppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Preferences;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;

public class AnalyticsContextBuilder {

    private String sdkName = "";
    private String sdkVersion = "";
    private String mockUniqueIdValue = "";
    private Configuration mockConfig = mock(Configuration.class);
    private FileManager mockFileManager = mock(FileManager.class);
    private Preferences mockPreferences = mock(Preferences.class);
    private DeliveryClient mockDeliveryClient = mock(DeliveryClient.class);
    private Connectivity mockConnectivity = mock(Connectivity.class);
    private DeviceDetails mockDeviceDetails = new MockDeviceDetails();
    private AmazonMobileAnalyticsClient mockERS = mock(AmazonMobileAnalyticsClient.class);

    public AnalyticsContext build() {

        SDKInfo mockSDKInfo = mock(SDKInfo.class);
        when(mockSDKInfo.getName()).thenReturn(sdkName);
        when(mockSDKInfo.getVersion()).thenReturn(sdkVersion);

        Id mockUniqueId = mock(Id.class);
        when(mockUniqueId.getValue()).thenReturn(mockUniqueIdValue);

        com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System mockSystem = mock(com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System.class);
        when(mockSystem.getFileManager()).thenReturn(mockFileManager);
        when(mockSystem.getPreferences()).thenReturn(mockPreferences);
        when(mockSystem.getConnectivity()).thenReturn(mockConnectivity);

        AppDetails mockAppDetails = new MockAppDetails();
        when(mockSystem.getAppDetails()).thenReturn(mockAppDetails);

        when(mockSystem.getDeviceDetails()).thenReturn(mockDeviceDetails);

        AnalyticsContext mockContext = mock(AnalyticsContext.class);
        when(mockContext.getSDKInfo()).thenReturn(mockSDKInfo);
        when(mockContext.getConfiguration()).thenReturn(mockConfig);
        when(mockContext.getUniqueId()).thenReturn(mockUniqueId);
        when(mockContext.getERSClient()).thenReturn(mockERS);
        when(mockContext.getDeliveryClient()).thenReturn(mockDeliveryClient);
        when(mockContext.getSystem()).thenReturn(mockSystem);

        return mockContext;
    }

    public AnalyticsContextBuilder withConfiguration(Configuration mockConfig) {
        this.mockConfig = mockConfig;
        return this;
    }

    public AnalyticsContextBuilder withERSClient(AmazonMobileAnalyticsClient mockERS) {
        this.mockERS = mockERS;
        return this;
    }

    public AnalyticsContextBuilder withDeliveryClient(DeliveryClient deliveryClient) {
        this.mockDeliveryClient = deliveryClient;
        return this;
    }

    public AnalyticsContextBuilder withUniqueIdValue(String id) {
        this.mockUniqueIdValue = id;
        return this;
    }

    public AnalyticsContextBuilder withSdkInfo(String sdkName, String sdkVersion) {
        this.sdkName = sdkName;
        this.sdkVersion = sdkVersion;
        return this;
    }

    public AnalyticsContextBuilder withPreferences(Preferences prefs) {
        this.mockPreferences = prefs;
        return this;
    }

    public AnalyticsContextBuilder withFileManager(FileManager fileManager) {
        this.mockFileManager = fileManager;
        return this;
    }

    public AnalyticsContextBuilder withConnectivity(Connectivity connectivity) {
        this.mockConnectivity = connectivity;
        return this;
    }

    public AnalyticsContextBuilder withDeviceDetails(DeviceDetails deviceDetails) {
        this.mockDeviceDetails = deviceDetails;
        return this;
    }

}
