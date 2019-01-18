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
 * JSON marshaller for POJO BaiduMessage
 */
class BaiduMessageJsonMarshaller {

    public void marshall(BaiduMessage baiduMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (baiduMessage.getAction() != null) {
            String action = baiduMessage.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (baiduMessage.getBody() != null) {
            String body = baiduMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (baiduMessage.getData() != null) {
            java.util.Map<String, String> data = baiduMessage.getData();
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
        if (baiduMessage.getIconReference() != null) {
            String iconReference = baiduMessage.getIconReference();
            jsonWriter.name("IconReference");
            jsonWriter.value(iconReference);
        }
        if (baiduMessage.getImageIconUrl() != null) {
            String imageIconUrl = baiduMessage.getImageIconUrl();
            jsonWriter.name("ImageIconUrl");
            jsonWriter.value(imageIconUrl);
        }
        if (baiduMessage.getImageUrl() != null) {
            String imageUrl = baiduMessage.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (baiduMessage.getRawContent() != null) {
            String rawContent = baiduMessage.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (baiduMessage.getSilentPush() != null) {
            Boolean silentPush = baiduMessage.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (baiduMessage.getSmallImageIconUrl() != null) {
            String smallImageIconUrl = baiduMessage.getSmallImageIconUrl();
            jsonWriter.name("SmallImageIconUrl");
            jsonWriter.value(smallImageIconUrl);
        }
        if (baiduMessage.getSound() != null) {
            String sound = baiduMessage.getSound();
            jsonWriter.name("Sound");
            jsonWriter.value(sound);
        }
        if (baiduMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = baiduMessage
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
        if (baiduMessage.getTimeToLive() != null) {
            Integer timeToLive = baiduMessage.getTimeToLive();
            jsonWriter.name("TimeToLive");
            jsonWriter.value(timeToLive);
        }
        if (baiduMessage.getTitle() != null) {
            String title = baiduMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (baiduMessage.getUrl() != null) {
            String url = baiduMessage.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static BaiduMessageJsonMarshaller instance;

    public static BaiduMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BaiduMessageJsonMarshaller();
        return instance;
    }
}
