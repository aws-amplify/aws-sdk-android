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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
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
                testInvokeAuthorizerRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/authorizer/{authorizerName}/test";
        uriResourcePath = uriResourcePath.replace(
                "{authorizerName}",
                (testInvokeAuthorizerRequest.getAuthorizerName() == null) ? "" : StringUtils
                        .fromString(testInvokeAuthorizerRequest.getAuthorizerName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (testInvokeAuthorizerRequest.getToken() != null) {
                String token = testInvokeAuthorizerRequest.getToken();
                jsonWriter.name("token");
                jsonWriter.value(token);
            }
            if (testInvokeAuthorizerRequest.getTokenSignature() != null) {
                String tokenSignature = testInvokeAuthorizerRequest.getTokenSignature();
                jsonWriter.name("tokenSignature");
                jsonWriter.value(tokenSignature);
            }
            if (testInvokeAuthorizerRequest.getHttpContext() != null) {
                HttpContext httpContext = testInvokeAuthorizerRequest.getHttpContext();
                jsonWriter.name("httpContext");
                HttpContextJsonMarshaller.getInstance().marshall(httpContext, jsonWriter);
            }
            if (testInvokeAuthorizerRequest.getMqttContext() != null) {
                MqttContext mqttContext = testInvokeAuthorizerRequest.getMqttContext();
                jsonWriter.name("mqttContext");
                MqttContextJsonMarshaller.getInstance().marshall(mqttContext, jsonWriter);
            }
            if (testInvokeAuthorizerRequest.getTlsContext() != null) {
                TlsContext tlsContext = testInvokeAuthorizerRequest.getTlsContext();
                jsonWriter.name("tlsContext");
                TlsContextJsonMarshaller.getInstance().marshall(tlsContext, jsonWriter);
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
