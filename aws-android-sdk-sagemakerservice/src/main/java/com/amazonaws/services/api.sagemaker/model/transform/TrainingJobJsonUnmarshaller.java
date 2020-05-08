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
 * JSON unmarshaller for POJO TrainingJob
 */
class TrainingJobJsonUnmarshaller implements Unmarshaller<TrainingJob, JsonUnmarshallerContext> {

    public TrainingJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrainingJob trainingJob = new TrainingJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrainingJobName")) {
                trainingJob.setTrainingJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobArn")) {
                trainingJob.setTrainingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TuningJobArn")) {
                trainingJob.setTuningJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobArn")) {
                trainingJob.setLabelingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                trainingJob.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelArtifacts")) {
                trainingJob.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobStatus")) {
                trainingJob.setTrainingJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecondaryStatus")) {
                trainingJob.setSecondaryStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                trainingJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HyperParameters")) {
                trainingJob.setHyperParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AlgorithmSpecification")) {
                trainingJob.setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                trainingJob.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                trainingJob.setInputDataConfig(new ListUnmarshaller<Channel>(
                        ChannelJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                trainingJob.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceConfig")) {
                trainingJob.setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                trainingJob.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                trainingJob.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                trainingJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingStartTime")) {
                trainingJob.setTrainingStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTime")) {
                trainingJob.setTrainingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                trainingJob.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecondaryStatusTransitions")) {
                trainingJob
                        .setSecondaryStatusTransitions(new ListUnmarshaller<SecondaryStatusTransition>(
                                SecondaryStatusTransitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FinalMetricDataList")) {
                trainingJob.setFinalMetricDataList(new ListUnmarshaller<MetricData>(
                        MetricDataJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EnableNetworkIsolation")) {
                trainingJob.setEnableNetworkIsolation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnableInterContainerTrafficEncryption")) {
                trainingJob.setEnableInterContainerTrafficEncryption(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnableManagedSpotTraining")) {
                trainingJob.setEnableManagedSpotTraining(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CheckpointConfig")) {
                trainingJob.setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingTimeInSeconds")) {
                trainingJob.setTrainingTimeInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BillableTimeInSeconds")) {
                trainingJob.setBillableTimeInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DebugHookConfig")) {
                trainingJob.setDebugHookConfig(DebugHookConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentConfig")) {
                trainingJob.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DebugRuleConfigurations")) {
                trainingJob
                        .setDebugRuleConfigurations(new ListUnmarshaller<DebugRuleConfiguration>(
                                DebugRuleConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TensorBoardOutputConfig")) {
                trainingJob.setTensorBoardOutputConfig(TensorBoardOutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DebugRuleEvaluationStatuses")) {
                trainingJob
                        .setDebugRuleEvaluationStatuses(new ListUnmarshaller<DebugRuleEvaluationStatus>(
                                DebugRuleEvaluationStatusJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                trainingJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trainingJob;
    }

    private static TrainingJobJsonUnmarshaller instance;

    public static TrainingJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobJsonUnmarshaller();
        return instance;
    }
}
