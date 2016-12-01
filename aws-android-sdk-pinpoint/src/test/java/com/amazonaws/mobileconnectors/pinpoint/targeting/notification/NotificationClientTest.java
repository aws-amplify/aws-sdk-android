package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;


import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class NotificationClientTest extends MobileAnalyticsTestBase {

    private NotificationClient target;

    @Mock
    private AnalyticsClient mockAnalyticsClient;
    @Mock
    private TargetingClient mockTargetingClient;
    @Mock
    private AnalyticsClient mockEventClient;
    @Mock
    private PinpointConfiguration mockPinpointConfiguration;
    @Mock
    AndroidPreferencesConfiguration mockConfiguration;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        PinpointContext mockPinpointContext = new AnalyticsContextBuilder()
                .withSystem(new MockSystem("JIMMY_CRACKED_CORN.and"))
                .withConfiguration(mockConfiguration)
                .withContext(Robolectric.application.getApplicationContext())
                .build();


        when(mockConfiguration.optBoolean("isAnalyticsEnabled", true)).thenReturn(true);

        when(mockPinpointContext.getAnalyticsClient()).thenReturn(mockAnalyticsClient);
        when(mockPinpointContext.getTargetingClient()).thenReturn(mockTargetingClient);
        when(mockPinpointContext.getConfiguration()).thenReturn(mockConfiguration);
        when(mockPinpointContext.getPinpointConfiguration()).thenReturn(mockPinpointConfiguration);
        target = new NotificationClient(mockPinpointContext);
    }

    @Test
    public void testRegisterGCMDeviceToken() {
        final String testDeviceToken = "bla-bla-bla";

        target.registerGCMDeviceToken(testDeviceToken);
        assertEquals(target.getGCMDeviceToken(), testDeviceToken);
    }

    private Bundle buildPushBundle() throws JSONException {
        Bundle pushBundle = new Bundle();
        pushBundle.putString("gcm.notification.title", "Robots are Red");
        pushBundle.putString("gcm.notification.body", "My Class is New");
        pushBundle.putString("gcm.notification.color", "#FF0000");
        JSONObject campaignJson = new JSONObject();
        campaignJson.put("campaign_id", "Customers rule");
        campaignJson.put("campaign_activity_id", "the brink of dawn");
        JSONObject engageJson = new JSONObject();
        engageJson.put("openApp", "true");
        engageJson.put("url", "http://amazon.com");
        engageJson.put("deeplink", "http://amazon.com");
        engageJson.put("campaign", campaignJson);
        pushBundle.putString("pinpoint", engageJson.toString());
        return pushBundle;
    }


    //TODO FIX THESE TESTS
//    @Test
//    public void testHandleGCMPinpointMessageReceived() throws JSONException {
//        target.handleGCMCampaignPush("12345", buildPushBundle(), Service.class);
//
//        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
////        verify(mockDeliveryClient, times(1)).enqueueEventForDelivery(eventCaptor.capture());
////
//        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
//        assertThat(receivedEvent.getEventType(), is("_campaign.received"));
//        assertTrue(receivedEvent.getEventTimestamp() > 0);
//        //for (Map.Entry<String, String> entry : receivedEvent.getAllAttributes().entrySet()) {
//        //    System.out.println(entry.getKey() + ":" + entry.getValue());
//        //}
//        assertThat(receivedEvent.getAllAttributes().size(), is(4));
//        assertThat(receivedEvent.getAttribute("isOptedOut"), is("true"));
//        assertThat(receivedEvent.getAttribute("isAppInForeground"), is("false"));
//        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
//        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
//        // optOut is true because this test can't get the app icon resource id.
//        assertThat(receivedEvent.getAllMetrics().size(), is(0));
//    }
//
//    @Test
//    public void testHandleGCMPinpointMessageOpened() throws JSONException {
//        NotificationClient.CampaignPushResult result = target.handleGCMCampaignPush("_campaign.opened", buildPushBundle(), Service.class);
//        assertEquals(NotificationClient.CampaignPushResult.NOTIFICATION_OPENED, result);
//
//        ArgumentCaptor<AnalyticsEvent> eventCaptor = ArgumentCaptor.forClass(AnalyticsEvent.class);
//        verify(mockDeliveryClient, times(1)).enqueueEventForDelivery(eventCaptor.capture());
//
//        final AnalyticsEvent receivedEvent = eventCaptor.getAllValues().get(0);
//        assertThat(receivedEvent.getEventType(), is("_campaign.opened"));
//        assertTrue(receivedEvent.getEventTimestamp() > 0);
//        assertThat(receivedEvent.getAllAttributes().size(), is(2));
//        assertThat(receivedEvent.getAttribute("campaign_id"), is("Customers rule"));
//        assertThat(receivedEvent.getAttribute("campaign_activity_id"), is("the brink of dawn"));
//        assertThat(receivedEvent.getAllMetrics().size(), is(0));
//    }

    @Test
    public void testEmptyBundle() {
        Bundle pushBundle = new Bundle();
        NotificationClient.CampaignPushResult result = target.handleGCMCampaignPush("_campaign.opened", pushBundle, Service.class);
        assertEquals(NotificationClient.CampaignPushResult.NOT_HANDLED, result);
    }

}
