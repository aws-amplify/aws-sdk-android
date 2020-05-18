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
 * JSON marshaller for POJO Cluster
 */
class ClusterJsonMarshaller {

    public void marshall(Cluster cluster, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cluster.getClusterArn() != null) {
            String clusterArn = cluster.getClusterArn();
            jsonWriter.name("clusterArn");
            jsonWriter.value(clusterArn);
        }
        if (cluster.getClusterName() != null) {
            String clusterName = cluster.getClusterName();
            jsonWriter.name("clusterName");
            jsonWriter.value(clusterName);
        }
        if (cluster.getStatus() != null) {
            String status = cluster.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (cluster.getRegisteredContainerInstancesCount() != null) {
            Integer registeredContainerInstancesCount = cluster
                    .getRegisteredContainerInstancesCount();
            jsonWriter.name("registeredContainerInstancesCount");
            jsonWriter.value(registeredContainerInstancesCount);
        }
        if (cluster.getRunningTasksCount() != null) {
            Integer runningTasksCount = cluster.getRunningTasksCount();
            jsonWriter.name("runningTasksCount");
            jsonWriter.value(runningTasksCount);
        }
        if (cluster.getPendingTasksCount() != null) {
            Integer pendingTasksCount = cluster.getPendingTasksCount();
            jsonWriter.name("pendingTasksCount");
            jsonWriter.value(pendingTasksCount);
        }
        if (cluster.getActiveServicesCount() != null) {
            Integer activeServicesCount = cluster.getActiveServicesCount();
            jsonWriter.name("activeServicesCount");
            jsonWriter.value(activeServicesCount);
        }
        if (cluster.getStatistics() != null) {
            java.util.List<KeyValuePair> statistics = cluster.getStatistics();
            jsonWriter.name("statistics");
            jsonWriter.beginArray();
            for (KeyValuePair statisticsItem : statistics) {
                if (statisticsItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(statisticsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getTags() != null) {
            java.util.List<Tag> tags = cluster.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getSettings() != null) {
            java.util.List<ClusterSetting> settings = cluster.getSettings();
            jsonWriter.name("settings");
            jsonWriter.beginArray();
            for (ClusterSetting settingsItem : settings) {
                if (settingsItem != null) {
                    ClusterSettingJsonMarshaller.getInstance().marshall(settingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getCapacityProviders() != null) {
            java.util.List<String> capacityProviders = cluster.getCapacityProviders();
            jsonWriter.name("capacityProviders");
            jsonWriter.beginArray();
            for (String capacityProvidersItem : capacityProviders) {
                if (capacityProvidersItem != null) {
                    jsonWriter.value(capacityProvidersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getDefaultCapacityProviderStrategy() != null) {
            java.util.List<CapacityProviderStrategyItem> defaultCapacityProviderStrategy = cluster
                    .getDefaultCapacityProviderStrategy();
            jsonWriter.name("defaultCapacityProviderStrategy");
            jsonWriter.beginArray();
            for (CapacityProviderStrategyItem defaultCapacityProviderStrategyItem : defaultCapacityProviderStrategy) {
                if (defaultCapacityProviderStrategyItem != null) {
                    CapacityProviderStrategyItemJsonMarshaller.getInstance().marshall(
                            defaultCapacityProviderStrategyItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getAttachments() != null) {
            java.util.List<Attachment> attachments = cluster.getAttachments();
            jsonWriter.name("attachments");
            jsonWriter.beginArray();
            for (Attachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    AttachmentJsonMarshaller.getInstance().marshall(attachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getAttachmentsStatus() != null) {
            String attachmentsStatus = cluster.getAttachmentsStatus();
            jsonWriter.name("attachmentsStatus");
            jsonWriter.value(attachmentsStatus);
        }
        jsonWriter.endObject();
    }

    private static ClusterJsonMarshaller instance;

    public static ClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonMarshaller();
        return instance;
    }
}
