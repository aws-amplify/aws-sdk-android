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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeploymentSummary
 */
class DeploymentSummaryJsonMarshaller {

    public void marshall(DeploymentSummary deploymentSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentSummary.getDeploymentNumber() != null) {
            Integer deploymentNumber = deploymentSummary.getDeploymentNumber();
            jsonWriter.name("DeploymentNumber");
            jsonWriter.value(deploymentNumber);
        }
        if (deploymentSummary.getConfigurationName() != null) {
            String configurationName = deploymentSummary.getConfigurationName();
            jsonWriter.name("ConfigurationName");
            jsonWriter.value(configurationName);
        }
        if (deploymentSummary.getConfigurationVersion() != null) {
            String configurationVersion = deploymentSummary.getConfigurationVersion();
            jsonWriter.name("ConfigurationVersion");
            jsonWriter.value(configurationVersion);
        }
        if (deploymentSummary.getDeploymentDurationInMinutes() != null) {
            Integer deploymentDurationInMinutes = deploymentSummary
                    .getDeploymentDurationInMinutes();
            jsonWriter.name("DeploymentDurationInMinutes");
            jsonWriter.value(deploymentDurationInMinutes);
        }
        if (deploymentSummary.getGrowthType() != null) {
            String growthType = deploymentSummary.getGrowthType();
            jsonWriter.name("GrowthType");
            jsonWriter.value(growthType);
        }
        if (deploymentSummary.getGrowthFactor() != null) {
            Float growthFactor = deploymentSummary.getGrowthFactor();
            jsonWriter.name("GrowthFactor");
            jsonWriter.value(growthFactor);
        }
        if (deploymentSummary.getFinalBakeTimeInMinutes() != null) {
            Integer finalBakeTimeInMinutes = deploymentSummary.getFinalBakeTimeInMinutes();
            jsonWriter.name("FinalBakeTimeInMinutes");
            jsonWriter.value(finalBakeTimeInMinutes);
        }
        if (deploymentSummary.getState() != null) {
            String state = deploymentSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (deploymentSummary.getPercentageComplete() != null) {
            Float percentageComplete = deploymentSummary.getPercentageComplete();
            jsonWriter.name("PercentageComplete");
            jsonWriter.value(percentageComplete);
        }
        if (deploymentSummary.getStartedAt() != null) {
            java.util.Date startedAt = deploymentSummary.getStartedAt();
            jsonWriter.name("StartedAt");
            jsonWriter.value(startedAt);
        }
        if (deploymentSummary.getCompletedAt() != null) {
            java.util.Date completedAt = deploymentSummary.getCompletedAt();
            jsonWriter.name("CompletedAt");
            jsonWriter.value(completedAt);
        }
        jsonWriter.endObject();
    }

    private static DeploymentSummaryJsonMarshaller instance;

    public static DeploymentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentSummaryJsonMarshaller();
        return instance;
    }
}
