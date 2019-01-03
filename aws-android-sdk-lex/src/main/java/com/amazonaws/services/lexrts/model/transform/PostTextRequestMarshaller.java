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
 * JSON request marshaller for PostTextRequest
 */
public class PostTextRequestMarshaller implements
        Marshaller<Request<PostTextRequest>, PostTextRequest> {

    public Request<PostTextRequest> marshall(PostTextRequest postTextRequest) {
        if (postTextRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PostTextRequest)");
        }

        Request<PostTextRequest> request = new DefaultRequest<PostTextRequest>(postTextRequest,
                "AmazonLexRuntime");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/bot/{botName}/alias/{botAlias}/user/{userId}/text";
        uriResourcePath = uriResourcePath.replace(
                "{botName}",
                (postTextRequest.getBotName() == null) ? "" : StringUtils
                        .fromString(postTextRequest.getBotName()));
        uriResourcePath = uriResourcePath.replace(
                "{botAlias}",
                (postTextRequest.getBotAlias() == null) ? "" : StringUtils
                        .fromString(postTextRequest.getBotAlias()));
        uriResourcePath = uriResourcePath.replace(
                "{userId}",
                (postTextRequest.getUserId() == null) ? "" : StringUtils.fromString(postTextRequest
                        .getUserId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (postTextRequest.getSessionAttributes() != null) {
                java.util.Map<String, String> sessionAttributes = postTextRequest
                        .getSessionAttributes();
                jsonWriter.name("sessionAttributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> sessionAttributesEntry : sessionAttributes
                        .entrySet()) {
                    String sessionAttributesValue = sessionAttributesEntry.getValue();
                    if (sessionAttributesValue != null) {
                        jsonWriter.name(sessionAttributesEntry.getKey());
                        jsonWriter.value(sessionAttributesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (postTextRequest.getRequestAttributes() != null) {
                java.util.Map<String, String> requestAttributes = postTextRequest
                        .getRequestAttributes();
                jsonWriter.name("requestAttributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestAttributesEntry : requestAttributes
                        .entrySet()) {
                    String requestAttributesValue = requestAttributesEntry.getValue();
                    if (requestAttributesValue != null) {
                        jsonWriter.name(requestAttributesEntry.getKey());
                        jsonWriter.value(requestAttributesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (postTextRequest.getInputText() != null) {
                String inputText = postTextRequest.getInputText();
                jsonWriter.name("inputText");
                jsonWriter.value(inputText);
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
