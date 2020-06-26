/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptureContentTypeHeader
 */
class CaptureContentTypeHeaderJsonMarshaller {

    public void marshall(CaptureContentTypeHeader captureContentTypeHeader, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captureContentTypeHeader.getCsvContentTypes() != null) {
            java.util.List<String> csvContentTypes = captureContentTypeHeader.getCsvContentTypes();
            jsonWriter.name("CsvContentTypes");
            jsonWriter.beginArray();
            for (String csvContentTypesItem : csvContentTypes) {
                if (csvContentTypesItem != null) {
                    jsonWriter.value(csvContentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (captureContentTypeHeader.getJsonContentTypes() != null) {
            java.util.List<String> jsonContentTypes = captureContentTypeHeader
                    .getJsonContentTypes();
            jsonWriter.name("JsonContentTypes");
            jsonWriter.beginArray();
            for (String jsonContentTypesItem : jsonContentTypes) {
                if (jsonContentTypesItem != null) {
                    jsonWriter.value(jsonContentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CaptureContentTypeHeaderJsonMarshaller instance;

    public static CaptureContentTypeHeaderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptureContentTypeHeaderJsonMarshaller();
        return instance;
    }
}
