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
 * JSON marshaller for POJO IntegerHyperParameterRange
 */
class IntegerHyperParameterRangeJsonMarshaller {

    public void marshall(IntegerHyperParameterRange integerHyperParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (integerHyperParameterRange.getName() != null) {
            String name = integerHyperParameterRange.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (integerHyperParameterRange.getMinValue() != null) {
            Integer minValue = integerHyperParameterRange.getMinValue();
            jsonWriter.name("minValue");
            jsonWriter.value(minValue);
        }
        if (integerHyperParameterRange.getMaxValue() != null) {
            Integer maxValue = integerHyperParameterRange.getMaxValue();
            jsonWriter.name("maxValue");
            jsonWriter.value(maxValue);
        }
        jsonWriter.endObject();
    }

    private static IntegerHyperParameterRangeJsonMarshaller instance;

    public static IntegerHyperParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegerHyperParameterRangeJsonMarshaller();
        return instance;
    }
}
