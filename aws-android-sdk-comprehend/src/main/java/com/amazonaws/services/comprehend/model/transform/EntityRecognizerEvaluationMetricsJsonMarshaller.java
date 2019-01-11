/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityRecognizerEvaluationMetrics
 */
class EntityRecognizerEvaluationMetricsJsonMarshaller {

    public void marshall(EntityRecognizerEvaluationMetrics entityRecognizerEvaluationMetrics,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerEvaluationMetrics.getPrecision() != null) {
            Double precision = entityRecognizerEvaluationMetrics.getPrecision();
            jsonWriter.name("Precision");
            jsonWriter.value(precision);
        }
        if (entityRecognizerEvaluationMetrics.getRecall() != null) {
            Double recall = entityRecognizerEvaluationMetrics.getRecall();
            jsonWriter.name("Recall");
            jsonWriter.value(recall);
        }
        if (entityRecognizerEvaluationMetrics.getF1Score() != null) {
            Double f1Score = entityRecognizerEvaluationMetrics.getF1Score();
            jsonWriter.name("F1Score");
            jsonWriter.value(f1Score);
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerEvaluationMetricsJsonMarshaller instance;

    public static EntityRecognizerEvaluationMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerEvaluationMetricsJsonMarshaller();
        return instance;
    }
}
