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
 * JSON marshaller for POJO DefaultIntegerHyperParameterRange
 */
class DefaultIntegerHyperParameterRangeJsonMarshaller {

    public void marshall(DefaultIntegerHyperParameterRange defaultIntegerHyperParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultIntegerHyperParameterRange.getName() != null) {
            String name = defaultIntegerHyperParameterRange.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (defaultIntegerHyperParameterRange.getMinValue() != null) {
            Integer minValue = defaultIntegerHyperParameterRange.getMinValue();
            jsonWriter.name("minValue");
            jsonWriter.value(minValue);
        }
        if (defaultIntegerHyperParameterRange.getMaxValue() != null) {
            Integer maxValue = defaultIntegerHyperParameterRange.getMaxValue();
            jsonWriter.name("maxValue");
            jsonWriter.value(maxValue);
        }
        if (defaultIntegerHyperParameterRange.getIsTunable() != null) {
            Boolean isTunable = defaultIntegerHyperParameterRange.getIsTunable();
            jsonWriter.name("isTunable");
            jsonWriter.value(isTunable);
        }
        jsonWriter.endObject();
    }

    private static DefaultIntegerHyperParameterRangeJsonMarshaller instance;

    public static DefaultIntegerHyperParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultIntegerHyperParameterRangeJsonMarshaller();
        return instance;
    }
}
