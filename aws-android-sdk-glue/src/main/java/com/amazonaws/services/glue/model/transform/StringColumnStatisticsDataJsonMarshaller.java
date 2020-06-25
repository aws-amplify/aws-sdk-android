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
 * JSON marshaller for POJO StringColumnStatisticsData
 */
class StringColumnStatisticsDataJsonMarshaller {

    public void marshall(StringColumnStatisticsData stringColumnStatisticsData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stringColumnStatisticsData.getMaximumLength() != null) {
            Long maximumLength = stringColumnStatisticsData.getMaximumLength();
            jsonWriter.name("MaximumLength");
            jsonWriter.value(maximumLength);
        }
        if (stringColumnStatisticsData.getAverageLength() != null) {
            Double averageLength = stringColumnStatisticsData.getAverageLength();
            jsonWriter.name("AverageLength");
            jsonWriter.value(averageLength);
        }
        if (stringColumnStatisticsData.getNumberOfNulls() != null) {
            Long numberOfNulls = stringColumnStatisticsData.getNumberOfNulls();
            jsonWriter.name("NumberOfNulls");
            jsonWriter.value(numberOfNulls);
        }
        if (stringColumnStatisticsData.getNumberOfDistinctValues() != null) {
            Long numberOfDistinctValues = stringColumnStatisticsData.getNumberOfDistinctValues();
            jsonWriter.name("NumberOfDistinctValues");
            jsonWriter.value(numberOfDistinctValues);
        }
        jsonWriter.endObject();
    }

    private static StringColumnStatisticsDataJsonMarshaller instance;

    public static StringColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StringColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
