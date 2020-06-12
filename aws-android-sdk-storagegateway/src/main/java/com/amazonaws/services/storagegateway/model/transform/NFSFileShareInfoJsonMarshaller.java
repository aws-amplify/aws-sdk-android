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

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NFSFileShareInfo
 */
class NFSFileShareInfoJsonMarshaller {

    public void marshall(NFSFileShareInfo nFSFileShareInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (nFSFileShareInfo.getNFSFileShareDefaults() != null) {
            NFSFileShareDefaults nFSFileShareDefaults = nFSFileShareInfo.getNFSFileShareDefaults();
            jsonWriter.name("NFSFileShareDefaults");
            NFSFileShareDefaultsJsonMarshaller.getInstance().marshall(nFSFileShareDefaults,
                    jsonWriter);
        }
        if (nFSFileShareInfo.getFileShareARN() != null) {
            String fileShareARN = nFSFileShareInfo.getFileShareARN();
            jsonWriter.name("FileShareARN");
            jsonWriter.value(fileShareARN);
        }
        if (nFSFileShareInfo.getFileShareId() != null) {
            String fileShareId = nFSFileShareInfo.getFileShareId();
            jsonWriter.name("FileShareId");
            jsonWriter.value(fileShareId);
        }
        if (nFSFileShareInfo.getFileShareStatus() != null) {
            String fileShareStatus = nFSFileShareInfo.getFileShareStatus();
            jsonWriter.name("FileShareStatus");
            jsonWriter.value(fileShareStatus);
        }
        if (nFSFileShareInfo.getGatewayARN() != null) {
            String gatewayARN = nFSFileShareInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        if (nFSFileShareInfo.getKMSEncrypted() != null) {
            Boolean kMSEncrypted = nFSFileShareInfo.getKMSEncrypted();
            jsonWriter.name("KMSEncrypted");
            jsonWriter.value(kMSEncrypted);
        }
        if (nFSFileShareInfo.getKMSKey() != null) {
            String kMSKey = nFSFileShareInfo.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (nFSFileShareInfo.getPath() != null) {
            String path = nFSFileShareInfo.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (nFSFileShareInfo.getRole() != null) {
            String role = nFSFileShareInfo.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (nFSFileShareInfo.getLocationARN() != null) {
            String locationARN = nFSFileShareInfo.getLocationARN();
            jsonWriter.name("LocationARN");
            jsonWriter.value(locationARN);
        }
        if (nFSFileShareInfo.getDefaultStorageClass() != null) {
            String defaultStorageClass = nFSFileShareInfo.getDefaultStorageClass();
            jsonWriter.name("DefaultStorageClass");
            jsonWriter.value(defaultStorageClass);
        }
        if (nFSFileShareInfo.getObjectACL() != null) {
            String objectACL = nFSFileShareInfo.getObjectACL();
            jsonWriter.name("ObjectACL");
            jsonWriter.value(objectACL);
        }
        if (nFSFileShareInfo.getClientList() != null) {
            java.util.List<String> clientList = nFSFileShareInfo.getClientList();
            jsonWriter.name("ClientList");
            jsonWriter.beginArray();
            for (String clientListItem : clientList) {
                if (clientListItem != null) {
                    jsonWriter.value(clientListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (nFSFileShareInfo.getSquash() != null) {
            String squash = nFSFileShareInfo.getSquash();
            jsonWriter.name("Squash");
            jsonWriter.value(squash);
        }
        if (nFSFileShareInfo.getReadOnly() != null) {
            Boolean readOnly = nFSFileShareInfo.getReadOnly();
            jsonWriter.name("ReadOnly");
            jsonWriter.value(readOnly);
        }
        if (nFSFileShareInfo.getGuessMIMETypeEnabled() != null) {
            Boolean guessMIMETypeEnabled = nFSFileShareInfo.getGuessMIMETypeEnabled();
            jsonWriter.name("GuessMIMETypeEnabled");
            jsonWriter.value(guessMIMETypeEnabled);
        }
        if (nFSFileShareInfo.getRequesterPays() != null) {
            Boolean requesterPays = nFSFileShareInfo.getRequesterPays();
            jsonWriter.name("RequesterPays");
            jsonWriter.value(requesterPays);
        }
        if (nFSFileShareInfo.getTags() != null) {
            java.util.List<Tag> tags = nFSFileShareInfo.getTags();
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

    private static NFSFileShareInfoJsonMarshaller instance;

    public static NFSFileShareInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareInfoJsonMarshaller();
        return instance;
    }
}
