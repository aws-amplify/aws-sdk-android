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

import android.app.Service;
import android.os.Bundle;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.services.pinpoint.model.ChannelType;

import java.util.Map;

/**
 * NotificationClient is the entry point into the Amazon Mobile Analytics SDK to
 * handle Pinpoint notifications.
 */
public class NotificationClient {
    /**
     * Intent Key for GCM bundle.
     */
    public static final String INTENT_SNS_NOTIFICATION_FROM = "from";

    /**
     * Intent Key for GCM bundle data.
     */
    public static final String INTENT_SNS_NOTIFICATION_DATA = "data";
    // Pinpoint
    protected static final String PINPOINT_PUSH_KEY_PREFIX = "pinpoint.";
    // Campaign

    protected static final String CAMPAIGN_PUSH_KEY_PREFIX = PINPOINT_PUSH_KEY_PREFIX + "campaign.";
    protected static final String CAMPAIGN_ID_ATTRIBUTE_KEY = "campaign_id";
    protected static final String CAMPAIGN_ID_PUSH_KEY = CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_ID_ATTRIBUTE_KEY;
    protected static final String CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY = "campaign_activity_id";
    protected static final String CAMPAIGN_ACTIVITY_ID_PUSH_KEY =
        CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY;
    protected static final String CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY = "treatment_id";
    protected static final String CAMPAIGN_TREATMENT_ID_PUSH_KEY =
        CAMPAIGN_PUSH_KEY_PREFIX + CAMPAIGN_TREATMENT_ID_ATTRIBUTE_KEY;


    /**
     * Intent action for ADM
     */
    public static final String ADM_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";

    /**
     * Intent action for Baidu
     */
    public static final String BAIDU_INTENT_ACTION = "com.amazonaws.intent.baidu.NOTIFICATION_OPEN";

    /**
     * Intent action for GCM
     */
    public static final String GCM_INTENT_ACTION = "com.google.android.c2dm.intent.RECEIVE";

    /**
     * Intent action for FCM
     */
    public static final String FCM_INTENT_ACTION = "com.amazonaws.intent.fcm.NOTIFICATION_OPEN";

    NotificationClientBase notificationClientBase;

    /**
     * Creates a new NotificationClient based on the supplied context and channel type. This method
     * returns an instance based on NotificationClient interface.
     *
     * @param pinpointContext Context to associate with the client.
     * @param channelType The channel type the client will support.
     * @return A new instance of the {@link NotificationClient}
     */
    public static NotificationClient createClient(PinpointContext pinpointContext, ChannelType channelType) {
        return new NotificationClient(NotificationClientBase.createClient(pinpointContext, channelType));
    }

    /**
     * Constructor.
     *
     * @param pinpointContext the pinpoint context. {@link PinpointContext}
     * @deprecated Use {@link #createClient(PinpointContext, ChannelType)} instead.
     */
    @Deprecated
    public NotificationClient(final PinpointContext pinpointContext) {
        notificationClientBase = NotificationClientBase.createClient(pinpointContext, ChannelType.GCM);
    }

    NotificationClient(final NotificationClientBase notificationClientBase) {
        this.notificationClientBase = notificationClientBase;
    }

    /**
     * Add a GCM token register handler.
     *
     * @param handler the GCM register handler.
     * @deprecated Use {@link #addDeviceTokenRegisteredHandler(DeviceTokenRegisteredHandler)} instead.
     */
    @Deprecated
    public void addGCMTokenRegisteredHandler(final GCMTokenRegisteredHandler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("GCMTokenRegisteredHandler cannot be null.");
        }
        notificationClientBase.addDeviceTokenRegisteredHandler(handler);
    }

    /**
     * Remove the gcm register handler.
     *
     * @param handler the gcm register handler.
     * @deprecated Use {@link #removeDeviceTokenRegisteredHandler(DeviceTokenRegisteredHandler)} instead.
     */
    @Deprecated
    public void removeGCMTokenRegisteredHandler(final GCMTokenRegisteredHandler handler) {
        notificationClientBase.removeDeviceTokenRegisteredHandler(handler);
    }

    /**
     * This method should be called once the device token has been received from
     * the GCM api in order to enable being targeted for campaign push
     * notifications.
     *
     * @param deviceToken the GCM device token.
     * @deprecated Use {@link #registerDeviceToken(String)} instead.
     */
    @Deprecated
    public void registerGCMDeviceToken(final String deviceToken) {
        notificationClientBase.registerDeviceToken(deviceToken);
    }

    /**
     * get the GCM device token.
     *
     * @return the GCM device token.
     * @deprecated Use {@link #getDeviceToken()} instead.
     */
    @Deprecated
    public String getGCMDeviceToken() {
        return notificationClientBase.getDeviceToken();
    }

    /**
     * Handles pinpoint FCM push messages by posting a local notification when
     * the app is in the background, or sending a local broadcast if the app is
     * in the foreground. Also on Api level 19 devices and above, if local
     * notifications have been disabled and the app is in the background, a
     * local broadcast is sent.
     *
     * @param from the from string received by the FCM service,
     * @param data the bundle received from the FCM service
     * @return {@link CampaignPushResult}.
     *
     * @deprecated Use {@link #handleCampaignPush(NotificationDetails)} instead.
     */
    @Deprecated
    public CampaignPushResult handleFCMCampaignPush(final String from,
                                                    final Map<String, String> data) {
        NotificationDetails.NotificationDetailsBuilder notificationDetailsBuilder =
                NotificationDetails.builder()
                .from(from)
                .mapData(data)
                .intentAction(FCM_INTENT_ACTION);
        return notificationClientBase.handleCampaignPush(notificationDetailsBuilder.build());
    }

    /**
     * Handles pinpoint GCM push messages by posting a local notification when
     * the app is in the background, or sending a local broadcast if the app is
     * in the foreground. Also on Api level 19 devices and above, if local
     * notifications have been disabled and the app is in the background, a
     * local broadcast is sent.
     *
     * @param from         the from string received by the GCM service
     * @param data         the bundle received from the GCM service
     * @param serviceClass the class extending GCMListenerService that handles
     *                     receiving GCM messages.
     * @return {@link CampaignPushResult}.
     *
     * @deprecated Use {@link #handleCampaignPush(NotificationDetails)} instead.
     */
    @Deprecated
    public CampaignPushResult handleGCMCampaignPush(final String from, final Bundle data, final Class<? extends Service> serviceClass) {
        NotificationDetails.NotificationDetailsBuilder notificationDetailsBuilder =
                NotificationDetails.builder()
                .from(from)
                .bundle(data)
                .serviceClass(serviceClass)
                .intentAction(GCM_INTENT_ACTION);
        return notificationClientBase.handleCampaignPush(notificationDetailsBuilder.build());
    }

    /**
     * If app-level opt-out is enabled, this method always returns false. Otherwise,
     * the following logic applies: On devices using Android API level 19 and above,
     * this method properly returns whether local notifications are enabled for the app.
     * For devices before API level 19, this method always returns true. Disabling
     * notifications was a feature added on devices supporting API Level 16 and
     * above, so devices from API level 16 to 18 will return true from this
     * method even when local notifications have been disabled for the app.
     *
     * @return true if local notifications are enabled for this app, otherwise
     * false.
     */
    public boolean areAppNotificationsEnabled() {
        return notificationClientBase.areAppNotificationsEnabled();
    }

    /**
     * Add a device token register handler.
     *
     * @param handler the devices register handler.
     */
    public final void addDeviceTokenRegisteredHandler(final DeviceTokenRegisteredHandler handler) {
        notificationClientBase.addDeviceTokenRegisteredHandler(handler);
    }

    /**
     * Remove the device register handler.
     *
     * @param handler the gcm register handler.
     */
    public final void removeDeviceTokenRegisteredHandler(final DeviceTokenRegisteredHandler handler) {
        notificationClientBase.removeDeviceTokenRegisteredHandler(handler);
    }

    /**
     * This method should be called once the device token has been received from
     * the device's messaging api in order to enable being targeted for campaign push
     * notifications.
     *
     * @param deviceToken the device token.
     */
    public final void registerDeviceToken(final String deviceToken) {
        notificationClientBase.registerDeviceToken(deviceToken);
    }

    /**
     * This method should be called once the user id and channel id has been received from
     * the device's messaging api in order to enable being targeted for campaign push
     * notifications.
     *
     * @param userId the user id
     * @param channelId the channel id
     */
    public final void registerDeviceToken(final String userId, final String channelId) {
        notificationClientBase.registerDeviceToken(userId, channelId);
    }

    /**
     * get the device token.
     *
     * @return the device token.
     */
    public final String getDeviceToken() {
        return notificationClientBase.getDeviceToken();
    }

    /**
     * The Pinpoint channel type for the device associated with
     * this notification client.
     *
     * @return Channel type for the device.
     */
    public String getChannelType() {
        return notificationClientBase.getChannelType();
    }

    /**
     * Handles pinpoint push messages by posting a local notification when
     * the app is in the background, or sending a local broadcast if the app is
     * in the foreground. Also on Api level 19 devices and above, if local
     * notifications have been disabled and the app is in the background, a
     * local broadcast is sent.
     *
     * @param notificationDetails the notification message received by the device's messaging service
     * @return {@link NotificationClient.CampaignPushResult}.
     */
    public CampaignPushResult handleCampaignPush(final NotificationDetails notificationDetails) {
        return notificationClientBase.handleCampaignPush(notificationDetails);
    }

    /**
     * Result values of handling a pinpoint push message.
     */
    public enum CampaignPushResult {
        /**
         * The message wasn't for pinpoint.
         */
        NOT_HANDLED,
        /**
         * The SDK handled the message and posted a local notification.
         */
        POSTED_NOTIFICATION,
        /**
         * The SDK handled the message, but no notification was posted, since
         * the app was in the foreground.
         */
        APP_IN_FOREGROUND,
        /**
         * The SDK handled the message, but no notification was posted, since
         * the app was opted out.
         */
        OPTED_OUT,
        /**
         * The SDK handled the message that indicated the local campaign
         * notification was opened.
         */
        NOTIFICATION_OPENED,
        /**
         * The SDK handled the message that indicated the local campaign
         * notification was opened.
         */
        SILENT
    }

    CampaignPushResult handleNotificationOpen(Map<String, String> campaignAttributes,
                                              final Bundle data) {
        return notificationClientBase
                .handleNotificationOpen(campaignAttributes, data);
    }

    int getNotificationRequestId(final String campaignId,
                                 final String activityId) {
        return notificationClientBase
                .getNotificationRequestId(campaignId, activityId);
    }
}
