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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.core;

import android.app.Activity;

import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.PreferencesConfiguration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http.SDKInfoHandler;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.SharedPrefsUniqueIdService;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.UniqueIdService;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DefaultDeliveryClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;

import java.util.Locale;

public class MockAnalyticsContext implements AnalyticsContext {

    private final SDKInfo sdkInfo;
    private final Configuration configuration;
    private final Id uniqueId;
    private final MockSystem system;
    private final String networkType;
    private final DeliveryClient deliveryClient;
    private final AmazonMobileAnalyticsClient ersClient;

    public MockAnalyticsContext(final SDKInfo sdkInfo, final Id id) {
        this(sdkInfo, id, true, null, true, true, true, "TestNetwork");
    }

    public MockAnalyticsContext(final SDKInfo sdkInfo, final Id id,
            RequestHandler2 additionalHandler) {
        this(sdkInfo, id, true, additionalHandler, true, true, true, "TestNetwork");
    }

    public MockAnalyticsContext(final SDKInfo sdkInfo, final Id id, boolean allowWANDelivery) {
        this(sdkInfo, id, allowWANDelivery, null, true, true, true, "TestNetwork");
    }

    public MockAnalyticsContext(final SDKInfo sdkInfo, final Id id, boolean allowWANDelivery,
            RequestHandler2 additionalHandler, boolean initConnectivity, boolean initWifi,
            boolean initWAN, String networkType) {

        this.sdkInfo = sdkInfo;
        this.networkType = networkType;
        this.system = new MockSystem(id.getValue());
        this.system.getPreferences().putString("UniqueId", id.getValue());
        this.setConnectivity(initConnectivity);
        this.setWAN(initWAN);
        this.setWifi(initWifi);

        UniqueIdService uniqueIdService = new SharedPrefsUniqueIdService(id.getValue(),
                new Activity());
        this.uniqueId = uniqueIdService.getUniqueId(this);

        AmazonMobileAnalyticsClient ers = new AmazonMobileAnalyticsClient();
        ers.addRequestHandler(additionalHandler);
        ers.addRequestHandler(new SDKInfoHandler(sdkInfo));
        this.ersClient = ers;

        configuration = PreferencesConfiguration.newInstance(this);

        deliveryClient = DefaultDeliveryClient.newInstance(this, allowWANDelivery);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    @Override
    public DeliveryClient getDeliveryClient() {
        return deliveryClient;
    }

    @Override
    public Id getUniqueId() {
        return uniqueId;
    }

    @Override
    public SDKInfo getSDKInfo() {
        return sdkInfo;
    }

    @Override
    public com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System getSystem() {
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
    public AmazonMobileAnalyticsClient getERSClient() {
        return ersClient;
    }

    @Override
    public String getNetworkType() {
        return networkType;
    }

}
