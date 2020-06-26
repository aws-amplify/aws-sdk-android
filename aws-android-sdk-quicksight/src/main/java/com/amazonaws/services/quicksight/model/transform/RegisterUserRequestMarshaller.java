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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RegisterUserRequest
 */
public class RegisterUserRequestMarshaller implements
        Marshaller<Request<RegisterUserRequest>, RegisterUserRequest> {

    public Request<RegisterUserRequest> marshall(RegisterUserRequest registerUserRequest) {
        if (registerUserRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterUserRequest)");
        }

        Request<RegisterUserRequest> request = new DefaultRequest<RegisterUserRequest>(
                registerUserRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/users";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (registerUserRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(registerUserRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (registerUserRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(registerUserRequest.getNamespace()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerUserRequest.getIdentityType() != null) {
                String identityType = registerUserRequest.getIdentityType();
                jsonWriter.name("IdentityType");
                jsonWriter.value(identityType);
            }
            if (registerUserRequest.getEmail() != null) {
                String email = registerUserRequest.getEmail();
                jsonWriter.name("Email");
                jsonWriter.value(email);
            }
            if (registerUserRequest.getUserRole() != null) {
                String userRole = registerUserRequest.getUserRole();
                jsonWriter.name("UserRole");
                jsonWriter.value(userRole);
            }
            if (registerUserRequest.getIamArn() != null) {
                String iamArn = registerUserRequest.getIamArn();
                jsonWriter.name("IamArn");
                jsonWriter.value(iamArn);
            }
            if (registerUserRequest.getSessionName() != null) {
                String sessionName = registerUserRequest.getSessionName();
                jsonWriter.name("SessionName");
                jsonWriter.value(sessionName);
            }
            if (registerUserRequest.getUserName() != null) {
                String userName = registerUserRequest.getUserName();
                jsonWriter.name("UserName");
                jsonWriter.value(userName);
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
