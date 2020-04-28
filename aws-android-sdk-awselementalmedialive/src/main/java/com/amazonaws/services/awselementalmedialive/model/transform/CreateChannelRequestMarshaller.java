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

package com.amazonaws.services.awselementalmedialive.model.transform;

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
import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateChannelRequest
 */
public class CreateChannelRequestMarshaller implements
        Marshaller<Request<CreateChannelRequest>, CreateChannelRequest> {

    public Request<CreateChannelRequest> marshall(CreateChannelRequest createChannelRequest) {
        if (createChannelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateChannelRequest)");
        }

        Request<CreateChannelRequest> request = new DefaultRequest<CreateChannelRequest>(
                createChannelRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/prod/channels";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createChannelRequest.getChannelClass() != null) {
                String channelClass = createChannelRequest.getChannelClass();
                jsonWriter.name("ChannelClass");
                jsonWriter.value(channelClass);
            }
            if (createChannelRequest.getDestinations() != null) {
                java.util.List<OutputDestination> destinations = createChannelRequest
                        .getDestinations();
                jsonWriter.name("Destinations");
                jsonWriter.beginArray();
                for (OutputDestination destinationsItem : destinations) {
                    if (destinationsItem != null) {
                        OutputDestinationJsonMarshaller.getInstance().marshall(destinationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createChannelRequest.getEncoderSettings() != null) {
                EncoderSettings encoderSettings = createChannelRequest.getEncoderSettings();
                jsonWriter.name("EncoderSettings");
                EncoderSettingsJsonMarshaller.getInstance().marshall(encoderSettings, jsonWriter);
            }
            if (createChannelRequest.getInputAttachments() != null) {
                java.util.List<InputAttachment> inputAttachments = createChannelRequest
                        .getInputAttachments();
                jsonWriter.name("InputAttachments");
                jsonWriter.beginArray();
                for (InputAttachment inputAttachmentsItem : inputAttachments) {
                    if (inputAttachmentsItem != null) {
                        InputAttachmentJsonMarshaller.getInstance().marshall(inputAttachmentsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createChannelRequest.getInputSpecification() != null) {
                InputSpecification inputSpecification = createChannelRequest
                        .getInputSpecification();
                jsonWriter.name("InputSpecification");
                InputSpecificationJsonMarshaller.getInstance().marshall(inputSpecification,
                        jsonWriter);
            }
            if (createChannelRequest.getLogLevel() != null) {
                String logLevel = createChannelRequest.getLogLevel();
                jsonWriter.name("LogLevel");
                jsonWriter.value(logLevel);
            }
            if (createChannelRequest.getName() != null) {
                String name = createChannelRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createChannelRequest.getRequestId() != null) {
                String requestId = createChannelRequest.getRequestId();
                jsonWriter.name("RequestId");
                jsonWriter.value(requestId);
            }
            if (createChannelRequest.getReserved() != null) {
                String reserved = createChannelRequest.getReserved();
                jsonWriter.name("Reserved");
                jsonWriter.value(reserved);
            }
            if (createChannelRequest.getRoleArn() != null) {
                String roleArn = createChannelRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createChannelRequest.getTags() != null) {
                java.util.Map<String, String> tags = createChannelRequest.getTags();
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
