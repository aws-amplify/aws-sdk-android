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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamInfo
 */
class StreamInfoJsonMarshaller {

    public void marshall(StreamInfo streamInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (streamInfo.getDeviceName() != null) {
            String deviceName = streamInfo.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (streamInfo.getStreamName() != null) {
            String streamName = streamInfo.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        if (streamInfo.getStreamARN() != null) {
            String streamARN = streamInfo.getStreamARN();
            jsonWriter.name("StreamARN");
            jsonWriter.value(streamARN);
        }
        if (streamInfo.getMediaType() != null) {
            String mediaType = streamInfo.getMediaType();
            jsonWriter.name("MediaType");
            jsonWriter.value(mediaType);
        }
        if (streamInfo.getKmsKeyId() != null) {
            String kmsKeyId = streamInfo.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (streamInfo.getVersion() != null) {
            String version = streamInfo.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (streamInfo.getStatus() != null) {
            String status = streamInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (streamInfo.getCreationTime() != null) {
            java.util.Date creationTime = streamInfo.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (streamInfo.getDataRetentionInHours() != null) {
            Integer dataRetentionInHours = streamInfo.getDataRetentionInHours();
            jsonWriter.name("DataRetentionInHours");
            jsonWriter.value(dataRetentionInHours);
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
