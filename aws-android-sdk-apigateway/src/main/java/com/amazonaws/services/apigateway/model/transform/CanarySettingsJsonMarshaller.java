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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanarySettings
 */
class CanarySettingsJsonMarshaller {

    public void marshall(CanarySettings canarySettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canarySettings.getPercentTraffic() != null) {
            Double percentTraffic = canarySettings.getPercentTraffic();
            jsonWriter.name("percentTraffic");
            jsonWriter.value(percentTraffic);
        }
        if (canarySettings.getDeploymentId() != null) {
            String deploymentId = canarySettings.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (canarySettings.getStageVariableOverrides() != null) {
            java.util.Map<String, String> stageVariableOverrides = canarySettings
                    .getStageVariableOverrides();
            jsonWriter.name("stageVariableOverrides");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> stageVariableOverridesEntry : stageVariableOverrides
                    .entrySet()) {
                String stageVariableOverridesValue = stageVariableOverridesEntry.getValue();
                if (stageVariableOverridesValue != null) {
                    jsonWriter.name(stageVariableOverridesEntry.getKey());
                    jsonWriter.value(stageVariableOverridesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (canarySettings.getUseStageCache() != null) {
            Boolean useStageCache = canarySettings.getUseStageCache();
            jsonWriter.name("useStageCache");
            jsonWriter.value(useStageCache);
        }
        jsonWriter.endObject();
    }

    private static CanarySettingsJsonMarshaller instance;

    public static CanarySettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanarySettingsJsonMarshaller();
        return instance;
    }
}
