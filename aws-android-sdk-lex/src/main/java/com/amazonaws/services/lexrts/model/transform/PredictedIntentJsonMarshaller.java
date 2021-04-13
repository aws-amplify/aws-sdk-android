/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PredictedIntent
 */
class PredictedIntentJsonMarshaller {

    public void marshall(PredictedIntent predictedIntent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (predictedIntent.getIntentName() != null) {
            String intentName = predictedIntent.getIntentName();
            jsonWriter.name("intentName");
            jsonWriter.value(intentName);
        }
        if (predictedIntent.getNluIntentConfidence() != null) {
            IntentConfidence nluIntentConfidence = predictedIntent.getNluIntentConfidence();
            jsonWriter.name("nluIntentConfidence");
            IntentConfidenceJsonMarshaller.getInstance().marshall(nluIntentConfidence, jsonWriter);
        }
        if (predictedIntent.getSlots() != null) {
            java.util.Map<String, String> slots = predictedIntent.getSlots();
            jsonWriter.name("slots");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> slotsEntry : slots.entrySet()) {
                String slotsValue = slotsEntry.getValue();
                if (slotsValue != null) {
                    jsonWriter.name(slotsEntry.getKey());
                    jsonWriter.value(slotsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PredictedIntentJsonMarshaller instance;

    public static PredictedIntentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredictedIntentJsonMarshaller();
        return instance;
    }
}
