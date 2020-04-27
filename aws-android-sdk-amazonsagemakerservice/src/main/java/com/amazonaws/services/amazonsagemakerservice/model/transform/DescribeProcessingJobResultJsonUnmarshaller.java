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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeProcessingJobResult
 */
public class DescribeProcessingJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeProcessingJobResult, JsonUnmarshallerContext> {

    public DescribeProcessingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProcessingJobResult describeProcessingJobResult = new DescribeProcessingJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProcessingInputs")) {
                describeProcessingJobResult
                        .setProcessingInputs(new ListUnmarshaller<ProcessingInput>(
                                ProcessingInputJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessingOutputConfig")) {
                describeProcessingJobResult
                        .setProcessingOutputConfig(ProcessingOutputConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ProcessingJobName")) {
                describeProcessingJobResult.setProcessingJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingResources")) {
                describeProcessingJobResult
                        .setProcessingResources(ProcessingResourcesJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                describeProcessingJobResult
                        .setStoppingCondition(ProcessingStoppingConditionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AppSpecification")) {
                describeProcessingJobResult.setAppSpecification(AppSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Environment")) {
                describeProcessingJobResult.setEnvironment(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkConfig")) {
                describeProcessingJobResult.setNetworkConfig(NetworkConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeProcessingJobResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentConfig")) {
                describeProcessingJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobArn")) {
                describeProcessingJobResult.setProcessingJobArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobStatus")) {
                describeProcessingJobResult.setProcessingJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExitMessage")) {
                describeProcessingJobResult.setExitMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeProcessingJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingEndTime")) {
                describeProcessingJobResult.setProcessingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingStartTime")) {
                describeProcessingJobResult.setProcessingStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeProcessingJobResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeProcessingJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleArn")) {
                describeProcessingJobResult.setMonitoringScheduleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                describeProcessingJobResult.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobArn")) {
                describeProcessingJobResult.setTrainingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeProcessingJobResult;
    }

    private static DescribeProcessingJobResultJsonUnmarshaller instance;

    public static DescribeProcessingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProcessingJobResultJsonUnmarshaller();
        return instance;
    }
}
