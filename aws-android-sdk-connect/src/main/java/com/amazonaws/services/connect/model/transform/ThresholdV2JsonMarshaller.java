/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThresholdV2
 */
class ThresholdV2JsonMarshaller {

    public void marshall(ThresholdV2 thresholdV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (thresholdV2.getComparison() != null) {
            String comparison = thresholdV2.getComparison();
            jsonWriter.name("Comparison");
            jsonWriter.value(comparison);
        }
        if (thresholdV2.getThresholdValue() != null) {
            Double thresholdValue = thresholdV2.getThresholdValue();
            jsonWriter.name("ThresholdValue");
            jsonWriter.value(thresholdValue);
        }
        jsonWriter.endObject();
    }

    private static ThresholdV2JsonMarshaller instance;

    public static ThresholdV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThresholdV2JsonMarshaller();
        return instance;
    }
}
