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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CategoricalParameterRange
 */
class CategoricalParameterRangeJsonMarshaller {

    public void marshall(CategoricalParameterRange categoricalParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (categoricalParameterRange.getName() != null) {
            String name = categoricalParameterRange.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (categoricalParameterRange.getValues() != null) {
            java.util.List<String> values = categoricalParameterRange.getValues();
            jsonWriter.name("Values");
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

    private static CategoricalParameterRangeJsonMarshaller instance;

    public static CategoricalParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CategoricalParameterRangeJsonMarshaller();
        return instance;
    }
}
