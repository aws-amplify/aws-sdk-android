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
 * JSON marshaller for POJO TaskDefinition
 */
class TaskDefinitionJsonMarshaller {

    public void marshall(TaskDefinition taskDefinition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskDefinition.getTaskDefinitionArn() != null) {
            String taskDefinitionArn = taskDefinition.getTaskDefinitionArn();
            jsonWriter.name("taskDefinitionArn");
            jsonWriter.value(taskDefinitionArn);
        }
        if (taskDefinition.getContainerDefinitions() != null) {
            java.util.List<ContainerDefinition> containerDefinitions = taskDefinition
                    .getContainerDefinitions();
            jsonWriter.name("containerDefinitions");
            jsonWriter.beginArray();
            for (ContainerDefinition containerDefinitionsItem : containerDefinitions) {
                if (containerDefinitionsItem != null) {
                    ContainerDefinitionJsonMarshaller.getInstance().marshall(
                            containerDefinitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getFamily() != null) {
            String family = taskDefinition.getFamily();
            jsonWriter.name("family");
            jsonWriter.value(family);
        }
        if (taskDefinition.getTaskRoleArn() != null) {
            String taskRoleArn = taskDefinition.getTaskRoleArn();
            jsonWriter.name("taskRoleArn");
            jsonWriter.value(taskRoleArn);
        }
        if (taskDefinition.getExecutionRoleArn() != null) {
            String executionRoleArn = taskDefinition.getExecutionRoleArn();
            jsonWriter.name("executionRoleArn");
            jsonWriter.value(executionRoleArn);
        }
        if (taskDefinition.getNetworkMode() != null) {
            String networkMode = taskDefinition.getNetworkMode();
            jsonWriter.name("networkMode");
            jsonWriter.value(networkMode);
        }
        if (taskDefinition.getRevision() != null) {
            Integer revision = taskDefinition.getRevision();
            jsonWriter.name("revision");
            jsonWriter.value(revision);
        }
        if (taskDefinition.getVolumes() != null) {
            java.util.List<Volume> volumes = taskDefinition.getVolumes();
            jsonWriter.name("volumes");
            jsonWriter.beginArray();
            for (Volume volumesItem : volumes) {
                if (volumesItem != null) {
                    VolumeJsonMarshaller.getInstance().marshall(volumesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getStatus() != null) {
            String status = taskDefinition.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (taskDefinition.getRequiresAttributes() != null) {
            java.util.List<Attribute> requiresAttributes = taskDefinition.getRequiresAttributes();
            jsonWriter.name("requiresAttributes");
            jsonWriter.beginArray();
            for (Attribute requiresAttributesItem : requiresAttributes) {
                if (requiresAttributesItem != null) {
                    AttributeJsonMarshaller.getInstance().marshall(requiresAttributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getPlacementConstraints() != null) {
            java.util.List<TaskDefinitionPlacementConstraint> placementConstraints = taskDefinition
                    .getPlacementConstraints();
            jsonWriter.name("placementConstraints");
            jsonWriter.beginArray();
            for (TaskDefinitionPlacementConstraint placementConstraintsItem : placementConstraints) {
                if (placementConstraintsItem != null) {
                    TaskDefinitionPlacementConstraintJsonMarshaller.getInstance().marshall(
                            placementConstraintsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getCompatibilities() != null) {
            java.util.List<String> compatibilities = taskDefinition.getCompatibilities();
            jsonWriter.name("compatibilities");
            jsonWriter.beginArray();
            for (String compatibilitiesItem : compatibilities) {
                if (compatibilitiesItem != null) {
                    jsonWriter.value(compatibilitiesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getRequiresCompatibilities() != null) {
            java.util.List<String> requiresCompatibilities = taskDefinition
                    .getRequiresCompatibilities();
            jsonWriter.name("requiresCompatibilities");
            jsonWriter.beginArray();
            for (String requiresCompatibilitiesItem : requiresCompatibilities) {
                if (requiresCompatibilitiesItem != null) {
                    jsonWriter.value(requiresCompatibilitiesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getCpu() != null) {
            String cpu = taskDefinition.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (taskDefinition.getMemory() != null) {
            String memory = taskDefinition.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (taskDefinition.getInferenceAccelerators() != null) {
            java.util.List<InferenceAccelerator> inferenceAccelerators = taskDefinition
                    .getInferenceAccelerators();
            jsonWriter.name("inferenceAccelerators");
            jsonWriter.beginArray();
            for (InferenceAccelerator inferenceAcceleratorsItem : inferenceAccelerators) {
                if (inferenceAcceleratorsItem != null) {
                    InferenceAcceleratorJsonMarshaller.getInstance().marshall(
                            inferenceAcceleratorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskDefinition.getPidMode() != null) {
            String pidMode = taskDefinition.getPidMode();
            jsonWriter.name("pidMode");
            jsonWriter.value(pidMode);
        }
        if (taskDefinition.getIpcMode() != null) {
            String ipcMode = taskDefinition.getIpcMode();
            jsonWriter.name("ipcMode");
            jsonWriter.value(ipcMode);
        }
        if (taskDefinition.getProxyConfiguration() != null) {
            ProxyConfiguration proxyConfiguration = taskDefinition.getProxyConfiguration();
            jsonWriter.name("proxyConfiguration");
            ProxyConfigurationJsonMarshaller.getInstance().marshall(proxyConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TaskDefinitionJsonMarshaller instance;

    public static TaskDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskDefinitionJsonMarshaller();
        return instance;
    }
}
