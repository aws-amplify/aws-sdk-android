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
 * JSON marshaller for POJO DeploymentStrategy
 */
class DeploymentStrategyJsonMarshaller {

    public void marshall(DeploymentStrategy deploymentStrategy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentStrategy.getId() != null) {
            String id = deploymentStrategy.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (deploymentStrategy.getName() != null) {
            String name = deploymentStrategy.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (deploymentStrategy.getDescription() != null) {
            String description = deploymentStrategy.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (deploymentStrategy.getDeploymentDurationInMinutes() != null) {
            Integer deploymentDurationInMinutes = deploymentStrategy
                    .getDeploymentDurationInMinutes();
            jsonWriter.name("DeploymentDurationInMinutes");
            jsonWriter.value(deploymentDurationInMinutes);
        }
        if (deploymentStrategy.getGrowthType() != null) {
            String growthType = deploymentStrategy.getGrowthType();
            jsonWriter.name("GrowthType");
            jsonWriter.value(growthType);
        }
        if (deploymentStrategy.getGrowthFactor() != null) {
            Float growthFactor = deploymentStrategy.getGrowthFactor();
            jsonWriter.name("GrowthFactor");
            jsonWriter.value(growthFactor);
        }
        if (deploymentStrategy.getFinalBakeTimeInMinutes() != null) {
            Integer finalBakeTimeInMinutes = deploymentStrategy.getFinalBakeTimeInMinutes();
            jsonWriter.name("FinalBakeTimeInMinutes");
            jsonWriter.value(finalBakeTimeInMinutes);
        }
        if (deploymentStrategy.getReplicateTo() != null) {
            String replicateTo = deploymentStrategy.getReplicateTo();
            jsonWriter.name("ReplicateTo");
            jsonWriter.value(replicateTo);
        }
        jsonWriter.endObject();
    }

    private static DeploymentStrategyJsonMarshaller instance;

    public static DeploymentStrategyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentStrategyJsonMarshaller();
        return instance;
    }
}
