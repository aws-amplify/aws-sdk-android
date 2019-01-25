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
 * JSON marshaller for POJO GCMMessage
 */
class GCMMessageJsonMarshaller {

    public void marshall(GCMMessage gCMMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gCMMessage.getAction() != null) {
            String action = gCMMessage.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (gCMMessage.getBody() != null) {
            String body = gCMMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (gCMMessage.getCollapseKey() != null) {
            String collapseKey = gCMMessage.getCollapseKey();
            jsonWriter.name("CollapseKey");
            jsonWriter.value(collapseKey);
        }
        if (gCMMessage.getData() != null) {
            java.util.Map<String, String> data = gCMMessage.getData();
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
        if (gCMMessage.getIconReference() != null) {
            String iconReference = gCMMessage.getIconReference();
            jsonWriter.name("IconReference");
            jsonWriter.value(iconReference);
        }
        if (gCMMessage.getImageIconUrl() != null) {
            String imageIconUrl = gCMMessage.getImageIconUrl();
            jsonWriter.name("ImageIconUrl");
            jsonWriter.value(imageIconUrl);
        }
        if (gCMMessage.getImageUrl() != null) {
            String imageUrl = gCMMessage.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (gCMMessage.getPriority() != null) {
            String priority = gCMMessage.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (gCMMessage.getRawContent() != null) {
            String rawContent = gCMMessage.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (gCMMessage.getRestrictedPackageName() != null) {
            String restrictedPackageName = gCMMessage.getRestrictedPackageName();
            jsonWriter.name("RestrictedPackageName");
            jsonWriter.value(restrictedPackageName);
        }
        if (gCMMessage.getSilentPush() != null) {
            Boolean silentPush = gCMMessage.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (gCMMessage.getSmallImageIconUrl() != null) {
            String smallImageIconUrl = gCMMessage.getSmallImageIconUrl();
            jsonWriter.name("SmallImageIconUrl");
            jsonWriter.value(smallImageIconUrl);
        }
        if (gCMMessage.getSound() != null) {
            String sound = gCMMessage.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (gCMMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = gCMMessage
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
        if (gCMMessage.getTimeToLive() != null) {
            Integer timeToLive = gCMMessage.getTimeToLive();
            jsonWriter.name("TimeToLive");
            jsonWriter.value(timeToLive);
        }
        if (gCMMessage.getTitle() != null) {
            String title = gCMMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (gCMMessage.getUrl() != null) {
            String url = gCMMessage.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static GCMMessageJsonMarshaller instance;

    public static GCMMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GCMMessageJsonMarshaller();
        return instance;
    }
}
