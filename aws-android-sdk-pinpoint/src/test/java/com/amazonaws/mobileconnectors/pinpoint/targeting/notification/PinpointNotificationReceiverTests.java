package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class PinpointNotificationReceiverTests {

    private NotificationClient notificationClient;

    private PinpointNotificationReceiver receiver;

    private Intent intent;

    private Context context;

    @Before
    public void setup() {
        notificationClient = Mockito.mock(NotificationClient.class);
        intent = Mockito.mock(Intent.class);
        receiver = new PinpointNotificationReceiver();
        PinpointNotificationReceiver.setNotificationClient(notificationClient);
        context = Mockito.mock(Context.class);
    }

    @Test
    public void testReferenceToNotificationClient() {
        System.gc();
        receiver.onReceive(context, intent);
        verify(notificationClient, times(1)).handleNotificationOpen(Mockito.anyMap(),
                Mockito.any(Bundle.class));
    }
}
