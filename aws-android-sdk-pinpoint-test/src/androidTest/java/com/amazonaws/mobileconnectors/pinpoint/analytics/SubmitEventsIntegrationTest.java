/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import android.net.wifi.WifiManager;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.pinpoint.model.ChannelType;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class SubmitEventsIntegrationTest extends AWSTestBase {

    private static Context appContext;

    private PinpointManager pinpointManager;
    private PinpointConfiguration pinpointConfiguration;
    private CognitoCachingCredentialsProvider credentialsProvider;
    private WifiManager wifiManager;

    private String appId;
    private Regions regions;

    private static String TAG = SubmitEventsIntegrationTest.class.getSimpleName();

    @Before
    public void setUp() throws Exception {
        appContext = InstrumentationRegistry.getTargetContext();
        appContext.deleteDatabase("awspinpoint.db");

        wifiManager = (WifiManager) InstrumentationRegistry
                .getContext().getSystemService(Context.WIFI_SERVICE);
        assertTrue(wifiManager.setWifiEnabled(true));

        appId = getPackageConfigure("pinpoint")
                .getString("AppId");
        regions = Regions.fromName(getPackageConfigure("pinpoint")
                        .getString("Region"));

        credentialsProvider = new CognitoCachingCredentialsProvider(
                appContext,
                getPackageConfigure("pinpoint")
                        .getString("identity_pool_id"),
                Regions.fromName(getPackageConfigure("pinpoint")
                        .getString("identity_pool_id_region")));
        pinpointConfiguration = new PinpointConfiguration(appContext,
                appId,
                regions,
                ChannelType.GCM,
                credentialsProvider);
        pinpointManager = new PinpointManager(pinpointConfiguration);
    }

    @After
    public void tearDown() {
        assertTrue(wifiManager.setWifiEnabled(true));
        pinpointManager.getAnalyticsClient().closeDB();
        appContext.deleteDatabase("awspinpoint.db");
    }

    @Test
    public void testPinpointManagerInitialization() {
        assertNotNull(pinpointManager);
        assertNotNull(pinpointManager.getAnalyticsClient());
        assertNotNull(pinpointManager.getNotificationClient());
        assertNotNull(pinpointManager.getPinpointContext());
        assertNotNull(pinpointManager.getSessionClient());
        assertNotNull(pinpointManager.getTargetingClient());

        assertEquals(0, pinpointManager.getAnalyticsClient().getAllEvents().size());
        assertEquals(pinpointManager.getPinpointContext().getPinpointConfiguration(),
                pinpointConfiguration);
        assertEquals(pinpointManager.getPinpointContext().getApplicationContext(), appContext);
    }

    @Test
    public void testSubmitEvents() {
        Log.d(TAG, "Events in database before calling recordEvent(): " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        pinpointManager.getSessionClient().startSession();
        for (int i = 0; i < 10; i++) {
            AnalyticsEvent analyticsEvent =
                    pinpointManager.getAnalyticsClient().createEvent("EventName-" + UUID.randomUUID().toString())
                            .withAttribute("DemoAttribute1", "DemoAttributeValue1")
                            .withAttribute("DemoAttribute2", "DemoAttributeValue2")
                            .withMetric("DemoMetric1", Math.random());

            pinpointManager.getAnalyticsClient().recordEvent(analyticsEvent);
        }
        pinpointManager.getSessionClient().stopSession();

        Log.d(TAG, "Events in database after calling submitEvents() before submitting: " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        assertEquals(12, pinpointManager.getAnalyticsClient().getAllEvents().size());

        pinpointManager.getAnalyticsClient().submitEvents();

        long timeSleptSoFar = 0;
        while (timeSleptSoFar < TimeUnit.SECONDS.toMillis(60)) {
            try {
                sleep(TimeUnit.SECONDS.toMillis(5));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            timeSleptSoFar += TimeUnit.SECONDS.toMillis(5);
            if (pinpointManager.getAnalyticsClient().getAllEvents().size() == 0) {
                break;
            }
        }

        Log.d(TAG, "Events in database after calling submitEvents() after submitting: " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        assertEquals(0, pinpointManager.getAnalyticsClient().getAllEvents().size());
    }

    public void testSubmitEventsNetworkDisconnectAndReconnect() {
        Log.d(TAG, "Events in database before calling recordEvent(): " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        pinpointManager.getSessionClient().startSession();
        for (int i = 0; i < 10; i++) {
            AnalyticsEvent analyticsEvent =
                    pinpointManager.getAnalyticsClient().createEvent("EventName-" + UUID.randomUUID().toString())
                            .withAttribute("DemoAttribute1", "DemoAttributeValue1")
                            .withAttribute("DemoAttribute2", "DemoAttributeValue2")
                            .withMetric("DemoMetric1", Math.random());

            pinpointManager.getAnalyticsClient().recordEvent(analyticsEvent);
        }
        pinpointManager.getSessionClient().stopSession();

        // All event records. Now turn off the network connectivity
        // Set Wifi Network offline and expect submitEvents to preserve
        // the events in the database and not delete them.
        assertTrue(wifiManager.setWifiEnabled(false));
        try {
            sleep(10000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Log.d(TAG, "Events in database after calling submitEvents() before submitting: " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        assertEquals(12, pinpointManager.getAnalyticsClient().getAllEvents().size());

        pinpointManager.getAnalyticsClient().submitEvents();

        // Set Wifi Network offline
        // Once network comes back online, submitEvents again and make
        // sure events are being removed from the local database.
        assertTrue(wifiManager.setWifiEnabled(true));
        try {
            sleep(10000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        pinpointManager.getAnalyticsClient().submitEvents();
        try {
            sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        long timeSleptSoFar = 0;
        while (timeSleptSoFar < TimeUnit.SECONDS.toMillis(60)) {
            try {
                sleep(TimeUnit.SECONDS.toMillis(5));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            timeSleptSoFar += TimeUnit.SECONDS.toMillis(5);
            if (pinpointManager.getAnalyticsClient().getAllEvents().size() == 0) {
                break;
            }
        }

        Log.d(TAG, "Events in database after calling submitEvents() after submitting: " +
                pinpointManager.getAnalyticsClient().getAllEvents().size());

        assertEquals(0, pinpointManager.getAnalyticsClient().getAllEvents().size());
    }
}
