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
 * JSON request marshaller for DescribeChannelBanRequest
 */
public class DescribeChannelBanRequestMarshaller implements
        Marshaller<Request<DescribeChannelBanRequest>, DescribeChannelBanRequest> {

    public Request<DescribeChannelBanRequest> marshall(
            DescribeChannelBanRequest describeChannelBanRequest) {
        if (describeChannelBanRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeChannelBanRequest)");
        }

        Request<DescribeChannelBanRequest> request = new DefaultRequest<DescribeChannelBanRequest>(
                describeChannelBanRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.GET);

        if (describeChannelBanRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(describeChannelBanRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}/bans/{memberArn}";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (describeChannelBanRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(describeChannelBanRequest.getChannelArn()));
        uriResourcePath = uriResourcePath.replace(
                "{memberArn}",
                (describeChannelBanRequest.getMemberArn() == null) ? "" : StringUtils
                        .fromString(describeChannelBanRequest.getMemberArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}/bans/{memberArn}";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (describeChannelBanRequest.getChannelArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(describeChannelBanRequest.getChannelArn())));
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{memberArn}",
                (describeChannelBanRequest.getMemberArn() == null) ? "" : Uri.encode(StringUtils
                        .fromString(describeChannelBanRequest.getMemberArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
