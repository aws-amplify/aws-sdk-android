/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class PinpointNotificationReceiver extends BroadcastReceiver {

    private static WeakReference<NotificationClient> weakNotificationClient = null;

    public static void setWeakNotificationClient(NotificationClient notificationClient) {
        weakNotificationClient =  new WeakReference<NotificationClient>(notificationClient);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (weakNotificationClient != null) {
            String prefix = NotificationClient.CAMPAIGN_PUSH_KEY_PREFIX;
            Map<String, String> campaignAttributes = new HashMap<String, String>();
            campaignAttributes.put(NotificationClient.CAMPAIGN_ID_ATTRIBUTE_KEY, intent.getStringExtra(prefix.concat(NotificationClient.CAMPAIGN_ID_ATTRIBUTE_KEY)));
            campaignAttributes.put(NotificationClient.CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY, intent.getStringExtra(prefix.concat(NotificationClient.CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY)));
            campaignAttributes.put(NotificationClient.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY, intent.getStringExtra(prefix.concat(NotificationClient.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY)));
            weakNotificationClient.get().handleNotificationOpen(campaignAttributes, intent.getExtras());
        } else {
            PackageManager pm = context.getPackageManager();
            Intent launchIntent = pm.getLaunchIntentForPackage(intent.getPackage());
            launchIntent.putExtras(intent.getExtras());
            context.startActivity(launchIntent);
        }
    }
}
