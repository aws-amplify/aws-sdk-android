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
 * JSON unmarshaller for POJO HyperParameterTrainingJobDefinition
 */
class HyperParameterTrainingJobDefinitionJsonUnmarshaller implements
        Unmarshaller<HyperParameterTrainingJobDefinition, JsonUnmarshallerContext> {

    public HyperParameterTrainingJobDefinition unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HyperParameterTrainingJobDefinition hyperParameterTrainingJobDefinition = new HyperParameterTrainingJobDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DefinitionName")) {
                hyperParameterTrainingJobDefinition.setDefinitionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TuningObjective")) {
                hyperParameterTrainingJobDefinition
                        .setTuningObjective(HyperParameterTuningJobObjectiveJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HyperParameterRanges")) {
                hyperParameterTrainingJobDefinition
                        .setHyperParameterRanges(ParameterRangesJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StaticHyperParameters")) {
                hyperParameterTrainingJobDefinition
                        .setStaticHyperParameters(new MapUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AlgorithmSpecification")) {
                hyperParameterTrainingJobDefinition
                        .setAlgorithmSpecification(HyperParameterAlgorithmSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                hyperParameterTrainingJobDefinition.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                hyperParameterTrainingJobDefinition
                        .setInputDataConfig(new ListUnmarshaller<Channel>(ChannelJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                hyperParameterTrainingJobDefinition.setVpcConfig(VpcConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                hyperParameterTrainingJobDefinition
                        .setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ResourceConfig")) {
                hyperParameterTrainingJobDefinition
                        .setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                hyperParameterTrainingJobDefinition
                        .setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EnableNetworkIsolation")) {
                hyperParameterTrainingJobDefinition
                        .setEnableNetworkIsolation(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EnableInterContainerTrafficEncryption")) {
                hyperParameterTrainingJobDefinition
                        .setEnableInterContainerTrafficEncryption(BooleanJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EnableManagedSpotTraining")) {
                hyperParameterTrainingJobDefinition
                        .setEnableManagedSpotTraining(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CheckpointConfig")) {
                hyperParameterTrainingJobDefinition
                        .setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hyperParameterTrainingJobDefinition;
    }

    private static HyperParameterTrainingJobDefinitionJsonUnmarshaller instance;

    public static HyperParameterTrainingJobDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobDefinitionJsonUnmarshaller();
        return instance;
    }
}
