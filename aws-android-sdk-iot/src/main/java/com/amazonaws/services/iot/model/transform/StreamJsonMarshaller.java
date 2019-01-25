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
 * JSON marshaller for POJO Stream
 */
class StreamJsonMarshaller {

    public void marshall(Stream stream, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stream.getStreamId() != null) {
            String streamId = stream.getStreamId();
            jsonWriter.name("streamId");
            jsonWriter.value(streamId);
        }
        if (stream.getFileId() != null) {
            Integer fileId = stream.getFileId();
            jsonWriter.name("fileId");
            jsonWriter.value(fileId);
        }
        jsonWriter.endObject();
    }

    private static StreamJsonMarshaller instance;

    public static StreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamJsonMarshaller();
        return instance;
    }
}
