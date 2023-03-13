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
 * JSON marshaller for POJO MetricV2
 */
class MetricV2JsonMarshaller {

    public void marshall(MetricV2 metricV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricV2.getName() != null) {
            String name = metricV2.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (metricV2.getThreshold() != null) {
            java.util.List<ThresholdV2> threshold = metricV2.getThreshold();
            jsonWriter.name("Threshold");
            jsonWriter.beginArray();
            for (ThresholdV2 thresholdItem : threshold) {
                if (thresholdItem != null) {
                    ThresholdV2JsonMarshaller.getInstance().marshall(thresholdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (metricV2.getMetricFilters() != null) {
            java.util.List<MetricFilterV2> metricFilters = metricV2.getMetricFilters();
            jsonWriter.name("MetricFilters");
            jsonWriter.beginArray();
            for (MetricFilterV2 metricFiltersItem : metricFilters) {
                if (metricFiltersItem != null) {
                    MetricFilterV2JsonMarshaller.getInstance().marshall(metricFiltersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MetricV2JsonMarshaller instance;

    public static MetricV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricV2JsonMarshaller();
        return instance;
    }
}
