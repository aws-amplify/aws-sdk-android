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

package com.amazonaws.mobileconnectors.pinpoint.analytics;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointCallback;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.ContextWithPermissions;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.model.ChannelType;

import android.app.Activity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class PinpointManagerTest {

    public static final String uniqueAnalyticsTag1 = "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST";
    private static StaticCredentialsProvider provider;
    private PinpointManager analyticsClient;

    private PinpointConfiguration createConfig(String appId) {
        provider = new StaticCredentialsProvider(new AnonymousAWSCredentials());
        return new PinpointConfiguration(new ContextWithPermissions(
                RuntimeEnvironment.application.getApplicationContext()),
                appId,
                Regions.US_EAST_1,
                ChannelType.GCM,
                provider);
    }

    /**
     * Sets up the clients, and also tests the creation callback functionality.
     */
    @Before
    public void setup() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1 +
                                                             (new Random())
                                                                     .nextInt());
        analyticsClient = new PinpointManager(options);
    }

    @Test
    public void initAndTestConstructorCallback() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1)
                                                .withInitCompletionCallback(new PinpointCallback<PinpointManager>() {
                                                    @Override
                                                    public void onComplete(PinpointManager arg0) {
                                                        arg0.getAnalyticsClient()
                                                                .addGlobalAttribute("globalComplete",
                                                                                           "GlobalComplete");
                                                        assertNotNull(arg0.getTargetingClient());
                                                        assertNotNull(arg0.getSessionClient());
                                                    }
                                                });

        analyticsClient = new PinpointManager(options);
        assertTrue(analyticsClient.getAnalyticsClient()
                           .createEvent("testInitCallback")
                           .hasAttribute("globalComplete"));
    }

    @Test
    public void initPinpointEnabledAndTestConstructorCallback() {
        PinpointConfiguration options = createConfig(uniqueAnalyticsTag1)
                                                .withEnablePinpoint(true)
                                                .withInitCompletionCallback(new PinpointCallback<PinpointManager>() {
                                                    @Override
                                                    public void onComplete(PinpointManager arg0) {
                                                        arg0.getAnalyticsClient()
                                                                .addGlobalAttribute("globalComplete",
                                                                                           "GlobalComplete");
                                                        assertNotNull(arg0.getTargetingClient());
                                                        assertNotNull(arg0.getSessionClient());
                                                    }
                                                });

        analyticsClient = new PinpointManager(options);
        assertTrue(analyticsClient.getAnalyticsClient()
                           .createEvent("testInitCallback")
                           .hasAttribute("globalComplete"));
    }

    @Test
    public void initAndTestNewConstructor() {
        PinpointConfiguration config = createConfig(uniqueAnalyticsTag1);
        analyticsClient = new PinpointManager(config);

        assertNotNull(analyticsClient);
    }

    @Test
    public void initWithCustomExecutor() {
        PinpointConfiguration config = createConfig(uniqueAnalyticsTag1);
        ThreadPoolExecutor customExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(1),
                new ThreadPoolExecutor.DiscardPolicy());
        analyticsClient = new PinpointManager(config.withExecutor(customExecutor));
        assertNotNull(analyticsClient);
        assertNotNull(analyticsClient.getTargetingClient());

    }
}
