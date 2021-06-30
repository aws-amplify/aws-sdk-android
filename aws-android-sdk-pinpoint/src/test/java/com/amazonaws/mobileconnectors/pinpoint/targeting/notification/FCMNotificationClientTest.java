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

import android.content.Context;

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
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class FCMNotificationClientTest extends MobileAnalyticsTestBase {

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

        final Context roboContext = RuntimeEnvironment.application
            .getApplicationContext();
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
    public void testRegisterFCMDeviceToken() {
        final String testDeviceToken = "bla-bla-bla";

        target.registerDeviceToken(testDeviceToken);
        assertEquals(target.getDeviceToken(), testDeviceToken);
    }

    private NotificationDetails buildNotificationDetails(String from) throws JSONException {
        Map<String, String> pushData = new HashMap<String, String>();
        pushData.put("pinpoint.campaign.campaign_id", "Customers rule");
        pushData.put("pinpoint.campaign.treatment_id", "Treat Me well please");
        pushData.put("pinpoint.campaign.campaign_activity_id", "the brink of dawn");
        pushData.put("gcm.notification.title", "Robots are Red");
        pushData.put("gcm.notification.body", "My Class is New");
        pushData.put("gcm.notification.color", "#FF0000");
        JSONObject campaignJson = new JSONObject();
        campaignJson.put("campaign_id", "Customers rule");
        campaignJson.put("campaign_activity_id", "the brink of dawn");
        JSONObject engageJson = new JSONObject();
        engageJson.put("openApp", "true");
        engageJson.put("url", "http://amazon.com");
        engageJson.put("deeplink", "http://amazon.com");
        engageJson.put("campaign", campaignJson);
        pushData.put("pinpoint", engageJson.toString());

        NotificationDetails.NotificationDetailsBuilder notificationDetailsBuilder
                = NotificationDetails.builder()
                .from(from)
                .mapData(pushData)
                .intentAction(NotificationClient.FCM_INTENT_ACTION);
        return notificationDetailsBuilder.build();
    }

    @Test
    public void testFCMMessageReceivedDefaultDoNotPostNotificationInForeground() throws JSONException {
        // Force the app to be in the background.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(false);

        NotificationClient.CampaignPushResult pushResult
            = target.handleCampaignPush(buildNotificationDetails("12345"));
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
    public void testFCMMessageReceivedInForegroundDefaultConfig() throws JSONException {
        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(true);

        NotificationClient.CampaignPushResult pushResult
            = target.handleCampaignPush(buildNotificationDetails("12345"));
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
    public void testFCMMessageReceivedInForegroundExplicitDoNotPostNotificationInForeground() throws JSONException {
        // Setting this false should be the same as the default config, since default is false.
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(false);

        testFCMMessageReceivedInForegroundDefaultConfig();
    }

    @Test
    public void testFCMMessageReceivedInForegroundWithConfigShouldPostNotificationsInForegroundSet() throws JSONException {
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(true);

        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(true);

        NotificationClient.CampaignPushResult pushResult
            = target.handleCampaignPush(buildNotificationDetails("12345"));
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
    public void testFCMMessageReceivedInBackgroundWithConfigShouldPostNotificationsInForegroundSet() throws JSONException {
        when(mockPinpointConfiguration.getShouldPostNotificationsInForeground()).thenReturn(true);

        // Force the app to be in the foreground.
        final AppUtil appUtil = Mockito.mock(AppUtil.class);
        Whitebox.setInternalState(target.notificationClientBase, "appUtil", appUtil);
        Mockito.when(appUtil.isAppInForeground()).thenReturn(false);

        NotificationClient.CampaignPushResult pushResult
            = target.handleCampaignPush(buildNotificationDetails("12345"));
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
    public void testHandleFCMPinpointMessageOpened() throws JSONException {
        NotificationClient.CampaignPushResult result
            = target.handleCampaignPush(buildNotificationDetails("_campaign.opened_notification"));
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
    public void testEmptyMap() {
        Map<String, String> map = new HashMap<String, String>();
        NotificationDetails.NotificationDetailsBuilder notificationDetailsBuilder =
                NotificationDetails.builder()
                .from("_campaign.opened")
                .mapData(map)
                .intentAction(NotificationClient.FCM_INTENT_ACTION);
        NotificationClient.CampaignPushResult result =
                target.handleCampaignPush(notificationDetailsBuilder.build());
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

}
