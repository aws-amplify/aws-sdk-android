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
 * JSON marshaller for POJO AutoScalingSettingsUpdate
 */
class AutoScalingSettingsUpdateJsonMarshaller {

    public void marshall(AutoScalingSettingsUpdate autoScalingSettingsUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingSettingsUpdate.getMinimumUnits() != null) {
            Long minimumUnits = autoScalingSettingsUpdate.getMinimumUnits();
            jsonWriter.name("MinimumUnits");
            jsonWriter.value(minimumUnits);
        }
        if (autoScalingSettingsUpdate.getMaximumUnits() != null) {
            Long maximumUnits = autoScalingSettingsUpdate.getMaximumUnits();
            jsonWriter.name("MaximumUnits");
            jsonWriter.value(maximumUnits);
        }
        if (autoScalingSettingsUpdate.getAutoScalingDisabled() != null) {
            Boolean autoScalingDisabled = autoScalingSettingsUpdate.getAutoScalingDisabled();
            jsonWriter.name("AutoScalingDisabled");
            jsonWriter.value(autoScalingDisabled);
        }
        if (autoScalingSettingsUpdate.getAutoScalingRoleArn() != null) {
            String autoScalingRoleArn = autoScalingSettingsUpdate.getAutoScalingRoleArn();
            jsonWriter.name("AutoScalingRoleArn");
            jsonWriter.value(autoScalingRoleArn);
        }
        if (autoScalingSettingsUpdate.getScalingPolicyUpdate() != null) {
            AutoScalingPolicyUpdate scalingPolicyUpdate = autoScalingSettingsUpdate
                    .getScalingPolicyUpdate();
            jsonWriter.name("ScalingPolicyUpdate");
            AutoScalingPolicyUpdateJsonMarshaller.getInstance().marshall(scalingPolicyUpdate,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingSettingsUpdateJsonMarshaller instance;

    public static AutoScalingSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingSettingsUpdateJsonMarshaller();
        return instance;
    }
}
