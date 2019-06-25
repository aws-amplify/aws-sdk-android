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
 * JSON marshaller for POJO Warning
 */
class WarningJsonMarshaller {

    public void marshall(Warning warning, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (warning.getErrorCode() != null) {
            String errorCode = warning.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (warning.getPages() != null) {
            java.util.List<Integer> pages = warning.getPages();
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

    private static WarningJsonMarshaller instance;

    public static WarningJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WarningJsonMarshaller();
        return instance;
    }
}
