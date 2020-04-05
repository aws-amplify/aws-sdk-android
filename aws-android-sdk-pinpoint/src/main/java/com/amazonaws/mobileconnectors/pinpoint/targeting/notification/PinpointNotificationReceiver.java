/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.Map;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * The Amazon Pinpoint push notification receiver.
 */
public class PinpointNotificationReceiver extends BroadcastReceiver {
    private static String TAG = PinpointNotificationReceiver.class.getSimpleName();

    private static volatile NotificationClient notificationClient = null;

    public static void setNotificationClient(NotificationClient notificationClient) {
        PinpointNotificationReceiver.notificationClient = notificationClient;
    }

    public static void setNotificationClient(NotificationClientBase notificationClientBase) {
        PinpointNotificationReceiver.notificationClient = new NotificationClient(notificationClientBase);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (notificationClient != null) {
            EventSourceType eventSourceType = EventSourceType.getEventSourceType(intent.getExtras());
            notificationClient.handleNotificationOpen(eventSourceType.getAttributeParser().parseAttributes(intent.getExtras()),
                                                      intent.getExtras());
        } else {
            final PackageManager pm = context.getPackageManager();
            final Intent launchIntent = pm.getLaunchIntentForPackage(intent.getPackage());
            launchIntent.putExtras(intent.getExtras());
            context.startActivity(launchIntent);
        }
    }
}
