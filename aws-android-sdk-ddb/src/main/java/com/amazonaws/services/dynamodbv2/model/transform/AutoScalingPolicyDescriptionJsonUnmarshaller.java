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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutoScalingPolicyDescription
 */
class AutoScalingPolicyDescriptionJsonUnmarshaller implements
        Unmarshaller<AutoScalingPolicyDescription, JsonUnmarshallerContext> {

    public AutoScalingPolicyDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoScalingPolicyDescription autoScalingPolicyDescription = new AutoScalingPolicyDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PolicyName")) {
                autoScalingPolicyDescription.setPolicyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetTrackingScalingPolicyConfiguration")) {
                autoScalingPolicyDescription
                        .setTargetTrackingScalingPolicyConfiguration(AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoScalingPolicyDescription;
    }

    private static AutoScalingPolicyDescriptionJsonUnmarshaller instance;

    public static AutoScalingPolicyDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyDescriptionJsonUnmarshaller();
        return instance;
    }
}
