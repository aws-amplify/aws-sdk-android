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
 * JSON unmarshaller for POJO FlywheelModelEvaluationMetrics
 */
class FlywheelModelEvaluationMetricsJsonUnmarshaller implements
        Unmarshaller<FlywheelModelEvaluationMetrics, JsonUnmarshallerContext> {

    public FlywheelModelEvaluationMetrics unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FlywheelModelEvaluationMetrics flywheelModelEvaluationMetrics = new FlywheelModelEvaluationMetrics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AverageF1Score")) {
                flywheelModelEvaluationMetrics.setAverageF1Score(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AveragePrecision")) {
                flywheelModelEvaluationMetrics.setAveragePrecision(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AverageRecall")) {
                flywheelModelEvaluationMetrics.setAverageRecall(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AverageAccuracy")) {
                flywheelModelEvaluationMetrics.setAverageAccuracy(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return flywheelModelEvaluationMetrics;
    }

    private static FlywheelModelEvaluationMetricsJsonUnmarshaller instance;

    public static FlywheelModelEvaluationMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelModelEvaluationMetricsJsonUnmarshaller();
        return instance;
    }
}
