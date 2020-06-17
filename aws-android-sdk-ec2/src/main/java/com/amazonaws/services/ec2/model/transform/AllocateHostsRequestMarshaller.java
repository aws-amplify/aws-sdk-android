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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for AllocateHostsRequest
 */
public class AllocateHostsRequestMarshaller implements
        Marshaller<Request<AllocateHostsRequest>, AllocateHostsRequest> {

    public Request<AllocateHostsRequest> marshall(AllocateHostsRequest allocateHostsRequest) {
        if (allocateHostsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AllocateHostsRequest)");
        }

        Request<AllocateHostsRequest> request = new DefaultRequest<AllocateHostsRequest>(
                allocateHostsRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (allocateHostsRequest.getAutoPlacement() != null) {
                String autoPlacement = allocateHostsRequest.getAutoPlacement();
                jsonWriter.name("AutoPlacement");
                jsonWriter.value(autoPlacement);
            }
            if (allocateHostsRequest.getAvailabilityZone() != null) {
                String availabilityZone = allocateHostsRequest.getAvailabilityZone();
                jsonWriter.name("AvailabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (allocateHostsRequest.getClientToken() != null) {
                String clientToken = allocateHostsRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (allocateHostsRequest.getInstanceType() != null) {
                String instanceType = allocateHostsRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (allocateHostsRequest.getInstanceFamily() != null) {
                String instanceFamily = allocateHostsRequest.getInstanceFamily();
                jsonWriter.name("InstanceFamily");
                jsonWriter.value(instanceFamily);
            }
            if (allocateHostsRequest.getQuantity() != null) {
                Integer quantity = allocateHostsRequest.getQuantity();
                jsonWriter.name("Quantity");
                jsonWriter.value(quantity);
            }
            if (allocateHostsRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = allocateHostsRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (allocateHostsRequest.getHostRecovery() != null) {
                String hostRecovery = allocateHostsRequest.getHostRecovery();
                jsonWriter.name("HostRecovery");
                jsonWriter.value(hostRecovery);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
