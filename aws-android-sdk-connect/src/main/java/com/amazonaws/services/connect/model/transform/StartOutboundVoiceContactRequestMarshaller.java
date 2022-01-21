/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for StartOutboundVoiceContactRequest
 */
public class StartOutboundVoiceContactRequestMarshaller implements
        Marshaller<Request<StartOutboundVoiceContactRequest>, StartOutboundVoiceContactRequest> {

    public Request<StartOutboundVoiceContactRequest> marshall(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest) {
        if (startOutboundVoiceContactRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartOutboundVoiceContactRequest)");
        }

        Request<StartOutboundVoiceContactRequest> request = new DefaultRequest<StartOutboundVoiceContactRequest>(
                startOutboundVoiceContactRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/contact/outbound-voice";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startOutboundVoiceContactRequest.getDestinationPhoneNumber() != null) {
                String destinationPhoneNumber = startOutboundVoiceContactRequest
                        .getDestinationPhoneNumber();
                jsonWriter.name("DestinationPhoneNumber");
                jsonWriter.value(destinationPhoneNumber);
            }
            if (startOutboundVoiceContactRequest.getContactFlowId() != null) {
                String contactFlowId = startOutboundVoiceContactRequest.getContactFlowId();
                jsonWriter.name("ContactFlowId");
                jsonWriter.value(contactFlowId);
            }
            if (startOutboundVoiceContactRequest.getInstanceId() != null) {
                String instanceId = startOutboundVoiceContactRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (startOutboundVoiceContactRequest.getClientToken() != null) {
                String clientToken = startOutboundVoiceContactRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (startOutboundVoiceContactRequest.getSourcePhoneNumber() != null) {
                String sourcePhoneNumber = startOutboundVoiceContactRequest.getSourcePhoneNumber();
                jsonWriter.name("SourcePhoneNumber");
                jsonWriter.value(sourcePhoneNumber);
            }
            if (startOutboundVoiceContactRequest.getQueueId() != null) {
                String queueId = startOutboundVoiceContactRequest.getQueueId();
                jsonWriter.name("QueueId");
                jsonWriter.value(queueId);
            }
            if (startOutboundVoiceContactRequest.getAttributes() != null) {
                java.util.Map<String, String> attributes = startOutboundVoiceContactRequest
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
            if (startOutboundVoiceContactRequest.getAnswerMachineDetectionConfig() != null) {
                AnswerMachineDetectionConfig answerMachineDetectionConfig = startOutboundVoiceContactRequest
                        .getAnswerMachineDetectionConfig();
                jsonWriter.name("AnswerMachineDetectionConfig");
                AnswerMachineDetectionConfigJsonMarshaller.getInstance().marshall(
                        answerMachineDetectionConfig, jsonWriter);
            }
            if (startOutboundVoiceContactRequest.getCampaignId() != null) {
                String campaignId = startOutboundVoiceContactRequest.getCampaignId();
                jsonWriter.name("CampaignId");
                jsonWriter.value(campaignId);
            }
            if (startOutboundVoiceContactRequest.getTrafficType() != null) {
                String trafficType = startOutboundVoiceContactRequest.getTrafficType();
                jsonWriter.name("TrafficType");
                jsonWriter.value(trafficType);
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
