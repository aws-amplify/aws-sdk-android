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
 * JSON marshaller for POJO DocumentIdentifier
 */
class DocumentIdentifierJsonMarshaller {

    public void marshall(DocumentIdentifier documentIdentifier, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentIdentifier.getName() != null) {
            String name = documentIdentifier.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentIdentifier.getOwner() != null) {
            String owner = documentIdentifier.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (documentIdentifier.getVersionName() != null) {
            String versionName = documentIdentifier.getVersionName();
            jsonWriter.name("VersionName");
            jsonWriter.value(versionName);
        }
        if (documentIdentifier.getPlatformTypes() != null) {
            java.util.List<String> platformTypes = documentIdentifier.getPlatformTypes();
            jsonWriter.name("PlatformTypes");
            jsonWriter.beginArray();
            for (String platformTypesItem : platformTypes) {
                if (platformTypesItem != null) {
                    jsonWriter.value(platformTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (documentIdentifier.getDocumentVersion() != null) {
            String documentVersion = documentIdentifier.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (documentIdentifier.getDocumentType() != null) {
            String documentType = documentIdentifier.getDocumentType();
            jsonWriter.name("DocumentType");
            jsonWriter.value(documentType);
        }
        if (documentIdentifier.getSchemaVersion() != null) {
            String schemaVersion = documentIdentifier.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (documentIdentifier.getDocumentFormat() != null) {
            String documentFormat = documentIdentifier.getDocumentFormat();
            jsonWriter.name("DocumentFormat");
            jsonWriter.value(documentFormat);
        }
        if (documentIdentifier.getTargetType() != null) {
            String targetType = documentIdentifier.getTargetType();
            jsonWriter.name("TargetType");
            jsonWriter.value(targetType);
        }
        if (documentIdentifier.getTags() != null) {
            java.util.List<Tag> tags = documentIdentifier.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (documentIdentifier.getRequires() != null) {
            java.util.List<DocumentRequires> requires = documentIdentifier.getRequires();
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

    private static DocumentIdentifierJsonMarshaller instance;

    public static DocumentIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentIdentifierJsonMarshaller();
        return instance;
    }
}
