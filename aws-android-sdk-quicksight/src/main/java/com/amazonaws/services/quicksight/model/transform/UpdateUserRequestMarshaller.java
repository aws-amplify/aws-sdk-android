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
 * JSON request marshaller for UpdateUserRequest
 */
public class UpdateUserRequestMarshaller implements
        Marshaller<Request<UpdateUserRequest>, UpdateUserRequest> {

    public Request<UpdateUserRequest> marshall(UpdateUserRequest updateUserRequest) {
        if (updateUserRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateUserRequest)");
        }

        Request<UpdateUserRequest> request = new DefaultRequest<UpdateUserRequest>(
                updateUserRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/users/{UserName}";
        uriResourcePath = uriResourcePath.replace(
                "{UserName}",
                (updateUserRequest.getUserName() == null) ? "" : StringUtils
                        .fromString(updateUserRequest.getUserName()));
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (updateUserRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(updateUserRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (updateUserRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(updateUserRequest.getNamespace()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateUserRequest.getEmail() != null) {
                String email = updateUserRequest.getEmail();
                jsonWriter.name("Email");
                jsonWriter.value(email);
            }
            if (updateUserRequest.getRole() != null) {
                String role = updateUserRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
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
