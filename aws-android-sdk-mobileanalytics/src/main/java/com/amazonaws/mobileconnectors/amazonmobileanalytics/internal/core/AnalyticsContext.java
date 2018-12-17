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

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface AnalyticsContext {
    public Configuration getConfiguration();

    public DeliveryClient getDeliveryClient();

    public Id getUniqueId();

    public SDKInfo getSDKInfo();

    public com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System getSystem();

    public AmazonMobileAnalyticsClient getERSClient();

    public String getNetworkType();
}
