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
 * JSON marshaller for POJO Query
 */
class QueryJsonMarshaller {

    public void marshall(Query query, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (query.getText() != null) {
            String text = query.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (query.getAlias() != null) {
            String alias = query.getAlias();
            jsonWriter.name("Alias");
            jsonWriter.value(alias);
        }
        if (query.getPages() != null) {
            java.util.List<String> pages = query.getPages();
            jsonWriter.name("Pages");
            jsonWriter.beginArray();
            for (String pagesItem : pages) {
                if (pagesItem != null) {
                    jsonWriter.value(pagesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static QueryJsonMarshaller instance;

    public static QueryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryJsonMarshaller();
        return instance;
    }
}
