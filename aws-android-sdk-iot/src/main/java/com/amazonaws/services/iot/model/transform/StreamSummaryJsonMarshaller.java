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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamSummary
 */
class StreamSummaryJsonMarshaller {

    public void marshall(StreamSummary streamSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (streamSummary.getStreamId() != null) {
            String streamId = streamSummary.getStreamId();
            jsonWriter.name("streamId");
            jsonWriter.value(streamId);
        }
        if (streamSummary.getStreamArn() != null) {
            String streamArn = streamSummary.getStreamArn();
            jsonWriter.name("streamArn");
            jsonWriter.value(streamArn);
        }
        if (streamSummary.getStreamVersion() != null) {
            Integer streamVersion = streamSummary.getStreamVersion();
            jsonWriter.name("streamVersion");
            jsonWriter.value(streamVersion);
        }
        if (streamSummary.getDescription() != null) {
            String description = streamSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static StreamSummaryJsonMarshaller instance;

    public static StreamSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamSummaryJsonMarshaller();
        return instance;
    }
}
