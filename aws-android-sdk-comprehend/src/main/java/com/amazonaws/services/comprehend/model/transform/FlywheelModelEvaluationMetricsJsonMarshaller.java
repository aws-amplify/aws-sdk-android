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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FlywheelModelEvaluationMetrics
 */
class FlywheelModelEvaluationMetricsJsonMarshaller {

    public void marshall(FlywheelModelEvaluationMetrics flywheelModelEvaluationMetrics,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (flywheelModelEvaluationMetrics.getAverageF1Score() != null) {
            Double averageF1Score = flywheelModelEvaluationMetrics.getAverageF1Score();
            jsonWriter.name("AverageF1Score");
            jsonWriter.value(averageF1Score);
        }
        if (flywheelModelEvaluationMetrics.getAveragePrecision() != null) {
            Double averagePrecision = flywheelModelEvaluationMetrics.getAveragePrecision();
            jsonWriter.name("AveragePrecision");
            jsonWriter.value(averagePrecision);
        }
        if (flywheelModelEvaluationMetrics.getAverageRecall() != null) {
            Double averageRecall = flywheelModelEvaluationMetrics.getAverageRecall();
            jsonWriter.name("AverageRecall");
            jsonWriter.value(averageRecall);
        }
        if (flywheelModelEvaluationMetrics.getAverageAccuracy() != null) {
            Double averageAccuracy = flywheelModelEvaluationMetrics.getAverageAccuracy();
            jsonWriter.name("AverageAccuracy");
            jsonWriter.value(averageAccuracy);
        }
        jsonWriter.endObject();
    }

    private static FlywheelModelEvaluationMetricsJsonMarshaller instance;

    public static FlywheelModelEvaluationMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelModelEvaluationMetricsJsonMarshaller();
        return instance;
    }
}
