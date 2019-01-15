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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoScalingSettingsDescription
 */
class AutoScalingSettingsDescriptionJsonMarshaller {

    public void marshall(AutoScalingSettingsDescription autoScalingSettingsDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingSettingsDescription.getMinimumUnits() != null) {
            Long minimumUnits = autoScalingSettingsDescription.getMinimumUnits();
            jsonWriter.name("MinimumUnits");
            jsonWriter.value(minimumUnits);
        }
        if (autoScalingSettingsDescription.getMaximumUnits() != null) {
            Long maximumUnits = autoScalingSettingsDescription.getMaximumUnits();
            jsonWriter.name("MaximumUnits");
            jsonWriter.value(maximumUnits);
        }
        if (autoScalingSettingsDescription.getAutoScalingDisabled() != null) {
            Boolean autoScalingDisabled = autoScalingSettingsDescription.getAutoScalingDisabled();
            jsonWriter.name("AutoScalingDisabled");
            jsonWriter.value(autoScalingDisabled);
        }
        if (autoScalingSettingsDescription.getAutoScalingRoleArn() != null) {
            String autoScalingRoleArn = autoScalingSettingsDescription.getAutoScalingRoleArn();
            jsonWriter.name("AutoScalingRoleArn");
            jsonWriter.value(autoScalingRoleArn);
        }
        if (autoScalingSettingsDescription.getScalingPolicies() != null) {
            java.util.List<AutoScalingPolicyDescription> scalingPolicies = autoScalingSettingsDescription
                    .getScalingPolicies();
            jsonWriter.name("ScalingPolicies");
            jsonWriter.beginArray();
            for (AutoScalingPolicyDescription scalingPoliciesItem : scalingPolicies) {
                if (scalingPoliciesItem != null) {
                    AutoScalingPolicyDescriptionJsonMarshaller.getInstance().marshall(
                            scalingPoliciesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutoScalingSettingsDescriptionJsonMarshaller instance;

    public static AutoScalingSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingSettingsDescriptionJsonMarshaller();
        return instance;
    }
}
