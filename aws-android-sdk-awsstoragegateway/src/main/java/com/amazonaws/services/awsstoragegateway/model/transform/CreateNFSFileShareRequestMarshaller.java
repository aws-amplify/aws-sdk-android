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

package com.amazonaws.services.awsstoragegateway.model.transform;

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
import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateNFSFileShareRequest
 */
public class CreateNFSFileShareRequestMarshaller implements
        Marshaller<Request<CreateNFSFileShareRequest>, CreateNFSFileShareRequest> {

    public Request<CreateNFSFileShareRequest> marshall(
            CreateNFSFileShareRequest createNFSFileShareRequest) {
        if (createNFSFileShareRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateNFSFileShareRequest)");
        }

        Request<CreateNFSFileShareRequest> request = new DefaultRequest<CreateNFSFileShareRequest>(
                createNFSFileShareRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.CreateNFSFileShare";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createNFSFileShareRequest.getClientToken() != null) {
                String clientToken = createNFSFileShareRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createNFSFileShareRequest.getNFSFileShareDefaults() != null) {
                NFSFileShareDefaults nFSFileShareDefaults = createNFSFileShareRequest
                        .getNFSFileShareDefaults();
                jsonWriter.name("NFSFileShareDefaults");
                NFSFileShareDefaultsJsonMarshaller.getInstance().marshall(nFSFileShareDefaults,
                        jsonWriter);
            }
            if (createNFSFileShareRequest.getGatewayARN() != null) {
                String gatewayARN = createNFSFileShareRequest.getGatewayARN();
                jsonWriter.name("GatewayARN");
                jsonWriter.value(gatewayARN);
            }
            if (createNFSFileShareRequest.getKMSEncrypted() != null) {
                Boolean kMSEncrypted = createNFSFileShareRequest.getKMSEncrypted();
                jsonWriter.name("KMSEncrypted");
                jsonWriter.value(kMSEncrypted);
            }
            if (createNFSFileShareRequest.getKMSKey() != null) {
                String kMSKey = createNFSFileShareRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (createNFSFileShareRequest.getRole() != null) {
                String role = createNFSFileShareRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createNFSFileShareRequest.getLocationARN() != null) {
                String locationARN = createNFSFileShareRequest.getLocationARN();
                jsonWriter.name("LocationARN");
                jsonWriter.value(locationARN);
            }
            if (createNFSFileShareRequest.getDefaultStorageClass() != null) {
                String defaultStorageClass = createNFSFileShareRequest.getDefaultStorageClass();
                jsonWriter.name("DefaultStorageClass");
                jsonWriter.value(defaultStorageClass);
            }
            if (createNFSFileShareRequest.getObjectACL() != null) {
                String objectACL = createNFSFileShareRequest.getObjectACL();
                jsonWriter.name("ObjectACL");
                jsonWriter.value(objectACL);
            }
            if (createNFSFileShareRequest.getClientList() != null) {
                java.util.List<String> clientList = createNFSFileShareRequest.getClientList();
                jsonWriter.name("ClientList");
                jsonWriter.beginArray();
                for (String clientListItem : clientList) {
                    if (clientListItem != null) {
                        jsonWriter.value(clientListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNFSFileShareRequest.getSquash() != null) {
                String squash = createNFSFileShareRequest.getSquash();
                jsonWriter.name("Squash");
                jsonWriter.value(squash);
            }
            if (createNFSFileShareRequest.getReadOnly() != null) {
                Boolean readOnly = createNFSFileShareRequest.getReadOnly();
                jsonWriter.name("ReadOnly");
                jsonWriter.value(readOnly);
            }
            if (createNFSFileShareRequest.getGuessMIMETypeEnabled() != null) {
                Boolean guessMIMETypeEnabled = createNFSFileShareRequest.getGuessMIMETypeEnabled();
                jsonWriter.name("GuessMIMETypeEnabled");
                jsonWriter.value(guessMIMETypeEnabled);
            }
            if (createNFSFileShareRequest.getRequesterPays() != null) {
                Boolean requesterPays = createNFSFileShareRequest.getRequesterPays();
                jsonWriter.name("RequesterPays");
                jsonWriter.value(requesterPays);
            }
            if (createNFSFileShareRequest.getTags() != null) {
                java.util.List<Tag> tags = createNFSFileShareRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
