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
 * JSON request marshaller for RegisterContainerInstanceRequest
 */
public class RegisterContainerInstanceRequestMarshaller implements
        Marshaller<Request<RegisterContainerInstanceRequest>, RegisterContainerInstanceRequest> {

    public Request<RegisterContainerInstanceRequest> marshall(
            RegisterContainerInstanceRequest registerContainerInstanceRequest) {
        if (registerContainerInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterContainerInstanceRequest)");
        }

        Request<RegisterContainerInstanceRequest> request = new DefaultRequest<RegisterContainerInstanceRequest>(
                registerContainerInstanceRequest, "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.RegisterContainerInstance";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerContainerInstanceRequest.getCluster() != null) {
                String cluster = registerContainerInstanceRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocument() != null) {
                String instanceIdentityDocument = registerContainerInstanceRequest
                        .getInstanceIdentityDocument();
                jsonWriter.name("instanceIdentityDocument");
                jsonWriter.value(instanceIdentityDocument);
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocumentSignature() != null) {
                String instanceIdentityDocumentSignature = registerContainerInstanceRequest
                        .getInstanceIdentityDocumentSignature();
                jsonWriter.name("instanceIdentityDocumentSignature");
                jsonWriter.value(instanceIdentityDocumentSignature);
            }
            if (registerContainerInstanceRequest.getTotalResources() != null) {
                java.util.List<Resource> totalResources = registerContainerInstanceRequest
                        .getTotalResources();
                jsonWriter.name("totalResources");
                jsonWriter.beginArray();
                for (Resource totalResourcesItem : totalResources) {
                    if (totalResourcesItem != null) {
                        ResourceJsonMarshaller.getInstance().marshall(totalResourcesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerContainerInstanceRequest.getVersionInfo() != null) {
                VersionInfo versionInfo = registerContainerInstanceRequest.getVersionInfo();
                jsonWriter.name("versionInfo");
                VersionInfoJsonMarshaller.getInstance().marshall(versionInfo, jsonWriter);
            }
            if (registerContainerInstanceRequest.getContainerInstanceArn() != null) {
                String containerInstanceArn = registerContainerInstanceRequest
                        .getContainerInstanceArn();
                jsonWriter.name("containerInstanceArn");
                jsonWriter.value(containerInstanceArn);
            }
            if (registerContainerInstanceRequest.getAttributes() != null) {
                java.util.List<Attribute> attributes = registerContainerInstanceRequest
                        .getAttributes();
                jsonWriter.name("attributes");
                jsonWriter.beginArray();
                for (Attribute attributesItem : attributes) {
                    if (attributesItem != null) {
                        AttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerContainerInstanceRequest.getPlatformDevices() != null) {
                java.util.List<PlatformDevice> platformDevices = registerContainerInstanceRequest
                        .getPlatformDevices();
                jsonWriter.name("platformDevices");
                jsonWriter.beginArray();
                for (PlatformDevice platformDevicesItem : platformDevices) {
                    if (platformDevicesItem != null) {
                        PlatformDeviceJsonMarshaller.getInstance().marshall(platformDevicesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerContainerInstanceRequest.getTags() != null) {
                java.util.List<Tag> tags = registerContainerInstanceRequest.getTags();
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
