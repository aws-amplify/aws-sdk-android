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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessingJob
 */
class ProcessingJobJsonMarshaller {

    public void marshall(ProcessingJob processingJob, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (processingJob.getProcessingInputs() != null) {
            java.util.List<ProcessingInput> processingInputs = processingJob.getProcessingInputs();
            jsonWriter.name("ProcessingInputs");
            jsonWriter.beginArray();
            for (ProcessingInput processingInputsItem : processingInputs) {
                if (processingInputsItem != null) {
                    ProcessingInputJsonMarshaller.getInstance().marshall(processingInputsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (processingJob.getProcessingOutputConfig() != null) {
            ProcessingOutputConfig processingOutputConfig = processingJob
                    .getProcessingOutputConfig();
            jsonWriter.name("ProcessingOutputConfig");
            ProcessingOutputConfigJsonMarshaller.getInstance().marshall(processingOutputConfig,
                    jsonWriter);
        }
        if (processingJob.getProcessingJobName() != null) {
            String processingJobName = processingJob.getProcessingJobName();
            jsonWriter.name("ProcessingJobName");
            jsonWriter.value(processingJobName);
        }
        if (processingJob.getProcessingResources() != null) {
            ProcessingResources processingResources = processingJob.getProcessingResources();
            jsonWriter.name("ProcessingResources");
            ProcessingResourcesJsonMarshaller.getInstance().marshall(processingResources,
                    jsonWriter);
        }
        if (processingJob.getStoppingCondition() != null) {
            ProcessingStoppingCondition stoppingCondition = processingJob.getStoppingCondition();
            jsonWriter.name("StoppingCondition");
            ProcessingStoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition,
                    jsonWriter);
        }
        if (processingJob.getAppSpecification() != null) {
            AppSpecification appSpecification = processingJob.getAppSpecification();
            jsonWriter.name("AppSpecification");
            AppSpecificationJsonMarshaller.getInstance().marshall(appSpecification, jsonWriter);
        }
        if (processingJob.getEnvironment() != null) {
            java.util.Map<String, String> environment = processingJob.getEnvironment();
            jsonWriter.name("Environment");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> environmentEntry : environment.entrySet()) {
                String environmentValue = environmentEntry.getValue();
                if (environmentValue != null) {
                    jsonWriter.name(environmentEntry.getKey());
                    jsonWriter.value(environmentValue);
                }
            }
            jsonWriter.endObject();
        }
        if (processingJob.getNetworkConfig() != null) {
            NetworkConfig networkConfig = processingJob.getNetworkConfig();
            jsonWriter.name("NetworkConfig");
            NetworkConfigJsonMarshaller.getInstance().marshall(networkConfig, jsonWriter);
        }
        if (processingJob.getRoleArn() != null) {
            String roleArn = processingJob.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (processingJob.getExperimentConfig() != null) {
            ExperimentConfig experimentConfig = processingJob.getExperimentConfig();
            jsonWriter.name("ExperimentConfig");
            ExperimentConfigJsonMarshaller.getInstance().marshall(experimentConfig, jsonWriter);
        }
        if (processingJob.getProcessingJobArn() != null) {
            String processingJobArn = processingJob.getProcessingJobArn();
            jsonWriter.name("ProcessingJobArn");
            jsonWriter.value(processingJobArn);
        }
        if (processingJob.getProcessingJobStatus() != null) {
            String processingJobStatus = processingJob.getProcessingJobStatus();
            jsonWriter.name("ProcessingJobStatus");
            jsonWriter.value(processingJobStatus);
        }
        if (processingJob.getExitMessage() != null) {
            String exitMessage = processingJob.getExitMessage();
            jsonWriter.name("ExitMessage");
            jsonWriter.value(exitMessage);
        }
        if (processingJob.getFailureReason() != null) {
            String failureReason = processingJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (processingJob.getProcessingEndTime() != null) {
            java.util.Date processingEndTime = processingJob.getProcessingEndTime();
            jsonWriter.name("ProcessingEndTime");
            jsonWriter.value(processingEndTime);
        }
        if (processingJob.getProcessingStartTime() != null) {
            java.util.Date processingStartTime = processingJob.getProcessingStartTime();
            jsonWriter.name("ProcessingStartTime");
            jsonWriter.value(processingStartTime);
        }
        if (processingJob.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = processingJob.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (processingJob.getCreationTime() != null) {
            java.util.Date creationTime = processingJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (processingJob.getMonitoringScheduleArn() != null) {
            String monitoringScheduleArn = processingJob.getMonitoringScheduleArn();
            jsonWriter.name("MonitoringScheduleArn");
            jsonWriter.value(monitoringScheduleArn);
        }
        if (processingJob.getAutoMLJobArn() != null) {
            String autoMLJobArn = processingJob.getAutoMLJobArn();
            jsonWriter.name("AutoMLJobArn");
            jsonWriter.value(autoMLJobArn);
        }
        if (processingJob.getTrainingJobArn() != null) {
            String trainingJobArn = processingJob.getTrainingJobArn();
            jsonWriter.name("TrainingJobArn");
            jsonWriter.value(trainingJobArn);
        }
        if (processingJob.getTags() != null) {
            java.util.List<Tag> tags = processingJob.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProcessingJobJsonMarshaller instance;

    public static ProcessingJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingJobJsonMarshaller();
        return instance;
    }
}
