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

package com.amazonaws.services.applicationautoscaling.model.transform;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TargetTrackingScalingPolicyConfiguration
 */
class TargetTrackingScalingPolicyConfigurationJsonUnmarshaller implements
        Unmarshaller<TargetTrackingScalingPolicyConfiguration, JsonUnmarshallerContext> {

    public TargetTrackingScalingPolicyConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration = new TargetTrackingScalingPolicyConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TargetValue")) {
                targetTrackingScalingPolicyConfiguration.setTargetValue(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PredefinedMetricSpecification")) {
                targetTrackingScalingPolicyConfiguration
                        .setPredefinedMetricSpecification(PredefinedMetricSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CustomizedMetricSpecification")) {
                targetTrackingScalingPolicyConfiguration
                        .setCustomizedMetricSpecification(CustomizedMetricSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ScaleOutCooldown")) {
                targetTrackingScalingPolicyConfiguration
                        .setScaleOutCooldown(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ScaleInCooldown")) {
                targetTrackingScalingPolicyConfiguration.setScaleInCooldown(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisableScaleIn")) {
                targetTrackingScalingPolicyConfiguration.setDisableScaleIn(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return targetTrackingScalingPolicyConfiguration;
    }

    private static TargetTrackingScalingPolicyConfigurationJsonUnmarshaller instance;

    public static TargetTrackingScalingPolicyConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingScalingPolicyConfigurationJsonUnmarshaller();
        return instance;
    }
}
