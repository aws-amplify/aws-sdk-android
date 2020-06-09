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

package com.amazonaws.services.transfer.model.transform;

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
import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
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
                createUserRequest, "AWSTransferFamily");
        String target = "TransferService.CreateUser";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUserRequest.getHomeDirectory() != null) {
                String homeDirectory = createUserRequest.getHomeDirectory();
                jsonWriter.name("HomeDirectory");
                jsonWriter.value(homeDirectory);
            }
            if (createUserRequest.getHomeDirectoryType() != null) {
                String homeDirectoryType = createUserRequest.getHomeDirectoryType();
                jsonWriter.name("HomeDirectoryType");
                jsonWriter.value(homeDirectoryType);
            }
            if (createUserRequest.getHomeDirectoryMappings() != null) {
                java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings = createUserRequest
                        .getHomeDirectoryMappings();
                jsonWriter.name("HomeDirectoryMappings");
                jsonWriter.beginArray();
                for (HomeDirectoryMapEntry homeDirectoryMappingsItem : homeDirectoryMappings) {
                    if (homeDirectoryMappingsItem != null) {
                        HomeDirectoryMapEntryJsonMarshaller.getInstance().marshall(
                                homeDirectoryMappingsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserRequest.getPolicy() != null) {
                String policy = createUserRequest.getPolicy();
                jsonWriter.name("Policy");
                jsonWriter.value(policy);
            }
            if (createUserRequest.getRole() != null) {
                String role = createUserRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createUserRequest.getServerId() != null) {
                String serverId = createUserRequest.getServerId();
                jsonWriter.name("ServerId");
                jsonWriter.value(serverId);
            }
            if (createUserRequest.getSshPublicKeyBody() != null) {
                String sshPublicKeyBody = createUserRequest.getSshPublicKeyBody();
                jsonWriter.name("SshPublicKeyBody");
                jsonWriter.value(sshPublicKeyBody);
            }
            if (createUserRequest.getTags() != null) {
                java.util.List<Tag> tags = createUserRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserRequest.getUserName() != null) {
                String userName = createUserRequest.getUserName();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
