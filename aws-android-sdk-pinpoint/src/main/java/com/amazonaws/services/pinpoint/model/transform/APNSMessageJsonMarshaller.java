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
 * JSON marshaller for POJO APNSMessage
 */
class APNSMessageJsonMarshaller {

    public void marshall(APNSMessage aPNSMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSMessage.getAction() != null) {
            String action = aPNSMessage.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (aPNSMessage.getBadge() != null) {
            Integer badge = aPNSMessage.getBadge();
            jsonWriter.name("Badge");
            jsonWriter.value(badge);
        }
        if (aPNSMessage.getBody() != null) {
            String body = aPNSMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (aPNSMessage.getCategory() != null) {
            String category = aPNSMessage.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (aPNSMessage.getCollapseId() != null) {
            String collapseId = aPNSMessage.getCollapseId();
            jsonWriter.name("CollapseId");
            jsonWriter.value(collapseId);
        }
        if (aPNSMessage.getData() != null) {
            java.util.Map<String, String> data = aPNSMessage.getData();
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
        if (aPNSMessage.getMediaUrl() != null) {
            String mediaUrl = aPNSMessage.getMediaUrl();
            jsonWriter.name("MediaUrl");
            jsonWriter.value(mediaUrl);
        }
        if (aPNSMessage.getPreferredAuthenticationMethod() != null) {
            String preferredAuthenticationMethod = aPNSMessage.getPreferredAuthenticationMethod();
            jsonWriter.name("PreferredAuthenticationMethod");
            jsonWriter.value(preferredAuthenticationMethod);
        }
        if (aPNSMessage.getPriority() != null) {
            String priority = aPNSMessage.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (aPNSMessage.getRawContent() != null) {
            String rawContent = aPNSMessage.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (aPNSMessage.getSilentPush() != null) {
            Boolean silentPush = aPNSMessage.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (aPNSMessage.getSound() != null) {
            String sound = aPNSMessage.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (aPNSMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = aPNSMessage
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
        if (aPNSMessage.getThreadId() != null) {
            String threadId = aPNSMessage.getThreadId();
            jsonWriter.name("ThreadId");
            jsonWriter.value(threadId);
        }
        if (aPNSMessage.getTimeToLive() != null) {
            Integer timeToLive = aPNSMessage.getTimeToLive();
            jsonWriter.name("TimeToLive");
            jsonWriter.value(timeToLive);
        }
        if (aPNSMessage.getTitle() != null) {
            String title = aPNSMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (aPNSMessage.getUrl() != null) {
            String url = aPNSMessage.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static APNSMessageJsonMarshaller instance;

    public static APNSMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSMessageJsonMarshaller();
        return instance;
    }
}
