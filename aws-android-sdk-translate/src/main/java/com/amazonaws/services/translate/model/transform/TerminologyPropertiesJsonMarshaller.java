/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TerminologyProperties
 */
class TerminologyPropertiesJsonMarshaller {

    public void marshall(TerminologyProperties terminologyProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (terminologyProperties.getName() != null) {
            String name = terminologyProperties.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (terminologyProperties.getDescription() != null) {
            String description = terminologyProperties.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (terminologyProperties.getArn() != null) {
            String arn = terminologyProperties.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (terminologyProperties.getSourceLanguageCode() != null) {
            String sourceLanguageCode = terminologyProperties.getSourceLanguageCode();
            jsonWriter.name("SourceLanguageCode");
            jsonWriter.value(sourceLanguageCode);
        }
        if (terminologyProperties.getTargetLanguageCodes() != null) {
            java.util.List<String> targetLanguageCodes = terminologyProperties
                    .getTargetLanguageCodes();
            jsonWriter.name("TargetLanguageCodes");
            jsonWriter.beginArray();
            for (String targetLanguageCodesItem : targetLanguageCodes) {
                if (targetLanguageCodesItem != null) {
                    jsonWriter.value(targetLanguageCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (terminologyProperties.getEncryptionKey() != null) {
            EncryptionKey encryptionKey = terminologyProperties.getEncryptionKey();
            jsonWriter.name("EncryptionKey");
            EncryptionKeyJsonMarshaller.getInstance().marshall(encryptionKey, jsonWriter);
        }
        if (terminologyProperties.getSizeBytes() != null) {
            Integer sizeBytes = terminologyProperties.getSizeBytes();
            jsonWriter.name("SizeBytes");
            jsonWriter.value(sizeBytes);
        }
        if (terminologyProperties.getTermCount() != null) {
            Integer termCount = terminologyProperties.getTermCount();
            jsonWriter.name("TermCount");
            jsonWriter.value(termCount);
        }
        if (terminologyProperties.getCreatedAt() != null) {
            java.util.Date createdAt = terminologyProperties.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (terminologyProperties.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = terminologyProperties.getLastUpdatedAt();
            jsonWriter.name("LastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        jsonWriter.endObject();
    }

    private static TerminologyPropertiesJsonMarshaller instance;

    public static TerminologyPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TerminologyPropertiesJsonMarshaller();
        return instance;
    }
}
