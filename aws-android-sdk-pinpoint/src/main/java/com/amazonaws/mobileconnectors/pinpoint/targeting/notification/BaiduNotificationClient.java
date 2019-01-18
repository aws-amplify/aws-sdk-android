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

import android.app.PendingIntent;
import android.os.Bundle;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.services.pinpoint.model.ChannelType;

/**
 * BaiduNotificationClient is the entry point into the Amazon Mobile Analytics SDK to
 * handle Pinpoint notifications on devices registered with Baidu cloud messaging.
 */
final class BaiduNotificationClient extends NotificationClientBase {

    protected BaiduNotificationClient(PinpointContext pinpointContext) {
        super(pinpointContext);
    }

    @Override
    public String getChannelType() {
        return ChannelType.BAIDU.toString();
    }

    @Override
    protected PendingIntent createOpenAppPendingIntent(Bundle pushBundle, Class<?> targetClass, String campaignId, int requestId, String intentAction) {
        PendingIntent contentIntent = null;
        if (NotificationClient.BAIDU_INTENT_ACTION.equals(intentAction)) {
            contentIntent = PendingIntent.getBroadcast(pinpointContext.getApplicationContext(), requestId,
                    this.notificationIntent(pushBundle, campaignId, requestId, NotificationClient.BAIDU_INTENT_ACTION,
                            targetClass), PendingIntent.FLAG_ONE_SHOT);
            PinpointNotificationReceiver.setNotificationClient(this);
        }
        return contentIntent;
    }
}
