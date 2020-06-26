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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DecimalParameter
 */
class DecimalParameterJsonMarshaller {

    public void marshall(DecimalParameter decimalParameter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (decimalParameter.getName() != null) {
            String name = decimalParameter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (decimalParameter.getValues() != null) {
            java.util.List<Double> values = decimalParameter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (Double valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DecimalParameterJsonMarshaller instance;

    public static DecimalParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DecimalParameterJsonMarshaller();
        return instance;
    }
}
