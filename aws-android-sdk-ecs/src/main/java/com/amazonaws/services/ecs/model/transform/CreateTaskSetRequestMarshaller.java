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
 * JSON request marshaller for CreateTaskSetRequest
 */
public class CreateTaskSetRequestMarshaller implements
        Marshaller<Request<CreateTaskSetRequest>, CreateTaskSetRequest> {

    public Request<CreateTaskSetRequest> marshall(CreateTaskSetRequest createTaskSetRequest) {
        if (createTaskSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTaskSetRequest)");
        }

        Request<CreateTaskSetRequest> request = new DefaultRequest<CreateTaskSetRequest>(
                createTaskSetRequest, "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.CreateTaskSet";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTaskSetRequest.getService() != null) {
                String service = createTaskSetRequest.getService();
                jsonWriter.name("service");
                jsonWriter.value(service);
            }
            if (createTaskSetRequest.getCluster() != null) {
                String cluster = createTaskSetRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (createTaskSetRequest.getExternalId() != null) {
                String externalId = createTaskSetRequest.getExternalId();
                jsonWriter.name("externalId");
                jsonWriter.value(externalId);
            }
            if (createTaskSetRequest.getTaskDefinition() != null) {
                String taskDefinition = createTaskSetRequest.getTaskDefinition();
                jsonWriter.name("taskDefinition");
                jsonWriter.value(taskDefinition);
            }
            if (createTaskSetRequest.getNetworkConfiguration() != null) {
                NetworkConfiguration networkConfiguration = createTaskSetRequest
                        .getNetworkConfiguration();
                jsonWriter.name("networkConfiguration");
                NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                        jsonWriter);
            }
            if (createTaskSetRequest.getLoadBalancers() != null) {
                java.util.List<LoadBalancer> loadBalancers = createTaskSetRequest
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
            if (createTaskSetRequest.getServiceRegistries() != null) {
                java.util.List<ServiceRegistry> serviceRegistries = createTaskSetRequest
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
            if (createTaskSetRequest.getLaunchType() != null) {
                String launchType = createTaskSetRequest.getLaunchType();
                jsonWriter.name("launchType");
                jsonWriter.value(launchType);
            }
            if (createTaskSetRequest.getCapacityProviderStrategy() != null) {
                java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = createTaskSetRequest
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
            if (createTaskSetRequest.getPlatformVersion() != null) {
                String platformVersion = createTaskSetRequest.getPlatformVersion();
                jsonWriter.name("platformVersion");
                jsonWriter.value(platformVersion);
            }
            if (createTaskSetRequest.getScale() != null) {
                Scale scale = createTaskSetRequest.getScale();
                jsonWriter.name("scale");
                ScaleJsonMarshaller.getInstance().marshall(scale, jsonWriter);
            }
            if (createTaskSetRequest.getClientToken() != null) {
                String clientToken = createTaskSetRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createTaskSetRequest.getTags() != null) {
                java.util.List<Tag> tags = createTaskSetRequest.getTags();
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
