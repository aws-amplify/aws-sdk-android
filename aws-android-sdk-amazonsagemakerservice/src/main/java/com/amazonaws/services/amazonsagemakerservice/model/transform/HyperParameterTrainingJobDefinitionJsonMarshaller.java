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
 * JSON marshaller for POJO HyperParameterTrainingJobDefinition
 */
class HyperParameterTrainingJobDefinitionJsonMarshaller {

    public void marshall(HyperParameterTrainingJobDefinition hyperParameterTrainingJobDefinition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterTrainingJobDefinition.getDefinitionName() != null) {
            String definitionName = hyperParameterTrainingJobDefinition.getDefinitionName();
            jsonWriter.name("DefinitionName");
            jsonWriter.value(definitionName);
        }
        if (hyperParameterTrainingJobDefinition.getTuningObjective() != null) {
            HyperParameterTuningJobObjective tuningObjective = hyperParameterTrainingJobDefinition
                    .getTuningObjective();
            jsonWriter.name("TuningObjective");
            HyperParameterTuningJobObjectiveJsonMarshaller.getInstance().marshall(tuningObjective,
                    jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getHyperParameterRanges() != null) {
            ParameterRanges hyperParameterRanges = hyperParameterTrainingJobDefinition
                    .getHyperParameterRanges();
            jsonWriter.name("HyperParameterRanges");
            ParameterRangesJsonMarshaller.getInstance().marshall(hyperParameterRanges, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getStaticHyperParameters() != null) {
            java.util.Map<String, String> staticHyperParameters = hyperParameterTrainingJobDefinition
                    .getStaticHyperParameters();
            jsonWriter.name("StaticHyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> staticHyperParametersEntry : staticHyperParameters
                    .entrySet()) {
                String staticHyperParametersValue = staticHyperParametersEntry.getValue();
                if (staticHyperParametersValue != null) {
                    jsonWriter.name(staticHyperParametersEntry.getKey());
                    jsonWriter.value(staticHyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (hyperParameterTrainingJobDefinition.getAlgorithmSpecification() != null) {
            HyperParameterAlgorithmSpecification algorithmSpecification = hyperParameterTrainingJobDefinition
                    .getAlgorithmSpecification();
            jsonWriter.name("AlgorithmSpecification");
            HyperParameterAlgorithmSpecificationJsonMarshaller.getInstance().marshall(
                    algorithmSpecification, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getRoleArn() != null) {
            String roleArn = hyperParameterTrainingJobDefinition.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (hyperParameterTrainingJobDefinition.getInputDataConfig() != null) {
            java.util.List<Channel> inputDataConfig = hyperParameterTrainingJobDefinition
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            jsonWriter.beginArray();
            for (Channel inputDataConfigItem : inputDataConfig) {
                if (inputDataConfigItem != null) {
                    ChannelJsonMarshaller.getInstance().marshall(inputDataConfigItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hyperParameterTrainingJobDefinition.getVpcConfig() != null) {
            VpcConfig vpcConfig = hyperParameterTrainingJobDefinition.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = hyperParameterTrainingJobDefinition
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getResourceConfig() != null) {
            ResourceConfig resourceConfig = hyperParameterTrainingJobDefinition.getResourceConfig();
            jsonWriter.name("ResourceConfig");
            ResourceConfigJsonMarshaller.getInstance().marshall(resourceConfig, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getStoppingCondition() != null) {
            StoppingCondition stoppingCondition = hyperParameterTrainingJobDefinition
                    .getStoppingCondition();
            jsonWriter.name("StoppingCondition");
            StoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition, jsonWriter);
        }
        if (hyperParameterTrainingJobDefinition.getEnableNetworkIsolation() != null) {
            Boolean enableNetworkIsolation = hyperParameterTrainingJobDefinition
                    .getEnableNetworkIsolation();
            jsonWriter.name("EnableNetworkIsolation");
            jsonWriter.value(enableNetworkIsolation);
        }
        if (hyperParameterTrainingJobDefinition.getEnableInterContainerTrafficEncryption() != null) {
            Boolean enableInterContainerTrafficEncryption = hyperParameterTrainingJobDefinition
                    .getEnableInterContainerTrafficEncryption();
            jsonWriter.name("EnableInterContainerTrafficEncryption");
            jsonWriter.value(enableInterContainerTrafficEncryption);
        }
        if (hyperParameterTrainingJobDefinition.getEnableManagedSpotTraining() != null) {
            Boolean enableManagedSpotTraining = hyperParameterTrainingJobDefinition
                    .getEnableManagedSpotTraining();
            jsonWriter.name("EnableManagedSpotTraining");
            jsonWriter.value(enableManagedSpotTraining);
        }
        if (hyperParameterTrainingJobDefinition.getCheckpointConfig() != null) {
            CheckpointConfig checkpointConfig = hyperParameterTrainingJobDefinition
                    .getCheckpointConfig();
            jsonWriter.name("CheckpointConfig");
            CheckpointConfigJsonMarshaller.getInstance().marshall(checkpointConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterTrainingJobDefinitionJsonMarshaller instance;

    public static HyperParameterTrainingJobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobDefinitionJsonMarshaller();
        return instance;
    }
}
