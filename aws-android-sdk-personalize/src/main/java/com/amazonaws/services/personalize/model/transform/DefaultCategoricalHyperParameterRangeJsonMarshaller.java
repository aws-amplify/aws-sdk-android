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
 * JSON marshaller for POJO DefaultCategoricalHyperParameterRange
 */
class DefaultCategoricalHyperParameterRangeJsonMarshaller {

    public void marshall(
            DefaultCategoricalHyperParameterRange defaultCategoricalHyperParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultCategoricalHyperParameterRange.getName() != null) {
            String name = defaultCategoricalHyperParameterRange.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (defaultCategoricalHyperParameterRange.getValues() != null) {
            java.util.List<String> values = defaultCategoricalHyperParameterRange.getValues();
            jsonWriter.name("values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (defaultCategoricalHyperParameterRange.getIsTunable() != null) {
            Boolean isTunable = defaultCategoricalHyperParameterRange.getIsTunable();
            jsonWriter.name("isTunable");
            jsonWriter.value(isTunable);
        }
        jsonWriter.endObject();
    }

    private static DefaultCategoricalHyperParameterRangeJsonMarshaller instance;

    public static DefaultCategoricalHyperParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultCategoricalHyperParameterRangeJsonMarshaller();
        return instance;
    }
}
