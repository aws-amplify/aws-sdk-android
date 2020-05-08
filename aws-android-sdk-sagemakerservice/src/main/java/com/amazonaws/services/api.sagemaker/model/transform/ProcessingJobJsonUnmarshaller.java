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
 * JSON unmarshaller for POJO ProcessingJob
 */
class ProcessingJobJsonUnmarshaller implements Unmarshaller<ProcessingJob, JsonUnmarshallerContext> {

    public ProcessingJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProcessingJob processingJob = new ProcessingJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProcessingInputs")) {
                processingJob.setProcessingInputs(new ListUnmarshaller<ProcessingInput>(
                        ProcessingInputJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessingOutputConfig")) {
                processingJob.setProcessingOutputConfig(ProcessingOutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobName")) {
                processingJob.setProcessingJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingResources")) {
                processingJob.setProcessingResources(ProcessingResourcesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                processingJob.setStoppingCondition(ProcessingStoppingConditionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AppSpecification")) {
                processingJob.setAppSpecification(AppSpecificationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Environment")) {
                processingJob.setEnvironment(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkConfig")) {
                processingJob.setNetworkConfig(NetworkConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                processingJob.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentConfig")) {
                processingJob.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobArn")) {
                processingJob.setProcessingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobStatus")) {
                processingJob.setProcessingJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExitMessage")) {
                processingJob.setExitMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                processingJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingEndTime")) {
                processingJob.setProcessingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingStartTime")) {
                processingJob.setProcessingStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                processingJob.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                processingJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleArn")) {
                processingJob.setMonitoringScheduleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                processingJob.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobArn")) {
                processingJob.setTrainingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                processingJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return processingJob;
    }

    private static ProcessingJobJsonUnmarshaller instance;

    public static ProcessingJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingJobJsonUnmarshaller();
        return instance;
    }
}
