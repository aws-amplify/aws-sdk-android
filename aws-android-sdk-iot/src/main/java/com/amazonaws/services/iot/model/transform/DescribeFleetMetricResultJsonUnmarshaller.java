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
 * JSON unmarshaller for response DescribeFleetMetricResult
 */
public class DescribeFleetMetricResultJsonUnmarshaller implements
        Unmarshaller<DescribeFleetMetricResult, JsonUnmarshallerContext> {

    public DescribeFleetMetricResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFleetMetricResult describeFleetMetricResult = new DescribeFleetMetricResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("metricName")) {
                describeFleetMetricResult.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryString")) {
                describeFleetMetricResult.setQueryString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("aggregationType")) {
                describeFleetMetricResult.setAggregationType(AggregationTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("period")) {
                describeFleetMetricResult.setPeriod(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("aggregationField")) {
                describeFleetMetricResult.setAggregationField(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                describeFleetMetricResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryVersion")) {
                describeFleetMetricResult.setQueryVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("indexName")) {
                describeFleetMetricResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeFleetMetricResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeFleetMetricResult.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("unit")) {
                describeFleetMetricResult.setUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                describeFleetMetricResult.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricArn")) {
                describeFleetMetricResult.setMetricArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeFleetMetricResult;
    }

    private static DescribeFleetMetricResultJsonUnmarshaller instance;

    public static DescribeFleetMetricResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetMetricResultJsonUnmarshaller();
        return instance;
    }
}
