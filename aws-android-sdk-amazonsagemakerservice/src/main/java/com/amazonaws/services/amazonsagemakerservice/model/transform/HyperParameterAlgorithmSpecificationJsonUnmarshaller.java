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
 * JSON unmarshaller for POJO HyperParameterAlgorithmSpecification
 */
class HyperParameterAlgorithmSpecificationJsonUnmarshaller implements
        Unmarshaller<HyperParameterAlgorithmSpecification, JsonUnmarshallerContext> {

    public HyperParameterAlgorithmSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HyperParameterAlgorithmSpecification hyperParameterAlgorithmSpecification = new HyperParameterAlgorithmSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrainingImage")) {
                hyperParameterAlgorithmSpecification.setTrainingImage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingInputMode")) {
                hyperParameterAlgorithmSpecification.setTrainingInputMode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlgorithmName")) {
                hyperParameterAlgorithmSpecification.setAlgorithmName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetricDefinitions")) {
                hyperParameterAlgorithmSpecification
                        .setMetricDefinitions(new ListUnmarshaller<MetricDefinition>(
                                MetricDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hyperParameterAlgorithmSpecification;
    }

    private static HyperParameterAlgorithmSpecificationJsonUnmarshaller instance;

    public static HyperParameterAlgorithmSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterAlgorithmSpecificationJsonUnmarshaller();
        return instance;
    }
}
