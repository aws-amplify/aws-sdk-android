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
 * JSON request marshaller for RedactChannelMessageRequest
 */
public class RedactChannelMessageRequestMarshaller implements
        Marshaller<Request<RedactChannelMessageRequest>, RedactChannelMessageRequest> {

    public Request<RedactChannelMessageRequest> marshall(
            RedactChannelMessageRequest redactChannelMessageRequest) {
        if (redactChannelMessageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RedactChannelMessageRequest)");
        }

        Request<RedactChannelMessageRequest> request = new DefaultRequest<RedactChannelMessageRequest>(
                redactChannelMessageRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.POST);

        if (redactChannelMessageRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(redactChannelMessageRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}/messages/{messageId}";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (redactChannelMessageRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(redactChannelMessageRequest.getChannelArn()));
        uriResourcePath = uriResourcePath.replace(
                "{messageId}",
                (redactChannelMessageRequest.getMessageId() == null) ? "" : StringUtils
                        .fromString(redactChannelMessageRequest.getMessageId()));
        request.addParameter("operation", "redact");
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}/messages/{messageId}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (redactChannelMessageRequest.getChannelArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(redactChannelMessageRequest.getChannelArn())));
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{messageId}",
                (redactChannelMessageRequest.getMessageId() == null) ? "" : Uri.encode(StringUtils
                        .fromString(redactChannelMessageRequest.getMessageId())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
