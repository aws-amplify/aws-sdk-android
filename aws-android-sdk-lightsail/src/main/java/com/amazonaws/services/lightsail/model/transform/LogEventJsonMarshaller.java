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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LogEvent
 */
class LogEventJsonMarshaller {

    public void marshall(LogEvent logEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logEvent.getCreatedAt() != null) {
            java.util.Date createdAt = logEvent.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (logEvent.getMessage() != null) {
            String message = logEvent.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static LogEventJsonMarshaller instance;

    public static LogEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogEventJsonMarshaller();
        return instance;
    }
}
