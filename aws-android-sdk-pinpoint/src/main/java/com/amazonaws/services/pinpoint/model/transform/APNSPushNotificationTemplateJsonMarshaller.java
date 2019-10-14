/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO APNSPushNotificationTemplate
 */
class APNSPushNotificationTemplateJsonMarshaller {

    public void marshall(APNSPushNotificationTemplate aPNSPushNotificationTemplate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSPushNotificationTemplate.getAction() != null) {
            String action = aPNSPushNotificationTemplate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (aPNSPushNotificationTemplate.getBody() != null) {
            String body = aPNSPushNotificationTemplate.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (aPNSPushNotificationTemplate.getMediaUrl() != null) {
            String mediaUrl = aPNSPushNotificationTemplate.getMediaUrl();
            jsonWriter.name("MediaUrl");
            jsonWriter.value(mediaUrl);
        }
        if (aPNSPushNotificationTemplate.getSound() != null) {
            String sound = aPNSPushNotificationTemplate.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (aPNSPushNotificationTemplate.getTitle() != null) {
            String title = aPNSPushNotificationTemplate.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (aPNSPushNotificationTemplate.getUrl() != null) {
            String url = aPNSPushNotificationTemplate.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static APNSPushNotificationTemplateJsonMarshaller instance;

    public static APNSPushNotificationTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSPushNotificationTemplateJsonMarshaller();
        return instance;
    }
}
