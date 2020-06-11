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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Deployment
 */
class DeploymentJsonMarshaller {

    public void marshall(Deployment deployment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deployment.getId() != null) {
            String id = deployment.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (deployment.getStatus() != null) {
            String status = deployment.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (deployment.getTaskDefinition() != null) {
            String taskDefinition = deployment.getTaskDefinition();
            jsonWriter.name("taskDefinition");
            jsonWriter.value(taskDefinition);
        }
        if (deployment.getDesiredCount() != null) {
            Integer desiredCount = deployment.getDesiredCount();
            jsonWriter.name("desiredCount");
            jsonWriter.value(desiredCount);
        }
        if (deployment.getPendingCount() != null) {
            Integer pendingCount = deployment.getPendingCount();
            jsonWriter.name("pendingCount");
            jsonWriter.value(pendingCount);
        }
        if (deployment.getRunningCount() != null) {
            Integer runningCount = deployment.getRunningCount();
            jsonWriter.name("runningCount");
            jsonWriter.value(runningCount);
        }
        if (deployment.getCreatedAt() != null) {
            java.util.Date createdAt = deployment.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (deployment.getUpdatedAt() != null) {
            java.util.Date updatedAt = deployment.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        if (deployment.getCapacityProviderStrategy() != null) {
            java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = deployment
                    .getCapacityProviderStrategy();
            jsonWriter.name("capacityProviderStrategy");
            jsonWriter.beginArray();
            for (CapacityProviderStrategyItem capacityProviderStrategyItem : capacityProviderStrategy) {
                if (capacityProviderStrategyItem != null) {
                    CapacityProviderStrategyItemJsonMarshaller.getInstance().marshall(
                            capacityProviderStrategyItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deployment.getLaunchType() != null) {
            String launchType = deployment.getLaunchType();
            jsonWriter.name("launchType");
            jsonWriter.value(launchType);
        }
        if (deployment.getPlatformVersion() != null) {
            String platformVersion = deployment.getPlatformVersion();
            jsonWriter.name("platformVersion");
            jsonWriter.value(platformVersion);
        }
        if (deployment.getNetworkConfiguration() != null) {
            NetworkConfiguration networkConfiguration = deployment.getNetworkConfiguration();
            jsonWriter.name("networkConfiguration");
            NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }
}
