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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Metric
 */
class MetricJsonMarshaller {

    public void marshall(Metric metric, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metric.getExpression() != null) {
            String expression = metric.getExpression();
            jsonWriter.name("expression");
            jsonWriter.value(expression);
        }
        if (metric.getVariables() != null) {
            java.util.List<ExpressionVariable> variables = metric.getVariables();
            jsonWriter.name("variables");
            jsonWriter.beginArray();
            for (ExpressionVariable variablesItem : variables) {
                if (variablesItem != null) {
                    ExpressionVariableJsonMarshaller.getInstance().marshall(variablesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (metric.getWindow() != null) {
            MetricWindow window = metric.getWindow();
            jsonWriter.name("window");
            MetricWindowJsonMarshaller.getInstance().marshall(window, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MetricJsonMarshaller instance;

    public static MetricJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricJsonMarshaller();
        return instance;
    }
}
