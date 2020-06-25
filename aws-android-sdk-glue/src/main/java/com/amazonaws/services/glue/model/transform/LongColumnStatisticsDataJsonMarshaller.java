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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LongColumnStatisticsData
 */
class LongColumnStatisticsDataJsonMarshaller {

    public void marshall(LongColumnStatisticsData longColumnStatisticsData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (longColumnStatisticsData.getMinimumValue() != null) {
            Long minimumValue = longColumnStatisticsData.getMinimumValue();
            jsonWriter.name("MinimumValue");
            jsonWriter.value(minimumValue);
        }
        if (longColumnStatisticsData.getMaximumValue() != null) {
            Long maximumValue = longColumnStatisticsData.getMaximumValue();
            jsonWriter.name("MaximumValue");
            jsonWriter.value(maximumValue);
        }
        if (longColumnStatisticsData.getNumberOfNulls() != null) {
            Long numberOfNulls = longColumnStatisticsData.getNumberOfNulls();
            jsonWriter.name("NumberOfNulls");
            jsonWriter.value(numberOfNulls);
        }
        if (longColumnStatisticsData.getNumberOfDistinctValues() != null) {
            Long numberOfDistinctValues = longColumnStatisticsData.getNumberOfDistinctValues();
            jsonWriter.name("NumberOfDistinctValues");
            jsonWriter.value(numberOfDistinctValues);
        }
        jsonWriter.endObject();
    }

    private static LongColumnStatisticsDataJsonMarshaller instance;

    public static LongColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LongColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
