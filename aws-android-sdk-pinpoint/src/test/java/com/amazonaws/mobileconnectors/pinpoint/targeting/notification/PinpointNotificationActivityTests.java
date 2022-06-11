package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import android.os.Bundle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.android.controller.ActivityController;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class PinpointNotificationActivityTests {

    private NotificationClient notificationClient;
    private ActivityController<PinpointNotificationActivity> activityController;

    @Before
    public void setup() {
        notificationClient = Mockito.mock(NotificationClient.class);
        activityController = Robolectric.buildActivity(PinpointNotificationActivity.class);
        PinpointNotificationActivity.setNotificationClient(notificationClient);
    }

    @After
    public void tearDown() {
        activityController.destroy();
        PinpointNotificationActivity.setNotificationClient((NotificationClient) null);
    }

    @Test
    public void testReferenceToNotificationClient() {
        verifyZeroInteractions(notificationClient);

        activityController.create();

        verify(notificationClient, times(1)).handleNotificationOpen(Mockito.anyMap(),
                Mockito.any(Bundle.class));
    }
}
