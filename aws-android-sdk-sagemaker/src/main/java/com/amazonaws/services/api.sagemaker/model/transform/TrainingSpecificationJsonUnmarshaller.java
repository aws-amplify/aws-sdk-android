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
 * JSON unmarshaller for POJO TrainingSpecification
 */
class TrainingSpecificationJsonUnmarshaller implements
        Unmarshaller<TrainingSpecification, JsonUnmarshallerContext> {

    public TrainingSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrainingSpecification trainingSpecification = new TrainingSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrainingImage")) {
                trainingSpecification.setTrainingImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingImageDigest")) {
                trainingSpecification.setTrainingImageDigest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportedHyperParameters")) {
                trainingSpecification
                        .setSupportedHyperParameters(new ListUnmarshaller<HyperParameterSpecification>(
                                HyperParameterSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedTrainingInstanceTypes")) {
                trainingSpecification
                        .setSupportedTrainingInstanceTypes(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportsDistributedTraining")) {
                trainingSpecification.setSupportsDistributedTraining(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetricDefinitions")) {
                trainingSpecification.setMetricDefinitions(new ListUnmarshaller<MetricDefinition>(
                        MetricDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TrainingChannels")) {
                trainingSpecification
                        .setTrainingChannels(new ListUnmarshaller<ChannelSpecification>(
                                ChannelSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedTuningJobObjectiveMetrics")) {
                trainingSpecification
                        .setSupportedTuningJobObjectiveMetrics(new ListUnmarshaller<HyperParameterTuningJobObjective>(
                                HyperParameterTuningJobObjectiveJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trainingSpecification;
    }

    private static TrainingSpecificationJsonUnmarshaller instance;

    public static TrainingSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrainingSpecificationJsonUnmarshaller();
        return instance;
    }
}
