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
 * JSON request marshaller for DeleteChannelBanRequest
 */
public class DeleteChannelBanRequestMarshaller implements
        Marshaller<Request<DeleteChannelBanRequest>, DeleteChannelBanRequest> {

    public Request<DeleteChannelBanRequest> marshall(DeleteChannelBanRequest deleteChannelBanRequest) {
        if (deleteChannelBanRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteChannelBanRequest)");
        }

        Request<DeleteChannelBanRequest> request = new DefaultRequest<DeleteChannelBanRequest>(
                deleteChannelBanRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.DELETE);

        if (deleteChannelBanRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(deleteChannelBanRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}/bans/{memberArn}";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (deleteChannelBanRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(deleteChannelBanRequest.getChannelArn()));
        uriResourcePath = uriResourcePath.replace(
                "{memberArn}",
                (deleteChannelBanRequest.getMemberArn() == null) ? "" : StringUtils
                        .fromString(deleteChannelBanRequest.getMemberArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}/bans/{memberArn}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (deleteChannelBanRequest.getChannelArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(deleteChannelBanRequest.getChannelArn())));
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{memberArn}",
                (deleteChannelBanRequest.getMemberArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(deleteChannelBanRequest.getMemberArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
