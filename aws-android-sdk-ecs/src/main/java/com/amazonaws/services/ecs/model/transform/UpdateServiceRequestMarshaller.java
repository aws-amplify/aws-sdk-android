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
 * JSON request marshaller for UpdateServiceRequest
 */
public class UpdateServiceRequestMarshaller implements
        Marshaller<Request<UpdateServiceRequest>, UpdateServiceRequest> {

    public Request<UpdateServiceRequest> marshall(UpdateServiceRequest updateServiceRequest) {
        if (updateServiceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateServiceRequest)");
        }

        Request<UpdateServiceRequest> request = new DefaultRequest<UpdateServiceRequest>(
                updateServiceRequest, "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.UpdateService";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateServiceRequest.getCluster() != null) {
                String cluster = updateServiceRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (updateServiceRequest.getService() != null) {
                String service = updateServiceRequest.getService();
                jsonWriter.name("service");
                jsonWriter.value(service);
            }
            if (updateServiceRequest.getDesiredCount() != null) {
                Integer desiredCount = updateServiceRequest.getDesiredCount();
                jsonWriter.name("desiredCount");
                jsonWriter.value(desiredCount);
            }
            if (updateServiceRequest.getTaskDefinition() != null) {
                String taskDefinition = updateServiceRequest.getTaskDefinition();
                jsonWriter.name("taskDefinition");
                jsonWriter.value(taskDefinition);
            }
            if (updateServiceRequest.getCapacityProviderStrategy() != null) {
                java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = updateServiceRequest
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
            if (updateServiceRequest.getDeploymentConfiguration() != null) {
                DeploymentConfiguration deploymentConfiguration = updateServiceRequest
                        .getDeploymentConfiguration();
                jsonWriter.name("deploymentConfiguration");
                DeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        deploymentConfiguration, jsonWriter);
            }
            if (updateServiceRequest.getNetworkConfiguration() != null) {
                NetworkConfiguration networkConfiguration = updateServiceRequest
                        .getNetworkConfiguration();
                jsonWriter.name("networkConfiguration");
                NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                        jsonWriter);
            }
            if (updateServiceRequest.getPlacementConstraints() != null) {
                java.util.List<PlacementConstraint> placementConstraints = updateServiceRequest
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
            if (updateServiceRequest.getPlacementStrategy() != null) {
                java.util.List<PlacementStrategy> placementStrategy = updateServiceRequest
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
            if (updateServiceRequest.getPlatformVersion() != null) {
                String platformVersion = updateServiceRequest.getPlatformVersion();
                jsonWriter.name("platformVersion");
                jsonWriter.value(platformVersion);
            }
            if (updateServiceRequest.getForceNewDeployment() != null) {
                Boolean forceNewDeployment = updateServiceRequest.getForceNewDeployment();
                jsonWriter.name("forceNewDeployment");
                jsonWriter.value(forceNewDeployment);
            }
            if (updateServiceRequest.getHealthCheckGracePeriodSeconds() != null) {
                Integer healthCheckGracePeriodSeconds = updateServiceRequest
                        .getHealthCheckGracePeriodSeconds();
                jsonWriter.name("healthCheckGracePeriodSeconds");
                jsonWriter.value(healthCheckGracePeriodSeconds);
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
