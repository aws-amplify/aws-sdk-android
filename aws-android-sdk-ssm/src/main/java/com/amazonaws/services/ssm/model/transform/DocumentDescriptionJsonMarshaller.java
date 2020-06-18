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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentDescription
 */
class DocumentDescriptionJsonMarshaller {

    public void marshall(DocumentDescription documentDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentDescription.getSha1() != null) {
            String sha1 = documentDescription.getSha1();
            jsonWriter.name("Sha1");
            jsonWriter.value(sha1);
        }
        if (documentDescription.getHash() != null) {
            String hash = documentDescription.getHash();
            jsonWriter.name("Hash");
            jsonWriter.value(hash);
        }
        if (documentDescription.getHashType() != null) {
            String hashType = documentDescription.getHashType();
            jsonWriter.name("HashType");
            jsonWriter.value(hashType);
        }
        if (documentDescription.getName() != null) {
            String name = documentDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentDescription.getVersionName() != null) {
            String versionName = documentDescription.getVersionName();
            jsonWriter.name("VersionName");
            jsonWriter.value(versionName);
        }
        if (documentDescription.getOwner() != null) {
            String owner = documentDescription.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (documentDescription.getCreatedDate() != null) {
            java.util.Date createdDate = documentDescription.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (documentDescription.getStatus() != null) {
            String status = documentDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (documentDescription.getStatusInformation() != null) {
            String statusInformation = documentDescription.getStatusInformation();
            jsonWriter.name("StatusInformation");
            jsonWriter.value(statusInformation);
        }
        if (documentDescription.getDocumentVersion() != null) {
            String documentVersion = documentDescription.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (documentDescription.getDescription() != null) {
            String description = documentDescription.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (documentDescription.getParameters() != null) {
            java.util.List<DocumentParameter> parameters = documentDescription.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginArray();
            for (DocumentParameter parametersItem : parameters) {
                if (parametersItem != null) {
                    DocumentParameterJsonMarshaller.getInstance().marshall(parametersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentDescription.getPlatformTypes() != null) {
            java.util.List<String> platformTypes = documentDescription.getPlatformTypes();
            jsonWriter.name("PlatformTypes");
            jsonWriter.beginArray();
            for (String platformTypesItem : platformTypes) {
                if (platformTypesItem != null) {
                    jsonWriter.value(platformTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (documentDescription.getDocumentType() != null) {
            String documentType = documentDescription.getDocumentType();
            jsonWriter.name("DocumentType");
            jsonWriter.value(documentType);
        }
        if (documentDescription.getSchemaVersion() != null) {
            String schemaVersion = documentDescription.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (documentDescription.getLatestVersion() != null) {
            String latestVersion = documentDescription.getLatestVersion();
            jsonWriter.name("LatestVersion");
            jsonWriter.value(latestVersion);
        }
        if (documentDescription.getDefaultVersion() != null) {
            String defaultVersion = documentDescription.getDefaultVersion();
            jsonWriter.name("DefaultVersion");
            jsonWriter.value(defaultVersion);
        }
        if (documentDescription.getDocumentFormat() != null) {
            String documentFormat = documentDescription.getDocumentFormat();
            jsonWriter.name("DocumentFormat");
            jsonWriter.value(documentFormat);
        }
        if (documentDescription.getTargetType() != null) {
            String targetType = documentDescription.getTargetType();
            jsonWriter.name("TargetType");
            jsonWriter.value(targetType);
        }
        if (documentDescription.getTags() != null) {
            java.util.List<Tag> tags = documentDescription.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentDescription.getAttachmentsInformation() != null) {
            java.util.List<AttachmentInformation> attachmentsInformation = documentDescription
                    .getAttachmentsInformation();
            jsonWriter.name("AttachmentsInformation");
            jsonWriter.beginArray();
            for (AttachmentInformation attachmentsInformationItem : attachmentsInformation) {
                if (attachmentsInformationItem != null) {
                    AttachmentInformationJsonMarshaller.getInstance().marshall(
                            attachmentsInformationItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentDescription.getRequires() != null) {
            java.util.List<DocumentRequires> requires = documentDescription.getRequires();
            jsonWriter.name("Requires");
            jsonWriter.beginArray();
            for (DocumentRequires requiresItem : requires) {
                if (requiresItem != null) {
                    DocumentRequiresJsonMarshaller.getInstance().marshall(requiresItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DocumentDescriptionJsonMarshaller instance;

    public static DocumentDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonMarshaller();
        return instance;
    }
}
