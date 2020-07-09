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
 * JSON marshaller for POJO SecretVersionsListEntry
 */
class SecretVersionsListEntryJsonMarshaller {

    public void marshall(SecretVersionsListEntry secretVersionsListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (secretVersionsListEntry.getVersionId() != null) {
            String versionId = secretVersionsListEntry.getVersionId();
            jsonWriter.name("VersionId");
            jsonWriter.value(versionId);
        }
        if (secretVersionsListEntry.getVersionStages() != null) {
            java.util.List<String> versionStages = secretVersionsListEntry.getVersionStages();
            jsonWriter.name("VersionStages");
            jsonWriter.beginArray();
            for (String versionStagesItem : versionStages) {
                if (versionStagesItem != null) {
            jsonWriter.value(versionStagesItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (secretVersionsListEntry.getLastAccessedDate() != null) {
            java.util.Date lastAccessedDate = secretVersionsListEntry.getLastAccessedDate();
            jsonWriter.name("LastAccessedDate");
            jsonWriter.value(lastAccessedDate);
        }
        if (secretVersionsListEntry.getCreatedDate() != null) {
            java.util.Date createdDate = secretVersionsListEntry.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        jsonWriter.endObject();
    }

    private static SecretVersionsListEntryJsonMarshaller instance;
    public static SecretVersionsListEntryJsonMarshaller getInstance() {
        if (instance == null) instance = new SecretVersionsListEntryJsonMarshaller();
        return instance;
    }
}
