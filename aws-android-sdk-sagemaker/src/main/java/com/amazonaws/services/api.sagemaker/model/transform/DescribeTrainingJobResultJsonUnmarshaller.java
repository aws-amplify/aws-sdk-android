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
 * JSON unmarshaller for response DescribeTrainingJobResult
 */
public class DescribeTrainingJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeTrainingJobResult, JsonUnmarshallerContext> {

    public DescribeTrainingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrainingJobResult describeTrainingJobResult = new DescribeTrainingJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrainingJobName")) {
                describeTrainingJobResult.setTrainingJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobArn")) {
                describeTrainingJobResult.setTrainingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TuningJobArn")) {
                describeTrainingJobResult.setTuningJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobArn")) {
                describeTrainingJobResult.setLabelingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                describeTrainingJobResult.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelArtifacts")) {
                describeTrainingJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobStatus")) {
                describeTrainingJobResult.setTrainingJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecondaryStatus")) {
                describeTrainingJobResult.setSecondaryStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeTrainingJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HyperParameters")) {
                describeTrainingJobResult.setHyperParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AlgorithmSpecification")) {
                describeTrainingJobResult
                        .setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeTrainingJobResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                describeTrainingJobResult.setInputDataConfig(new ListUnmarshaller<Channel>(
                        ChannelJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                describeTrainingJobResult.setOutputDataConfig(OutputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceConfig")) {
                describeTrainingJobResult.setResourceConfig(ResourceConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                describeTrainingJobResult.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                describeTrainingJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeTrainingJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingStartTime")) {
                describeTrainingJobResult.setTrainingStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTime")) {
                describeTrainingJobResult.setTrainingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeTrainingJobResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecondaryStatusTransitions")) {
                describeTrainingJobResult
                        .setSecondaryStatusTransitions(new ListUnmarshaller<SecondaryStatusTransition>(
                                SecondaryStatusTransitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FinalMetricDataList")) {
                describeTrainingJobResult.setFinalMetricDataList(new ListUnmarshaller<MetricData>(
                        MetricDataJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EnableNetworkIsolation")) {
                describeTrainingJobResult.setEnableNetworkIsolation(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnableInterContainerTrafficEncryption")) {
                describeTrainingJobResult
                        .setEnableInterContainerTrafficEncryption(BooleanJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EnableManagedSpotTraining")) {
                describeTrainingJobResult.setEnableManagedSpotTraining(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CheckpointConfig")) {
                describeTrainingJobResult.setCheckpointConfig(CheckpointConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingTimeInSeconds")) {
                describeTrainingJobResult.setTrainingTimeInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("BillableTimeInSeconds")) {
                describeTrainingJobResult.setBillableTimeInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DebugHookConfig")) {
                describeTrainingJobResult.setDebugHookConfig(DebugHookConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentConfig")) {
                describeTrainingJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DebugRuleConfigurations")) {
                describeTrainingJobResult
                        .setDebugRuleConfigurations(new ListUnmarshaller<DebugRuleConfiguration>(
                                DebugRuleConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TensorBoardOutputConfig")) {
                describeTrainingJobResult
                        .setTensorBoardOutputConfig(TensorBoardOutputConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DebugRuleEvaluationStatuses")) {
                describeTrainingJobResult
                        .setDebugRuleEvaluationStatuses(new ListUnmarshaller<DebugRuleEvaluationStatus>(
                                DebugRuleEvaluationStatusJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeTrainingJobResult;
    }

    private static DescribeTrainingJobResultJsonUnmarshaller instance;

    public static DescribeTrainingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrainingJobResultJsonUnmarshaller();
        return instance;
    }
}
