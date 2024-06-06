/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InferredState
 */
class InferredStateJsonMarshaller {

    public void marshall(InferredState inferredState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inferredState.getPosition() != null) {
            java.util.List<Double> position = inferredState.getPosition();
            jsonWriter.name("Position");
            jsonWriter.beginArray();
            for (Double positionItem : position) {
                if (positionItem != null) {
                    jsonWriter.value(positionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inferredState.getAccuracy() != null) {
            PositionalAccuracy accuracy = inferredState.getAccuracy();
            jsonWriter.name("Accuracy");
            PositionalAccuracyJsonMarshaller.getInstance().marshall(accuracy, jsonWriter);
        }
        if (inferredState.getDeviationDistance() != null) {
            Double deviationDistance = inferredState.getDeviationDistance();
            jsonWriter.name("DeviationDistance");
            jsonWriter.value(deviationDistance);
        }
        if (inferredState.getProxyDetected() != null) {
            Boolean proxyDetected = inferredState.getProxyDetected();
            jsonWriter.name("ProxyDetected");
            jsonWriter.value(proxyDetected);
        }
        jsonWriter.endObject();
    }

    private static InferredStateJsonMarshaller instance;

    public static InferredStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InferredStateJsonMarshaller();
        return instance;
    }
}
