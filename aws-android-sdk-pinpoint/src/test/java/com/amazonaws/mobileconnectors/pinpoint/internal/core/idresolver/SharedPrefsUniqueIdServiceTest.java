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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.idresolver;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.Context;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidPreferences;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidSystem;
import com.amazonaws.regions.Regions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class SharedPrefsUniqueIdServiceTest extends MobileAnalyticsTestBase {

    private static final String appId = "TestAppId";

    private PinpointContext mockPinpointContext = Mockito.mock(PinpointContext.class);
    private Context mockAppContext = new Activity();
    private AndroidSystem mockSystem = Mockito
            .mock(AndroidSystem.class);
    private AndroidPreferences mockPreferences = Mockito.mock(AndroidPreferences.class);
    private AWSCredentialsProvider credentialsProvider = Mockito.mock(AWSCredentialsProvider.class);

    private SharedPrefsUniqueIdService serviceToTest = null;

    @Before
    public void setup() {
        when(mockPinpointContext.getSystem()).thenReturn(mockSystem);
        when(mockPinpointContext.getPinpointConfiguration()).thenReturn(new PinpointConfiguration(mockAppContext, appId, Regions.US_EAST_1, credentialsProvider));
        when(mockSystem.getPreferences()).thenReturn(mockPreferences);

        serviceToTest = new SharedPrefsUniqueIdService(appId, mockAppContext);
    }

    @Test
    public void getUniqueId_whenSharedPrefsIsNull_returnEmptyId() {
        when(mockSystem.getPreferences()).thenReturn(null);
        String uniqueId = serviceToTest.getUniqueId(mockPinpointContext);
        assertThat(uniqueId, is(""));
    }

    @Test
    public void getUniqueId_whenIdDoesNotExist_createAndStoreId() {
        String expectedUniqueIdKey = "UniqueId";
        when(mockPreferences.getString(eq(expectedUniqueIdKey), anyString())).thenReturn(null);

        String uniqueId = serviceToTest.getUniqueId(mockPinpointContext);
        assertNotNull(uniqueId);

        verify(mockPreferences, times(1)).putString(eq(expectedUniqueIdKey), any(String.class));
    }

    @Test
    public void getUniqueId_whenIdExist_recallStoredId() {
        String expectedUniqueIdKey = "UniqueId";
        String expectedUniqueId = "98765";
        when(mockPreferences.getString(eq(expectedUniqueIdKey), anyString())).thenReturn(
                expectedUniqueId);
        String uniqueId = serviceToTest.getUniqueId(mockPinpointContext);
        assertThat(uniqueId, is(expectedUniqueId));
    }
}
