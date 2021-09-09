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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AggregationType
 */
class AggregationTypeJsonMarshaller {

    public void marshall(AggregationType aggregationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aggregationType.getName() != null) {
            String name = aggregationType.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (aggregationType.getValues() != null) {
            java.util.List<String> values = aggregationType.getValues();
            jsonWriter.name("values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AggregationTypeJsonMarshaller instance;

    public static AggregationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AggregationTypeJsonMarshaller();
        return instance;
    }
}
