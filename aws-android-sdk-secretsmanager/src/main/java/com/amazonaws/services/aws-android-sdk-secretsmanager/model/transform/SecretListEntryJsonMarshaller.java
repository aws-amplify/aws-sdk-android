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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SecretListEntry
 */
class SecretListEntryJsonMarshaller {

    public void marshall(SecretListEntry secretListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (secretListEntry.getARN() != null) {
            String aRN = secretListEntry.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (secretListEntry.getName() != null) {
            String name = secretListEntry.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (secretListEntry.getDescription() != null) {
            String description = secretListEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (secretListEntry.getKmsKeyId() != null) {
            String kmsKeyId = secretListEntry.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (secretListEntry.getRotationEnabled() != null) {
            Boolean rotationEnabled = secretListEntry.getRotationEnabled();
            jsonWriter.name("RotationEnabled");
            jsonWriter.value(rotationEnabled);
        }
        if (secretListEntry.getRotationLambdaARN() != null) {
            String rotationLambdaARN = secretListEntry.getRotationLambdaARN();
            jsonWriter.name("RotationLambdaARN");
            jsonWriter.value(rotationLambdaARN);
        }
        if (secretListEntry.getRotationRules() != null) {
            RotationRulesType rotationRules = secretListEntry.getRotationRules();
            jsonWriter.name("RotationRules");
            RotationRulesTypeJsonMarshaller.getInstance().marshall(rotationRules, jsonWriter);
        }
        if (secretListEntry.getLastRotatedDate() != null) {
            java.util.Date lastRotatedDate = secretListEntry.getLastRotatedDate();
            jsonWriter.name("LastRotatedDate");
            jsonWriter.value(lastRotatedDate);
        }
        if (secretListEntry.getLastChangedDate() != null) {
            java.util.Date lastChangedDate = secretListEntry.getLastChangedDate();
            jsonWriter.name("LastChangedDate");
            jsonWriter.value(lastChangedDate);
        }
        if (secretListEntry.getLastAccessedDate() != null) {
            java.util.Date lastAccessedDate = secretListEntry.getLastAccessedDate();
            jsonWriter.name("LastAccessedDate");
            jsonWriter.value(lastAccessedDate);
        }
        if (secretListEntry.getDeletedDate() != null) {
            java.util.Date deletedDate = secretListEntry.getDeletedDate();
            jsonWriter.name("DeletedDate");
            jsonWriter.value(deletedDate);
        }
        if (secretListEntry.getTags() != null) {
            java.util.List<Tag> tags = secretListEntry.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
            TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (secretListEntry.getSecretVersionsToStages() != null) {
            java.util.Map<String, java.util.List<String>> secretVersionsToStages = secretListEntry.getSecretVersionsToStages();
            jsonWriter.name("SecretVersionsToStages");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> secretVersionsToStagesEntry : secretVersionsToStages.entrySet()) {
                java.util.List<String> secretVersionsToStagesValue = secretVersionsToStagesEntry.getValue();
                if (secretVersionsToStagesValue != null) {
                    jsonWriter.name(secretVersionsToStagesEntry.getKey());
            jsonWriter.beginArray();
            for (String secretVersionsToStagesValueItem : secretVersionsToStagesValue) {
                if (secretVersionsToStagesValueItem != null) {
            jsonWriter.value(secretVersionsToStagesValueItem);
                    }
            }
            jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (secretListEntry.getOwningService() != null) {
            String owningService = secretListEntry.getOwningService();
            jsonWriter.name("OwningService");
            jsonWriter.value(owningService);
        }
        if (secretListEntry.getCreatedDate() != null) {
            java.util.Date createdDate = secretListEntry.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        jsonWriter.endObject();
    }

    private static SecretListEntryJsonMarshaller instance;
    public static SecretListEntryJsonMarshaller getInstance() {
        if (instance == null) instance = new SecretListEntryJsonMarshaller();
        return instance;
    }
}
