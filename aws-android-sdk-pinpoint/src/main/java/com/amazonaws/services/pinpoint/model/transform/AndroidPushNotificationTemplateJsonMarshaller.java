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
 * JSON marshaller for POJO AndroidPushNotificationTemplate
 */
class AndroidPushNotificationTemplateJsonMarshaller {

    public void marshall(AndroidPushNotificationTemplate androidPushNotificationTemplate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (androidPushNotificationTemplate.getAction() != null) {
            String action = androidPushNotificationTemplate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (androidPushNotificationTemplate.getBody() != null) {
            String body = androidPushNotificationTemplate.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (androidPushNotificationTemplate.getImageIconUrl() != null) {
            String imageIconUrl = androidPushNotificationTemplate.getImageIconUrl();
            jsonWriter.name("ImageIconUrl");
            jsonWriter.value(imageIconUrl);
        }
        if (androidPushNotificationTemplate.getImageUrl() != null) {
            String imageUrl = androidPushNotificationTemplate.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (androidPushNotificationTemplate.getSmallImageIconUrl() != null) {
            String smallImageIconUrl = androidPushNotificationTemplate.getSmallImageIconUrl();
            jsonWriter.name("SmallImageIconUrl");
            jsonWriter.value(smallImageIconUrl);
        }
        if (androidPushNotificationTemplate.getSound() != null) {
            String sound = androidPushNotificationTemplate.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (androidPushNotificationTemplate.getTitle() != null) {
            String title = androidPushNotificationTemplate.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (androidPushNotificationTemplate.getUrl() != null) {
            String url = androidPushNotificationTemplate.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static AndroidPushNotificationTemplateJsonMarshaller instance;

    public static AndroidPushNotificationTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AndroidPushNotificationTemplateJsonMarshaller();
        return instance;
    }
}
