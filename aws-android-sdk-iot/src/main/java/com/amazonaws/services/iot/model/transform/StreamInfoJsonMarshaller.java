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
 * JSON marshaller for POJO StreamInfo
 */
class StreamInfoJsonMarshaller {

    public void marshall(StreamInfo streamInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (streamInfo.getStreamId() != null) {
            String streamId = streamInfo.getStreamId();
            jsonWriter.name("streamId");
            jsonWriter.value(streamId);
        }
        if (streamInfo.getStreamArn() != null) {
            String streamArn = streamInfo.getStreamArn();
            jsonWriter.name("streamArn");
            jsonWriter.value(streamArn);
        }
        if (streamInfo.getStreamVersion() != null) {
            Integer streamVersion = streamInfo.getStreamVersion();
            jsonWriter.name("streamVersion");
            jsonWriter.value(streamVersion);
        }
        if (streamInfo.getDescription() != null) {
            String description = streamInfo.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (streamInfo.getFiles() != null) {
            java.util.List<StreamFile> files = streamInfo.getFiles();
            jsonWriter.name("files");
            jsonWriter.beginArray();
            for (StreamFile filesItem : files) {
                if (filesItem != null) {
                    StreamFileJsonMarshaller.getInstance().marshall(filesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (streamInfo.getCreatedAt() != null) {
            java.util.Date createdAt = streamInfo.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (streamInfo.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = streamInfo.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (streamInfo.getRoleArn() != null) {
            String roleArn = streamInfo.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static StreamInfoJsonMarshaller instance;

    public static StreamInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamInfoJsonMarshaller();
        return instance;
    }
}
