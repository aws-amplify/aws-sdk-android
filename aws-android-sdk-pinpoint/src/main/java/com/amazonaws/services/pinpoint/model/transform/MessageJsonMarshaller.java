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
 * JSON marshaller for POJO Message
 */
class MessageJsonMarshaller {

    public void marshall(Message message, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (message.getAction() != null) {
            String action = message.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (message.getBody() != null) {
            String body = message.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (message.getImageIconUrl() != null) {
            String imageIconUrl = message.getImageIconUrl();
            jsonWriter.name("ImageIconUrl");
            jsonWriter.value(imageIconUrl);
        }
        if (message.getImageSmallIconUrl() != null) {
            String imageSmallIconUrl = message.getImageSmallIconUrl();
            jsonWriter.name("ImageSmallIconUrl");
            jsonWriter.value(imageSmallIconUrl);
        }
        if (message.getImageUrl() != null) {
            String imageUrl = message.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (message.getJsonBody() != null) {
            String jsonBody = message.getJsonBody();
            jsonWriter.name("JsonBody");
            jsonWriter.value(jsonBody);
        }
        if (message.getMediaUrl() != null) {
            String mediaUrl = message.getMediaUrl();
            jsonWriter.name("MediaUrl");
            jsonWriter.value(mediaUrl);
        }
        if (message.getRawContent() != null) {
            String rawContent = message.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (message.getSilentPush() != null) {
            Boolean silentPush = message.getSilentPush();
            jsonWriter.name("SilentPush");
            jsonWriter.value(silentPush);
        }
        if (message.getTimeToLive() != null) {
            Integer timeToLive = message.getTimeToLive();
            jsonWriter.name("TimeToLive");
            jsonWriter.value(timeToLive);
        }
        if (message.getTitle() != null) {
            String title = message.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (message.getUrl() != null) {
            String url = message.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static MessageJsonMarshaller instance;

    public static MessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageJsonMarshaller();
        return instance;
    }
}
