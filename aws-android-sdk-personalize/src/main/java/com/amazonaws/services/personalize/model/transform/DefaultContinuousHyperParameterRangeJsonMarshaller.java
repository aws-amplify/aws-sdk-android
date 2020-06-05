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
 * JSON marshaller for POJO DefaultContinuousHyperParameterRange
 */
class DefaultContinuousHyperParameterRangeJsonMarshaller {

    public void marshall(DefaultContinuousHyperParameterRange defaultContinuousHyperParameterRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultContinuousHyperParameterRange.getName() != null) {
            String name = defaultContinuousHyperParameterRange.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (defaultContinuousHyperParameterRange.getMinValue() != null) {
            Double minValue = defaultContinuousHyperParameterRange.getMinValue();
            jsonWriter.name("minValue");
            jsonWriter.value(minValue);
        }
        if (defaultContinuousHyperParameterRange.getMaxValue() != null) {
            Double maxValue = defaultContinuousHyperParameterRange.getMaxValue();
            jsonWriter.name("maxValue");
            jsonWriter.value(maxValue);
        }
        if (defaultContinuousHyperParameterRange.getIsTunable() != null) {
            Boolean isTunable = defaultContinuousHyperParameterRange.getIsTunable();
            jsonWriter.name("isTunable");
            jsonWriter.value(isTunable);
        }
        jsonWriter.endObject();
    }

    private static DefaultContinuousHyperParameterRangeJsonMarshaller instance;

    public static DefaultContinuousHyperParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultContinuousHyperParameterRangeJsonMarshaller();
        return instance;
    }
}
