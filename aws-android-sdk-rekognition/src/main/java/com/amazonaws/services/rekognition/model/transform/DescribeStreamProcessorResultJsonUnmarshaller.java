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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeStreamProcessorResult
 */
public class DescribeStreamProcessorResultJsonUnmarshaller implements
        Unmarshaller<DescribeStreamProcessorResult, JsonUnmarshallerContext> {

    public DescribeStreamProcessorResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeStreamProcessorResult describeStreamProcessorResult = new DescribeStreamProcessorResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                describeStreamProcessorResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamProcessorArn")) {
                describeStreamProcessorResult.setStreamProcessorArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeStreamProcessorResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                describeStreamProcessorResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                describeStreamProcessorResult.setCreationTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdateTimestamp")) {
                describeStreamProcessorResult.setLastUpdateTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Input")) {
                describeStreamProcessorResult.setInput(StreamProcessorInputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Output")) {
                describeStreamProcessorResult.setOutput(StreamProcessorOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeStreamProcessorResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                describeStreamProcessorResult.setSettings(StreamProcessorSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeStreamProcessorResult;
    }

    private static DescribeStreamProcessorResultJsonUnmarshaller instance;

    public static DescribeStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStreamProcessorResultJsonUnmarshaller();
        return instance;
    }
}
