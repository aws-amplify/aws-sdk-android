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
 * JSON marshaller for POJO ContinuousParameterRange
 */
class ContinuousParameterRangeJsonMarshaller {

    public void marshall(ContinuousParameterRange continuousParameterRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (continuousParameterRange.getName() != null) {
            String name = continuousParameterRange.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (continuousParameterRange.getMinValue() != null) {
            String minValue = continuousParameterRange.getMinValue();
            jsonWriter.name("MinValue");
            jsonWriter.value(minValue);
        }
        if (continuousParameterRange.getMaxValue() != null) {
            String maxValue = continuousParameterRange.getMaxValue();
            jsonWriter.name("MaxValue");
            jsonWriter.value(maxValue);
        }
        if (continuousParameterRange.getScalingType() != null) {
            String scalingType = continuousParameterRange.getScalingType();
            jsonWriter.name("ScalingType");
            jsonWriter.value(scalingType);
        }
        jsonWriter.endObject();
    }

    private static ContinuousParameterRangeJsonMarshaller instance;

    public static ContinuousParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContinuousParameterRangeJsonMarshaller();
        return instance;
    }
}
