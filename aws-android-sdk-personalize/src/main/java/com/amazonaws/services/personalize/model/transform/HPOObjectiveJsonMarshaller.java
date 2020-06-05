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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HPOObjective
 */
class HPOObjectiveJsonMarshaller {

    public void marshall(HPOObjective hPOObjective, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hPOObjective.getType() != null) {
            String type = hPOObjective.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (hPOObjective.getMetricName() != null) {
            String metricName = hPOObjective.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (hPOObjective.getMetricRegex() != null) {
            String metricRegex = hPOObjective.getMetricRegex();
            jsonWriter.name("metricRegex");
            jsonWriter.value(metricRegex);
        }
        jsonWriter.endObject();
    }

    private static HPOObjectiveJsonMarshaller instance;

    public static HPOObjectiveJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HPOObjectiveJsonMarshaller();
        return instance;
    }
}
