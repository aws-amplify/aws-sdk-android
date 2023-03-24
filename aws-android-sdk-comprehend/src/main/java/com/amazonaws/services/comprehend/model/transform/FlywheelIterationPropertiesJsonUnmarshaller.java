/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FlywheelIterationProperties
 */
class FlywheelIterationPropertiesJsonUnmarshaller implements
        Unmarshaller<FlywheelIterationProperties, JsonUnmarshallerContext> {

    public FlywheelIterationProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FlywheelIterationProperties flywheelIterationProperties = new FlywheelIterationProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FlywheelArn")) {
                flywheelIterationProperties.setFlywheelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlywheelIterationId")) {
                flywheelIterationProperties.setFlywheelIterationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                flywheelIterationProperties.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                flywheelIterationProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                flywheelIterationProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                flywheelIterationProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluatedModelArn")) {
                flywheelIterationProperties.setEvaluatedModelArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluatedModelMetrics")) {
                flywheelIterationProperties
                        .setEvaluatedModelMetrics(FlywheelModelEvaluationMetricsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TrainedModelArn")) {
                flywheelIterationProperties.setTrainedModelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainedModelMetrics")) {
                flywheelIterationProperties
                        .setTrainedModelMetrics(FlywheelModelEvaluationMetricsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EvaluationManifestS3Prefix")) {
                flywheelIterationProperties.setEvaluationManifestS3Prefix(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return flywheelIterationProperties;
    }

    private static FlywheelIterationPropertiesJsonUnmarshaller instance;

    public static FlywheelIterationPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelIterationPropertiesJsonUnmarshaller();
        return instance;
    }
}
