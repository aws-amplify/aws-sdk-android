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
 * JSON marshaller for POJO DefaultPushNotificationTemplate
 */
class DefaultPushNotificationTemplateJsonMarshaller {

    public void marshall(DefaultPushNotificationTemplate defaultPushNotificationTemplate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultPushNotificationTemplate.getAction() != null) {
            String action = defaultPushNotificationTemplate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (defaultPushNotificationTemplate.getBody() != null) {
            String body = defaultPushNotificationTemplate.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (defaultPushNotificationTemplate.getSound() != null) {
            String sound = defaultPushNotificationTemplate.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (defaultPushNotificationTemplate.getTitle() != null) {
            String title = defaultPushNotificationTemplate.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (defaultPushNotificationTemplate.getUrl() != null) {
            String url = defaultPushNotificationTemplate.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static DefaultPushNotificationTemplateJsonMarshaller instance;

    public static DefaultPushNotificationTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultPushNotificationTemplateJsonMarshaller();
        return instance;
    }
}
