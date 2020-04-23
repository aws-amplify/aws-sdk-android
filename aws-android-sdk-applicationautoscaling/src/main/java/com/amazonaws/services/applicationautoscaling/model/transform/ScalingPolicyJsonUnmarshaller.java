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
 * JSON unmarshaller for POJO ScalingPolicy
 */
class ScalingPolicyJsonUnmarshaller implements Unmarshaller<ScalingPolicy, JsonUnmarshallerContext> {

    public ScalingPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScalingPolicy scalingPolicy = new ScalingPolicy();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PolicyARN")) {
                scalingPolicy.setPolicyARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyName")) {
                scalingPolicy.setPolicyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceNamespace")) {
                scalingPolicy.setServiceNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                scalingPolicy.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScalableDimension")) {
                scalingPolicy.setScalableDimension(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyType")) {
                scalingPolicy.setPolicyType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StepScalingPolicyConfiguration")) {
                scalingPolicy
                        .setStepScalingPolicyConfiguration(StepScalingPolicyConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TargetTrackingScalingPolicyConfiguration")) {
                scalingPolicy
                        .setTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Alarms")) {
                scalingPolicy.setAlarms(new ListUnmarshaller<Alarm>(AlarmJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                scalingPolicy.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scalingPolicy;
    }

    private static ScalingPolicyJsonUnmarshaller instance;

    public static ScalingPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyJsonUnmarshaller();
        return instance;
    }
}
