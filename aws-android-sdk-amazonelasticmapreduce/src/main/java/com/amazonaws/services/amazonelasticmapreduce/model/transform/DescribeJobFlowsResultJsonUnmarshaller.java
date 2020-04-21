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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeJobFlowsResult
 */
public class DescribeJobFlowsResultJsonUnmarshaller implements
        Unmarshaller<DescribeJobFlowsResult, JsonUnmarshallerContext> {

    public DescribeJobFlowsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobFlowsResult describeJobFlowsResult = new DescribeJobFlowsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobFlows")) {
                describeJobFlowsResult.setJobFlows(new ListUnmarshaller<JobFlowDetail>(
                        JobFlowDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeJobFlowsResult;
    }

    private static DescribeJobFlowsResultJsonUnmarshaller instance;

    public static DescribeJobFlowsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobFlowsResultJsonUnmarshaller();
        return instance;
    }
}
