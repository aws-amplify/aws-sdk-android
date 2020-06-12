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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for TestInvokeAuthorizerRequest
 */
public class TestInvokeAuthorizerRequestMarshaller implements
        Marshaller<Request<TestInvokeAuthorizerRequest>, TestInvokeAuthorizerRequest> {

    public Request<TestInvokeAuthorizerRequest> marshall(
            TestInvokeAuthorizerRequest testInvokeAuthorizerRequest) {
        if (testInvokeAuthorizerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TestInvokeAuthorizerRequest)");
        }

        Request<TestInvokeAuthorizerRequest> request = new DefaultRequest<TestInvokeAuthorizerRequest>(
                testInvokeAuthorizerRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/authorizers/{authorizer_id}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (testInvokeAuthorizerRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(testInvokeAuthorizerRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{authorizer_id}",
                (testInvokeAuthorizerRequest.getAuthorizerId() == null) ? "" : StringUtils
                        .fromString(testInvokeAuthorizerRequest.getAuthorizerId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (testInvokeAuthorizerRequest.getHeaders() != null) {
                java.util.Map<String, String> headers = testInvokeAuthorizerRequest.getHeaders();
                jsonWriter.name("headers");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> headersEntry : headers.entrySet()) {
                    String headersValue = headersEntry.getValue();
                    if (headersValue != null) {
                        jsonWriter.name(headersEntry.getKey());
                        jsonWriter.value(headersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (testInvokeAuthorizerRequest.getMultiValueHeaders() != null) {
                java.util.Map<String, java.util.List<String>> multiValueHeaders = testInvokeAuthorizerRequest
                        .getMultiValueHeaders();
                jsonWriter.name("multiValueHeaders");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> multiValueHeadersEntry : multiValueHeaders
                        .entrySet()) {
                    java.util.List<String> multiValueHeadersValue = multiValueHeadersEntry
                            .getValue();
                    if (multiValueHeadersValue != null) {
                        jsonWriter.name(multiValueHeadersEntry.getKey());
                        jsonWriter.beginArray();
                        for (String multiValueHeadersValueItem : multiValueHeadersValue) {
                            if (multiValueHeadersValueItem != null) {
                                jsonWriter.value(multiValueHeadersValueItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (testInvokeAuthorizerRequest.getPathWithQueryString() != null) {
                String pathWithQueryString = testInvokeAuthorizerRequest.getPathWithQueryString();
                jsonWriter.name("pathWithQueryString");
                jsonWriter.value(pathWithQueryString);
            }
            if (testInvokeAuthorizerRequest.getBody() != null) {
                String body = testInvokeAuthorizerRequest.getBody();
                jsonWriter.name("body");
                jsonWriter.value(body);
            }
            if (testInvokeAuthorizerRequest.getStageVariables() != null) {
                java.util.Map<String, String> stageVariables = testInvokeAuthorizerRequest
                        .getStageVariables();
                jsonWriter.name("stageVariables");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> stageVariablesEntry : stageVariables
                        .entrySet()) {
                    String stageVariablesValue = stageVariablesEntry.getValue();
                    if (stageVariablesValue != null) {
                        jsonWriter.name(stageVariablesEntry.getKey());
                        jsonWriter.value(stageVariablesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (testInvokeAuthorizerRequest.getAdditionalContext() != null) {
                java.util.Map<String, String> additionalContext = testInvokeAuthorizerRequest
                        .getAdditionalContext();
                jsonWriter.name("additionalContext");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> additionalContextEntry : additionalContext
                        .entrySet()) {
                    String additionalContextValue = additionalContextEntry.getValue();
                    if (additionalContextValue != null) {
                        jsonWriter.name(additionalContextEntry.getKey());
                        jsonWriter.value(additionalContextValue);
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
