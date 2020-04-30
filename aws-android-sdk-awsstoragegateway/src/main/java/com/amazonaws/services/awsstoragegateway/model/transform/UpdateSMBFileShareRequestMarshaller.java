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
 * JSON request marshaller for UpdateSMBFileShareRequest
 */
public class UpdateSMBFileShareRequestMarshaller implements
        Marshaller<Request<UpdateSMBFileShareRequest>, UpdateSMBFileShareRequest> {

    public Request<UpdateSMBFileShareRequest> marshall(
            UpdateSMBFileShareRequest updateSMBFileShareRequest) {
        if (updateSMBFileShareRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateSMBFileShareRequest)");
        }

        Request<UpdateSMBFileShareRequest> request = new DefaultRequest<UpdateSMBFileShareRequest>(
                updateSMBFileShareRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.UpdateSMBFileShare";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateSMBFileShareRequest.getFileShareARN() != null) {
                String fileShareARN = updateSMBFileShareRequest.getFileShareARN();
                jsonWriter.name("FileShareARN");
                jsonWriter.value(fileShareARN);
            }
            if (updateSMBFileShareRequest.getKMSEncrypted() != null) {
                Boolean kMSEncrypted = updateSMBFileShareRequest.getKMSEncrypted();
                jsonWriter.name("KMSEncrypted");
                jsonWriter.value(kMSEncrypted);
            }
            if (updateSMBFileShareRequest.getKMSKey() != null) {
                String kMSKey = updateSMBFileShareRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (updateSMBFileShareRequest.getDefaultStorageClass() != null) {
                String defaultStorageClass = updateSMBFileShareRequest.getDefaultStorageClass();
                jsonWriter.name("DefaultStorageClass");
                jsonWriter.value(defaultStorageClass);
            }
            if (updateSMBFileShareRequest.getObjectACL() != null) {
                String objectACL = updateSMBFileShareRequest.getObjectACL();
                jsonWriter.name("ObjectACL");
                jsonWriter.value(objectACL);
            }
            if (updateSMBFileShareRequest.getReadOnly() != null) {
                Boolean readOnly = updateSMBFileShareRequest.getReadOnly();
                jsonWriter.name("ReadOnly");
                jsonWriter.value(readOnly);
            }
            if (updateSMBFileShareRequest.getGuessMIMETypeEnabled() != null) {
                Boolean guessMIMETypeEnabled = updateSMBFileShareRequest.getGuessMIMETypeEnabled();
                jsonWriter.name("GuessMIMETypeEnabled");
                jsonWriter.value(guessMIMETypeEnabled);
            }
            if (updateSMBFileShareRequest.getRequesterPays() != null) {
                Boolean requesterPays = updateSMBFileShareRequest.getRequesterPays();
                jsonWriter.name("RequesterPays");
                jsonWriter.value(requesterPays);
            }
            if (updateSMBFileShareRequest.getSMBACLEnabled() != null) {
                Boolean sMBACLEnabled = updateSMBFileShareRequest.getSMBACLEnabled();
                jsonWriter.name("SMBACLEnabled");
                jsonWriter.value(sMBACLEnabled);
            }
            if (updateSMBFileShareRequest.getAdminUserList() != null) {
                java.util.List<String> adminUserList = updateSMBFileShareRequest.getAdminUserList();
                jsonWriter.name("AdminUserList");
                jsonWriter.beginArray();
                for (String adminUserListItem : adminUserList) {
                    if (adminUserListItem != null) {
                        jsonWriter.value(adminUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateSMBFileShareRequest.getValidUserList() != null) {
                java.util.List<String> validUserList = updateSMBFileShareRequest.getValidUserList();
                jsonWriter.name("ValidUserList");
                jsonWriter.beginArray();
                for (String validUserListItem : validUserList) {
                    if (validUserListItem != null) {
                        jsonWriter.value(validUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateSMBFileShareRequest.getInvalidUserList() != null) {
                java.util.List<String> invalidUserList = updateSMBFileShareRequest
                        .getInvalidUserList();
                jsonWriter.name("InvalidUserList");
                jsonWriter.beginArray();
                for (String invalidUserListItem : invalidUserList) {
                    if (invalidUserListItem != null) {
                        jsonWriter.value(invalidUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateSMBFileShareRequest.getAuditDestinationARN() != null) {
                String auditDestinationARN = updateSMBFileShareRequest.getAuditDestinationARN();
                jsonWriter.name("AuditDestinationARN");
                jsonWriter.value(auditDestinationARN);
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
