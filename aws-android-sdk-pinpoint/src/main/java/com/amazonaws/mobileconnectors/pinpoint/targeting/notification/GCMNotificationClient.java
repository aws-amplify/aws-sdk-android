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

import static android.os.Build.*;

import android.app.PendingIntent;
import android.os.Bundle;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.services.pinpoint.model.ChannelType;

/**
 * GCMNotificationClient is the entry point into the Amazon Mobile Analytics SDK to
 * handle Pinpoint notifications on devices registered with GCM/Firebase
 */
final class GCMNotificationClient extends NotificationClientBase {

    /**
     * Constructor.
     *
     * @param pinpointContext the Pinpoint context. {@link PinpointContext}
     */
    protected GCMNotificationClient(PinpointContext pinpointContext) {
        super(pinpointContext);
    }

    @Override
    public String getChannelType() {
        return ChannelType.GCM.toString();
    }

    @Override
    protected PendingIntent createOpenAppPendingIntent(final Bundle pushBundle, final Class<?> targetClass, final String eventSourceId,
                                                     final int requestId, final String intentAction) {
        PendingIntent contentIntent;
        int flags = PendingIntent.FLAG_ONE_SHOT;

        if (VERSION.SDK_INT >= VERSION_CODES.M) {
            flags |= PendingIntent.FLAG_IMMUTABLE;
        }

        if (intentAction.equals(NotificationClient.GCM_INTENT_ACTION)) {
            contentIntent = PendingIntent.getService(pinpointContext.getApplicationContext(), requestId,
                    this.notificationIntent(pushBundle, eventSourceId, requestId, NotificationClient.GCM_INTENT_ACTION,
                            targetClass), flags);
        } else {
            contentIntent = PendingIntent.getBroadcast(pinpointContext.getApplicationContext(), requestId,
                    this.notificationIntent(pushBundle, eventSourceId, requestId, NotificationClient.FCM_INTENT_ACTION,
                            targetClass), flags);
            PinpointNotificationReceiver.setNotificationClient(this);
        }
        return contentIntent;

    }
}
