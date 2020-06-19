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
package com.amazonaws.services.opsworks-cm.model.transform;

import com.amazonaws.services.opsworks-cm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO ServerEvent
 */
class ServerEventJsonUnmarshaller implements Unmarshaller<ServerEvent, JsonUnmarshallerContext> {

    public ServerEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServerEvent serverEvent = new ServerEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedAt")) {
                serverEvent.setCreatedAt(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServerName")) {
                serverEvent.setServerName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Message")) {
                serverEvent.setMessage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LogUrl")) {
                serverEvent.setLogUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serverEvent;
    }

    private static ServerEventJsonUnmarshaller instance;
    public static ServerEventJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ServerEventJsonUnmarshaller();
        return instance;
    }
}
