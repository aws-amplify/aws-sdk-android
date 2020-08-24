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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentVersionInfo
 */
class DocumentVersionInfoJsonMarshaller {

    public void marshall(DocumentVersionInfo documentVersionInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentVersionInfo.getName() != null) {
            String name = documentVersionInfo.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentVersionInfo.getDocumentVersion() != null) {
            String documentVersion = documentVersionInfo.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (documentVersionInfo.getVersionName() != null) {
            String versionName = documentVersionInfo.getVersionName();
            jsonWriter.name("VersionName");
            jsonWriter.value(versionName);
        }
        if (documentVersionInfo.getCreatedDate() != null) {
            java.util.Date createdDate = documentVersionInfo.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (documentVersionInfo.getIsDefaultVersion() != null) {
            Boolean isDefaultVersion = documentVersionInfo.getIsDefaultVersion();
            jsonWriter.name("IsDefaultVersion");
            jsonWriter.value(isDefaultVersion);
        }
        if (documentVersionInfo.getDocumentFormat() != null) {
            String documentFormat = documentVersionInfo.getDocumentFormat();
            jsonWriter.name("DocumentFormat");
            jsonWriter.value(documentFormat);
        }
        if (documentVersionInfo.getStatus() != null) {
            String status = documentVersionInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (documentVersionInfo.getStatusInformation() != null) {
            String statusInformation = documentVersionInfo.getStatusInformation();
            jsonWriter.name("StatusInformation");
            jsonWriter.value(statusInformation);
        }
        jsonWriter.endObject();
    }

    private static DocumentVersionInfoJsonMarshaller instance;
    public static DocumentVersionInfoJsonMarshaller getInstance() {
        if (instance == null) instance = new DocumentVersionInfoJsonMarshaller();
        return instance;
    }
}
