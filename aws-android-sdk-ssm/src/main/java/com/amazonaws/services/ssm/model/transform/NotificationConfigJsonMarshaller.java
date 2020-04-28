/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotificationConfig
 */
class NotificationConfigJsonMarshaller {

    public void marshall(NotificationConfig notificationConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (notificationConfig.getNotificationArn() != null) {
            String notificationArn = notificationConfig.getNotificationArn();
            jsonWriter.name("NotificationArn");
            jsonWriter.value(notificationArn);
        }
        if (notificationConfig.getNotificationEvents() != null) {
            java.util.List<String> notificationEvents = notificationConfig.getNotificationEvents();
            jsonWriter.name("NotificationEvents");
            jsonWriter.beginArray();
            for (String notificationEventsItem : notificationEvents) {
                if (notificationEventsItem != null) {
                    jsonWriter.value(notificationEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (notificationConfig.getNotificationType() != null) {
            String notificationType = notificationConfig.getNotificationType();
            jsonWriter.name("NotificationType");
            jsonWriter.value(notificationType);
        }
        jsonWriter.endObject();
    }

    private static NotificationConfigJsonMarshaller instance;

    public static NotificationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigJsonMarshaller();
        return instance;
    }
}
