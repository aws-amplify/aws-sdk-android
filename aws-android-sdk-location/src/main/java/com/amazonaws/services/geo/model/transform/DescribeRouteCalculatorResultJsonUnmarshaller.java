/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeRouteCalculatorResult
 */
public class DescribeRouteCalculatorResultJsonUnmarshaller implements
        Unmarshaller<DescribeRouteCalculatorResult, JsonUnmarshallerContext> {

    public DescribeRouteCalculatorResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeRouteCalculatorResult describeRouteCalculatorResult = new DescribeRouteCalculatorResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CalculatorArn")) {
                describeRouteCalculatorResult.setCalculatorArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CalculatorName")) {
                describeRouteCalculatorResult.setCalculatorName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                describeRouteCalculatorResult.setCreateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("DataSource")) {
                describeRouteCalculatorResult.setDataSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                describeRouteCalculatorResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlan")) {
                describeRouteCalculatorResult.setPricingPlan(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeRouteCalculatorResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                describeRouteCalculatorResult.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeRouteCalculatorResult;
    }

    private static DescribeRouteCalculatorResultJsonUnmarshaller instance;

    public static DescribeRouteCalculatorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRouteCalculatorResultJsonUnmarshaller();
        return instance;
    }
}
