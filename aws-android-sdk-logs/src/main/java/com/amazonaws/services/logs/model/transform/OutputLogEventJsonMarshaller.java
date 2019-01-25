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
 * JSON marshaller for POJO OutputLogEvent
 */
class OutputLogEventJsonMarshaller {

    public void marshall(OutputLogEvent outputLogEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputLogEvent.getTimestamp() != null) {
            Long timestamp = outputLogEvent.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (outputLogEvent.getMessage() != null) {
            String message = outputLogEvent.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (outputLogEvent.getIngestionTime() != null) {
            Long ingestionTime = outputLogEvent.getIngestionTime();
            jsonWriter.name("ingestionTime");
            jsonWriter.value(ingestionTime);
        }
        jsonWriter.endObject();
    }

    private static OutputLogEventJsonMarshaller instance;

    public static OutputLogEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputLogEventJsonMarshaller();
        return instance;
    }
}
