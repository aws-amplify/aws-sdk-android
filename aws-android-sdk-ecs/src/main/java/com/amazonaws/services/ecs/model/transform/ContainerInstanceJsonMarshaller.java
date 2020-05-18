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
 * JSON marshaller for POJO ContainerInstance
 */
class ContainerInstanceJsonMarshaller {

    public void marshall(ContainerInstance containerInstance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerInstance.getContainerInstanceArn() != null) {
            String containerInstanceArn = containerInstance.getContainerInstanceArn();
            jsonWriter.name("containerInstanceArn");
            jsonWriter.value(containerInstanceArn);
        }
        if (containerInstance.getEc2InstanceId() != null) {
            String ec2InstanceId = containerInstance.getEc2InstanceId();
            jsonWriter.name("ec2InstanceId");
            jsonWriter.value(ec2InstanceId);
        }
        if (containerInstance.getCapacityProviderName() != null) {
            String capacityProviderName = containerInstance.getCapacityProviderName();
            jsonWriter.name("capacityProviderName");
            jsonWriter.value(capacityProviderName);
        }
        if (containerInstance.getVersion() != null) {
            Long version = containerInstance.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (containerInstance.getVersionInfo() != null) {
            VersionInfo versionInfo = containerInstance.getVersionInfo();
            jsonWriter.name("versionInfo");
            VersionInfoJsonMarshaller.getInstance().marshall(versionInfo, jsonWriter);
        }
        if (containerInstance.getRemainingResources() != null) {
            java.util.List<Resource> remainingResources = containerInstance.getRemainingResources();
            jsonWriter.name("remainingResources");
            jsonWriter.beginArray();
            for (Resource remainingResourcesItem : remainingResources) {
                if (remainingResourcesItem != null) {
                    ResourceJsonMarshaller.getInstance().marshall(remainingResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerInstance.getRegisteredResources() != null) {
            java.util.List<Resource> registeredResources = containerInstance
                    .getRegisteredResources();
            jsonWriter.name("registeredResources");
            jsonWriter.beginArray();
            for (Resource registeredResourcesItem : registeredResources) {
                if (registeredResourcesItem != null) {
                    ResourceJsonMarshaller.getInstance().marshall(registeredResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerInstance.getStatus() != null) {
            String status = containerInstance.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (containerInstance.getStatusReason() != null) {
            String statusReason = containerInstance.getStatusReason();
            jsonWriter.name("statusReason");
            jsonWriter.value(statusReason);
        }
        if (containerInstance.getAgentConnected() != null) {
            Boolean agentConnected = containerInstance.getAgentConnected();
            jsonWriter.name("agentConnected");
            jsonWriter.value(agentConnected);
        }
        if (containerInstance.getRunningTasksCount() != null) {
            Integer runningTasksCount = containerInstance.getRunningTasksCount();
            jsonWriter.name("runningTasksCount");
            jsonWriter.value(runningTasksCount);
        }
        if (containerInstance.getPendingTasksCount() != null) {
            Integer pendingTasksCount = containerInstance.getPendingTasksCount();
            jsonWriter.name("pendingTasksCount");
            jsonWriter.value(pendingTasksCount);
        }
        if (containerInstance.getAgentUpdateStatus() != null) {
            String agentUpdateStatus = containerInstance.getAgentUpdateStatus();
            jsonWriter.name("agentUpdateStatus");
            jsonWriter.value(agentUpdateStatus);
        }
        if (containerInstance.getAttributes() != null) {
            java.util.List<Attribute> attributes = containerInstance.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginArray();
            for (Attribute attributesItem : attributes) {
                if (attributesItem != null) {
                    AttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerInstance.getRegisteredAt() != null) {
            java.util.Date registeredAt = containerInstance.getRegisteredAt();
            jsonWriter.name("registeredAt");
            jsonWriter.value(registeredAt);
        }
        if (containerInstance.getAttachments() != null) {
            java.util.List<Attachment> attachments = containerInstance.getAttachments();
            jsonWriter.name("attachments");
            jsonWriter.beginArray();
            for (Attachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    AttachmentJsonMarshaller.getInstance().marshall(attachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerInstance.getTags() != null) {
            java.util.List<Tag> tags = containerInstance.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContainerInstanceJsonMarshaller instance;

    public static ContainerInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerInstanceJsonMarshaller();
        return instance;
    }
}
