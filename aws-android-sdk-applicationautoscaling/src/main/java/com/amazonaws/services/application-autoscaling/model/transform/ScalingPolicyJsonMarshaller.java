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
 * JSON marshaller for POJO ScalingPolicy
 */
class ScalingPolicyJsonMarshaller {

    public void marshall(ScalingPolicy scalingPolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalingPolicy.getPolicyARN() != null) {
            String policyARN = scalingPolicy.getPolicyARN();
            jsonWriter.name("PolicyARN");
            jsonWriter.value(policyARN);
        }
        if (scalingPolicy.getPolicyName() != null) {
            String policyName = scalingPolicy.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (scalingPolicy.getServiceNamespace() != null) {
            String serviceNamespace = scalingPolicy.getServiceNamespace();
            jsonWriter.name("ServiceNamespace");
            jsonWriter.value(serviceNamespace);
        }
        if (scalingPolicy.getResourceId() != null) {
            String resourceId = scalingPolicy.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (scalingPolicy.getScalableDimension() != null) {
            String scalableDimension = scalingPolicy.getScalableDimension();
            jsonWriter.name("ScalableDimension");
            jsonWriter.value(scalableDimension);
        }
        if (scalingPolicy.getPolicyType() != null) {
            String policyType = scalingPolicy.getPolicyType();
            jsonWriter.name("PolicyType");
            jsonWriter.value(policyType);
        }
        if (scalingPolicy.getStepScalingPolicyConfiguration() != null) {
            StepScalingPolicyConfiguration stepScalingPolicyConfiguration = scalingPolicy.getStepScalingPolicyConfiguration();
            jsonWriter.name("StepScalingPolicyConfiguration");
            StepScalingPolicyConfigurationJsonMarshaller.getInstance().marshall(stepScalingPolicyConfiguration, jsonWriter);
        }
        if (scalingPolicy.getTargetTrackingScalingPolicyConfiguration() != null) {
            TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration = scalingPolicy.getTargetTrackingScalingPolicyConfiguration();
            jsonWriter.name("TargetTrackingScalingPolicyConfiguration");
            TargetTrackingScalingPolicyConfigurationJsonMarshaller.getInstance().marshall(targetTrackingScalingPolicyConfiguration, jsonWriter);
        }
        if (scalingPolicy.getAlarms() != null) {
            java.util.List<Alarm> alarms = scalingPolicy.getAlarms();
            jsonWriter.name("Alarms");
            jsonWriter.beginArray();
            for (Alarm alarmsItem : alarms) {
                if (alarmsItem != null) {
            AlarmJsonMarshaller.getInstance().marshall(alarmsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (scalingPolicy.getCreationTime() != null) {
            java.util.Date creationTime = scalingPolicy.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static ScalingPolicyJsonMarshaller instance;
    public static ScalingPolicyJsonMarshaller getInstance() {
        if (instance == null) instance = new ScalingPolicyJsonMarshaller();
        return instance;
    }
}
