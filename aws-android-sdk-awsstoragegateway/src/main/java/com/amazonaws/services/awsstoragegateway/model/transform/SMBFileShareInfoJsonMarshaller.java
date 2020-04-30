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

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SMBFileShareInfo
 */
class SMBFileShareInfoJsonMarshaller {

    public void marshall(SMBFileShareInfo sMBFileShareInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMBFileShareInfo.getFileShareARN() != null) {
            String fileShareARN = sMBFileShareInfo.getFileShareARN();
            jsonWriter.name("FileShareARN");
            jsonWriter.value(fileShareARN);
        }
        if (sMBFileShareInfo.getFileShareId() != null) {
            String fileShareId = sMBFileShareInfo.getFileShareId();
            jsonWriter.name("FileShareId");
            jsonWriter.value(fileShareId);
        }
        if (sMBFileShareInfo.getFileShareStatus() != null) {
            String fileShareStatus = sMBFileShareInfo.getFileShareStatus();
            jsonWriter.name("FileShareStatus");
            jsonWriter.value(fileShareStatus);
        }
        if (sMBFileShareInfo.getGatewayARN() != null) {
            String gatewayARN = sMBFileShareInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        if (sMBFileShareInfo.getKMSEncrypted() != null) {
            Boolean kMSEncrypted = sMBFileShareInfo.getKMSEncrypted();
            jsonWriter.name("KMSEncrypted");
            jsonWriter.value(kMSEncrypted);
        }
        if (sMBFileShareInfo.getKMSKey() != null) {
            String kMSKey = sMBFileShareInfo.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (sMBFileShareInfo.getPath() != null) {
            String path = sMBFileShareInfo.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (sMBFileShareInfo.getRole() != null) {
            String role = sMBFileShareInfo.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (sMBFileShareInfo.getLocationARN() != null) {
            String locationARN = sMBFileShareInfo.getLocationARN();
            jsonWriter.name("LocationARN");
            jsonWriter.value(locationARN);
        }
        if (sMBFileShareInfo.getDefaultStorageClass() != null) {
            String defaultStorageClass = sMBFileShareInfo.getDefaultStorageClass();
            jsonWriter.name("DefaultStorageClass");
            jsonWriter.value(defaultStorageClass);
        }
        if (sMBFileShareInfo.getObjectACL() != null) {
            String objectACL = sMBFileShareInfo.getObjectACL();
            jsonWriter.name("ObjectACL");
            jsonWriter.value(objectACL);
        }
        if (sMBFileShareInfo.getReadOnly() != null) {
            Boolean readOnly = sMBFileShareInfo.getReadOnly();
            jsonWriter.name("ReadOnly");
            jsonWriter.value(readOnly);
        }
        if (sMBFileShareInfo.getGuessMIMETypeEnabled() != null) {
            Boolean guessMIMETypeEnabled = sMBFileShareInfo.getGuessMIMETypeEnabled();
            jsonWriter.name("GuessMIMETypeEnabled");
            jsonWriter.value(guessMIMETypeEnabled);
        }
        if (sMBFileShareInfo.getRequesterPays() != null) {
            Boolean requesterPays = sMBFileShareInfo.getRequesterPays();
            jsonWriter.name("RequesterPays");
            jsonWriter.value(requesterPays);
        }
        if (sMBFileShareInfo.getSMBACLEnabled() != null) {
            Boolean sMBACLEnabled = sMBFileShareInfo.getSMBACLEnabled();
            jsonWriter.name("SMBACLEnabled");
            jsonWriter.value(sMBACLEnabled);
        }
        if (sMBFileShareInfo.getAdminUserList() != null) {
            java.util.List<String> adminUserList = sMBFileShareInfo.getAdminUserList();
            jsonWriter.name("AdminUserList");
            jsonWriter.beginArray();
            for (String adminUserListItem : adminUserList) {
                if (adminUserListItem != null) {
                    jsonWriter.value(adminUserListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sMBFileShareInfo.getValidUserList() != null) {
            java.util.List<String> validUserList = sMBFileShareInfo.getValidUserList();
            jsonWriter.name("ValidUserList");
            jsonWriter.beginArray();
            for (String validUserListItem : validUserList) {
                if (validUserListItem != null) {
                    jsonWriter.value(validUserListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sMBFileShareInfo.getInvalidUserList() != null) {
            java.util.List<String> invalidUserList = sMBFileShareInfo.getInvalidUserList();
            jsonWriter.name("InvalidUserList");
            jsonWriter.beginArray();
            for (String invalidUserListItem : invalidUserList) {
                if (invalidUserListItem != null) {
                    jsonWriter.value(invalidUserListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sMBFileShareInfo.getAuditDestinationARN() != null) {
            String auditDestinationARN = sMBFileShareInfo.getAuditDestinationARN();
            jsonWriter.name("AuditDestinationARN");
            jsonWriter.value(auditDestinationARN);
        }
        if (sMBFileShareInfo.getAuthentication() != null) {
            String authentication = sMBFileShareInfo.getAuthentication();
            jsonWriter.name("Authentication");
            jsonWriter.value(authentication);
        }
        if (sMBFileShareInfo.getTags() != null) {
            java.util.List<Tag> tags = sMBFileShareInfo.getTags();
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
    }

    private static SMBFileShareInfoJsonMarshaller instance;

    public static SMBFileShareInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMBFileShareInfoJsonMarshaller();
        return instance;
    }
}
