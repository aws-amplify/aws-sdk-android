/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.android.mobileanalytics.internal.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.amazonaws.android.mobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.android.mobileanalytics.internal.core.configuration.PreferencesConfiguration;
import com.amazonaws.android.mobileanalytics.internal.core.http.SDKInfoHandler;
import com.amazonaws.android.mobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.android.mobileanalytics.internal.core.idresolver.SharedPrefsUniqueIdService;
import com.amazonaws.android.mobileanalytics.internal.core.idresolver.UniqueIdService;
import com.amazonaws.android.mobileanalytics.internal.core.system.AndroidSystem;
import com.amazonaws.android.mobileanalytics.internal.core.system.System;
import com.amazonaws.android.mobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.android.mobileanalytics.internal.delivery.DefaultDeliveryClient;
import com.amazonaws.android.mobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.services.eventrecorder.AWSEventRecorderServiceClient;

public class DefaultAnalyticsContext implements AnalyticsContext {
	private final Configuration configuration;
	private Id uniqueId;
	private final SDKInfo sdkInfo;
	private final UniqueIdService uniqueIdService;
	private final com.amazonaws.android.mobileanalytics.internal.core.system.System system;
	private final DeliveryClient deliveryClient;
	private final AWSEventRecorderServiceClient ersClient;
	private final Context context;

	public static AnalyticsContext newInstance(final AWSEventRecorderServiceClient ersClient, final Context context, final String uniqueTag, final SDKInfo sdkInfo, boolean allowWanDelivery) {
		return new DefaultAnalyticsContext(ersClient, context, uniqueTag, sdkInfo, allowWanDelivery);
	}

	private DefaultAnalyticsContext(final AWSEventRecorderServiceClient ersClient, final Context context, final String uniqueTag, final SDKInfo sdkInfo, boolean allowWanDelivery) {
		this.sdkInfo = sdkInfo;
		
        this.system = new AndroidSystem(context,uniqueTag);
        
        this.uniqueIdService = SharedPrefsUniqueIdService.newInstance();
        this.uniqueId = uniqueIdService.getUniqueId(this);

        ersClient.setEndpoint("https://mobileanalytics.us-east-1.amazonaws.com");
        ersClient.setServiceNameIntern("mobileanalytics");
		this.ersClient = ersClient;
		ersClient.addRequestHandler(new SDKInfoHandler(sdkInfo));
		
		//config settings was always a new HashMap
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
	public AWSEventRecorderServiceClient getERSClient() {
	    return ersClient;
	}
	
	@Override
	public String getNetworkType() {
	    try {
            ConnectivityManager connectivity = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivity.getActiveNetworkInfo();
            if(null != networkInfo && networkInfo.isConnected() && networkInfo.isAvailable()) {
                return networkInfo.getTypeName();
            } else {
                return "Unknown";
            }
        } catch (Exception ex) {
            return "Unknown";
        }
	}
}
