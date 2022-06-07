package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * @deprecated This class is no longer functional and will soon be removed. At one point,
 * we required adding this receiver to the app manifest. That code block should be removed.
 */
@Deprecated
public class PinpointNotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // do nothing
    }
}
