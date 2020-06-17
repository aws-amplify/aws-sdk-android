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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClassificationResult
 */
class ClassificationResultJsonMarshaller {

    public void marshall(ClassificationResult classificationResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classificationResult.getCustomDataIdentifiers() != null) {
            CustomDataIdentifiers customDataIdentifiers = classificationResult
                    .getCustomDataIdentifiers();
            jsonWriter.name("customDataIdentifiers");
            CustomDataIdentifiersJsonMarshaller.getInstance().marshall(customDataIdentifiers,
                    jsonWriter);
        }
        if (classificationResult.getMimeType() != null) {
            String mimeType = classificationResult.getMimeType();
            jsonWriter.name("mimeType");
            jsonWriter.value(mimeType);
        }
        if (classificationResult.getSensitiveData() != null) {
            java.util.List<SensitiveDataItem> sensitiveData = classificationResult
                    .getSensitiveData();
            jsonWriter.name("sensitiveData");
            jsonWriter.beginArray();
            for (SensitiveDataItem sensitiveDataItem : sensitiveData) {
                if (sensitiveDataItem != null) {
                    SensitiveDataItemJsonMarshaller.getInstance().marshall(sensitiveDataItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (classificationResult.getSizeClassified() != null) {
            Long sizeClassified = classificationResult.getSizeClassified();
            jsonWriter.name("sizeClassified");
            jsonWriter.value(sizeClassified);
        }
        if (classificationResult.getStatus() != null) {
            ClassificationResultStatus status = classificationResult.getStatus();
            jsonWriter.name("status");
            ClassificationResultStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClassificationResultJsonMarshaller instance;

    public static ClassificationResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassificationResultJsonMarshaller();
        return instance;
    }
}
