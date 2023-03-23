/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DocumentGroup
 */
class DocumentGroupJsonUnmarshaller implements Unmarshaller<DocumentGroup, JsonUnmarshallerContext> {

    public DocumentGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentGroup documentGroup = new DocumentGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                documentGroup.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SplitDocuments")) {
                documentGroup.setSplitDocuments(new ListUnmarshaller<SplitDocument>(
                        SplitDocumentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DetectedSignatures")) {
                documentGroup.setDetectedSignatures(new ListUnmarshaller<DetectedSignature>(
                        DetectedSignatureJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UndetectedSignatures")) {
                documentGroup.setUndetectedSignatures(new ListUnmarshaller<UndetectedSignature>(
                        UndetectedSignatureJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentGroup;
    }

    private static DocumentGroupJsonUnmarshaller instance;

    public static DocumentGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentGroupJsonUnmarshaller();
        return instance;
    }
}
