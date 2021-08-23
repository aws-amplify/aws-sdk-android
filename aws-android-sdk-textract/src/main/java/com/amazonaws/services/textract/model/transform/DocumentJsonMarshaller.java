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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Document
 */
class DocumentJsonMarshaller {

    public void marshall(Document document, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (document.getBytes() != null) {
            java.nio.ByteBuffer bytes = document.getBytes();
            jsonWriter.name("Bytes");
            jsonWriter.value(bytes);
        }
        if (document.getS3Object() != null) {
            S3Object s3Object = document.getS3Object();
            jsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DocumentJsonMarshaller instance;

    public static DocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentJsonMarshaller();
        return instance;
    }
}
