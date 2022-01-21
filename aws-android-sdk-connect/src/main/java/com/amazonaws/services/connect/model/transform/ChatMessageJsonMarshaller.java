/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChatMessage
 */
class ChatMessageJsonMarshaller {

    public void marshall(ChatMessage chatMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (chatMessage.getContentType() != null) {
            String contentType = chatMessage.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (chatMessage.getContent() != null) {
            String content = chatMessage.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        jsonWriter.endObject();
    }

    private static ChatMessageJsonMarshaller instance;

    public static ChatMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChatMessageJsonMarshaller();
        return instance;
    }
}
