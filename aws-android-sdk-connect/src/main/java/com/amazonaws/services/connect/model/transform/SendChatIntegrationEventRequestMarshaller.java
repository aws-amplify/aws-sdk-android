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
 * JSON request marshaller for SendChatIntegrationEventRequest
 */
public class SendChatIntegrationEventRequestMarshaller implements
        Marshaller<Request<SendChatIntegrationEventRequest>, SendChatIntegrationEventRequest> {

    public Request<SendChatIntegrationEventRequest> marshall(
            SendChatIntegrationEventRequest sendChatIntegrationEventRequest) {
        if (sendChatIntegrationEventRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendChatIntegrationEventRequest)");
        }

        Request<SendChatIntegrationEventRequest> request = new DefaultRequest<SendChatIntegrationEventRequest>(
                sendChatIntegrationEventRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/chat-integration-event";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (sendChatIntegrationEventRequest.getSourceId() != null) {
                String sourceId = sendChatIntegrationEventRequest.getSourceId();
                jsonWriter.name("SourceId");
                jsonWriter.value(sourceId);
            }
            if (sendChatIntegrationEventRequest.getDestinationId() != null) {
                String destinationId = sendChatIntegrationEventRequest.getDestinationId();
                jsonWriter.name("DestinationId");
                jsonWriter.value(destinationId);
            }
            if (sendChatIntegrationEventRequest.getSubtype() != null) {
                String subtype = sendChatIntegrationEventRequest.getSubtype();
                jsonWriter.name("Subtype");
                jsonWriter.value(subtype);
            }
            if (sendChatIntegrationEventRequest.getEvent() != null) {
                ChatEvent event = sendChatIntegrationEventRequest.getEvent();
                jsonWriter.name("Event");
                ChatEventJsonMarshaller.getInstance().marshall(event, jsonWriter);
            }
            if (sendChatIntegrationEventRequest.getNewSessionDetails() != null) {
                NewSessionDetails newSessionDetails = sendChatIntegrationEventRequest
                        .getNewSessionDetails();
                jsonWriter.name("NewSessionDetails");
                NewSessionDetailsJsonMarshaller.getInstance().marshall(newSessionDetails,
                        jsonWriter);
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
