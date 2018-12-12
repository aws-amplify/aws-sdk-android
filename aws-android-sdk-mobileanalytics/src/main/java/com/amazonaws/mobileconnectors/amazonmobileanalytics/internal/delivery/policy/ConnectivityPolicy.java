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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class ConnectivityPolicy implements DeliveryPolicy {

    private static final String ALLOW_WAN_KEY = "allowWANEventDelivery";
    private static final boolean ALLOW_WAN_DEFAULT = true;

    private final Connectivity connectivity;
    private final boolean isWanAllowed;
    private final AnalyticsContext context;

    public ConnectivityPolicy(AnalyticsContext context, boolean isWanAllowed) {
        this.context = context;
        this.connectivity = context.getSystem().getConnectivity();
        this.isWanAllowed = isWanAllowed;
    }

    @Override
    public boolean isAllowed() {
        boolean allowed = false;

        // allow WAN transmission only if both the user and configuration allow
        // it
        boolean canTrasmitOnWAN = context.getConfiguration().optBoolean(ALLOW_WAN_KEY,
                ALLOW_WAN_DEFAULT)
                && isWanAllowed;

        if (connectivity.isConnected()) {
            allowed = connectivity.hasWifi() || connectivity.hasWired() || (connectivity.hasWAN() && canTrasmitOnWAN);
        }
        return allowed;
    }

    @Override
    public void handleDeliveryAttempt(boolean successful) {
        // no need to handle anything on submission
    }

}
