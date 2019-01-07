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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StreamInfo
 */
class StreamInfoJsonUnmarshaller implements Unmarshaller<StreamInfo, JsonUnmarshallerContext> {

    public StreamInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamInfo streamInfo = new StreamInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeviceName")) {
                streamInfo.setDeviceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamName")) {
                streamInfo.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamARN")) {
                streamInfo.setStreamARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaType")) {
                streamInfo.setMediaType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                streamInfo.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                streamInfo.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                streamInfo.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                streamInfo.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataRetentionInHours")) {
                streamInfo.setDataRetentionInHours(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamInfo;
    }

    private static StreamInfoJsonUnmarshaller instance;

    public static StreamInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamInfoJsonUnmarshaller();
        return instance;
    }
}
