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

package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import androidx.test.core.app.ApplicationProvider;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.util.reflection.Whitebox;
import org.robolectric.RobolectricTestRunner;

import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.pinpoint.internal.event.EventRecorder;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.services.pinpoint.model.ChannelType;

import java.util.Map;

import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient.GCM_INTENT_ACTION;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

@RunWith(RobolectricTestRunner.class)
public class GCMNotificationClientTest extends MobileAnalyticsTestBase {
    @Mock
    AndroidPreferencesConfiguration mockConfiguration;
    private NotificationClient target;
    private AnalyticsClient analyticsClient;
    @Mock
    private EventRecorder mockEventRecorder;
    @Mock
    private TargetingClient mockTargetingClient;
    @Mock
    private PinpointConfiguration mockPinpointConfiguration;
    @Mock
    private PinpointContext mockPinpointContext;
    @Mock
    private Context spiedRoboContext;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        Context roboContext = ApplicationProvider.getApplicationContext();
        spiedRoboContext = Mockito.spy(roboContext);
        mockPinpointContext = new AnalyticsContextBuilder()
                                                      .withSystem(new MockSystem("JIMMY_CRACKED_CORN.and"))
                                                      .withConfiguration(mockConfiguration)
                                                      .withContext(spiedRoboContext)
                                                      .build();

        analyticsClient =  new AnalyticsClient(mockPinpointContext);
        Whitebox.setInternalState(analyticsClient, "eventRecorder", mockEventRecorder);

        when(mockConfiguration.optBoolean("isAnalyticsEnabled", true))
                .thenReturn(true);

        when(mockPinpointContext.getAnalyticsClient())
            .thenReturn(analyticsClient);
        //target.setSessionClient(new SessionClient(mockContext, mockEventClient, mockTargetingClient,
        //    new TestSessionStore(), false));
        when(mockPinpointContext.getTargetingClient())
                .thenReturn(mockTargetingClient);
        when(mockPinpointContext.getConfiguration())
                .thenReturn(mockConfiguration);
        when(mockPinpointContext.getPinpointConfiguration())
                .thenReturn(mockPinpointConfiguration);

        target = NotificationClient.createClient(mockPinpointContext, ChannelType.GCM);
    }

    @Test
    public void testRegisterGCMDeviceToken() {
        final String testDeviceToken = "bla-bla-bla";

        target.registerGCMDeviceToken(testDeviceToken);
        assertEquals(target.getGCMDeviceToken(), testDeviceToken);
    }

    private Bundle buildPushBundle() throws JSONException {
        Bundle pushBundle = new Bundle();
        pushBundle.putString("pinpoint.campaign.campaign_id", "Customers rule");
        pushBundle.putString("pinpoint.campaign.treatment_id", "Treat Me well please");
        pushBundle.putString("pinpoint.campaign.campaign_activity_id", "the brink of dawn");
        pushBundle.putString("gcm.notification.title", "Robots are Red");
        pushBundle.putString("gcm.notification.body", "My Class is New");
        pushBundle.putString("gcm.notification.color", "#FF0000");
        JSONObject engageJson = new JSONObject()
            .put("openApp", "true")
            .put("url", "http://amazon.com")
            .put("deeplink", "http://amazon.com");
        pushBundle.putString("pinpoint", engageJson.toString());
        return pushBundle;
    }

    private Bundle buildJourneyPushBundle() throws JSONException {
        Bundle pushBundle = new Bundle();
        pushBundle.putString("gcm.notification.title", "Robots are Red");
        pushBundle.putString("gcm.notification.body", "My Class is New");
        pushBundle.putString("gcm.notification.color", "#FF0000");
        JSONObject engageJson = new JSONObject()
            .put("openApp", "true")
            .put("url", "http://amazon.com")
            .put("deeplink", "http://amazon.com")
            .put("journey", new JSONObject()
                .put("journey_id", "fake_journey_id")
                .put("journey_activity_id", "fake_journey_activity_id")
                .put("journey_run_id", "fake_journey_run_id")
                .put("feedback", "random_feedback")
                .put("endpoint_id", "fake_endpoint_id")
                .put("user_id", "fake_user_id")
            );
        pushBundle.putString("pinpoint", engageJson.toString());
        return pushBundle;
    }

    @Test
    public void testGCMJourneyMessageReceivedDefaultDoNotPostNotificationInForeground() throws JSONException {
        // Force the app to be in the background
        final AnalyticsEvent expectedEvent = new AnalyticsClient(mockPinpointContext).createEvent("_journey.received_background")
            .withAttribute("journey_id", "fake_journey_id")
            .withAttribute("journey_activity_id", "fake_journey_activity_id")
            .withAttribute("journey_run_id", "fake_journey_run_id")
            .withAttribute("feedback", "random_feedback")
            .withAttribute("endpoint_id", "fake_endpoint_id")
            .withAttribute("user_id", "fake_user_id")
            .withAttribute("isOptedOut", "true")
            .withAttribute("isAppInForeground", "false");

        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(false);

        NotificationDetails.NotificationDetailsBuilder notificationDetailsBuilder =
                NotificationDetails.builder()
                        .from("12345")
                        .bundle(buildJourneyPushBundle())
                        .serviceClass(Service.class)
                        .intentAction(GCM_INTENT_ACTION);

        NotificationClient.PushResult pushResult
                = target.handleNotificationReceived(notificationDetailsBuilder.build());

        assertEquals(NotificationClient.PushResult.OPTED_OUT, pushResult);

        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        assertEquals("_journey.received_background", receivedEvent.getEventType());
        assertEquals(expectedEvent.getAllAttributes(), receivedEvent.getAllAttributes());
    }

    @Test
    public void testGCMMessageReceivedDefaultDoNotPostNotificationInForeground() throws JSONException {
        // Force the app to be in the background
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(false);

        NotificationClient.CampaignPushResult pushResult
            = target.handleGCMCampaignPush("12345", buildPushBundle(), Service.class);
        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertThat(receivedEvent.getEventType(), is("_campaign.received_background"));
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        for (Map.Entry<String, String> entry : receivedEvent.getAllAttributes().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        assertThat(receivedEvent.getAllAttributes().size(), is(5));
        assertThat(receivedEvent.getAttribute("isOptedOut"), is("true"));
        assertThat(receivedEvent.getAttribute("isAppInForeground"), is("false"));
        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
        assertThat(receivedEvent.getAttribute("treatment_id"), is("Treat Me well please"));
        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
        // optOut is true because this test can't get the app icon resource id.
        assertThat(receivedEvent.getAllMetrics().size(), is(0));

        assertTrue(pushResult.equals(NotificationClient.CampaignPushResult.OPTED_OUT));
    }


    @Test
    public void testGCMMessageReceivedInForegroundDefaultConfig() throws JSONException {
        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(true);

        NotificationClient.CampaignPushResult pushResult
            = target.handleGCMCampaignPush("12345", buildPushBundle(), Service.class);
        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertThat(receivedEvent.getEventType(), is("_campaign.received_foreground"));
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        for (Map.Entry<String, String> entry : receivedEvent.getAllAttributes().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        assertThat(receivedEvent.getAllAttributes().size(), is(4));
        assertThat(receivedEvent.getAttribute("isAppInForeground"), is("true"));
        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
        assertThat(receivedEvent.getAttribute("treatment_id"), is("Treat Me well please"));
        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
        // optOut is true because this test can't get the app icon resource id.
        assertThat(receivedEvent.getAllMetrics().size(), is(0));

        // Verify the notification is not posted and instead we get the result that the app was in the foreground.
        assertTrue(pushResult.equals(NotificationClient.CampaignPushResult.APP_IN_FOREGROUND));
    }

    @Test
    public void testGCMMessageReceivedInForegroundExplicitDoNotPostNotificationInForeground() throws JSONException {
        // Setting this false should be the same as the default config, since default is false.
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(false);

        testGCMMessageReceivedInForegroundDefaultConfig();
    }

    @Test
    public void testGCMMessageReceivedInForegroundWithConfigShouldPostNotificationsInForegroundSet() throws JSONException {
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(true);

        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(true);

        NotificationClient.CampaignPushResult pushResult
            = target.handleGCMCampaignPush("12345", buildPushBundle(), Service.class);
        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertThat(receivedEvent.getEventType(), is("_campaign.received_foreground"));
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        for (Map.Entry<String, String> entry : receivedEvent.getAllAttributes().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        assertThat(receivedEvent.getAllAttributes().size(), is(5));
        assertThat(receivedEvent.getAttribute("isOptedOut"), is("true"));
        assertThat(receivedEvent.getAttribute("isAppInForeground"), is("true"));
        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
        assertThat(receivedEvent.getAttribute("treatment_id"), is("Treat Me well please"));
        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
        // optOut is true because this test can't get the app icon resource id.
        assertThat(receivedEvent.getAllMetrics().size(), is(0));

        // verify that the notification is posted even though the app is in the foreground, will actually
        // be OPTED_OUT, since the test can't get the app icon id.
        assertTrue(pushResult.equals(NotificationClient.CampaignPushResult.OPTED_OUT));
    }

    @Test
    public void testGCMMessageReceivedInBackgroundWithConfigShouldPostNotificationsInForegroundSet() throws JSONException {
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(true);

        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(false);

        NotificationClient.CampaignPushResult pushResult
            = target.handleGCMCampaignPush("12345", buildPushBundle(), Service.class);
        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertThat(receivedEvent.getEventType(), is("_campaign.received_background"));
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        for (Map.Entry<String, String> entry : receivedEvent.getAllAttributes().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        assertThat(receivedEvent.getAllAttributes().size(), is(5));
        assertThat(receivedEvent.getAttribute("isOptedOut"), is("true"));
        assertThat(receivedEvent.getAttribute("isAppInForeground"), is("false"));
        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
        assertThat(receivedEvent.getAttribute("treatment_id"), is("Treat Me well please"));
        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
        // optOut is true because this test can't get the app icon resource id.
        assertThat(receivedEvent.getAllMetrics().size(), is(0));

        // verify that the notification is posted even though the app is in the foreground, will actually
        // be OPTED_OUT, since the test can't get the app icon id.
        assertTrue(pushResult.equals(NotificationClient.CampaignPushResult.OPTED_OUT));
    }

    @Test
    public void testHandleGCMPinpointMessageOpened() throws JSONException {
        NotificationClient.CampaignPushResult result
            = target.handleGCMCampaignPush("_campaign.opened_notification", buildPushBundle(), Service.class);
        assertEquals(NotificationClient.CampaignPushResult.NOTIFICATION_OPENED, result);

        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
        verify(mockEventRecorder, times(1)).recordEvent(eventCaptor.capture());

        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
        assertThat(receivedEvent.getEventType(), is("_campaign.opened_notification"));
        assertTrue(receivedEvent.getEventTimestamp() > 0);
        assertThat(receivedEvent.getAllAttributes().size(), is(3));
        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
        assertThat(receivedEvent.getAttribute("treatment_id"), is("Treat Me well please"));
        assertThat(receivedEvent.getAllMetrics().size(), is(0));
    }

    @Test
    public void testEmptyBundle() {
        Bundle pushBundle = new Bundle();
        NotificationClient.CampaignPushResult result = target.handleGCMCampaignPush("_campaign.opened",
                                                                                           pushBundle,
                                                                                           Service.class);
        assertEquals(NotificationClient.CampaignPushResult.NOT_HANDLED, result);
    }

    @Test
    public void verifyNotificationRequestIdIsTheSameForTheSameCampaignIdandActivityId() {
        assertEquals(target.getNotificationRequestId("abc","123"),
            target.getNotificationRequestId("abc","123"));
    }

    @Test
    public void verifyNotificationRequestIdIsDifferentForDifferingCampignIdOrActivityId() {
        assertNotEquals(target.getNotificationRequestId("abc","123"),
            target.getNotificationRequestId("abc","567"));

        assertNotEquals(target.getNotificationRequestId("abc","123"),
            target.getNotificationRequestId("efg","123"));
    }

    @Test
    public void verifyNotificationRequestIdIsUniqueForDirectSend() {
        assertNotEquals(target.getNotificationRequestId(NotificationClientBase.DIRECT_CAMPAIGN_SEND, null),
            target.getNotificationRequestId(NotificationClientBase.DIRECT_CAMPAIGN_SEND, null));
    }

    @Test
    public void testAreAppNotificationsEnabled_returnsFalse_whenOptOutProviderReturnsTrue() {
        mockAppLevelOptOutProvider(true);
        assertEquals(false, target.areAppNotificationsEnabled());
    }

    @Test
    public void testAreAppNotificationsEnabled_callsPlatformMethod_whenOptOutProviderReturnsFalse() {
        mockAppLevelOptOutProvider(false);

        final NotificationClientBase notificationClient = Mockito.mock(NotificationClientBase.class,
                withSettings().defaultAnswer(CALLS_REAL_METHODS));

        Whitebox.setInternalState(notificationClient, "pinpointContext", mockPinpointContext);

        notificationClient.areAppNotificationsEnabled();

        verify(notificationClient).areAppNotificationsEnabledOnPlatform();
    }

    private void mockAppLevelOptOutProvider(final boolean returnValue) {
        when(mockPinpointConfiguration.getAppLevelOptOutProvider()).thenReturn(
            new AppLevelOptOutProvider() {
                public boolean isOptedOut() {
                    return returnValue;
                }
            }
        );
    }

    @Test
    public void testConvertBitmapToAlphaGrayscale() {
        // Create a color image to be converted to grayscale;
        final int[] inputPixels = new int[255*255];

        for (int x = 0; x < 255; x++) {
            for (int y = 0; y < 255; y++) {
                if (x < 10 || y < 10) {
                    // Outsides transparent.
                    inputPixels[x * 255 + y] = Color.TRANSPARENT;
                } else {
                    inputPixels[x * 255 + y] = Color.argb(255, x, y, 255 - x);
                }
            }
        }

        final Bitmap inputBitmap = Bitmap.createBitmap(inputPixels, 255, 255, Bitmap.Config.ARGB_8888);

        final Bitmap outputBitmap = NotificationClientBase.convertBitmapToAlphaGreyscale(inputBitmap);
        // Verify the output is white with greyscale in the alpha channel.
        for (int x = 0; x < 255; x++) {
            for (int y = 0; y < 255; y++) {
                final int pixel = outputBitmap.getPixel(x, y);
                //System.out.println(String.format("x: %d y: %d a: %d r: %d g: %d b: %d",
                //    x, y, Color.alpha(pixel), Color.red(pixel), Color.green(pixel), Color.blue(pixel)));
                if (x < 10 || y < 10) {
                    // Outsides transparent.
                    assertEquals(0x00FFFFFF, pixel);
                } else {
                    // Pixel should not be transparent.
                    assertNotEquals(0, Color.alpha(pixel));
                }
            }
        }

        // call the method again with the converted image, it should leave the bitmap unchanged.
        final Bitmap dupOutput = NotificationClientBase.convertBitmapToAlphaGreyscale(outputBitmap);

        for (int x = 0; x < 255; x++) {
            for (int y = 0; y < 255; y++) {
                assertEquals(outputBitmap.getPixel(x, y), dupOutput.getPixel(x, y));
            }
        }
    }

}
