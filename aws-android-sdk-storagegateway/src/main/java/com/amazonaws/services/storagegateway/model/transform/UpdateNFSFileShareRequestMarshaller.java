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

package com.amazonaws.services.storagegateway.model.transform;

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
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateNFSFileShareRequest
 */
public class UpdateNFSFileShareRequestMarshaller implements
        Marshaller<Request<UpdateNFSFileShareRequest>, UpdateNFSFileShareRequest> {

    public Request<UpdateNFSFileShareRequest> marshall(
            UpdateNFSFileShareRequest updateNFSFileShareRequest) {
        if (updateNFSFileShareRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateNFSFileShareRequest)");
        }

        Request<UpdateNFSFileShareRequest> request = new DefaultRequest<UpdateNFSFileShareRequest>(
                updateNFSFileShareRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.UpdateNFSFileShare";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateNFSFileShareRequest.getFileShareARN() != null) {
                String fileShareARN = updateNFSFileShareRequest.getFileShareARN();
                jsonWriter.name("FileShareARN");
                jsonWriter.value(fileShareARN);
            }
            if (updateNFSFileShareRequest.getKMSEncrypted() != null) {
                Boolean kMSEncrypted = updateNFSFileShareRequest.getKMSEncrypted();
                jsonWriter.name("KMSEncrypted");
                jsonWriter.value(kMSEncrypted);
            }
            if (updateNFSFileShareRequest.getKMSKey() != null) {
                String kMSKey = updateNFSFileShareRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (updateNFSFileShareRequest.getNFSFileShareDefaults() != null) {
                NFSFileShareDefaults nFSFileShareDefaults = updateNFSFileShareRequest
                        .getNFSFileShareDefaults();
                jsonWriter.name("NFSFileShareDefaults");
                NFSFileShareDefaultsJsonMarshaller.getInstance().marshall(nFSFileShareDefaults,
                        jsonWriter);
            }
            if (updateNFSFileShareRequest.getDefaultStorageClass() != null) {
                String defaultStorageClass = updateNFSFileShareRequest.getDefaultStorageClass();
                jsonWriter.name("DefaultStorageClass");
                jsonWriter.value(defaultStorageClass);
            }
            if (updateNFSFileShareRequest.getObjectACL() != null) {
                String objectACL = updateNFSFileShareRequest.getObjectACL();
                jsonWriter.name("ObjectACL");
                jsonWriter.value(objectACL);
            }
            if (updateNFSFileShareRequest.getClientList() != null) {
                java.util.List<String> clientList = updateNFSFileShareRequest.getClientList();
                jsonWriter.name("ClientList");
                jsonWriter.beginArray();
                for (String clientListItem : clientList) {
                    if (clientListItem != null) {
                        jsonWriter.value(clientListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateNFSFileShareRequest.getSquash() != null) {
                String squash = updateNFSFileShareRequest.getSquash();
                jsonWriter.name("Squash");
                jsonWriter.value(squash);
            }
            if (updateNFSFileShareRequest.getReadOnly() != null) {
                Boolean readOnly = updateNFSFileShareRequest.getReadOnly();
                jsonWriter.name("ReadOnly");
                jsonWriter.value(readOnly);
            }
            if (updateNFSFileShareRequest.getGuessMIMETypeEnabled() != null) {
                Boolean guessMIMETypeEnabled = updateNFSFileShareRequest.getGuessMIMETypeEnabled();
                jsonWriter.name("GuessMIMETypeEnabled");
                jsonWriter.value(guessMIMETypeEnabled);
            }
            if (updateNFSFileShareRequest.getRequesterPays() != null) {
                Boolean requesterPays = updateNFSFileShareRequest.getRequesterPays();
                jsonWriter.name("RequesterPays");
                jsonWriter.value(requesterPays);
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
