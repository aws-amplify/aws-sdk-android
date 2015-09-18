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

package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import android.test.mock.MockContext;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.DefaultEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.FileSessionStore;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient;
import com.amazonaws.regions.Regions;

public class MobileAnalyticsManagerBuilder {

    private static String defaultAppId = "UnitTestAppId";
    private static AWSCredentialsProvider defaultProvider = new AWSCredentialsProvider() {
        public AWSCredentials getCredentials() {
            return new BasicAWSCredentials("TestKey", "TestSecret");
        };

        public void refresh() {
            return;
        };
    };

    public static MobileAnalyticsManager newAnalyticsManager(final AnalyticsContext context) {
        return newAnalyticsManager(context, new AnalyticsConfig(), null);
    }

    public static MobileAnalyticsManager newAnalyticsManager(final AnalyticsContext context,
            final AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback) {
        return newAnalyticsManager(context, new AnalyticsConfig(), initCompletionCallback);
    }

    public static MobileAnalyticsManager newAnalyticsManager(final AnalyticsContext context,
            final AnalyticsConfig config) {
        return newAnalyticsManager(context, config, null);
    }

    public static MobileAnalyticsManager newAnalyticsManager(final AnalyticsContext context,
            final AnalyticsConfig config,
            final AnalyticsCallback<MobileAnalyticsManager> initCompletionCallback) {

        InternalEventClient ec = new DefaultEventClient(context, true);
        InternalSessionClient sc = new DefaultSessionClient(context, ec, new FileSessionStore(
                context));

        return new MobileAnalyticsManager(new MockContext(), defaultAppId, Regions.US_EAST_1,
                defaultProvider, new AnalyticsConfig(), null, context, ec, sc,
                context.getERSClient());
    }

}
