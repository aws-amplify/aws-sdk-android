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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DocumentDescription
 */
class DocumentDescriptionJsonUnmarshaller implements
        Unmarshaller<DocumentDescription, JsonUnmarshallerContext> {

    public DocumentDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentDescription documentDescription = new DocumentDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Sha1")) {
                documentDescription.setSha1(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hash")) {
                documentDescription.setHash(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HashType")) {
                documentDescription.setHashType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                documentDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionName")) {
                documentDescription.setVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Owner")) {
                documentDescription.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                documentDescription.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                documentDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusInformation")) {
                documentDescription.setStatusInformation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                documentDescription.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                documentDescription.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                documentDescription.setParameters(new ListUnmarshaller<DocumentParameter>(
                        DocumentParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PlatformTypes")) {
                documentDescription.setPlatformTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DocumentType")) {
                documentDescription.setDocumentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                documentDescription.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersion")) {
                documentDescription.setLatestVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultVersion")) {
                documentDescription.setDefaultVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentFormat")) {
                documentDescription.setDocumentFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetType")) {
                documentDescription.setTargetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                documentDescription.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AttachmentsInformation")) {
                documentDescription
                        .setAttachmentsInformation(new ListUnmarshaller<AttachmentInformation>(
                                AttachmentInformationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Requires")) {
                documentDescription.setRequires(new ListUnmarshaller<DocumentRequires>(
                        DocumentRequiresJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentDescription;
    }

    private static DocumentDescriptionJsonUnmarshaller instance;

    public static DocumentDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonUnmarshaller();
        return instance;
    }
}
