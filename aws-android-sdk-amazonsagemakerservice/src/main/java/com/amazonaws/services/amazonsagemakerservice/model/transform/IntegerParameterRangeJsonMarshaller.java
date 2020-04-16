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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IntegerParameterRange
 */
class IntegerParameterRangeJsonMarshaller {

    public void marshall(IntegerParameterRange integerParameterRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (integerParameterRange.getName() != null) {
            String name = integerParameterRange.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (integerParameterRange.getMinValue() != null) {
            String minValue = integerParameterRange.getMinValue();
            jsonWriter.name("MinValue");
            jsonWriter.value(minValue);
        }
        if (integerParameterRange.getMaxValue() != null) {
            String maxValue = integerParameterRange.getMaxValue();
            jsonWriter.name("MaxValue");
            jsonWriter.value(maxValue);
        }
        if (integerParameterRange.getScalingType() != null) {
            String scalingType = integerParameterRange.getScalingType();
            jsonWriter.name("ScalingType");
            jsonWriter.value(scalingType);
        }
        jsonWriter.endObject();
    }

    private static IntegerParameterRangeJsonMarshaller instance;

    public static IntegerParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegerParameterRangeJsonMarshaller();
        return instance;
    }
}
