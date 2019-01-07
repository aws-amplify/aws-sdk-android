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
            if (name.equals("streamId")) {
                streamInfo.setStreamId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("streamArn")) {
                streamInfo.setStreamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("streamVersion")) {
                streamInfo.setStreamVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                streamInfo.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("files")) {
                streamInfo.setFiles(new ListUnmarshaller<StreamFile>(StreamFileJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdAt")) {
                streamInfo.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                streamInfo.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                streamInfo.setRoleArn(StringJsonUnmarshaller.getInstance()
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
