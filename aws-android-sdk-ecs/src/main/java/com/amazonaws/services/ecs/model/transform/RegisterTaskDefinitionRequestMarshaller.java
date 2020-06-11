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
 * JSON request marshaller for RegisterTaskDefinitionRequest
 */
public class RegisterTaskDefinitionRequestMarshaller implements
        Marshaller<Request<RegisterTaskDefinitionRequest>, RegisterTaskDefinitionRequest> {

    public Request<RegisterTaskDefinitionRequest> marshall(
            RegisterTaskDefinitionRequest registerTaskDefinitionRequest) {
        if (registerTaskDefinitionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterTaskDefinitionRequest)");
        }

        Request<RegisterTaskDefinitionRequest> request = new DefaultRequest<RegisterTaskDefinitionRequest>(
                registerTaskDefinitionRequest, "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.RegisterTaskDefinition";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerTaskDefinitionRequest.getFamily() != null) {
                String family = registerTaskDefinitionRequest.getFamily();
                jsonWriter.name("family");
                jsonWriter.value(family);
            }
            if (registerTaskDefinitionRequest.getTaskRoleArn() != null) {
                String taskRoleArn = registerTaskDefinitionRequest.getTaskRoleArn();
                jsonWriter.name("taskRoleArn");
                jsonWriter.value(taskRoleArn);
            }
            if (registerTaskDefinitionRequest.getExecutionRoleArn() != null) {
                String executionRoleArn = registerTaskDefinitionRequest.getExecutionRoleArn();
                jsonWriter.name("executionRoleArn");
                jsonWriter.value(executionRoleArn);
            }
            if (registerTaskDefinitionRequest.getNetworkMode() != null) {
                String networkMode = registerTaskDefinitionRequest.getNetworkMode();
                jsonWriter.name("networkMode");
                jsonWriter.value(networkMode);
            }
            if (registerTaskDefinitionRequest.getContainerDefinitions() != null) {
                java.util.List<ContainerDefinition> containerDefinitions = registerTaskDefinitionRequest
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
            if (registerTaskDefinitionRequest.getVolumes() != null) {
                java.util.List<Volume> volumes = registerTaskDefinitionRequest.getVolumes();
                jsonWriter.name("volumes");
                jsonWriter.beginArray();
                for (Volume volumesItem : volumes) {
                    if (volumesItem != null) {
                        VolumeJsonMarshaller.getInstance().marshall(volumesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerTaskDefinitionRequest.getPlacementConstraints() != null) {
                java.util.List<TaskDefinitionPlacementConstraint> placementConstraints = registerTaskDefinitionRequest
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
            if (registerTaskDefinitionRequest.getRequiresCompatibilities() != null) {
                java.util.List<String> requiresCompatibilities = registerTaskDefinitionRequest
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
            if (registerTaskDefinitionRequest.getCpu() != null) {
                String cpu = registerTaskDefinitionRequest.getCpu();
                jsonWriter.name("cpu");
                jsonWriter.value(cpu);
            }
            if (registerTaskDefinitionRequest.getMemory() != null) {
                String memory = registerTaskDefinitionRequest.getMemory();
                jsonWriter.name("memory");
                jsonWriter.value(memory);
            }
            if (registerTaskDefinitionRequest.getTags() != null) {
                java.util.List<Tag> tags = registerTaskDefinitionRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerTaskDefinitionRequest.getPidMode() != null) {
                String pidMode = registerTaskDefinitionRequest.getPidMode();
                jsonWriter.name("pidMode");
                jsonWriter.value(pidMode);
            }
            if (registerTaskDefinitionRequest.getIpcMode() != null) {
                String ipcMode = registerTaskDefinitionRequest.getIpcMode();
                jsonWriter.name("ipcMode");
                jsonWriter.value(ipcMode);
            }
            if (registerTaskDefinitionRequest.getProxyConfiguration() != null) {
                ProxyConfiguration proxyConfiguration = registerTaskDefinitionRequest
                        .getProxyConfiguration();
                jsonWriter.name("proxyConfiguration");
                ProxyConfigurationJsonMarshaller.getInstance().marshall(proxyConfiguration,
                        jsonWriter);
            }
            if (registerTaskDefinitionRequest.getInferenceAccelerators() != null) {
                java.util.List<InferenceAccelerator> inferenceAccelerators = registerTaskDefinitionRequest
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
