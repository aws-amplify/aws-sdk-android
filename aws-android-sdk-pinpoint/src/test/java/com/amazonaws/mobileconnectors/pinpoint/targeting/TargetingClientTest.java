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

package com.amazonaws.mobileconnectors.pinpoint.targeting;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.services.pinpoint.AmazonPinpointClient;
import com.amazonaws.services.pinpoint.model.UpdateEndpointRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class TargetingClientTest extends MobileAnalyticsTestBase {

    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";

    private MockDeviceDetails testDeviceDetails;
    private PinpointContext mockContext;
    private TargetingClient targetingClient;

    @Mock
    AmazonPinpointClient mockPinpointServiceClient;
    @Mock
    ThreadPoolExecutor mockPinpointExecutor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        testDeviceDetails = new MockDeviceDetails();

        mockContext = new AnalyticsContextBuilder()
                .withSdkInfo(SDK_NAME, SDK_VERSION)
                .withUniqueIdValue(UNIQUE_ID)
                .withDeviceDetails(testDeviceDetails)
                .withPinpointServiceClient(mockPinpointServiceClient)
                .withContext(Robolectric.application.getApplicationContext())
                .build();

        targetingClient = new TargetingClient(mockContext, mockPinpointExecutor);
    }

    @After
    public void cleanup() {
        targetingClient = null;
    }

    @Test
    public void endpoint_globalAttributeAndMetricsAddedAfterEndpointCreation() {

        final EndpointProfile endpointProfile = targetingClient.currentEndpoint();
        final List attrVals = Arrays.asList(new String[]{"attr1", "attr2"});
        endpointProfile.withAttribute(null,null).withMetric(null,null)
                .withAttribute("attr", attrVals).withMetric("metric", 1.0);
        assertThat(endpointProfile.getAllAttributes().size(), is(1));
        assertThat(endpointProfile.getAllMetrics().size(), is(1));
        assertThat(endpointProfile.getAttribute("attr"), is(attrVals));
        assertThat(endpointProfile.getMetric("metric").intValue(), is(1));
        endpointProfile.withAttribute("attr", null).withMetric("metric", null);
        assertThat(endpointProfile.getAllAttributes().size(), is(0));
        assertThat(endpointProfile.getAllMetrics().size(), is(0));
        targetingClient.addAttribute("globalAttr", attrVals);
        targetingClient.addMetric("globalMetric", 100.0);

        targetingClient.currentEndpoint();
        assertThat(targetingClient.currentEndpoint().getAllAttributes().size(), is(1));
        assertThat(targetingClient.currentEndpoint().getAllMetrics().size(), is(1));
        assertThat(targetingClient.currentEndpoint().getAttribute("globalAttr"), is(attrVals));
        assertThat(targetingClient.currentEndpoint().getMetric("globalMetric").intValue(), is(100));
        targetingClient.removeMetric(null);
        targetingClient.removeMetric("globalMetric");
        targetingClient.removeAttribute(null);
        targetingClient.removeAttribute("globalAttr");
        assertThat(targetingClient.currentEndpoint().getAllAttributes().size(), is(0));
        assertThat(targetingClient.currentEndpoint().getAllMetrics().size(), is(0));
    }

    @Test
    public void endpoint_globalAttributeAndMetricSpecific_doesNotOverrideLocalAttribute() {
        final List attrVals1 = Arrays.asList(new String[]{"attr1", "attr2"});
        final List attrVals2 = Arrays.asList(new String[]{"attr3", "attr4"});

        targetingClient.addAttribute("c", attrVals1);
        targetingClient.addMetric("metric", 3.0);

        final EndpointProfile endpointProfile = targetingClient.currentEndpoint()
                .withAttribute("c", attrVals2)
                .withMetric("metric", 1.0);

        assertThat(endpointProfile.getAttribute("c"), is(attrVals2));
        assertThat(endpointProfile.getMetric("metric"), is(1.0));
    }
    @Test
    public void updateEndpoint_enqueueEndpointForDeliveryCalled() {
        targetingClient.updateEndpointProfile();
        verifyAndRunExecutorService(1);
        verify(mockPinpointServiceClient, times(1)).updateEndpoint(any(UpdateEndpointRequest.class));
    }

    private void verifyAndRunExecutorService(int numExpectedRunnables) {
        final ArgumentCaptor<Runnable> runnableCaptor = ArgumentCaptor.forClass(Runnable.class);
        verify(mockPinpointExecutor, times(numExpectedRunnables)).execute(runnableCaptor.capture());

        for (final Runnable enqueueRunnable : runnableCaptor.getAllValues()) {
            enqueueRunnable.run();
        }
    }
}