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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Behavior
 */
class BehaviorJsonMarshaller {

    public void marshall(Behavior behavior, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (behavior.getName() != null) {
            String name = behavior.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (behavior.getMetric() != null) {
            String metric = behavior.getMetric();
            jsonWriter.name("metric");
            jsonWriter.value(metric);
        }
        if (behavior.getMetricDimension() != null) {
            MetricDimension metricDimension = behavior.getMetricDimension();
            jsonWriter.name("metricDimension");
            MetricDimensionJsonMarshaller.getInstance().marshall(metricDimension, jsonWriter);
        }
        if (behavior.getCriteria() != null) {
            BehaviorCriteria criteria = behavior.getCriteria();
            jsonWriter.name("criteria");
            BehaviorCriteriaJsonMarshaller.getInstance().marshall(criteria, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BehaviorJsonMarshaller instance;

    public static BehaviorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BehaviorJsonMarshaller();
        return instance;
    }
}
