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
import android.content.Intent;
import android.os.Bundle;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;

import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClient.INTENT_SNS_NOTIFICATION_FROM;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.log;

/**
 * NotificationDetails stores push notification information received from Pinpoint.
 */
public class NotificationDetails {
    private String from;
    private Bundle bundle;
    private Class<?> targetClass;
    private String intentAction;
    private String notificationChannelId;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Class<?> targetClass) {
        this.targetClass = targetClass;
    }

    public String getIntentAction() {
        return intentAction;
    }

    public void setIntentAction(String intentAction) {
        this.intentAction = intentAction;
    }

    public String getNotificationChannelId() {
        return notificationChannelId;
    }

    public void setNotificationChannelId(String notificationChannelId) {
        this.notificationChannelId = notificationChannelId;
    }

    /**
     * Returns a builder for NotificationDetails.
     * @return {@link NotificationDetailsBuilder}
     */
    public static NotificationDetailsBuilder builder() {
        return new NotificationDetailsBuilder();
    }

    /**
     * Builds a NotificationDetails object from push notification data.
     *
     * The messaging platform the push notification was under should determine
     * which fields to set on the builder.
     *
     * GCM example:
     * new NotificationDetails.builder()
     *      .from(from)
     *      .bundle(bundle)
     *      .serviceClass(serviceClass)
     *      .intentAction(NotificationClient.GCM_INTENT_ACTION)
     *      .build();
     *
     * FCM example:
     *  new NotificationDetails.builder()
     *      .from(from)
     *      .mapData(mapData)
     *      .intentAction(NotificationClient.FCM_INTENT_ACTION)
     *      .build();
     *
     * ADM example:
     *  new NotificationDetails.builder()
     *      .intent(intent)
     *      .serviceClass(serviceClass)
     *      .intentAction(NotificationClient.ADM_INTENT_ACTION)
     *      .build();
     *
     * Baidu example:
     *  new NotificationDetails.builder()
     *      .message(message)
     *      .build()
     */
    public static class NotificationDetailsBuilder {
        private String from;
        private Bundle bundle;
        private Class<? extends Service> serviceClass;
        private String intentAction;
        private Map<String, String> mapData;
        private Intent intent;
        private String message;
        private String notificationChannelId;


        /**
         * The from string received by the local push notification service.
         * @param from the "from" string received by the push notification service.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * The bundle received by the local push notification service.
         * @param bundle the "bundle" received by the push notification service.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder bundle(Bundle bundle) {
            this.bundle = bundle;
            return this;
        }

        /**
         * The Android Service class that received the push notification.
         * @param serviceClass Android service class that received the push notification
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder serviceClass(Class<? extends Service> serviceClass) {
            this.serviceClass = serviceClass;
            return this;
        }

        /**
         * The intent action that identifies the push notification service platform.
         * @param intentAction the intent action that identifies the push notification service platform
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder intentAction(String intentAction) {
            this.intentAction = intentAction;
            return this;
        }

        /**
         * The mapData received by the local push notification service.
         * @param mapData the "mapData" received by the push notification service.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder mapData(Map<String, String> mapData) {
            this.mapData = mapData;
            return this;
        }

        /**
         * The intent received by the local push notification service.
         * @param intent the "intent" received by the push notification service.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder intent(Intent intent) {
            this.intent = intent;
            return this;
        }

        /**
         * The message received by the local push notification service.
         * @param message the "message" received by the push notification service.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The NotificationChannelId needed for the local push notification service in Android Oreo and above.
         * In the case that the NotificationChannelId is not provided or the provided channel id is not valid, Pinpoint assigns the notifications to its own NotificationChannel with the id "PINPOINT.NOTIFICATION" and channel name as "Notifications"
         * @param notificationChannelId the notification channel id to be associated with this notification.
         * @return {@link NotificationDetailsBuilder}
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public NotificationDetailsBuilder notificationChannelId(String notificationChannelId) {
            this.notificationChannelId = notificationChannelId;
            return this;
        }

        /**
         * Builds and returns an instance of {@link NotificationDetails}.
         * @return {@link NotificationDetails}
         */
        public NotificationDetails build() {
            NotificationDetails notificationDetails = new NotificationDetails();
            if (NotificationClient.GCM_INTENT_ACTION.equals(intentAction)) {
                notificationDetails.setFrom(from);
                notificationDetails.setBundle(bundle);
                notificationDetails.setTargetClass(serviceClass);
                notificationDetails.setIntentAction(intentAction);
                notificationDetails.setNotificationChannelId(notificationChannelId);
            }

            if (NotificationClient.FCM_INTENT_ACTION.equals(intentAction)) {
                if (mapData != null) {
                    final Bundle localBundle = new Bundle();
                    for (final Map.Entry<String, String> entry : mapData.entrySet()) {
                        localBundle.putString(entry.getKey(), entry.getValue());
                    }
                    notificationDetails.setBundle(localBundle);
                }

                notificationDetails.setFrom(from);
                notificationDetails.setTargetClass(PinpointNotificationReceiver.class);
                notificationDetails.setIntentAction(intentAction);
                notificationDetails.setNotificationChannelId(notificationChannelId);
            }

            if (NotificationClient.ADM_INTENT_ACTION.equals(intentAction)) {
                if (intent != null) {
                    final Bundle data = intent.getExtras();
                    if (data != null) {
                        notificationDetails.setFrom(data.getString(INTENT_SNS_NOTIFICATION_FROM));
                    }
                    notificationDetails.setBundle(data);
                }
                notificationDetails.setTargetClass(serviceClass);
                notificationDetails.setIntentAction(intentAction);
            }

            if (NotificationClient.BAIDU_INTENT_ACTION.equals(intentAction)) {

                try {
                    if (!StringUtil.isNullOrEmpty(message)) {
                        JSONObject jsonObject = new JSONObject(message);
                        String localFrom = jsonObject.optString(INTENT_SNS_NOTIFICATION_FROM, null);
                        Bundle localBundle = new Bundle();
                        for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
                            String key = (String) iter.next();
                            String value = jsonObject.getString(key);
                            localBundle.putString(key, value);
                        }

                        notificationDetails.setFrom(localFrom);
                        notificationDetails.setBundle(localBundle);
                    }
                    notificationDetails.setTargetClass(PinpointNotificationReceiver.class);
                    notificationDetails.setIntentAction(intentAction);
                } catch (JSONException e) {
                    log.error("Unable to parse JSON message: " + e, e);
                }

            }

            return notificationDetails;
        }
    }
}
