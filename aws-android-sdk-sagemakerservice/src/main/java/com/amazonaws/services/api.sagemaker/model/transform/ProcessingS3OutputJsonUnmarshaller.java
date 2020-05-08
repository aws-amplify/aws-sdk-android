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
 * JSON unmarshaller for POJO ProcessingS3Output
 */
class ProcessingS3OutputJsonUnmarshaller implements
        Unmarshaller<ProcessingS3Output, JsonUnmarshallerContext> {

    public ProcessingS3Output unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProcessingS3Output processingS3Output = new ProcessingS3Output();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Uri")) {
                processingS3Output.setS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalPath")) {
                processingS3Output.setLocalPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3UploadMode")) {
                processingS3Output.setS3UploadMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return processingS3Output;
    }

    private static ProcessingS3OutputJsonUnmarshaller instance;

    public static ProcessingS3OutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingS3OutputJsonUnmarshaller();
        return instance;
    }
}
