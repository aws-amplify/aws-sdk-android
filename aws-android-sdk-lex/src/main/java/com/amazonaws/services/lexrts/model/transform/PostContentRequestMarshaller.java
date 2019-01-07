/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

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
import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PostContentRequest
 */
public class PostContentRequestMarshaller implements
        Marshaller<Request<PostContentRequest>, PostContentRequest> {

    public Request<PostContentRequest> marshall(PostContentRequest postContentRequest) {
        if (postContentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PostContentRequest)");
        }

        Request<PostContentRequest> request = new DefaultRequest<PostContentRequest>(
                postContentRequest, "AmazonLexRuntime");
        request.setHttpMethod(HttpMethodName.POST);

        if (postContentRequest.getSessionAttributes() != null) {
            request.addHeader("x-amz-lex-session-attributes",
                    StringUtils.fromString(postContentRequest.getSessionAttributes()));
        }
        if (postContentRequest.getRequestAttributes() != null) {
            request.addHeader("x-amz-lex-request-attributes",
                    StringUtils.fromString(postContentRequest.getRequestAttributes()));
        }
        if (postContentRequest.getContentType() != null) {
            request.addHeader("Content-Type",
                    StringUtils.fromString(postContentRequest.getContentType()));
        }
        if (postContentRequest.getAccept() != null) {
            request.addHeader("Accept", StringUtils.fromString(postContentRequest.getAccept()));
        }
        String uriResourcePath = "/bot/{botName}/alias/{botAlias}/user/{userId}/content";
        uriResourcePath = uriResourcePath.replace(
                "{botName}",
                (postContentRequest.getBotName() == null) ? "" : StringUtils
                        .fromString(postContentRequest.getBotName()));
        uriResourcePath = uriResourcePath.replace(
                "{botAlias}",
                (postContentRequest.getBotAlias() == null) ? "" : StringUtils
                        .fromString(postContentRequest.getBotAlias()));
        uriResourcePath = uriResourcePath.replace(
                "{userId}",
                (postContentRequest.getUserId() == null) ? "" : StringUtils
                        .fromString(postContentRequest.getUserId()));
        request.setResourcePath(uriResourcePath);
        request.setContent(postContentRequest.getInputStream());
        request.setStreaming(true);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
