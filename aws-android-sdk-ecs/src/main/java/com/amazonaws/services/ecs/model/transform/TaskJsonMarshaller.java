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
 * JSON marshaller for POJO Task
 */
class TaskJsonMarshaller {

    public void marshall(Task task, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (task.getAttachments() != null) {
            java.util.List<Attachment> attachments = task.getAttachments();
            jsonWriter.name("attachments");
            jsonWriter.beginArray();
            for (Attachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    AttachmentJsonMarshaller.getInstance().marshall(attachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (task.getAttributes() != null) {
            java.util.List<Attribute> attributes = task.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginArray();
            for (Attribute attributesItem : attributes) {
                if (attributesItem != null) {
                    AttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (task.getAvailabilityZone() != null) {
            String availabilityZone = task.getAvailabilityZone();
            jsonWriter.name("availabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (task.getCapacityProviderName() != null) {
            String capacityProviderName = task.getCapacityProviderName();
            jsonWriter.name("capacityProviderName");
            jsonWriter.value(capacityProviderName);
        }
        if (task.getClusterArn() != null) {
            String clusterArn = task.getClusterArn();
            jsonWriter.name("clusterArn");
            jsonWriter.value(clusterArn);
        }
        if (task.getConnectivity() != null) {
            String connectivity = task.getConnectivity();
            jsonWriter.name("connectivity");
            jsonWriter.value(connectivity);
        }
        if (task.getConnectivityAt() != null) {
            java.util.Date connectivityAt = task.getConnectivityAt();
            jsonWriter.name("connectivityAt");
            jsonWriter.value(connectivityAt);
        }
        if (task.getContainerInstanceArn() != null) {
            String containerInstanceArn = task.getContainerInstanceArn();
            jsonWriter.name("containerInstanceArn");
            jsonWriter.value(containerInstanceArn);
        }
        if (task.getContainers() != null) {
            java.util.List<Container> containers = task.getContainers();
            jsonWriter.name("containers");
            jsonWriter.beginArray();
            for (Container containersItem : containers) {
                if (containersItem != null) {
                    ContainerJsonMarshaller.getInstance().marshall(containersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (task.getCpu() != null) {
            String cpu = task.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (task.getCreatedAt() != null) {
            java.util.Date createdAt = task.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (task.getDesiredStatus() != null) {
            String desiredStatus = task.getDesiredStatus();
            jsonWriter.name("desiredStatus");
            jsonWriter.value(desiredStatus);
        }
        if (task.getExecutionStoppedAt() != null) {
            java.util.Date executionStoppedAt = task.getExecutionStoppedAt();
            jsonWriter.name("executionStoppedAt");
            jsonWriter.value(executionStoppedAt);
        }
        if (task.getGroup() != null) {
            String group = task.getGroup();
            jsonWriter.name("group");
            jsonWriter.value(group);
        }
        if (task.getHealthStatus() != null) {
            String healthStatus = task.getHealthStatus();
            jsonWriter.name("healthStatus");
            jsonWriter.value(healthStatus);
        }
        if (task.getInferenceAccelerators() != null) {
            java.util.List<InferenceAccelerator> inferenceAccelerators = task
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
        if (task.getLastStatus() != null) {
            String lastStatus = task.getLastStatus();
            jsonWriter.name("lastStatus");
            jsonWriter.value(lastStatus);
        }
        if (task.getLaunchType() != null) {
            String launchType = task.getLaunchType();
            jsonWriter.name("launchType");
            jsonWriter.value(launchType);
        }
        if (task.getMemory() != null) {
            String memory = task.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (task.getOverrides() != null) {
            TaskOverride overrides = task.getOverrides();
            jsonWriter.name("overrides");
            TaskOverrideJsonMarshaller.getInstance().marshall(overrides, jsonWriter);
        }
        if (task.getPlatformVersion() != null) {
            String platformVersion = task.getPlatformVersion();
            jsonWriter.name("platformVersion");
            jsonWriter.value(platformVersion);
        }
        if (task.getPullStartedAt() != null) {
            java.util.Date pullStartedAt = task.getPullStartedAt();
            jsonWriter.name("pullStartedAt");
            jsonWriter.value(pullStartedAt);
        }
        if (task.getPullStoppedAt() != null) {
            java.util.Date pullStoppedAt = task.getPullStoppedAt();
            jsonWriter.name("pullStoppedAt");
            jsonWriter.value(pullStoppedAt);
        }
        if (task.getStartedAt() != null) {
            java.util.Date startedAt = task.getStartedAt();
            jsonWriter.name("startedAt");
            jsonWriter.value(startedAt);
        }
        if (task.getStartedBy() != null) {
            String startedBy = task.getStartedBy();
            jsonWriter.name("startedBy");
            jsonWriter.value(startedBy);
        }
        if (task.getStopCode() != null) {
            String stopCode = task.getStopCode();
            jsonWriter.name("stopCode");
            jsonWriter.value(stopCode);
        }
        if (task.getStoppedAt() != null) {
            java.util.Date stoppedAt = task.getStoppedAt();
            jsonWriter.name("stoppedAt");
            jsonWriter.value(stoppedAt);
        }
        if (task.getStoppedReason() != null) {
            String stoppedReason = task.getStoppedReason();
            jsonWriter.name("stoppedReason");
            jsonWriter.value(stoppedReason);
        }
        if (task.getStoppingAt() != null) {
            java.util.Date stoppingAt = task.getStoppingAt();
            jsonWriter.name("stoppingAt");
            jsonWriter.value(stoppingAt);
        }
        if (task.getTags() != null) {
            java.util.List<Tag> tags = task.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (task.getTaskArn() != null) {
            String taskArn = task.getTaskArn();
            jsonWriter.name("taskArn");
            jsonWriter.value(taskArn);
        }
        if (task.getTaskDefinitionArn() != null) {
            String taskDefinitionArn = task.getTaskDefinitionArn();
            jsonWriter.name("taskDefinitionArn");
            jsonWriter.value(taskDefinitionArn);
        }
        if (task.getVersion() != null) {
            Long version = task.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static TaskJsonMarshaller instance;

    public static TaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonMarshaller();
        return instance;
    }
}
