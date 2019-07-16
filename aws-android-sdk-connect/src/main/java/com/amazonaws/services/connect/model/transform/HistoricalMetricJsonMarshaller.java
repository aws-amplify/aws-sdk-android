/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HistoricalMetric
 */
class HistoricalMetricJsonMarshaller {

    public void marshall(HistoricalMetric historicalMetric, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (historicalMetric.getName() != null) {
            String name = historicalMetric.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (historicalMetric.getThreshold() != null) {
            Threshold threshold = historicalMetric.getThreshold();
            jsonWriter.name("Threshold");
            ThresholdJsonMarshaller.getInstance().marshall(threshold, jsonWriter);
        }
        if (historicalMetric.getStatistic() != null) {
            String statistic = historicalMetric.getStatistic();
            jsonWriter.name("Statistic");
            jsonWriter.value(statistic);
        }
        if (historicalMetric.getUnit() != null) {
            String unit = historicalMetric.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static HistoricalMetricJsonMarshaller instance;

    public static HistoricalMetricJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HistoricalMetricJsonMarshaller();
        return instance;
    }
}
