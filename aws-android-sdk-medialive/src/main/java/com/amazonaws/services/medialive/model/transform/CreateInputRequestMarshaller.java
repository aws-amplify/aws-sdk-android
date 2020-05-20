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

package com.amazonaws.services.medialive.model.transform;

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
import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInputRequest
 */
public class CreateInputRequestMarshaller implements
        Marshaller<Request<CreateInputRequest>, CreateInputRequest> {

    public Request<CreateInputRequest> marshall(CreateInputRequest createInputRequest) {
        if (createInputRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInputRequest)");
        }

        Request<CreateInputRequest> request = new DefaultRequest<CreateInputRequest>(
                createInputRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/prod/inputs";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInputRequest.getDestinations() != null) {
                java.util.List<InputDestinationRequest> destinations = createInputRequest
                        .getDestinations();
                jsonWriter.name("Destinations");
                jsonWriter.beginArray();
                for (InputDestinationRequest destinationsItem : destinations) {
                    if (destinationsItem != null) {
                        InputDestinationRequestJsonMarshaller.getInstance().marshall(
                                destinationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInputRequest.getInputDevices() != null) {
                java.util.List<InputDeviceSettings> inputDevices = createInputRequest
                        .getInputDevices();
                jsonWriter.name("InputDevices");
                jsonWriter.beginArray();
                for (InputDeviceSettings inputDevicesItem : inputDevices) {
                    if (inputDevicesItem != null) {
                        InputDeviceSettingsJsonMarshaller.getInstance().marshall(inputDevicesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInputRequest.getInputSecurityGroups() != null) {
                java.util.List<String> inputSecurityGroups = createInputRequest
                        .getInputSecurityGroups();
                jsonWriter.name("InputSecurityGroups");
                jsonWriter.beginArray();
                for (String inputSecurityGroupsItem : inputSecurityGroups) {
                    if (inputSecurityGroupsItem != null) {
                        jsonWriter.value(inputSecurityGroupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInputRequest.getMediaConnectFlows() != null) {
                java.util.List<MediaConnectFlowRequest> mediaConnectFlows = createInputRequest
                        .getMediaConnectFlows();
                jsonWriter.name("MediaConnectFlows");
                jsonWriter.beginArray();
                for (MediaConnectFlowRequest mediaConnectFlowsItem : mediaConnectFlows) {
                    if (mediaConnectFlowsItem != null) {
                        MediaConnectFlowRequestJsonMarshaller.getInstance().marshall(
                                mediaConnectFlowsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInputRequest.getName() != null) {
                String name = createInputRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createInputRequest.getRequestId() != null) {
                String requestId = createInputRequest.getRequestId();
                jsonWriter.name("RequestId");
                jsonWriter.value(requestId);
            }
            if (createInputRequest.getRoleArn() != null) {
                String roleArn = createInputRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createInputRequest.getSources() != null) {
                java.util.List<InputSourceRequest> sources = createInputRequest.getSources();
                jsonWriter.name("Sources");
                jsonWriter.beginArray();
                for (InputSourceRequest sourcesItem : sources) {
                    if (sourcesItem != null) {
                        InputSourceRequestJsonMarshaller.getInstance().marshall(sourcesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInputRequest.getTags() != null) {
                java.util.Map<String, String> tags = createInputRequest.getTags();
                jsonWriter.name("Tags");
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
            if (createInputRequest.getType() != null) {
                String type = createInputRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (createInputRequest.getVpc() != null) {
                InputVpcRequest vpc = createInputRequest.getVpc();
                jsonWriter.name("Vpc");
                InputVpcRequestJsonMarshaller.getInstance().marshall(vpc, jsonWriter);
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
