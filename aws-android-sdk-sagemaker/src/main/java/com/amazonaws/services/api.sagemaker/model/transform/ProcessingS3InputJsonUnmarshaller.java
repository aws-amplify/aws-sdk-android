/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProcessingS3Input
 */
class ProcessingS3InputJsonUnmarshaller implements
        Unmarshaller<ProcessingS3Input, JsonUnmarshallerContext> {

    public ProcessingS3Input unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProcessingS3Input processingS3Input = new ProcessingS3Input();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Uri")) {
                processingS3Input.setS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalPath")) {
                processingS3Input.setLocalPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3DataType")) {
                processingS3Input.setS3DataType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3InputMode")) {
                processingS3Input.setS3InputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3DataDistributionType")) {
                processingS3Input.setS3DataDistributionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3CompressionType")) {
                processingS3Input.setS3CompressionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return processingS3Input;
    }

    private static ProcessingS3InputJsonUnmarshaller instance;

    public static ProcessingS3InputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingS3InputJsonUnmarshaller();
        return instance;
    }
}
