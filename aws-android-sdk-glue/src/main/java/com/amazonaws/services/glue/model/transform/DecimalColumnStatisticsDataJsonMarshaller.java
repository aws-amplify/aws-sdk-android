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
 * JSON marshaller for POJO DecimalColumnStatisticsData
 */
class DecimalColumnStatisticsDataJsonMarshaller {

    public void marshall(DecimalColumnStatisticsData decimalColumnStatisticsData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (decimalColumnStatisticsData.getMinimumValue() != null) {
            DecimalNumber minimumValue = decimalColumnStatisticsData.getMinimumValue();
            jsonWriter.name("MinimumValue");
            DecimalNumberJsonMarshaller.getInstance().marshall(minimumValue, jsonWriter);
        }
        if (decimalColumnStatisticsData.getMaximumValue() != null) {
            DecimalNumber maximumValue = decimalColumnStatisticsData.getMaximumValue();
            jsonWriter.name("MaximumValue");
            DecimalNumberJsonMarshaller.getInstance().marshall(maximumValue, jsonWriter);
        }
        if (decimalColumnStatisticsData.getNumberOfNulls() != null) {
            Long numberOfNulls = decimalColumnStatisticsData.getNumberOfNulls();
            jsonWriter.name("NumberOfNulls");
            jsonWriter.value(numberOfNulls);
        }
        if (decimalColumnStatisticsData.getNumberOfDistinctValues() != null) {
            Long numberOfDistinctValues = decimalColumnStatisticsData.getNumberOfDistinctValues();
            jsonWriter.name("NumberOfDistinctValues");
            jsonWriter.value(numberOfDistinctValues);
        }
        jsonWriter.endObject();
    }

    private static DecimalColumnStatisticsDataJsonMarshaller instance;

    public static DecimalColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DecimalColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
