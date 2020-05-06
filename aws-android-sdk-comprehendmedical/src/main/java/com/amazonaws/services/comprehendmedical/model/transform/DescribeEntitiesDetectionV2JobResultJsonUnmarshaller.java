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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeEntitiesDetectionV2JobResult
 */
public class DescribeEntitiesDetectionV2JobResultJsonUnmarshaller implements
        Unmarshaller<DescribeEntitiesDetectionV2JobResult, JsonUnmarshallerContext> {

    public DescribeEntitiesDetectionV2JobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2JobResult = new DescribeEntitiesDetectionV2JobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComprehendMedicalAsyncJobProperties")) {
                describeEntitiesDetectionV2JobResult
                        .setComprehendMedicalAsyncJobProperties(ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeEntitiesDetectionV2JobResult;
    }

    private static DescribeEntitiesDetectionV2JobResultJsonUnmarshaller instance;

    public static DescribeEntitiesDetectionV2JobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEntitiesDetectionV2JobResultJsonUnmarshaller();
        return instance;
    }
}
