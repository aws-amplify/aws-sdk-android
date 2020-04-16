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

package com.amazonaws.services.amazonaugmentedairuntime.model.transform;

import com.amazonaws.services.amazonaugmentedairuntime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeHumanLoopResult
 */
public class DescribeHumanLoopResultJsonUnmarshaller implements
        Unmarshaller<DescribeHumanLoopResult, JsonUnmarshallerContext> {

    public DescribeHumanLoopResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHumanLoopResult describeHumanLoopResult = new DescribeHumanLoopResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreationTime")) {
                describeHumanLoopResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeHumanLoopResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureCode")) {
                describeHumanLoopResult.setFailureCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanLoopStatus")) {
                describeHumanLoopResult.setHumanLoopStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanLoopName")) {
                describeHumanLoopResult.setHumanLoopName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanLoopArn")) {
                describeHumanLoopResult.setHumanLoopArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionArn")) {
                describeHumanLoopResult.setFlowDefinitionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanLoopOutput")) {
                describeHumanLoopResult.setHumanLoopOutput(HumanLoopOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeHumanLoopResult;
    }

    private static DescribeHumanLoopResultJsonUnmarshaller instance;

    public static DescribeHumanLoopResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHumanLoopResultJsonUnmarshaller();
        return instance;
    }
}
