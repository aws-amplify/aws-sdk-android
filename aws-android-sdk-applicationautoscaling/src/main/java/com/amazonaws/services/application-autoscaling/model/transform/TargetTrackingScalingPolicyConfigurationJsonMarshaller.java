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
 * JSON marshaller for POJO TargetTrackingScalingPolicyConfiguration
 */
class TargetTrackingScalingPolicyConfigurationJsonMarshaller {

    public void marshall(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetTrackingScalingPolicyConfiguration.getTargetValue() != null) {
            Double targetValue = targetTrackingScalingPolicyConfiguration.getTargetValue();
            jsonWriter.name("TargetValue");
            jsonWriter.value(targetValue);
        }
        if (targetTrackingScalingPolicyConfiguration.getPredefinedMetricSpecification() != null) {
            PredefinedMetricSpecification predefinedMetricSpecification = targetTrackingScalingPolicyConfiguration.getPredefinedMetricSpecification();
            jsonWriter.name("PredefinedMetricSpecification");
            PredefinedMetricSpecificationJsonMarshaller.getInstance().marshall(predefinedMetricSpecification, jsonWriter);
        }
        if (targetTrackingScalingPolicyConfiguration.getCustomizedMetricSpecification() != null) {
            CustomizedMetricSpecification customizedMetricSpecification = targetTrackingScalingPolicyConfiguration.getCustomizedMetricSpecification();
            jsonWriter.name("CustomizedMetricSpecification");
            CustomizedMetricSpecificationJsonMarshaller.getInstance().marshall(customizedMetricSpecification, jsonWriter);
        }
        if (targetTrackingScalingPolicyConfiguration.getScaleOutCooldown() != null) {
            Integer scaleOutCooldown = targetTrackingScalingPolicyConfiguration.getScaleOutCooldown();
            jsonWriter.name("ScaleOutCooldown");
            jsonWriter.value(scaleOutCooldown);
        }
        if (targetTrackingScalingPolicyConfiguration.getScaleInCooldown() != null) {
            Integer scaleInCooldown = targetTrackingScalingPolicyConfiguration.getScaleInCooldown();
            jsonWriter.name("ScaleInCooldown");
            jsonWriter.value(scaleInCooldown);
        }
        if (targetTrackingScalingPolicyConfiguration.getDisableScaleIn() != null) {
            Boolean disableScaleIn = targetTrackingScalingPolicyConfiguration.getDisableScaleIn();
            jsonWriter.name("DisableScaleIn");
            jsonWriter.value(disableScaleIn);
        }
        jsonWriter.endObject();
    }

    private static TargetTrackingScalingPolicyConfigurationJsonMarshaller instance;
    public static TargetTrackingScalingPolicyConfigurationJsonMarshaller getInstance() {
        if (instance == null) instance = new TargetTrackingScalingPolicyConfigurationJsonMarshaller();
        return instance;
    }
}
