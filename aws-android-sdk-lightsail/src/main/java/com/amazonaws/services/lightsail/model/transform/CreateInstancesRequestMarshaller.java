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

package com.amazonaws.services.lightsail.model.transform;

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
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInstancesRequest
 */
public class CreateInstancesRequestMarshaller implements
        Marshaller<Request<CreateInstancesRequest>, CreateInstancesRequest> {

    public Request<CreateInstancesRequest> marshall(CreateInstancesRequest createInstancesRequest) {
        if (createInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInstancesRequest)");
        }

        Request<CreateInstancesRequest> request = new DefaultRequest<CreateInstancesRequest>(
                createInstancesRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.CreateInstances";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInstancesRequest.getInstanceNames() != null) {
                java.util.List<String> instanceNames = createInstancesRequest.getInstanceNames();
                jsonWriter.name("instanceNames");
                jsonWriter.beginArray();
                for (String instanceNamesItem : instanceNames) {
                    if (instanceNamesItem != null) {
                        jsonWriter.value(instanceNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstancesRequest.getAvailabilityZone() != null) {
                String availabilityZone = createInstancesRequest.getAvailabilityZone();
                jsonWriter.name("availabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createInstancesRequest.getCustomImageName() != null) {
                String customImageName = createInstancesRequest.getCustomImageName();
                jsonWriter.name("customImageName");
                jsonWriter.value(customImageName);
            }
            if (createInstancesRequest.getBlueprintId() != null) {
                String blueprintId = createInstancesRequest.getBlueprintId();
                jsonWriter.name("blueprintId");
                jsonWriter.value(blueprintId);
            }
            if (createInstancesRequest.getBundleId() != null) {
                String bundleId = createInstancesRequest.getBundleId();
                jsonWriter.name("bundleId");
                jsonWriter.value(bundleId);
            }
            if (createInstancesRequest.getUserData() != null) {
                String userData = createInstancesRequest.getUserData();
                jsonWriter.name("userData");
                jsonWriter.value(userData);
            }
            if (createInstancesRequest.getKeyPairName() != null) {
                String keyPairName = createInstancesRequest.getKeyPairName();
                jsonWriter.name("keyPairName");
                jsonWriter.value(keyPairName);
            }
            if (createInstancesRequest.getTags() != null) {
                java.util.List<Tag> tags = createInstancesRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstancesRequest.getAddOns() != null) {
                java.util.List<AddOnRequest> addOns = createInstancesRequest.getAddOns();
                jsonWriter.name("addOns");
                jsonWriter.beginArray();
                for (AddOnRequest addOnsItem : addOns) {
                    if (addOnsItem != null) {
                        AddOnRequestJsonMarshaller.getInstance().marshall(addOnsItem, jsonWriter);
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
