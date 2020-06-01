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
 * JSON unmarshaller for POJO MonitoringS3Output
 */
class MonitoringS3OutputJsonUnmarshaller implements
        Unmarshaller<MonitoringS3Output, JsonUnmarshallerContext> {

    public MonitoringS3Output unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MonitoringS3Output monitoringS3Output = new MonitoringS3Output();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Uri")) {
                monitoringS3Output.setS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalPath")) {
                monitoringS3Output.setLocalPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3UploadMode")) {
                monitoringS3Output.setS3UploadMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return monitoringS3Output;
    }

    private static MonitoringS3OutputJsonUnmarshaller instance;

    public static MonitoringS3OutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringS3OutputJsonUnmarshaller();
        return instance;
    }
}
