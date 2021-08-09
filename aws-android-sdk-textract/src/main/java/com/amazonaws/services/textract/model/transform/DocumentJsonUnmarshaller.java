/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO Document
 */
class DocumentJsonUnmarshaller implements Unmarshaller<Document, JsonUnmarshallerContext> {

    public Document unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Document document = new Document();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bytes")) {
                document.setBytes(ByteBufferJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Object")) {
                document.setS3Object(S3ObjectJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return document;
    }

    private static DocumentJsonUnmarshaller instance;

    public static DocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentJsonUnmarshaller();
        return instance;
    }
}
