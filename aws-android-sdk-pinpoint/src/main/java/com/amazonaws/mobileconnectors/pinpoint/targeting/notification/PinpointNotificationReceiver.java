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

/**
 * The Amazon Pinpoint push notification receiver.
 */
public class PinpointNotificationReceiver extends BroadcastReceiver {

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
            final String prefix = NotificationClientBase.CAMPAIGN_PUSH_KEY_PREFIX;
            final Map<String, String> campaignAttributes = new HashMap<String, String>();
            campaignAttributes.put(NotificationClientBase.CAMPAIGN_ID_ATTRIBUTE_KEY,
                                   intent.getStringExtra(prefix.concat(NotificationClientBase.CAMPAIGN_ID_ATTRIBUTE_KEY)));
            campaignAttributes
                .put(NotificationClientBase.CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY,
                     intent.getStringExtra(prefix.concat(NotificationClientBase.CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY)));
            campaignAttributes
                .put(NotificationClientBase.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY,
                     intent.getStringExtra(prefix.concat(NotificationClientBase.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY)));
            notificationClient.handleNotificationOpen(campaignAttributes,
                                                      intent.getExtras());
        } else {
            final PackageManager pm = context.getPackageManager();
            final Intent launchIntent = pm.getLaunchIntentForPackage(intent.getPackage());
            launchIntent.putExtras(intent.getExtras());
            context.startActivity(launchIntent);
        }
    }
}
