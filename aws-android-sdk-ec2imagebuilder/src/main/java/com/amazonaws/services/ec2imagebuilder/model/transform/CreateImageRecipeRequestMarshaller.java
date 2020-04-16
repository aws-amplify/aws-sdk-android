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

package com.amazonaws.services.ec2imagebuilder.model.transform;

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
import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateImageRecipeRequest
 */
public class CreateImageRecipeRequestMarshaller implements
        Marshaller<Request<CreateImageRecipeRequest>, CreateImageRecipeRequest> {

    public Request<CreateImageRecipeRequest> marshall(
            CreateImageRecipeRequest createImageRecipeRequest) {
        if (createImageRecipeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateImageRecipeRequest)");
        }

        Request<CreateImageRecipeRequest> request = new DefaultRequest<CreateImageRecipeRequest>(
                createImageRecipeRequest, "EC2ImageBuilder");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/CreateImageRecipe";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createImageRecipeRequest.getName() != null) {
                String name = createImageRecipeRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createImageRecipeRequest.getDescription() != null) {
                String description = createImageRecipeRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createImageRecipeRequest.getSemanticVersion() != null) {
                String semanticVersion = createImageRecipeRequest.getSemanticVersion();
                jsonWriter.name("semanticVersion");
                jsonWriter.value(semanticVersion);
            }
            if (createImageRecipeRequest.getComponents() != null) {
                java.util.List<ComponentConfiguration> components = createImageRecipeRequest
                        .getComponents();
                jsonWriter.name("components");
                jsonWriter.beginArray();
                for (ComponentConfiguration componentsItem : components) {
                    if (componentsItem != null) {
                        ComponentConfigurationJsonMarshaller.getInstance().marshall(componentsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createImageRecipeRequest.getParentImage() != null) {
                String parentImage = createImageRecipeRequest.getParentImage();
                jsonWriter.name("parentImage");
                jsonWriter.value(parentImage);
            }
            if (createImageRecipeRequest.getBlockDeviceMappings() != null) {
                java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings = createImageRecipeRequest
                        .getBlockDeviceMappings();
                jsonWriter.name("blockDeviceMappings");
                jsonWriter.beginArray();
                for (InstanceBlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                    if (blockDeviceMappingsItem != null) {
                        InstanceBlockDeviceMappingJsonMarshaller.getInstance().marshall(
                                blockDeviceMappingsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createImageRecipeRequest.getTags() != null) {
                java.util.Map<String, String> tags = createImageRecipeRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createImageRecipeRequest.getClientToken() != null) {
                String clientToken = createImageRecipeRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
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
