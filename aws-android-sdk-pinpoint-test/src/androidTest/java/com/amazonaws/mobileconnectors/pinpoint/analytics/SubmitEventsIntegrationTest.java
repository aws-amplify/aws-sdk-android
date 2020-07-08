/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.content.Context;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.model.ChannelType;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.testutils.util.InternetConnectivity;
import com.amazonaws.testutils.util.RetryStrategies;
import com.amazonaws.testutils.util.RetryStrategies.Condition;
import com.amazonaws.testutils.util.RetryStrategies.NoOpRetryable;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public final class SubmitEventsIntegrationTest extends AWSTestBase {
    private static final String TAG = SubmitEventsIntegrationTest.class.getSimpleName();
    private static final String PINPOINT_DATABASE_NAME = "awspinpoint.db";

    private Context context;
    private AnalyticsClient analyticsClient;
    private SessionClient sessionClient;

    @Before
    public void setUp() throws JSONException {
        InternetConnectivity.goOnline();

        context = ApplicationProvider.getApplicationContext();
        context.deleteDatabase(PINPOINT_DATABASE_NAME);

        PinpointManager pinpointManager = createPinpointManager();
        this.analyticsClient = pinpointManager.getAnalyticsClient();
        this.sessionClient = pinpointManager.getSessionClient();
    }

    private PinpointManager createPinpointManager() throws JSONException {
        JSONObject testConfig = getPackageConfigure("pinpoint");
        String appId = testConfig.getString("AppId");
        Regions regions = Regions.fromName(testConfig.getString("Region"));
        String identityPoolId = testConfig.getString("identity_pool_id");

        CognitoCachingCredentialsProvider credentialsProvider =
            new CognitoCachingCredentialsProvider(context, identityPoolId, regions);
        PinpointConfiguration pinpointConfiguration =
            new PinpointConfiguration(context, appId, regions, ChannelType.GCM, credentialsProvider);
        return new PinpointManager(pinpointConfiguration);
    }

    @After
    public void tearDown() {
        InternetConnectivity.goOnline();
        analyticsClient.closeDB();
        context.deleteDatabase(PINPOINT_DATABASE_NAME);
    }

    @Test
    public void testSubmitEvents() {
        // Arrange: a session has recorded some events.
        recordEvents(10);
        // 12 = 10 recorded + 1 start session + 1 stop session
        assertEventualEventCount(12);

        // Act: submit the events, and wait for them to be processed.
        analyticsClient.submitEvents();

        // Assert: there are 0 events left on the client.
        assertEventualEventCount(0);
    }

    @Test
    public void testSubmitEventsBeforeAndAfterConnectivityLoss() {
        // When the device is offline, submitting events will fail.
        // However, the events will be kept locally, until they can be
        // submitted again.
        InternetConnectivity.goOffline();
        recordEvents(10);
        analyticsClient.submitEvents();
        try {
            assertEventualEventCount(0);
            fail("Events drained but the device was offline?");
        } catch (IllegalStateException eventsDidNotDrain) {
            // We EXPECT that no events drain. The original 12 should be present.
            // 12 = 10 recorded + 1 start session + 1 stop session
            // However, we have to try and wait anyway, in case the component
            // does _try_ to drain them.
            assertEquals(12, analyticsClient.getAllEvents().size());
        }

        // Once the device is back online, submitting the events should succeed;
        // all should be submitted. What's more, _all_ of the original events
        // should be processed. We check this to ensure that none were lost, during
        // the network interruption.
        InternetConnectivity.goOnline();
        assertEventualEventCount(12);
        analyticsClient.submitEvents();
        assertEventualEventCount(0);
    }

    @SuppressWarnings("SameParameterValue")
    private void recordEvents(int howMany) {
        sessionClient.startSession();

        for (int index = 0; index < howMany; index++) {
            String eventType = String.format("EventName-%d-%s", index, UUID.randomUUID().toString());
            AnalyticsEvent event = analyticsClient.createEvent(eventType)
                .withAttribute("DemoAttribute" + index, "DemoAttributeValue" + index)
                .withMetric("DemoMetric" + index, (double) index);
            analyticsClient.recordEvent(event);
        }

        sessionClient.stopSession();
    }

    // Asserts that the count of events in the Analytics Client is
    // eventually the provided value. "Eventually" = after checking
    // for this condition up to 10 times, with 5 seconds in between
    // each attempt.
    private void assertEventualEventCount(final int eventualCount) {
        RetryStrategies.linear(NoOpRetryable.instance(), new Condition() {
            @Override
            public boolean isMet() {
                int currentCount = analyticsClient.getAllEvents().size();
                Log.d(TAG, "Current count = " + currentCount + " but want " + eventualCount);
                return currentCount == eventualCount;
            }
        }, 10, 5);
    }
}
