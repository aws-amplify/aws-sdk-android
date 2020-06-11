/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Message
 */
class MessageJsonMarshaller {

    public void marshall(Message message, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (message.getContentType() != null) {
            String contentType = message.getContentType();
            jsonWriter.name("contentType");
            jsonWriter.value(contentType);
        }
        if (message.getContent() != null) {
            String content = message.getContent();
            jsonWriter.name("content");
            jsonWriter.value(content);
        }
        if (message.getGroupNumber() != null) {
            Integer groupNumber = message.getGroupNumber();
            jsonWriter.name("groupNumber");
            jsonWriter.value(groupNumber);
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
