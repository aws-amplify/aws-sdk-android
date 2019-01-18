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
 * JSON marshaller for POJO DefaultPushNotificationMessage
 */
class DefaultPushNotificationMessageJsonMarshaller {

    public void marshall(DefaultPushNotificationMessage defaultPushNotificationMessage,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultPushNotificationMessage.getAction() != null) {
            String action = defaultPushNotificationMessage.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (defaultPushNotificationMessage.getBody() != null) {
            String body = defaultPushNotificationMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (defaultPushNotificationMessage.getData() != null) {
            java.util.Map<String, String> data = defaultPushNotificationMessage.getData();
            jsonWriter.name("Data");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> dataEntry : data.entrySet()) {
                String dataValue = dataEntry.getValue();
                if (dataValue != null) {
                    jsonWriter.name(dataEntry.getKey());
                    jsonWriter.value(dataValue);
                }
            }
            jsonWriter.endObject();
        }
        if (defaultPushNotificationMessage.getSilentPush() != null) {
            Boolean silentPush = defaultPushNotificationMessage.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (defaultPushNotificationMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = defaultPushNotificationMessage
                    .getSubstitutions();
            jsonWriter.name("Substitutions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> substitutionsEntry : substitutions
                    .entrySet()) {
                java.util.List<String> substitutionsValue = substitutionsEntry.getValue();
                if (substitutionsValue != null) {
                    jsonWriter.name(substitutionsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String substitutionsValueItem : substitutionsValue) {
                        if (substitutionsValueItem != null) {
                            jsonWriter.value(substitutionsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (defaultPushNotificationMessage.getTitle() != null) {
            String title = defaultPushNotificationMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (defaultPushNotificationMessage.getUrl() != null) {
            String url = defaultPushNotificationMessage.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static DefaultPushNotificationMessageJsonMarshaller instance;

    public static DefaultPushNotificationMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultPushNotificationMessageJsonMarshaller();
        return instance;
    }
}
