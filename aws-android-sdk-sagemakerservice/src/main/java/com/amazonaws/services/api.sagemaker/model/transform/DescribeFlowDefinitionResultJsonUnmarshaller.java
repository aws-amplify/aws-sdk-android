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
 * JSON unmarshaller for response DescribeFlowDefinitionResult
 */
public class DescribeFlowDefinitionResultJsonUnmarshaller implements
        Unmarshaller<DescribeFlowDefinitionResult, JsonUnmarshallerContext> {

    public DescribeFlowDefinitionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeFlowDefinitionResult describeFlowDefinitionResult = new DescribeFlowDefinitionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FlowDefinitionArn")) {
                describeFlowDefinitionResult.setFlowDefinitionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionName")) {
                describeFlowDefinitionResult.setFlowDefinitionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowDefinitionStatus")) {
                describeFlowDefinitionResult.setFlowDefinitionStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeFlowDefinitionResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanLoopRequestSource")) {
                describeFlowDefinitionResult
                        .setHumanLoopRequestSource(HumanLoopRequestSourceJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HumanLoopActivationConfig")) {
                describeFlowDefinitionResult
                        .setHumanLoopActivationConfig(HumanLoopActivationConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HumanLoopConfig")) {
                describeFlowDefinitionResult.setHumanLoopConfig(HumanLoopConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                describeFlowDefinitionResult
                        .setOutputConfig(FlowDefinitionOutputConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeFlowDefinitionResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeFlowDefinitionResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeFlowDefinitionResult;
    }

    private static DescribeFlowDefinitionResultJsonUnmarshaller instance;

    public static DescribeFlowDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFlowDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
