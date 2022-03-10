/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ParallelDataProperties
 */
class ParallelDataPropertiesJsonMarshaller {

    public void marshall(ParallelDataProperties parallelDataProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (parallelDataProperties.getName() != null) {
            String name = parallelDataProperties.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (parallelDataProperties.getArn() != null) {
            String arn = parallelDataProperties.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (parallelDataProperties.getDescription() != null) {
            String description = parallelDataProperties.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (parallelDataProperties.getStatus() != null) {
            String status = parallelDataProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (parallelDataProperties.getSourceLanguageCode() != null) {
            String sourceLanguageCode = parallelDataProperties.getSourceLanguageCode();
            jsonWriter.name("SourceLanguageCode");
            jsonWriter.value(sourceLanguageCode);
        }
        if (parallelDataProperties.getTargetLanguageCodes() != null) {
            java.util.List<String> targetLanguageCodes = parallelDataProperties
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
        if (parallelDataProperties.getParallelDataConfig() != null) {
            ParallelDataConfig parallelDataConfig = parallelDataProperties.getParallelDataConfig();
            jsonWriter.name("ParallelDataConfig");
            ParallelDataConfigJsonMarshaller.getInstance().marshall(parallelDataConfig, jsonWriter);
        }
        if (parallelDataProperties.getMessage() != null) {
            String message = parallelDataProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (parallelDataProperties.getImportedDataSize() != null) {
            Long importedDataSize = parallelDataProperties.getImportedDataSize();
            jsonWriter.name("ImportedDataSize");
            jsonWriter.value(importedDataSize);
        }
        if (parallelDataProperties.getImportedRecordCount() != null) {
            Long importedRecordCount = parallelDataProperties.getImportedRecordCount();
            jsonWriter.name("ImportedRecordCount");
            jsonWriter.value(importedRecordCount);
        }
        if (parallelDataProperties.getFailedRecordCount() != null) {
            Long failedRecordCount = parallelDataProperties.getFailedRecordCount();
            jsonWriter.name("FailedRecordCount");
            jsonWriter.value(failedRecordCount);
        }
        if (parallelDataProperties.getSkippedRecordCount() != null) {
            Long skippedRecordCount = parallelDataProperties.getSkippedRecordCount();
            jsonWriter.name("SkippedRecordCount");
            jsonWriter.value(skippedRecordCount);
        }
        if (parallelDataProperties.getEncryptionKey() != null) {
            EncryptionKey encryptionKey = parallelDataProperties.getEncryptionKey();
            jsonWriter.name("EncryptionKey");
            EncryptionKeyJsonMarshaller.getInstance().marshall(encryptionKey, jsonWriter);
        }
        if (parallelDataProperties.getCreatedAt() != null) {
            java.util.Date createdAt = parallelDataProperties.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (parallelDataProperties.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = parallelDataProperties.getLastUpdatedAt();
            jsonWriter.name("LastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (parallelDataProperties.getLatestUpdateAttemptStatus() != null) {
            String latestUpdateAttemptStatus = parallelDataProperties
                    .getLatestUpdateAttemptStatus();
            jsonWriter.name("LatestUpdateAttemptStatus");
            jsonWriter.value(latestUpdateAttemptStatus);
        }
        if (parallelDataProperties.getLatestUpdateAttemptAt() != null) {
            java.util.Date latestUpdateAttemptAt = parallelDataProperties
                    .getLatestUpdateAttemptAt();
            jsonWriter.name("LatestUpdateAttemptAt");
            jsonWriter.value(latestUpdateAttemptAt);
        }
        jsonWriter.endObject();
    }

    private static ParallelDataPropertiesJsonMarshaller instance;

    public static ParallelDataPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParallelDataPropertiesJsonMarshaller();
        return instance;
    }
}
