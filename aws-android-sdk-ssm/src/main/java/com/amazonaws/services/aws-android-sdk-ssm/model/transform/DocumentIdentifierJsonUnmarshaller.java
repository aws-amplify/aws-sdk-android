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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO DocumentIdentifier
 */
class DocumentIdentifierJsonUnmarshaller implements Unmarshaller<DocumentIdentifier, JsonUnmarshallerContext> {

    public DocumentIdentifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentIdentifier documentIdentifier = new DocumentIdentifier();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                documentIdentifier.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Owner")) {
                documentIdentifier.setOwner(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("VersionName")) {
                documentIdentifier.setVersionName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PlatformTypes")) {
                documentIdentifier.setPlatformTypes(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                documentIdentifier.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentType")) {
                documentIdentifier.setDocumentType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                documentIdentifier.setSchemaVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentFormat")) {
                documentIdentifier.setDocumentFormat(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TargetType")) {
                documentIdentifier.setTargetType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                documentIdentifier.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("Requires")) {
                documentIdentifier.setRequires(new ListUnmarshaller<DocumentRequires>(DocumentRequiresJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentIdentifier;
    }

    private static DocumentIdentifierJsonUnmarshaller instance;
    public static DocumentIdentifierJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DocumentIdentifierJsonUnmarshaller();
        return instance;
    }
}
