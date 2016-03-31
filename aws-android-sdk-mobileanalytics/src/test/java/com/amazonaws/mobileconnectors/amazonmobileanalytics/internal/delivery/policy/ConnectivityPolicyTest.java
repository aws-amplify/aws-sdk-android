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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.AnalyticsContextBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class ConnectivityPolicyTest {

    @Mock
    Connectivity mockConnectivity;
    @Mock
    Configuration mockConfig;
    private AnalyticsContext mockContext;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockContext = new AnalyticsContextBuilder().withConnectivity(mockConnectivity)
                .withConfiguration(mockConfig)
                .build();

        when(mockConfig.optBoolean("allowWANEventDelivery", true)).thenReturn(true);
    }

    @Test
    public void isAllowed_hasNoConnectivity_policyIsFalse() {
        setupConnectivity(false, false, false);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(false));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(false));
    }

    @Test
    public void isAllowed_hasWifiNoWanAndWanAllowed_policyIsTrue() {
        setupConnectivity(true, true, false);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasWifiNoWanAndWanNotAllowed_policyIsTrue() {
        setupConnectivity(true, true, false);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasOnlyWanAndWanNotAllowed_policyIsFalse() {
        setupConnectivity(true, false, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(false));
    }

    @Test
    public void isAllowed_hasOnlyWan_WanAllowedByUserButNotConfig_policyIsFalse() {
        setupConnectivity(true, false, true);
        when(mockConfig.optBoolean("allowWANEventDelivery", true)).thenReturn(false);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(false));
    }

    @Test
    public void isAllowed_hasOnlyWan_WanAllowedByUserAndConfig_policyIsTrue() {
        setupConnectivity(true, false, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasAllConnectivity_policyIsTrue() {
        setupConnectivity(true, true, true, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasOnlyWired_policyIsTrue() {
        setupConnectivity(true, false, false, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasWifiAndWired_policyIsTrue() {
        setupConnectivity(true, true, false, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasWANAndWired_policyIsTrue() {
        setupConnectivity(true, false, true, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasWifi_policyIsTrue() {
        setupConnectivity(true, true, false);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void isAllowed_hasWAN_policyIsTrue() {
        setupConnectivity(true, false, true);
        ConnectivityPolicy target = new ConnectivityPolicy(mockContext, true);
        assertThat(target.isAllowed(), is(true));

        target = new ConnectivityPolicy(mockContext, false);
        assertThat(target.isAllowed(), is(false));
    }

    private void setupConnectivity(boolean isConnected, boolean hasWifi, boolean hasWan) {
        setupConnectivity(isConnected, hasWifi, hasWan, false);
    }

    private void setupConnectivity(boolean isConnected, boolean hasWifi, boolean hasWan, boolean hasWired) {
        when(mockConnectivity.isConnected()).thenReturn(isConnected);
        when(mockConnectivity.hasWifi()).thenReturn(hasWifi);
        when(mockConnectivity.hasWAN()).thenReturn(hasWan);
        when(mockConnectivity.hasWired()).thenReturn(hasWired);
    }

}
