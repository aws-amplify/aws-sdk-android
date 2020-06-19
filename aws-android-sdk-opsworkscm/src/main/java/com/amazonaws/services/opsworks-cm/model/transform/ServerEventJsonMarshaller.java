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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServerEvent
 */
class ServerEventJsonMarshaller {

    public void marshall(ServerEvent serverEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serverEvent.getCreatedAt() != null) {
            java.util.Date createdAt = serverEvent.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (serverEvent.getServerName() != null) {
            String serverName = serverEvent.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (serverEvent.getMessage() != null) {
            String message = serverEvent.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (serverEvent.getLogUrl() != null) {
            String logUrl = serverEvent.getLogUrl();
            jsonWriter.name("LogUrl");
            jsonWriter.value(logUrl);
        }
        jsonWriter.endObject();
    }

    private static ServerEventJsonMarshaller instance;
    public static ServerEventJsonMarshaller getInstance() {
        if (instance == null) instance = new ServerEventJsonMarshaller();
        return instance;
    }
}
