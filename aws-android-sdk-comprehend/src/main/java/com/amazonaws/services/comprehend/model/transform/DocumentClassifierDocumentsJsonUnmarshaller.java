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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DocumentClassifierDocuments
 */
class DocumentClassifierDocumentsJsonUnmarshaller implements
        Unmarshaller<DocumentClassifierDocuments, JsonUnmarshallerContext> {

    public DocumentClassifierDocuments unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentClassifierDocuments documentClassifierDocuments = new DocumentClassifierDocuments();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Uri")) {
                documentClassifierDocuments.setS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TestS3Uri")) {
                documentClassifierDocuments.setTestS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentClassifierDocuments;
    }

    private static DocumentClassifierDocumentsJsonUnmarshaller instance;

    public static DocumentClassifierDocumentsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierDocumentsJsonUnmarshaller();
        return instance;
    }
}
