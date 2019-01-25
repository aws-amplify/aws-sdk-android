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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputLogEvent
 */
class InputLogEventJsonMarshaller {

    public void marshall(InputLogEvent inputLogEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputLogEvent.getTimestamp() != null) {
            Long timestamp = inputLogEvent.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (inputLogEvent.getMessage() != null) {
            String message = inputLogEvent.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static InputLogEventJsonMarshaller instance;

    public static InputLogEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputLogEventJsonMarshaller();
        return instance;
    }
}
