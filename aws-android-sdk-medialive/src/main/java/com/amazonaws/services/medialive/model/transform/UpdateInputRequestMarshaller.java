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
 * JSON request marshaller for UpdateInputRequest
 */
public class UpdateInputRequestMarshaller implements
        Marshaller<Request<UpdateInputRequest>, UpdateInputRequest> {

    public Request<UpdateInputRequest> marshall(UpdateInputRequest updateInputRequest) {
        if (updateInputRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateInputRequest)");
        }

        Request<UpdateInputRequest> request = new DefaultRequest<UpdateInputRequest>(
                updateInputRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/prod/inputs/{inputId}";
        uriResourcePath = uriResourcePath.replace(
                "{inputId}",
                (updateInputRequest.getInputId() == null) ? "" : StringUtils
                        .fromString(updateInputRequest.getInputId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateInputRequest.getDestinations() != null) {
                java.util.List<InputDestinationRequest> destinations = updateInputRequest
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
            if (updateInputRequest.getInputDevices() != null) {
                java.util.List<InputDeviceRequest> inputDevices = updateInputRequest
                        .getInputDevices();
                jsonWriter.name("InputDevices");
                jsonWriter.beginArray();
                for (InputDeviceRequest inputDevicesItem : inputDevices) {
                    if (inputDevicesItem != null) {
                        InputDeviceRequestJsonMarshaller.getInstance().marshall(inputDevicesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateInputRequest.getInputSecurityGroups() != null) {
                java.util.List<String> inputSecurityGroups = updateInputRequest
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
            if (updateInputRequest.getMediaConnectFlows() != null) {
                java.util.List<MediaConnectFlowRequest> mediaConnectFlows = updateInputRequest
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
            if (updateInputRequest.getName() != null) {
                String name = updateInputRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateInputRequest.getRoleArn() != null) {
                String roleArn = updateInputRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (updateInputRequest.getSources() != null) {
                java.util.List<InputSourceRequest> sources = updateInputRequest.getSources();
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
