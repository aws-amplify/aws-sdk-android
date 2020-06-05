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
 * JSON marshaller for POJO ContinuousHyperParameterRange
 */
class ContinuousHyperParameterRangeJsonMarshaller {

    public void marshall(ContinuousHyperParameterRange continuousHyperParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (continuousHyperParameterRange.getName() != null) {
            String name = continuousHyperParameterRange.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (continuousHyperParameterRange.getMinValue() != null) {
            Double minValue = continuousHyperParameterRange.getMinValue();
            jsonWriter.name("minValue");
            jsonWriter.value(minValue);
        }
        if (continuousHyperParameterRange.getMaxValue() != null) {
            Double maxValue = continuousHyperParameterRange.getMaxValue();
            jsonWriter.name("maxValue");
            jsonWriter.value(maxValue);
        }
        jsonWriter.endObject();
    }

    private static ContinuousHyperParameterRangeJsonMarshaller instance;

    public static ContinuousHyperParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContinuousHyperParameterRangeJsonMarshaller();
        return instance;
    }
}
