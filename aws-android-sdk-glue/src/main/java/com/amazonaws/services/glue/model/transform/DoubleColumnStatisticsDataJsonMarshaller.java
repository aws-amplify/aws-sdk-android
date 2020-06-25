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
 * JSON marshaller for POJO DoubleColumnStatisticsData
 */
class DoubleColumnStatisticsDataJsonMarshaller {

    public void marshall(DoubleColumnStatisticsData doubleColumnStatisticsData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (doubleColumnStatisticsData.getMinimumValue() != null) {
            Double minimumValue = doubleColumnStatisticsData.getMinimumValue();
            jsonWriter.name("MinimumValue");
            jsonWriter.value(minimumValue);
        }
        if (doubleColumnStatisticsData.getMaximumValue() != null) {
            Double maximumValue = doubleColumnStatisticsData.getMaximumValue();
            jsonWriter.name("MaximumValue");
            jsonWriter.value(maximumValue);
        }
        if (doubleColumnStatisticsData.getNumberOfNulls() != null) {
            Long numberOfNulls = doubleColumnStatisticsData.getNumberOfNulls();
            jsonWriter.name("NumberOfNulls");
            jsonWriter.value(numberOfNulls);
        }
        if (doubleColumnStatisticsData.getNumberOfDistinctValues() != null) {
            Long numberOfDistinctValues = doubleColumnStatisticsData.getNumberOfDistinctValues();
            jsonWriter.name("NumberOfDistinctValues");
            jsonWriter.value(numberOfDistinctValues);
        }
        jsonWriter.endObject();
    }

    private static DoubleColumnStatisticsDataJsonMarshaller instance;

    public static DoubleColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DoubleColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
