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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindMatchesMetrics
 */
class FindMatchesMetricsJsonMarshaller {

    public void marshall(FindMatchesMetrics findMatchesMetrics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (findMatchesMetrics.getAreaUnderPRCurve() != null) {
            Double areaUnderPRCurve = findMatchesMetrics.getAreaUnderPRCurve();
            jsonWriter.name("AreaUnderPRCurve");
            jsonWriter.value(areaUnderPRCurve);
        }
        if (findMatchesMetrics.getPrecision() != null) {
            Double precision = findMatchesMetrics.getPrecision();
            jsonWriter.name("Precision");
            jsonWriter.value(precision);
        }
        if (findMatchesMetrics.getRecall() != null) {
            Double recall = findMatchesMetrics.getRecall();
            jsonWriter.name("Recall");
            jsonWriter.value(recall);
        }
        if (findMatchesMetrics.getF1() != null) {
            Double f1 = findMatchesMetrics.getF1();
            jsonWriter.name("F1");
            jsonWriter.value(f1);
        }
        if (findMatchesMetrics.getConfusionMatrix() != null) {
            ConfusionMatrix confusionMatrix = findMatchesMetrics.getConfusionMatrix();
            jsonWriter.name("ConfusionMatrix");
            ConfusionMatrixJsonMarshaller.getInstance().marshall(confusionMatrix, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FindMatchesMetricsJsonMarshaller instance;

    public static FindMatchesMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindMatchesMetricsJsonMarshaller();
        return instance;
    }
}
