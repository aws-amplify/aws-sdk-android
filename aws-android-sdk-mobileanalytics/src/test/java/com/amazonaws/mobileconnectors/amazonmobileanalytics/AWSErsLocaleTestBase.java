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

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.core.MockAnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.DefaultEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.FileSessionStore;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.ApplyLocalesRule;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.LocaleTestingSetupAndTeardown;
import com.amazonaws.regions.Regions;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Locale;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public abstract class AWSErsLocaleTestBase implements LocaleTestingSetupAndTeardown {

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

    protected MockAnalyticsContext context;
    protected MobileAnalyticsManager instance;

    private class ContextWithPermissions extends ContextWrapper {
        public ContextWithPermissions(Context base) {
            super(base);
        }

        @Override
        public int checkCallingOrSelfPermission(String permission) {
            if (permission.equalsIgnoreCase("android.permission.INTERNET")
                    || permission.equalsIgnoreCase("android.permission.ACCESS_NETWORK_STATE"))
                return PackageManager.PERMISSION_GRANTED;
            else
                return super.checkCallingOrSelfPermission(permission);
        }

    }

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

        AnalyticsConfig options = new AnalyticsConfig();
        context = new MockAnalyticsContext(new SDKInfo(SDK_NAME, SDK_VERSION),
                Id.valueOf(UNIQUE_ID));
        InternalEventClient iec = new DefaultEventClient(context, false);
        InternalSessionClient isc = new DefaultSessionClient(context, iec, new FileSessionStore(
                context));
        instance = new MobileAnalyticsManager(mockAndroidContext, UNIQUE_ID, Regions.US_EAST_1,
                provider, options, null, context, iec, isc, context.getERSClient());

    }

    @Override
    public void teardownForRepeatedTestCase() {
        ((MockSystem) context.getSystem()).reset();
    }
}
