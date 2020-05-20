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
 * JSON marshaller for POJO StepScalingPolicyConfiguration
 */
class StepScalingPolicyConfigurationJsonMarshaller {

    public void marshall(StepScalingPolicyConfiguration stepScalingPolicyConfiguration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepScalingPolicyConfiguration.getAdjustmentType() != null) {
            String adjustmentType = stepScalingPolicyConfiguration.getAdjustmentType();
            jsonWriter.name("AdjustmentType");
            jsonWriter.value(adjustmentType);
        }
        if (stepScalingPolicyConfiguration.getStepAdjustments() != null) {
            java.util.List<StepAdjustment> stepAdjustments = stepScalingPolicyConfiguration.getStepAdjustments();
            jsonWriter.name("StepAdjustments");
            jsonWriter.beginArray();
            for (StepAdjustment stepAdjustmentsItem : stepAdjustments) {
                if (stepAdjustmentsItem != null) {
            StepAdjustmentJsonMarshaller.getInstance().marshall(stepAdjustmentsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (stepScalingPolicyConfiguration.getMinAdjustmentMagnitude() != null) {
            Integer minAdjustmentMagnitude = stepScalingPolicyConfiguration.getMinAdjustmentMagnitude();
            jsonWriter.name("MinAdjustmentMagnitude");
            jsonWriter.value(minAdjustmentMagnitude);
        }
        if (stepScalingPolicyConfiguration.getCooldown() != null) {
            Integer cooldown = stepScalingPolicyConfiguration.getCooldown();
            jsonWriter.name("Cooldown");
            jsonWriter.value(cooldown);
        }
        if (stepScalingPolicyConfiguration.getMetricAggregationType() != null) {
            String metricAggregationType = stepScalingPolicyConfiguration.getMetricAggregationType();
            jsonWriter.name("MetricAggregationType");
            jsonWriter.value(metricAggregationType);
        }
        jsonWriter.endObject();
    }

    private static StepScalingPolicyConfigurationJsonMarshaller instance;
    public static StepScalingPolicyConfigurationJsonMarshaller getInstance() {
        if (instance == null) instance = new StepScalingPolicyConfigurationJsonMarshaller();
        return instance;
    }
}
