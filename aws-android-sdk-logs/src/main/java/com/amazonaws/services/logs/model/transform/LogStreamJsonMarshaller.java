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
 * JSON marshaller for POJO LogStream
 */
class LogStreamJsonMarshaller {

    public void marshall(LogStream logStream, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logStream.getLogStreamName() != null) {
            String logStreamName = logStream.getLogStreamName();
            jsonWriter.name("logStreamName");
            jsonWriter.value(logStreamName);
        }
        if (logStream.getCreationTime() != null) {
            Long creationTime = logStream.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (logStream.getFirstEventTimestamp() != null) {
            Long firstEventTimestamp = logStream.getFirstEventTimestamp();
            jsonWriter.name("firstEventTimestamp");
            jsonWriter.value(firstEventTimestamp);
        }
        if (logStream.getLastEventTimestamp() != null) {
            Long lastEventTimestamp = logStream.getLastEventTimestamp();
            jsonWriter.name("lastEventTimestamp");
            jsonWriter.value(lastEventTimestamp);
        }
        if (logStream.getLastIngestionTime() != null) {
            Long lastIngestionTime = logStream.getLastIngestionTime();
            jsonWriter.name("lastIngestionTime");
            jsonWriter.value(lastIngestionTime);
        }
        if (logStream.getUploadSequenceToken() != null) {
            String uploadSequenceToken = logStream.getUploadSequenceToken();
            jsonWriter.name("uploadSequenceToken");
            jsonWriter.value(uploadSequenceToken);
        }
        if (logStream.getArn() != null) {
            String arn = logStream.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (logStream.getStoredBytes() != null) {
            Long storedBytes = logStream.getStoredBytes();
            jsonWriter.name("storedBytes");
            jsonWriter.value(storedBytes);
        }
        jsonWriter.endObject();
    }

    private static LogStreamJsonMarshaller instance;

    public static LogStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogStreamJsonMarshaller();
        return instance;
    }
}
