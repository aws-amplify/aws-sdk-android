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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response ExportEC2InstanceRecommendationsResult
 */
public class ExportEC2InstanceRecommendationsResultJsonUnmarshaller implements Unmarshaller<ExportEC2InstanceRecommendationsResult, JsonUnmarshallerContext> {

    public ExportEC2InstanceRecommendationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendationsResult = new ExportEC2InstanceRecommendationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("jobId")) {
                exportEC2InstanceRecommendationsResult.setJobId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("s3Destination")) {
                exportEC2InstanceRecommendationsResult.setS3Destination(S3DestinationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return exportEC2InstanceRecommendationsResult;
    }

    private static ExportEC2InstanceRecommendationsResultJsonUnmarshaller instance;
    public static ExportEC2InstanceRecommendationsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ExportEC2InstanceRecommendationsResultJsonUnmarshaller();
        return instance;
    }
}
