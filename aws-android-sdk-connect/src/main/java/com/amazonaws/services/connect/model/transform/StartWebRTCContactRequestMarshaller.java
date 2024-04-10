/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartWebRTCContactRequest
 */
public class StartWebRTCContactRequestMarshaller implements
        Marshaller<Request<StartWebRTCContactRequest>, StartWebRTCContactRequest> {

    public Request<StartWebRTCContactRequest> marshall(
            StartWebRTCContactRequest startWebRTCContactRequest) {
        if (startWebRTCContactRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartWebRTCContactRequest)");
        }

        Request<StartWebRTCContactRequest> request = new DefaultRequest<StartWebRTCContactRequest>(
                startWebRTCContactRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/contact/webrtc";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startWebRTCContactRequest.getAttributes() != null) {
                java.util.Map<String, String> attributes = startWebRTCContactRequest
                        .getAttributes();
                jsonWriter.name("Attributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                    String attributesValue = attributesEntry.getValue();
                    if (attributesValue != null) {
                        jsonWriter.name(attributesEntry.getKey());
                        jsonWriter.value(attributesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (startWebRTCContactRequest.getClientToken() != null) {
                String clientToken = startWebRTCContactRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (startWebRTCContactRequest.getContactFlowId() != null) {
                String contactFlowId = startWebRTCContactRequest.getContactFlowId();
                jsonWriter.name("ContactFlowId");
                jsonWriter.value(contactFlowId);
            }
            if (startWebRTCContactRequest.getInstanceId() != null) {
                String instanceId = startWebRTCContactRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (startWebRTCContactRequest.getAllowedCapabilities() != null) {
                AllowedCapabilities allowedCapabilities = startWebRTCContactRequest
                        .getAllowedCapabilities();
                jsonWriter.name("AllowedCapabilities");
                AllowedCapabilitiesJsonMarshaller.getInstance().marshall(allowedCapabilities,
                        jsonWriter);
            }
            if (startWebRTCContactRequest.getParticipantDetails() != null) {
                ParticipantDetails participantDetails = startWebRTCContactRequest
                        .getParticipantDetails();
                jsonWriter.name("ParticipantDetails");
                ParticipantDetailsJsonMarshaller.getInstance().marshall(participantDetails,
                        jsonWriter);
            }
            if (startWebRTCContactRequest.getRelatedContactId() != null) {
                String relatedContactId = startWebRTCContactRequest.getRelatedContactId();
                jsonWriter.name("RelatedContactId");
                jsonWriter.value(relatedContactId);
            }
            if (startWebRTCContactRequest.getReferences() != null) {
                java.util.Map<String, Reference> references = startWebRTCContactRequest
                        .getReferences();
                jsonWriter.name("References");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Reference> referencesEntry : references.entrySet()) {
                    Reference referencesValue = referencesEntry.getValue();
                    if (referencesValue != null) {
                        jsonWriter.name(referencesEntry.getKey());
                        ReferenceJsonMarshaller.getInstance().marshall(referencesValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (startWebRTCContactRequest.getDescription() != null) {
                String description = startWebRTCContactRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
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
