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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelScores
 */
class ModelScoresJsonMarshaller {

    public void marshall(ModelScores modelScores, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelScores.getModelVersion() != null) {
            ModelVersion modelVersion = modelScores.getModelVersion();
            jsonWriter.name("modelVersion");
            ModelVersionJsonMarshaller.getInstance().marshall(modelVersion, jsonWriter);
        }
        if (modelScores.getScores() != null) {
            java.util.Map<String, Float> scores = modelScores.getScores();
            jsonWriter.name("scores");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Float> scoresEntry : scores.entrySet()) {
                Float scoresValue = scoresEntry.getValue();
                if (scoresValue != null) {
                    jsonWriter.name(scoresEntry.getKey());
                    jsonWriter.value(scoresValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ModelScoresJsonMarshaller instance;

    public static ModelScoresJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelScoresJsonMarshaller();
        return instance;
    }
}
