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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrainingJob
 */
class TrainingJobJsonMarshaller {

    public void marshall(TrainingJob trainingJob, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trainingJob.getTrainingJobName() != null) {
            String trainingJobName = trainingJob.getTrainingJobName();
            jsonWriter.name("TrainingJobName");
            jsonWriter.value(trainingJobName);
        }
        if (trainingJob.getTrainingJobArn() != null) {
            String trainingJobArn = trainingJob.getTrainingJobArn();
            jsonWriter.name("TrainingJobArn");
            jsonWriter.value(trainingJobArn);
        }
        if (trainingJob.getTuningJobArn() != null) {
            String tuningJobArn = trainingJob.getTuningJobArn();
            jsonWriter.name("TuningJobArn");
            jsonWriter.value(tuningJobArn);
        }
        if (trainingJob.getLabelingJobArn() != null) {
            String labelingJobArn = trainingJob.getLabelingJobArn();
            jsonWriter.name("LabelingJobArn");
            jsonWriter.value(labelingJobArn);
        }
        if (trainingJob.getAutoMLJobArn() != null) {
            String autoMLJobArn = trainingJob.getAutoMLJobArn();
            jsonWriter.name("AutoMLJobArn");
            jsonWriter.value(autoMLJobArn);
        }
        if (trainingJob.getModelArtifacts() != null) {
            ModelArtifacts modelArtifacts = trainingJob.getModelArtifacts();
            jsonWriter.name("ModelArtifacts");
            ModelArtifactsJsonMarshaller.getInstance().marshall(modelArtifacts, jsonWriter);
        }
        if (trainingJob.getTrainingJobStatus() != null) {
            String trainingJobStatus = trainingJob.getTrainingJobStatus();
            jsonWriter.name("TrainingJobStatus");
            jsonWriter.value(trainingJobStatus);
        }
        if (trainingJob.getSecondaryStatus() != null) {
            String secondaryStatus = trainingJob.getSecondaryStatus();
            jsonWriter.name("SecondaryStatus");
            jsonWriter.value(secondaryStatus);
        }
        if (trainingJob.getFailureReason() != null) {
            String failureReason = trainingJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (trainingJob.getHyperParameters() != null) {
            java.util.Map<String, String> hyperParameters = trainingJob.getHyperParameters();
            jsonWriter.name("HyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> hyperParametersEntry : hyperParameters
                    .entrySet()) {
                String hyperParametersValue = hyperParametersEntry.getValue();
                if (hyperParametersValue != null) {
                    jsonWriter.name(hyperParametersEntry.getKey());
                    jsonWriter.value(hyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (trainingJob.getAlgorithmSpecification() != null) {
            AlgorithmSpecification algorithmSpecification = trainingJob.getAlgorithmSpecification();
            jsonWriter.name("AlgorithmSpecification");
            AlgorithmSpecificationJsonMarshaller.getInstance().marshall(algorithmSpecification,
                    jsonWriter);
        }
        if (trainingJob.getRoleArn() != null) {
            String roleArn = trainingJob.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (trainingJob.getInputDataConfig() != null) {
            java.util.List<Channel> inputDataConfig = trainingJob.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            jsonWriter.beginArray();
            for (Channel inputDataConfigItem : inputDataConfig) {
                if (inputDataConfigItem != null) {
                    ChannelJsonMarshaller.getInstance().marshall(inputDataConfigItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJob.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = trainingJob.getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (trainingJob.getResourceConfig() != null) {
            ResourceConfig resourceConfig = trainingJob.getResourceConfig();
            jsonWriter.name("ResourceConfig");
            ResourceConfigJsonMarshaller.getInstance().marshall(resourceConfig, jsonWriter);
        }
        if (trainingJob.getVpcConfig() != null) {
            VpcConfig vpcConfig = trainingJob.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (trainingJob.getStoppingCondition() != null) {
            StoppingCondition stoppingCondition = trainingJob.getStoppingCondition();
            jsonWriter.name("StoppingCondition");
            StoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition, jsonWriter);
        }
        if (trainingJob.getCreationTime() != null) {
            java.util.Date creationTime = trainingJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trainingJob.getTrainingStartTime() != null) {
            java.util.Date trainingStartTime = trainingJob.getTrainingStartTime();
            jsonWriter.name("TrainingStartTime");
            jsonWriter.value(trainingStartTime);
        }
        if (trainingJob.getTrainingEndTime() != null) {
            java.util.Date trainingEndTime = trainingJob.getTrainingEndTime();
            jsonWriter.name("TrainingEndTime");
            jsonWriter.value(trainingEndTime);
        }
        if (trainingJob.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trainingJob.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (trainingJob.getSecondaryStatusTransitions() != null) {
            java.util.List<SecondaryStatusTransition> secondaryStatusTransitions = trainingJob
                    .getSecondaryStatusTransitions();
            jsonWriter.name("SecondaryStatusTransitions");
            jsonWriter.beginArray();
            for (SecondaryStatusTransition secondaryStatusTransitionsItem : secondaryStatusTransitions) {
                if (secondaryStatusTransitionsItem != null) {
                    SecondaryStatusTransitionJsonMarshaller.getInstance().marshall(
                            secondaryStatusTransitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJob.getFinalMetricDataList() != null) {
            java.util.List<MetricData> finalMetricDataList = trainingJob.getFinalMetricDataList();
            jsonWriter.name("FinalMetricDataList");
            jsonWriter.beginArray();
            for (MetricData finalMetricDataListItem : finalMetricDataList) {
                if (finalMetricDataListItem != null) {
                    MetricDataJsonMarshaller.getInstance().marshall(finalMetricDataListItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJob.getEnableNetworkIsolation() != null) {
            Boolean enableNetworkIsolation = trainingJob.getEnableNetworkIsolation();
            jsonWriter.name("EnableNetworkIsolation");
            jsonWriter.value(enableNetworkIsolation);
        }
        if (trainingJob.getEnableInterContainerTrafficEncryption() != null) {
            Boolean enableInterContainerTrafficEncryption = trainingJob
                    .getEnableInterContainerTrafficEncryption();
            jsonWriter.name("EnableInterContainerTrafficEncryption");
            jsonWriter.value(enableInterContainerTrafficEncryption);
        }
        if (trainingJob.getEnableManagedSpotTraining() != null) {
            Boolean enableManagedSpotTraining = trainingJob.getEnableManagedSpotTraining();
            jsonWriter.name("EnableManagedSpotTraining");
            jsonWriter.value(enableManagedSpotTraining);
        }
        if (trainingJob.getCheckpointConfig() != null) {
            CheckpointConfig checkpointConfig = trainingJob.getCheckpointConfig();
            jsonWriter.name("CheckpointConfig");
            CheckpointConfigJsonMarshaller.getInstance().marshall(checkpointConfig, jsonWriter);
        }
        if (trainingJob.getTrainingTimeInSeconds() != null) {
            Integer trainingTimeInSeconds = trainingJob.getTrainingTimeInSeconds();
            jsonWriter.name("TrainingTimeInSeconds");
            jsonWriter.value(trainingTimeInSeconds);
        }
        if (trainingJob.getBillableTimeInSeconds() != null) {
            Integer billableTimeInSeconds = trainingJob.getBillableTimeInSeconds();
            jsonWriter.name("BillableTimeInSeconds");
            jsonWriter.value(billableTimeInSeconds);
        }
        if (trainingJob.getDebugHookConfig() != null) {
            DebugHookConfig debugHookConfig = trainingJob.getDebugHookConfig();
            jsonWriter.name("DebugHookConfig");
            DebugHookConfigJsonMarshaller.getInstance().marshall(debugHookConfig, jsonWriter);
        }
        if (trainingJob.getExperimentConfig() != null) {
            ExperimentConfig experimentConfig = trainingJob.getExperimentConfig();
            jsonWriter.name("ExperimentConfig");
            ExperimentConfigJsonMarshaller.getInstance().marshall(experimentConfig, jsonWriter);
        }
        if (trainingJob.getDebugRuleConfigurations() != null) {
            java.util.List<DebugRuleConfiguration> debugRuleConfigurations = trainingJob
                    .getDebugRuleConfigurations();
            jsonWriter.name("DebugRuleConfigurations");
            jsonWriter.beginArray();
            for (DebugRuleConfiguration debugRuleConfigurationsItem : debugRuleConfigurations) {
                if (debugRuleConfigurationsItem != null) {
                    DebugRuleConfigurationJsonMarshaller.getInstance().marshall(
                            debugRuleConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJob.getTensorBoardOutputConfig() != null) {
            TensorBoardOutputConfig tensorBoardOutputConfig = trainingJob
                    .getTensorBoardOutputConfig();
            jsonWriter.name("TensorBoardOutputConfig");
            TensorBoardOutputConfigJsonMarshaller.getInstance().marshall(tensorBoardOutputConfig,
                    jsonWriter);
        }
        if (trainingJob.getDebugRuleEvaluationStatuses() != null) {
            java.util.List<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses = trainingJob
                    .getDebugRuleEvaluationStatuses();
            jsonWriter.name("DebugRuleEvaluationStatuses");
            jsonWriter.beginArray();
            for (DebugRuleEvaluationStatus debugRuleEvaluationStatusesItem : debugRuleEvaluationStatuses) {
                if (debugRuleEvaluationStatusesItem != null) {
                    DebugRuleEvaluationStatusJsonMarshaller.getInstance().marshall(
                            debugRuleEvaluationStatusesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingJob.getTags() != null) {
            java.util.List<Tag> tags = trainingJob.getTags();
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

    private static TrainingJobJsonMarshaller instance;

    public static TrainingJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobJsonMarshaller();
        return instance;
    }
}
