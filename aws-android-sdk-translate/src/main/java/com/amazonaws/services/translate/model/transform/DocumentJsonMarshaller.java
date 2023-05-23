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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Document
 */
class DocumentJsonMarshaller {

    public void marshall(Document document, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (document.getContent() != null) {
            java.nio.ByteBuffer content = document.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (document.getContentType() != null) {
            String contentType = document.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
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
