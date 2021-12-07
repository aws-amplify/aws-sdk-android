/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model.transform;

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
import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import android.net.Uri;

/**
 * JSON request marshaller for SendChannelMessageRequest
 */
public class SendChannelMessageRequestMarshaller implements
        Marshaller<Request<SendChannelMessageRequest>, SendChannelMessageRequest> {

    public Request<SendChannelMessageRequest> marshall(
            SendChannelMessageRequest sendChannelMessageRequest) {
        if (sendChannelMessageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendChannelMessageRequest)");
        }

        Request<SendChannelMessageRequest> request = new DefaultRequest<SendChannelMessageRequest>(
                sendChannelMessageRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendChannelMessageRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(sendChannelMessageRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}/messages";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (sendChannelMessageRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(sendChannelMessageRequest.getChannelArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}/messages";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (sendChannelMessageRequest.getChannelArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(sendChannelMessageRequest.getChannelArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (sendChannelMessageRequest.getContent() != null) {
                String content = sendChannelMessageRequest.getContent();
                jsonWriter.name("Content");
                jsonWriter.value(content);
            }
            if (sendChannelMessageRequest.getType() != null) {
                String type = sendChannelMessageRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (sendChannelMessageRequest.getPersistence() != null) {
                String persistence = sendChannelMessageRequest.getPersistence();
                jsonWriter.name("Persistence");
                jsonWriter.value(persistence);
            }
            if (sendChannelMessageRequest.getMetadata() != null) {
                String metadata = sendChannelMessageRequest.getMetadata();
                jsonWriter.name("Metadata");
                jsonWriter.value(metadata);
            }
            if (sendChannelMessageRequest.getClientRequestToken() != null) {
                String clientRequestToken = sendChannelMessageRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (sendChannelMessageRequest.getPushNotification() != null) {
                PushNotificationConfiguration pushNotification = sendChannelMessageRequest
                        .getPushNotification();
                jsonWriter.name("PushNotification");
                PushNotificationConfigurationJsonMarshaller.getInstance().marshall(
                        pushNotification, jsonWriter);
            }
            if (sendChannelMessageRequest.getMessageAttributes() != null) {
                java.util.Map<String, MessageAttributeValue> messageAttributes = sendChannelMessageRequest
                        .getMessageAttributes();
                jsonWriter.name("MessageAttributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, MessageAttributeValue> messageAttributesEntry : messageAttributes
                        .entrySet()) {
                    MessageAttributeValue messageAttributesValue = messageAttributesEntry
                            .getValue();
                    if (messageAttributesValue != null) {
                        jsonWriter.name(messageAttributesEntry.getKey());
                        MessageAttributeValueJsonMarshaller.getInstance().marshall(
                                messageAttributesValue, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
