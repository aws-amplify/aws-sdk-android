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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateServiceRequest
 */
public class CreateServiceRequestMarshaller implements
        Marshaller<Request<CreateServiceRequest>, CreateServiceRequest> {

    public Request<CreateServiceRequest> marshall(CreateServiceRequest createServiceRequest) {
        if (createServiceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateServiceRequest)");
        }

        Request<CreateServiceRequest> request = new DefaultRequest<CreateServiceRequest>(
                createServiceRequest, "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.CreateService";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createServiceRequest.getCluster() != null) {
                String cluster = createServiceRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (createServiceRequest.getServiceName() != null) {
                String serviceName = createServiceRequest.getServiceName();
                jsonWriter.name("serviceName");
                jsonWriter.value(serviceName);
            }
            if (createServiceRequest.getTaskDefinition() != null) {
                String taskDefinition = createServiceRequest.getTaskDefinition();
                jsonWriter.name("taskDefinition");
                jsonWriter.value(taskDefinition);
            }
            if (createServiceRequest.getLoadBalancers() != null) {
                java.util.List<LoadBalancer> loadBalancers = createServiceRequest
                        .getLoadBalancers();
                jsonWriter.name("loadBalancers");
                jsonWriter.beginArray();
                for (LoadBalancer loadBalancersItem : loadBalancers) {
                    if (loadBalancersItem != null) {
                        LoadBalancerJsonMarshaller.getInstance().marshall(loadBalancersItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServiceRequest.getServiceRegistries() != null) {
                java.util.List<ServiceRegistry> serviceRegistries = createServiceRequest
                        .getServiceRegistries();
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
            if (createServiceRequest.getDesiredCount() != null) {
                Integer desiredCount = createServiceRequest.getDesiredCount();
                jsonWriter.name("desiredCount");
                jsonWriter.value(desiredCount);
            }
            if (createServiceRequest.getClientToken() != null) {
                String clientToken = createServiceRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createServiceRequest.getLaunchType() != null) {
                String launchType = createServiceRequest.getLaunchType();
                jsonWriter.name("launchType");
                jsonWriter.value(launchType);
            }
            if (createServiceRequest.getCapacityProviderStrategy() != null) {
                java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = createServiceRequest
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
            if (createServiceRequest.getPlatformVersion() != null) {
                String platformVersion = createServiceRequest.getPlatformVersion();
                jsonWriter.name("platformVersion");
                jsonWriter.value(platformVersion);
            }
            if (createServiceRequest.getRole() != null) {
                String role = createServiceRequest.getRole();
                jsonWriter.name("role");
                jsonWriter.value(role);
            }
            if (createServiceRequest.getDeploymentConfiguration() != null) {
                DeploymentConfiguration deploymentConfiguration = createServiceRequest
                        .getDeploymentConfiguration();
                jsonWriter.name("deploymentConfiguration");
                DeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        deploymentConfiguration, jsonWriter);
            }
            if (createServiceRequest.getPlacementConstraints() != null) {
                java.util.List<PlacementConstraint> placementConstraints = createServiceRequest
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
            if (createServiceRequest.getPlacementStrategy() != null) {
                java.util.List<PlacementStrategy> placementStrategy = createServiceRequest
                        .getPlacementStrategy();
                jsonWriter.name("placementStrategy");
                jsonWriter.beginArray();
                for (PlacementStrategy placementStrategyItem : placementStrategy) {
                    if (placementStrategyItem != null) {
                        PlacementStrategyJsonMarshaller.getInstance().marshall(
                                placementStrategyItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServiceRequest.getNetworkConfiguration() != null) {
                NetworkConfiguration networkConfiguration = createServiceRequest
                        .getNetworkConfiguration();
                jsonWriter.name("networkConfiguration");
                NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                        jsonWriter);
            }
            if (createServiceRequest.getHealthCheckGracePeriodSeconds() != null) {
                Integer healthCheckGracePeriodSeconds = createServiceRequest
                        .getHealthCheckGracePeriodSeconds();
                jsonWriter.name("healthCheckGracePeriodSeconds");
                jsonWriter.value(healthCheckGracePeriodSeconds);
            }
            if (createServiceRequest.getSchedulingStrategy() != null) {
                String schedulingStrategy = createServiceRequest.getSchedulingStrategy();
                jsonWriter.name("schedulingStrategy");
                jsonWriter.value(schedulingStrategy);
            }
            if (createServiceRequest.getDeploymentController() != null) {
                DeploymentController deploymentController = createServiceRequest
                        .getDeploymentController();
                jsonWriter.name("deploymentController");
                DeploymentControllerJsonMarshaller.getInstance().marshall(deploymentController,
                        jsonWriter);
            }
            if (createServiceRequest.getTags() != null) {
                java.util.List<Tag> tags = createServiceRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServiceRequest.getEnableECSManagedTags() != null) {
                Boolean enableECSManagedTags = createServiceRequest.getEnableECSManagedTags();
                jsonWriter.name("enableECSManagedTags");
                jsonWriter.value(enableECSManagedTags);
            }
            if (createServiceRequest.getPropagateTags() != null) {
                String propagateTags = createServiceRequest.getPropagateTags();
                jsonWriter.name("propagateTags");
                jsonWriter.value(propagateTags);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
