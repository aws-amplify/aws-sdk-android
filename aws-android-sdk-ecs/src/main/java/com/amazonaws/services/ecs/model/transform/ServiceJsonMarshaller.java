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
 * JSON marshaller for POJO Service
 */
class ServiceJsonMarshaller {

    public void marshall(Service service, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (service.getServiceArn() != null) {
            String serviceArn = service.getServiceArn();
            jsonWriter.name("serviceArn");
            jsonWriter.value(serviceArn);
        }
        if (service.getServiceName() != null) {
            String serviceName = service.getServiceName();
            jsonWriter.name("serviceName");
            jsonWriter.value(serviceName);
        }
        if (service.getClusterArn() != null) {
            String clusterArn = service.getClusterArn();
            jsonWriter.name("clusterArn");
            jsonWriter.value(clusterArn);
        }
        if (service.getLoadBalancers() != null) {
            java.util.List<LoadBalancer> loadBalancers = service.getLoadBalancers();
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
        if (service.getServiceRegistries() != null) {
            java.util.List<ServiceRegistry> serviceRegistries = service.getServiceRegistries();
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
        if (service.getStatus() != null) {
            String status = service.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (service.getDesiredCount() != null) {
            Integer desiredCount = service.getDesiredCount();
            jsonWriter.name("desiredCount");
            jsonWriter.value(desiredCount);
        }
        if (service.getRunningCount() != null) {
            Integer runningCount = service.getRunningCount();
            jsonWriter.name("runningCount");
            jsonWriter.value(runningCount);
        }
        if (service.getPendingCount() != null) {
            Integer pendingCount = service.getPendingCount();
            jsonWriter.name("pendingCount");
            jsonWriter.value(pendingCount);
        }
        if (service.getLaunchType() != null) {
            String launchType = service.getLaunchType();
            jsonWriter.name("launchType");
            jsonWriter.value(launchType);
        }
        if (service.getCapacityProviderStrategy() != null) {
            java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = service
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
        if (service.getPlatformVersion() != null) {
            String platformVersion = service.getPlatformVersion();
            jsonWriter.name("platformVersion");
            jsonWriter.value(platformVersion);
        }
        if (service.getTaskDefinition() != null) {
            String taskDefinition = service.getTaskDefinition();
            jsonWriter.name("taskDefinition");
            jsonWriter.value(taskDefinition);
        }
        if (service.getDeploymentConfiguration() != null) {
            DeploymentConfiguration deploymentConfiguration = service.getDeploymentConfiguration();
            jsonWriter.name("deploymentConfiguration");
            DeploymentConfigurationJsonMarshaller.getInstance().marshall(deploymentConfiguration,
                    jsonWriter);
        }
        if (service.getTaskSets() != null) {
            java.util.List<TaskSet> taskSets = service.getTaskSets();
            jsonWriter.name("taskSets");
            jsonWriter.beginArray();
            for (TaskSet taskSetsItem : taskSets) {
                if (taskSetsItem != null) {
                    TaskSetJsonMarshaller.getInstance().marshall(taskSetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getDeployments() != null) {
            java.util.List<Deployment> deployments = service.getDeployments();
            jsonWriter.name("deployments");
            jsonWriter.beginArray();
            for (Deployment deploymentsItem : deployments) {
                if (deploymentsItem != null) {
                    DeploymentJsonMarshaller.getInstance().marshall(deploymentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getRoleArn() != null) {
            String roleArn = service.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (service.getEvents() != null) {
            java.util.List<ServiceEvent> events = service.getEvents();
            jsonWriter.name("events");
            jsonWriter.beginArray();
            for (ServiceEvent eventsItem : events) {
                if (eventsItem != null) {
                    ServiceEventJsonMarshaller.getInstance().marshall(eventsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getCreatedAt() != null) {
            java.util.Date createdAt = service.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (service.getPlacementConstraints() != null) {
            java.util.List<PlacementConstraint> placementConstraints = service
                    .getPlacementConstraints();
            jsonWriter.name("placementConstraints");
            jsonWriter.beginArray();
            for (PlacementConstraint placementConstraintsItem : placementConstraints) {
                if (placementConstraintsItem != null) {
                    PlacementConstraintJsonMarshaller.getInstance().marshall(
                            placementConstraintsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getPlacementStrategy() != null) {
            java.util.List<PlacementStrategy> placementStrategy = service.getPlacementStrategy();
            jsonWriter.name("placementStrategy");
            jsonWriter.beginArray();
            for (PlacementStrategy placementStrategyItem : placementStrategy) {
                if (placementStrategyItem != null) {
                    PlacementStrategyJsonMarshaller.getInstance().marshall(placementStrategyItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getNetworkConfiguration() != null) {
            NetworkConfiguration networkConfiguration = service.getNetworkConfiguration();
            jsonWriter.name("networkConfiguration");
            NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                    jsonWriter);
        }
        if (service.getHealthCheckGracePeriodSeconds() != null) {
            Integer healthCheckGracePeriodSeconds = service.getHealthCheckGracePeriodSeconds();
            jsonWriter.name("healthCheckGracePeriodSeconds");
            jsonWriter.value(healthCheckGracePeriodSeconds);
        }
        if (service.getSchedulingStrategy() != null) {
            String schedulingStrategy = service.getSchedulingStrategy();
            jsonWriter.name("schedulingStrategy");
            jsonWriter.value(schedulingStrategy);
        }
        if (service.getDeploymentController() != null) {
            DeploymentController deploymentController = service.getDeploymentController();
            jsonWriter.name("deploymentController");
            DeploymentControllerJsonMarshaller.getInstance().marshall(deploymentController,
                    jsonWriter);
        }
        if (service.getTags() != null) {
            java.util.List<Tag> tags = service.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (service.getCreatedBy() != null) {
            String createdBy = service.getCreatedBy();
            jsonWriter.name("createdBy");
            jsonWriter.value(createdBy);
        }
        if (service.getEnableECSManagedTags() != null) {
            Boolean enableECSManagedTags = service.getEnableECSManagedTags();
            jsonWriter.name("enableECSManagedTags");
            jsonWriter.value(enableECSManagedTags);
        }
        if (service.getPropagateTags() != null) {
            String propagateTags = service.getPropagateTags();
            jsonWriter.name("propagateTags");
            jsonWriter.value(propagateTags);
        }
        jsonWriter.endObject();
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }
}
