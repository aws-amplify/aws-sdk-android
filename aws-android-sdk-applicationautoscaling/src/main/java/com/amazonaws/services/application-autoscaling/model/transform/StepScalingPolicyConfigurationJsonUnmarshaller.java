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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO StepScalingPolicyConfiguration
 */
class StepScalingPolicyConfigurationJsonUnmarshaller implements Unmarshaller<StepScalingPolicyConfiguration, JsonUnmarshallerContext> {

    public StepScalingPolicyConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StepScalingPolicyConfiguration stepScalingPolicyConfiguration = new StepScalingPolicyConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdjustmentType")) {
                stepScalingPolicyConfiguration.setAdjustmentType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StepAdjustments")) {
                stepScalingPolicyConfiguration.setStepAdjustments(new ListUnmarshaller<StepAdjustment>(StepAdjustmentJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("MinAdjustmentMagnitude")) {
                stepScalingPolicyConfiguration.setMinAdjustmentMagnitude(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Cooldown")) {
                stepScalingPolicyConfiguration.setCooldown(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MetricAggregationType")) {
                stepScalingPolicyConfiguration.setMetricAggregationType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stepScalingPolicyConfiguration;
    }

    private static StepScalingPolicyConfigurationJsonUnmarshaller instance;
    public static StepScalingPolicyConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new StepScalingPolicyConfigurationJsonUnmarshaller();
        return instance;
    }
}
