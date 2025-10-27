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
 * JSON marshaller for POJO Adapter
 */
class AdapterJsonMarshaller {

    public void marshall(Adapter adapter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (adapter.getAdapterId() != null) {
            String adapterId = adapter.getAdapterId();
            jsonWriter.name("AdapterId");
            jsonWriter.value(adapterId);
        }
        if (adapter.getPages() != null) {
            java.util.List<String> pages = adapter.getPages();
            jsonWriter.name("Pages");
            jsonWriter.beginArray();
            for (String pagesItem : pages) {
                if (pagesItem != null) {
                    jsonWriter.value(pagesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (adapter.getVersion() != null) {
            String version = adapter.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static AdapterJsonMarshaller instance;

    public static AdapterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdapterJsonMarshaller();
        return instance;
    }
}
