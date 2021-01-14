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

package com.amazonaws.services.cognitoidentity.model.transform;

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
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SetIdentityPoolRolesRequest
 */
public class SetIdentityPoolRolesRequestMarshaller implements
        Marshaller<Request<SetIdentityPoolRolesRequest>, SetIdentityPoolRolesRequest> {

    public Request<SetIdentityPoolRolesRequest> marshall(
            SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) {
        if (setIdentityPoolRolesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetIdentityPoolRolesRequest)");
        }

        Request<SetIdentityPoolRolesRequest> request = new DefaultRequest<SetIdentityPoolRolesRequest>(
                setIdentityPoolRolesRequest, "AmazonCognitoIdentity");
        String target = "AWSCognitoIdentityService.SetIdentityPoolRoles";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (setIdentityPoolRolesRequest.getIdentityPoolId() != null) {
                String identityPoolId = setIdentityPoolRolesRequest.getIdentityPoolId();
                jsonWriter.name("IdentityPoolId");
                jsonWriter.value(identityPoolId);
            }
            if (setIdentityPoolRolesRequest.getRoles() != null) {
                java.util.Map<String, String> roles = setIdentityPoolRolesRequest.getRoles();
                jsonWriter.name("Roles");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> rolesEntry : roles.entrySet()) {
                    String rolesValue = rolesEntry.getValue();
                    if (rolesValue != null) {
                        jsonWriter.name(rolesEntry.getKey());
                        jsonWriter.value(rolesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (setIdentityPoolRolesRequest.getRoleMappings() != null) {
                java.util.Map<String, RoleMapping> roleMappings = setIdentityPoolRolesRequest
                        .getRoleMappings();
                jsonWriter.name("RoleMappings");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, RoleMapping> roleMappingsEntry : roleMappings
                        .entrySet()) {
                    RoleMapping roleMappingsValue = roleMappingsEntry.getValue();
                    if (roleMappingsValue != null) {
                        jsonWriter.name(roleMappingsEntry.getKey());
                        RoleMappingJsonMarshaller.getInstance().marshall(roleMappingsValue,
                                jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
