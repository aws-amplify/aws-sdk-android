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
 * JSON marshaller for POJO TaskSet
 */
class TaskSetJsonMarshaller {

    public void marshall(TaskSet taskSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskSet.getId() != null) {
            String id = taskSet.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (taskSet.getTaskSetArn() != null) {
            String taskSetArn = taskSet.getTaskSetArn();
            jsonWriter.name("taskSetArn");
            jsonWriter.value(taskSetArn);
        }
        if (taskSet.getServiceArn() != null) {
            String serviceArn = taskSet.getServiceArn();
            jsonWriter.name("serviceArn");
            jsonWriter.value(serviceArn);
        }
        if (taskSet.getClusterArn() != null) {
            String clusterArn = taskSet.getClusterArn();
            jsonWriter.name("clusterArn");
            jsonWriter.value(clusterArn);
        }
        if (taskSet.getStartedBy() != null) {
            String startedBy = taskSet.getStartedBy();
            jsonWriter.name("startedBy");
            jsonWriter.value(startedBy);
        }
        if (taskSet.getExternalId() != null) {
            String externalId = taskSet.getExternalId();
            jsonWriter.name("externalId");
            jsonWriter.value(externalId);
        }
        if (taskSet.getStatus() != null) {
            String status = taskSet.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (taskSet.getTaskDefinition() != null) {
            String taskDefinition = taskSet.getTaskDefinition();
            jsonWriter.name("taskDefinition");
            jsonWriter.value(taskDefinition);
        }
        if (taskSet.getComputedDesiredCount() != null) {
            Integer computedDesiredCount = taskSet.getComputedDesiredCount();
            jsonWriter.name("computedDesiredCount");
            jsonWriter.value(computedDesiredCount);
        }
        if (taskSet.getPendingCount() != null) {
            Integer pendingCount = taskSet.getPendingCount();
            jsonWriter.name("pendingCount");
            jsonWriter.value(pendingCount);
        }
        if (taskSet.getRunningCount() != null) {
            Integer runningCount = taskSet.getRunningCount();
            jsonWriter.name("runningCount");
            jsonWriter.value(runningCount);
        }
        if (taskSet.getCreatedAt() != null) {
            java.util.Date createdAt = taskSet.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (taskSet.getUpdatedAt() != null) {
            java.util.Date updatedAt = taskSet.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        if (taskSet.getLaunchType() != null) {
            String launchType = taskSet.getLaunchType();
            jsonWriter.name("launchType");
            jsonWriter.value(launchType);
        }
        if (taskSet.getCapacityProviderStrategy() != null) {
            java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = taskSet
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
        if (taskSet.getPlatformVersion() != null) {
            String platformVersion = taskSet.getPlatformVersion();
            jsonWriter.name("platformVersion");
            jsonWriter.value(platformVersion);
        }
        if (taskSet.getNetworkConfiguration() != null) {
            NetworkConfiguration networkConfiguration = taskSet.getNetworkConfiguration();
            jsonWriter.name("networkConfiguration");
            NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                    jsonWriter);
        }
        if (taskSet.getLoadBalancers() != null) {
            java.util.List<LoadBalancer> loadBalancers = taskSet.getLoadBalancers();
            jsonWriter.name("loadBalancers");
            jsonWriter.beginArray();
            for (LoadBalancer loadBalancersItem : loadBalancers) {
                if (loadBalancersItem != null) {
                    LoadBalancerJsonMarshaller.getInstance()
                            .marshall(loadBalancersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskSet.getServiceRegistries() != null) {
            java.util.List<ServiceRegistry> serviceRegistries = taskSet.getServiceRegistries();
            jsonWriter.name("serviceRegistries");
            jsonWriter.beginArray();
            for (ServiceRegistry serviceRegistriesItem : serviceRegistries) {
                if (serviceRegistriesItem != null) {
                    ServiceRegistryJsonMarshaller.getInstance().marshall(serviceRegistriesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskSet.getScale() != null) {
            Scale scale = taskSet.getScale();
            jsonWriter.name("scale");
            ScaleJsonMarshaller.getInstance().marshall(scale, jsonWriter);
        }
        if (taskSet.getStabilityStatus() != null) {
            String stabilityStatus = taskSet.getStabilityStatus();
            jsonWriter.name("stabilityStatus");
            jsonWriter.value(stabilityStatus);
        }
        if (taskSet.getStabilityStatusAt() != null) {
            java.util.Date stabilityStatusAt = taskSet.getStabilityStatusAt();
            jsonWriter.name("stabilityStatusAt");
            jsonWriter.value(stabilityStatusAt);
        }
        if (taskSet.getTags() != null) {
            java.util.List<Tag> tags = taskSet.getTags();
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

    private static TaskSetJsonMarshaller instance;

    public static TaskSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskSetJsonMarshaller();
        return instance;
    }
}
