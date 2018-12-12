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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.PreferencesConfiguration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http.SDKInfoHandler;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.SharedPrefsUniqueIdService;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.UniqueIdService;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AndroidSystem;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DefaultDeliveryClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class DefaultAnalyticsContext implements AnalyticsContext {
    private final Configuration configuration;
    private Id uniqueId;
    private final SDKInfo sdkInfo;
    private final UniqueIdService uniqueIdService;
    private final com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System system;
    private final DeliveryClient deliveryClient;
    private final AmazonMobileAnalyticsClient ersClient;
    private final Context context;

    public DefaultAnalyticsContext(final AmazonMobileAnalyticsClient ersClient,
            final Context context, final Regions region, final String appId, final SDKInfo sdkInfo,
            boolean allowWanDelivery) {
        this.sdkInfo = sdkInfo;

        this.system = new AndroidSystem(context, appId);

        this.uniqueIdService = new SharedPrefsUniqueIdService(appId, context);
        this.uniqueId = uniqueIdService.getUniqueId(this);

        ersClient.setServiceNameIntern("mobileanalytics");
        ersClient.setRegion(Region.getRegion(region));
        this.ersClient = ersClient;
        ersClient.addRequestHandler(new SDKInfoHandler(sdkInfo));

        // config settings was always a new HashMap
        configuration = PreferencesConfiguration.newInstance(this);

        deliveryClient = DefaultDeliveryClient.newInstance(this, allowWanDelivery);
        this.context = context;

    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
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
    public System getSystem() {
        return system;
    }

    @Override
    public DeliveryClient getDeliveryClient() {
        return deliveryClient;
    }

    @Override
    public AmazonMobileAnalyticsClient getERSClient() {
        return ersClient;
    }

    @Override
    public String getNetworkType() {
        try {
            ConnectivityManager connectivity = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivity.getActiveNetworkInfo();
            if (null != networkInfo && networkInfo.isConnected() && networkInfo.isAvailable()
                    && networkInfo.getTypeName() != null) {
                return networkInfo.getTypeName();
            } else {
                return "Unknown";
            }
        } catch (Exception ex) {
            return "Unknown";
        }
    }
}
