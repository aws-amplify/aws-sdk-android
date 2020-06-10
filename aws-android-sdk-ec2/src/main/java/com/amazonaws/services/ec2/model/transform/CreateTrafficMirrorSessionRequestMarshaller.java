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
 * JSON request marshaller for CreateTrafficMirrorSessionRequest
 */
public class CreateTrafficMirrorSessionRequestMarshaller implements
        Marshaller<Request<CreateTrafficMirrorSessionRequest>, CreateTrafficMirrorSessionRequest> {

    public Request<CreateTrafficMirrorSessionRequest> marshall(
            CreateTrafficMirrorSessionRequest createTrafficMirrorSessionRequest) {
        if (createTrafficMirrorSessionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTrafficMirrorSessionRequest)");
        }

        Request<CreateTrafficMirrorSessionRequest> request = new DefaultRequest<CreateTrafficMirrorSessionRequest>(
                createTrafficMirrorSessionRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTrafficMirrorSessionRequest.getNetworkInterfaceId() != null) {
                String networkInterfaceId = createTrafficMirrorSessionRequest
                        .getNetworkInterfaceId();
                jsonWriter.name("NetworkInterfaceId");
                jsonWriter.value(networkInterfaceId);
            }
            if (createTrafficMirrorSessionRequest.getTrafficMirrorTargetId() != null) {
                String trafficMirrorTargetId = createTrafficMirrorSessionRequest
                        .getTrafficMirrorTargetId();
                jsonWriter.name("TrafficMirrorTargetId");
                jsonWriter.value(trafficMirrorTargetId);
            }
            if (createTrafficMirrorSessionRequest.getTrafficMirrorFilterId() != null) {
                String trafficMirrorFilterId = createTrafficMirrorSessionRequest
                        .getTrafficMirrorFilterId();
                jsonWriter.name("TrafficMirrorFilterId");
                jsonWriter.value(trafficMirrorFilterId);
            }
            if (createTrafficMirrorSessionRequest.getPacketLength() != null) {
                Integer packetLength = createTrafficMirrorSessionRequest.getPacketLength();
                jsonWriter.name("PacketLength");
                jsonWriter.value(packetLength);
            }
            if (createTrafficMirrorSessionRequest.getSessionNumber() != null) {
                Integer sessionNumber = createTrafficMirrorSessionRequest.getSessionNumber();
                jsonWriter.name("SessionNumber");
                jsonWriter.value(sessionNumber);
            }
            if (createTrafficMirrorSessionRequest.getVirtualNetworkId() != null) {
                Integer virtualNetworkId = createTrafficMirrorSessionRequest.getVirtualNetworkId();
                jsonWriter.name("VirtualNetworkId");
                jsonWriter.value(virtualNetworkId);
            }
            if (createTrafficMirrorSessionRequest.getDescription() != null) {
                String description = createTrafficMirrorSessionRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createTrafficMirrorSessionRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createTrafficMirrorSessionRequest
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
            if (createTrafficMirrorSessionRequest.getDryRun() != null) {
                Boolean dryRun = createTrafficMirrorSessionRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createTrafficMirrorSessionRequest.getClientToken() != null) {
                String clientToken = createTrafficMirrorSessionRequest.getClientToken();
                jsonWriter.name("ClientToken");
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
