/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ChatEvent
 */
class ChatEventJsonUnmarshaller implements Unmarshaller<ChatEvent, JsonUnmarshallerContext> {

    public ChatEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChatEvent chatEvent = new ChatEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                chatEvent.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentType")) {
                chatEvent.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                chatEvent.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return chatEvent;
    }

    private static ChatEventJsonUnmarshaller instance;

    public static ChatEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChatEventJsonUnmarshaller();
        return instance;
    }
}
