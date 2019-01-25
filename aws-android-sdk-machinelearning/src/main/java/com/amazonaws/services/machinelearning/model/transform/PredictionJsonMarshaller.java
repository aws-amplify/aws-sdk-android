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

package com.amazonaws.services.machinelearning.model.transform;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Prediction
 */
class PredictionJsonMarshaller {

    public void marshall(Prediction prediction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (prediction.getPredictedLabel() != null) {
            String predictedLabel = prediction.getPredictedLabel();
            jsonWriter.name("predictedLabel");
            jsonWriter.value(predictedLabel);
        }
        if (prediction.getPredictedValue() != null) {
            Float predictedValue = prediction.getPredictedValue();
            jsonWriter.name("predictedValue");
            jsonWriter.value(predictedValue);
        }
        if (prediction.getPredictedScores() != null) {
            java.util.Map<String, Float> predictedScores = prediction.getPredictedScores();
            jsonWriter.name("predictedScores");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Float> predictedScoresEntry : predictedScores
                    .entrySet()) {
                Float predictedScoresValue = predictedScoresEntry.getValue();
                if (predictedScoresValue != null) {
                    jsonWriter.name(predictedScoresEntry.getKey());
                    jsonWriter.value(predictedScoresValue);
                }
            }
            jsonWriter.endObject();
        }
        if (prediction.getDetails() != null) {
            java.util.Map<String, String> details = prediction.getDetails();
            jsonWriter.name("details");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> detailsEntry : details.entrySet()) {
                String detailsValue = detailsEntry.getValue();
                if (detailsValue != null) {
                    jsonWriter.name(detailsEntry.getKey());
                    jsonWriter.value(detailsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PredictionJsonMarshaller instance;

    public static PredictionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredictionJsonMarshaller();
        return instance;
    }
}
