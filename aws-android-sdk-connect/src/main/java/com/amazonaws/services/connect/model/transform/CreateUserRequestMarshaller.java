/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateUserRequest
 */
public class CreateUserRequestMarshaller implements
        Marshaller<Request<CreateUserRequest>, CreateUserRequest> {

    public Request<CreateUserRequest> marshall(CreateUserRequest createUserRequest) {
        if (createUserRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUserRequest)");
        }

        Request<CreateUserRequest> request = new DefaultRequest<CreateUserRequest>(
                createUserRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/users/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createUserRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createUserRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUserRequest.getUsername() != null) {
                String username = createUserRequest.getUsername();
                jsonWriter.name("Username");
                jsonWriter.value(username);
            }
            if (createUserRequest.getPassword() != null) {
                String password = createUserRequest.getPassword();
                jsonWriter.name("Password");
                jsonWriter.value(password);
            }
            if (createUserRequest.getIdentityInfo() != null) {
                UserIdentityInfo identityInfo = createUserRequest.getIdentityInfo();
                jsonWriter.name("IdentityInfo");
                UserIdentityInfoJsonMarshaller.getInstance().marshall(identityInfo, jsonWriter);
            }
            if (createUserRequest.getPhoneConfig() != null) {
                UserPhoneConfig phoneConfig = createUserRequest.getPhoneConfig();
                jsonWriter.name("PhoneConfig");
                UserPhoneConfigJsonMarshaller.getInstance().marshall(phoneConfig, jsonWriter);
            }
            if (createUserRequest.getDirectoryUserId() != null) {
                String directoryUserId = createUserRequest.getDirectoryUserId();
                jsonWriter.name("DirectoryUserId");
                jsonWriter.value(directoryUserId);
            }
            if (createUserRequest.getSecurityProfileIds() != null) {
                java.util.List<String> securityProfileIds = createUserRequest
                        .getSecurityProfileIds();
                jsonWriter.name("SecurityProfileIds");
                jsonWriter.beginArray();
                for (String securityProfileIdsItem : securityProfileIds) {
                    if (securityProfileIdsItem != null) {
                        jsonWriter.value(securityProfileIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserRequest.getRoutingProfileId() != null) {
                String routingProfileId = createUserRequest.getRoutingProfileId();
                jsonWriter.name("RoutingProfileId");
                jsonWriter.value(routingProfileId);
            }
            if (createUserRequest.getHierarchyGroupId() != null) {
                String hierarchyGroupId = createUserRequest.getHierarchyGroupId();
                jsonWriter.name("HierarchyGroupId");
                jsonWriter.value(hierarchyGroupId);
            }
            if (createUserRequest.getTags() != null) {
                java.util.Map<String, String> tags = createUserRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
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
