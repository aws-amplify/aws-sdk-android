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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SplitDocument
 */
class SplitDocumentJsonMarshaller {

    public void marshall(SplitDocument splitDocument, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (splitDocument.getIndex() != null) {
            Integer index = splitDocument.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (splitDocument.getPages() != null) {
            java.util.List<Integer> pages = splitDocument.getPages();
            jsonWriter.name("Pages");
            jsonWriter.beginArray();
            for (Integer pagesItem : pages) {
                if (pagesItem != null) {
                    jsonWriter.value(pagesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SplitDocumentJsonMarshaller instance;

    public static SplitDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SplitDocumentJsonMarshaller();
        return instance;
    }
}
