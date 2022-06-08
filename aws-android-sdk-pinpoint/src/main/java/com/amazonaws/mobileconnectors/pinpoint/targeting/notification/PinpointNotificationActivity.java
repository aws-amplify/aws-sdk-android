/**
 * Copyright 2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

/**
 * The Amazon Pinpoint push notification tracking/routing activity.
 * This class is an Activity instead of BroadcastReceiver due to Android 12 restrictions around
 * notification trampolining.
 */
public class PinpointNotificationActivity extends Activity {
    private static String TAG = PinpointNotificationActivity.class.getSimpleName();

    private static volatile NotificationClient notificationClient = null;

    public static void setNotificationClient(NotificationClient notificationClient) {
        PinpointNotificationActivity.notificationClient = notificationClient;
    }

    public static void setNotificationClient(NotificationClientBase notificationClientBase) {
        PinpointNotificationActivity.notificationClient = new NotificationClient(notificationClientBase);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (notificationClient != null) {
            EventSourceType eventSourceType = EventSourceType.getEventSourceType(extras);
            notificationClient.handleNotificationOpen(eventSourceType.getAttributeParser().parseAttributes(extras), extras);
        } else {
            final PackageManager pm = getPackageManager();
            final Intent launchIntent = pm.getLaunchIntentForPackage(intent.getPackage());
            launchIntent.putExtras(extras);
            startActivity(launchIntent);
        }

        finish();
    }
}
