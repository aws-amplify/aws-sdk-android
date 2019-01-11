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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EntityRecognizerEvaluationMetrics
 */
class EntityRecognizerEvaluationMetricsJsonUnmarshaller implements
        Unmarshaller<EntityRecognizerEvaluationMetrics, JsonUnmarshallerContext> {

    public EntityRecognizerEvaluationMetrics unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityRecognizerEvaluationMetrics entityRecognizerEvaluationMetrics = new EntityRecognizerEvaluationMetrics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Precision")) {
                entityRecognizerEvaluationMetrics.setPrecision(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Recall")) {
                entityRecognizerEvaluationMetrics.setRecall(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("F1Score")) {
                entityRecognizerEvaluationMetrics.setF1Score(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityRecognizerEvaluationMetrics;
    }

    private static EntityRecognizerEvaluationMetricsJsonUnmarshaller instance;

    public static EntityRecognizerEvaluationMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerEvaluationMetricsJsonUnmarshaller();
        return instance;
    }
}
