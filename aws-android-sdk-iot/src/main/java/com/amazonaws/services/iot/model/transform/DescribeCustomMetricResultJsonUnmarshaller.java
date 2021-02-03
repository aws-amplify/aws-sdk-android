/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response DescribeCustomMetricResult
 */
public class DescribeCustomMetricResultJsonUnmarshaller implements
        Unmarshaller<DescribeCustomMetricResult, JsonUnmarshallerContext> {

    public DescribeCustomMetricResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCustomMetricResult describeCustomMetricResult = new DescribeCustomMetricResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("metricName")) {
                describeCustomMetricResult.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricArn")) {
                describeCustomMetricResult.setMetricArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricType")) {
                describeCustomMetricResult.setMetricType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("displayName")) {
                describeCustomMetricResult.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeCustomMetricResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeCustomMetricResult.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeCustomMetricResult;
    }

    private static DescribeCustomMetricResultJsonUnmarshaller instance;

    public static DescribeCustomMetricResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCustomMetricResultJsonUnmarshaller();
        return instance;
    }
}
