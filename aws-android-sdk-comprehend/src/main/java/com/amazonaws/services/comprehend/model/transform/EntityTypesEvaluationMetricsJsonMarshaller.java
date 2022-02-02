/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO EntityTypesEvaluationMetrics
 */
class EntityTypesEvaluationMetricsJsonMarshaller {

    public void marshall(EntityTypesEvaluationMetrics entityTypesEvaluationMetrics,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entityTypesEvaluationMetrics.getPrecision() != null) {
            Double precision = entityTypesEvaluationMetrics.getPrecision();
            jsonWriter.name("Precision");
            jsonWriter.value(precision);
        }
        if (entityTypesEvaluationMetrics.getRecall() != null) {
            Double recall = entityTypesEvaluationMetrics.getRecall();
            jsonWriter.name("Recall");
            jsonWriter.value(recall);
        }
        if (entityTypesEvaluationMetrics.getF1Score() != null) {
            Double f1Score = entityTypesEvaluationMetrics.getF1Score();
            jsonWriter.name("F1Score");
            jsonWriter.value(f1Score);
        }
        jsonWriter.endObject();
    }

    private static EntityTypesEvaluationMetricsJsonMarshaller instance;

    public static EntityTypesEvaluationMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityTypesEvaluationMetricsJsonMarshaller();
        return instance;
    }
}
