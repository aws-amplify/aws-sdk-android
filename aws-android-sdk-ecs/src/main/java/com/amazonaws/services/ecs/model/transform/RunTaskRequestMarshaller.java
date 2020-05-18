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
 * JSON request marshaller for RunTaskRequest
 */
public class RunTaskRequestMarshaller implements
        Marshaller<Request<RunTaskRequest>, RunTaskRequest> {

    public Request<RunTaskRequest> marshall(RunTaskRequest runTaskRequest) {
        if (runTaskRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(RunTaskRequest)");
        }

        Request<RunTaskRequest> request = new DefaultRequest<RunTaskRequest>(runTaskRequest,
                "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.RunTask";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (runTaskRequest.getCapacityProviderStrategy() != null) {
                java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy = runTaskRequest
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
            if (runTaskRequest.getCluster() != null) {
                String cluster = runTaskRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (runTaskRequest.getCount() != null) {
                Integer count = runTaskRequest.getCount();
                jsonWriter.name("count");
                jsonWriter.value(count);
            }
            if (runTaskRequest.getEnableECSManagedTags() != null) {
                Boolean enableECSManagedTags = runTaskRequest.getEnableECSManagedTags();
                jsonWriter.name("enableECSManagedTags");
                jsonWriter.value(enableECSManagedTags);
            }
            if (runTaskRequest.getGroup() != null) {
                String group = runTaskRequest.getGroup();
                jsonWriter.name("group");
                jsonWriter.value(group);
            }
            if (runTaskRequest.getLaunchType() != null) {
                String launchType = runTaskRequest.getLaunchType();
                jsonWriter.name("launchType");
                jsonWriter.value(launchType);
            }
            if (runTaskRequest.getNetworkConfiguration() != null) {
                NetworkConfiguration networkConfiguration = runTaskRequest
                        .getNetworkConfiguration();
                jsonWriter.name("networkConfiguration");
                NetworkConfigurationJsonMarshaller.getInstance().marshall(networkConfiguration,
                        jsonWriter);
            }
            if (runTaskRequest.getOverrides() != null) {
                TaskOverride overrides = runTaskRequest.getOverrides();
                jsonWriter.name("overrides");
                TaskOverrideJsonMarshaller.getInstance().marshall(overrides, jsonWriter);
            }
            if (runTaskRequest.getPlacementConstraints() != null) {
                java.util.List<PlacementConstraint> placementConstraints = runTaskRequest
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
            if (runTaskRequest.getPlacementStrategy() != null) {
                java.util.List<PlacementStrategy> placementStrategy = runTaskRequest
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
            if (runTaskRequest.getPlatformVersion() != null) {
                String platformVersion = runTaskRequest.getPlatformVersion();
                jsonWriter.name("platformVersion");
                jsonWriter.value(platformVersion);
            }
            if (runTaskRequest.getPropagateTags() != null) {
                String propagateTags = runTaskRequest.getPropagateTags();
                jsonWriter.name("propagateTags");
                jsonWriter.value(propagateTags);
            }
            if (runTaskRequest.getReferenceId() != null) {
                String referenceId = runTaskRequest.getReferenceId();
                jsonWriter.name("referenceId");
                jsonWriter.value(referenceId);
            }
            if (runTaskRequest.getStartedBy() != null) {
                String startedBy = runTaskRequest.getStartedBy();
                jsonWriter.name("startedBy");
                jsonWriter.value(startedBy);
            }
            if (runTaskRequest.getTags() != null) {
                java.util.List<Tag> tags = runTaskRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runTaskRequest.getTaskDefinition() != null) {
                String taskDefinition = runTaskRequest.getTaskDefinition();
                jsonWriter.name("taskDefinition");
                jsonWriter.value(taskDefinition);
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
