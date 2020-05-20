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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StepAdjustment
 */
class StepAdjustmentJsonMarshaller {

    public void marshall(StepAdjustment stepAdjustment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepAdjustment.getMetricIntervalLowerBound() != null) {
            Double metricIntervalLowerBound = stepAdjustment.getMetricIntervalLowerBound();
            jsonWriter.name("MetricIntervalLowerBound");
            jsonWriter.value(metricIntervalLowerBound);
        }
        if (stepAdjustment.getMetricIntervalUpperBound() != null) {
            Double metricIntervalUpperBound = stepAdjustment.getMetricIntervalUpperBound();
            jsonWriter.name("MetricIntervalUpperBound");
            jsonWriter.value(metricIntervalUpperBound);
        }
        if (stepAdjustment.getScalingAdjustment() != null) {
            Integer scalingAdjustment = stepAdjustment.getScalingAdjustment();
            jsonWriter.name("ScalingAdjustment");
            jsonWriter.value(scalingAdjustment);
        }
        jsonWriter.endObject();
    }

    private static StepAdjustmentJsonMarshaller instance;
    public static StepAdjustmentJsonMarshaller getInstance() {
        if (instance == null) instance = new StepAdjustmentJsonMarshaller();
        return instance;
    }
}
