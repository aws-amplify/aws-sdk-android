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
 * JSON marshaller for POJO ADMMessage
 */
class ADMMessageJsonMarshaller {

    public void marshall(ADMMessage aDMMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aDMMessage.getAction() != null) {
            String action = aDMMessage.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (aDMMessage.getBody() != null) {
            String body = aDMMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (aDMMessage.getConsolidationKey() != null) {
            String consolidationKey = aDMMessage.getConsolidationKey();
            jsonWriter.name("ConsolidationKey");
            jsonWriter.value(consolidationKey);
        }
        if (aDMMessage.getData() != null) {
            java.util.Map<String, String> data = aDMMessage.getData();
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
        if (aDMMessage.getExpiresAfter() != null) {
            String expiresAfter = aDMMessage.getExpiresAfter();
            jsonWriter.name("ExpiresAfter");
            jsonWriter.value(expiresAfter);
        }
        if (aDMMessage.getIconReference() != null) {
            String iconReference = aDMMessage.getIconReference();
            jsonWriter.name("IconReference");
            jsonWriter.value(iconReference);
        }
        if (aDMMessage.getImageIconUrl() != null) {
            String imageIconUrl = aDMMessage.getImageIconUrl();
            jsonWriter.name("ImageIconUrl");
            jsonWriter.value(imageIconUrl);
        }
        if (aDMMessage.getImageUrl() != null) {
            String imageUrl = aDMMessage.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (aDMMessage.getMD5() != null) {
            String mD5 = aDMMessage.getMD5();
            jsonWriter.name("MD5");
            jsonWriter.value(mD5);
        }
        if (aDMMessage.getRawContent() != null) {
            String rawContent = aDMMessage.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (aDMMessage.getSilentPush() != null) {
            Boolean silentPush = aDMMessage.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (aDMMessage.getSmallImageIconUrl() != null) {
            String smallImageIconUrl = aDMMessage.getSmallImageIconUrl();
            jsonWriter.name("SmallImageIconUrl");
            jsonWriter.value(smallImageIconUrl);
        }
        if (aDMMessage.getSound() != null) {
            String sound = aDMMessage.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (aDMMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = aDMMessage
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
        if (aDMMessage.getTitle() != null) {
            String title = aDMMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (aDMMessage.getUrl() != null) {
            String url = aDMMessage.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static ADMMessageJsonMarshaller instance;

    public static ADMMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ADMMessageJsonMarshaller();
        return instance;
    }
}
