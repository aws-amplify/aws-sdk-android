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
 * JSON request marshaller for UpdateChannelRequest
 */
public class UpdateChannelRequestMarshaller implements
        Marshaller<Request<UpdateChannelRequest>, UpdateChannelRequest> {

    public Request<UpdateChannelRequest> marshall(UpdateChannelRequest updateChannelRequest) {
        if (updateChannelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateChannelRequest)");
        }

        Request<UpdateChannelRequest> request = new DefaultRequest<UpdateChannelRequest>(
                updateChannelRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/prod/channels/{channelId}";
        uriResourcePath = uriResourcePath.replace(
                "{channelId}",
                (updateChannelRequest.getChannelId() == null) ? "" : StringUtils
                        .fromString(updateChannelRequest.getChannelId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateChannelRequest.getDestinations() != null) {
                java.util.List<OutputDestination> destinations = updateChannelRequest
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
            if (updateChannelRequest.getEncoderSettings() != null) {
                EncoderSettings encoderSettings = updateChannelRequest.getEncoderSettings();
                jsonWriter.name("EncoderSettings");
                EncoderSettingsJsonMarshaller.getInstance().marshall(encoderSettings, jsonWriter);
            }
            if (updateChannelRequest.getInputAttachments() != null) {
                java.util.List<InputAttachment> inputAttachments = updateChannelRequest
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
            if (updateChannelRequest.getInputSpecification() != null) {
                InputSpecification inputSpecification = updateChannelRequest
                        .getInputSpecification();
                jsonWriter.name("InputSpecification");
                InputSpecificationJsonMarshaller.getInstance().marshall(inputSpecification,
                        jsonWriter);
            }
            if (updateChannelRequest.getLogLevel() != null) {
                String logLevel = updateChannelRequest.getLogLevel();
                jsonWriter.name("LogLevel");
                jsonWriter.value(logLevel);
            }
            if (updateChannelRequest.getName() != null) {
                String name = updateChannelRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateChannelRequest.getRoleArn() != null) {
                String roleArn = updateChannelRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
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
