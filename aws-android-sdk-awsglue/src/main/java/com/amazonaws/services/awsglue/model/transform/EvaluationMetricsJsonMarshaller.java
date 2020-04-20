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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EvaluationMetrics
 */
class EvaluationMetricsJsonMarshaller {

    public void marshall(EvaluationMetrics evaluationMetrics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationMetrics.getTransformType() != null) {
            String transformType = evaluationMetrics.getTransformType();
            jsonWriter.name("TransformType");
            jsonWriter.value(transformType);
        }
        if (evaluationMetrics.getFindMatchesMetrics() != null) {
            FindMatchesMetrics findMatchesMetrics = evaluationMetrics.getFindMatchesMetrics();
            jsonWriter.name("FindMatchesMetrics");
            FindMatchesMetricsJsonMarshaller.getInstance().marshall(findMatchesMetrics, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationMetricsJsonMarshaller instance;

    public static EvaluationMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationMetricsJsonMarshaller();
        return instance;
    }
}
