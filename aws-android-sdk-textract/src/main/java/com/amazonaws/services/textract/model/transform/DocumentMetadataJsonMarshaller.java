/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentMetadata
 */
class DocumentMetadataJsonMarshaller {

    public void marshall(DocumentMetadata documentMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentMetadata.getPages() != null) {
            Integer pages = documentMetadata.getPages();
            jsonWriter.name("Pages");
            jsonWriter.value(pages);
        }
        jsonWriter.endObject();
    }

    private static DocumentMetadataJsonMarshaller instance;

    public static DocumentMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentMetadataJsonMarshaller();
        return instance;
    }
}
