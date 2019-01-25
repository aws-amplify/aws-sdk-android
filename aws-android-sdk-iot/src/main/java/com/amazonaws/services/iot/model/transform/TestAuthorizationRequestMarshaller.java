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
 * JSON request marshaller for TestAuthorizationRequest
 */
public class TestAuthorizationRequestMarshaller implements
        Marshaller<Request<TestAuthorizationRequest>, TestAuthorizationRequest> {

    public Request<TestAuthorizationRequest> marshall(
            TestAuthorizationRequest testAuthorizationRequest) {
        if (testAuthorizationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TestAuthorizationRequest)");
        }

        Request<TestAuthorizationRequest> request = new DefaultRequest<TestAuthorizationRequest>(
                testAuthorizationRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/test-authorization";
        if (testAuthorizationRequest.getClientId() != null) {
            request.addParameter("clientId",
                    StringUtils.fromString(testAuthorizationRequest.getClientId()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (testAuthorizationRequest.getPrincipal() != null) {
                String principal = testAuthorizationRequest.getPrincipal();
                jsonWriter.name("principal");
                jsonWriter.value(principal);
            }
            if (testAuthorizationRequest.getCognitoIdentityPoolId() != null) {
                String cognitoIdentityPoolId = testAuthorizationRequest.getCognitoIdentityPoolId();
                jsonWriter.name("cognitoIdentityPoolId");
                jsonWriter.value(cognitoIdentityPoolId);
            }
            if (testAuthorizationRequest.getAuthInfos() != null) {
                java.util.List<AuthInfo> authInfos = testAuthorizationRequest.getAuthInfos();
                jsonWriter.name("authInfos");
                jsonWriter.beginArray();
                for (AuthInfo authInfosItem : authInfos) {
                    if (authInfosItem != null) {
                        AuthInfoJsonMarshaller.getInstance().marshall(authInfosItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (testAuthorizationRequest.getPolicyNamesToAdd() != null) {
                java.util.List<String> policyNamesToAdd = testAuthorizationRequest
                        .getPolicyNamesToAdd();
                jsonWriter.name("policyNamesToAdd");
                jsonWriter.beginArray();
                for (String policyNamesToAddItem : policyNamesToAdd) {
                    if (policyNamesToAddItem != null) {
                        jsonWriter.value(policyNamesToAddItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (testAuthorizationRequest.getPolicyNamesToSkip() != null) {
                java.util.List<String> policyNamesToSkip = testAuthorizationRequest
                        .getPolicyNamesToSkip();
                jsonWriter.name("policyNamesToSkip");
                jsonWriter.beginArray();
                for (String policyNamesToSkipItem : policyNamesToSkip) {
                    if (policyNamesToSkipItem != null) {
                        jsonWriter.value(policyNamesToSkipItem);
                    }
                }
                jsonWriter.endArray();
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
