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

package com.amazonaws.mobileconnectors.pinpoint;

import android.app.Activity;
import android.content.Context;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.ContextWithPermissions;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.ApplyLocalesRule;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.LocaleTestingSetupAndTeardown;
import com.amazonaws.regions.Regions;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Locale;

import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public abstract class AWSErsLocaleTestBase implements LocaleTestingSetupAndTeardown {
    @Mock
    AndroidPreferencesConfiguration mockConfiguration;

    private static final Locale[] locales = new Locale[] {
            new Locale("en", "US"),
            new Locale("ar", "SA"),
            new Locale("ja", "JP", "JP"),
            new Locale("fr", "FR")
    };

    @Rule
    public ApplyLocalesRule applyLocalesRule = new ApplyLocalesRule(locales);

    protected static final String SDK_VERSION = "2.1.test";
    protected static final String SDK_NAME = "AmazonAnalyticsSDK";
    protected static final String UNIQUE_ID = "BEEFBEEF-BEEF-BEEF-BEEF-BEEFBEEFBEEF";

    protected PinpointContext context;
    protected PinpointManager instance;

    @Override
    public void setupForRepeatedTestCase() {
        Context mockAndroidContext = new ContextWithPermissions(new Activity());
        AWSCredentialsProvider provider = new AWSCredentialsProvider() {

            AWSCredentials creds = new AnonymousAWSCredentials();

            @Override
            public AWSCredentials getCredentials() {
                return creds;
            }

            @Override
            public void refresh() {
            };
        };

        mockConfiguration = mock(AndroidPreferencesConfiguration.class);
        PinpointConfiguration options = new PinpointConfiguration(mockAndroidContext, UNIQUE_ID, Regions.US_EAST_1, provider);
        context = new AnalyticsContextBuilder()
                .withSdkInfo(SDK_NAME, SDK_VERSION)
                .withUniqueIdValue(UNIQUE_ID)
                .withContext(Robolectric.application.getApplicationContext())
                .withSystem(new MockSystem("HELLO.world"))
                .withConfiguration(mockConfiguration)
                .build();
        AnalyticsClient analyticsClient = new AnalyticsClient(context);
        TargetingClient targetingClient = new TargetingClient(context);
        context.setAnalyticsClient(analyticsClient);
        context.setTargetingClient(targetingClient);
        SessionClient isc = new SessionClient(context);

        PinpointConfiguration config = new PinpointConfiguration(mockAndroidContext, UNIQUE_ID, Regions.US_EAST_1, provider);

        instance = new PinpointManager(config);

    }

    @Override
    public void teardownForRepeatedTestCase() {
        ((MockSystem) context.getSystem()).reset();
    }
}
