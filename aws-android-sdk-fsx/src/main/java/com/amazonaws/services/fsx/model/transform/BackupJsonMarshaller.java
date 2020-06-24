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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Backup
 */
class BackupJsonMarshaller {

    public void marshall(Backup backup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backup.getBackupId() != null) {
            String backupId = backup.getBackupId();
            jsonWriter.name("BackupId");
            jsonWriter.value(backupId);
        }
        if (backup.getLifecycle() != null) {
            String lifecycle = backup.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (backup.getFailureDetails() != null) {
            BackupFailureDetails failureDetails = backup.getFailureDetails();
            jsonWriter.name("FailureDetails");
            BackupFailureDetailsJsonMarshaller.getInstance().marshall(failureDetails, jsonWriter);
        }
        if (backup.getType() != null) {
            String type = backup.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (backup.getProgressPercent() != null) {
            Integer progressPercent = backup.getProgressPercent();
            jsonWriter.name("ProgressPercent");
            jsonWriter.value(progressPercent);
        }
        if (backup.getCreationTime() != null) {
            java.util.Date creationTime = backup.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (backup.getKmsKeyId() != null) {
            String kmsKeyId = backup.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (backup.getResourceARN() != null) {
            String resourceARN = backup.getResourceARN();
            jsonWriter.name("ResourceARN");
            jsonWriter.value(resourceARN);
        }
        if (backup.getTags() != null) {
            java.util.List<Tag> tags = backup.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (backup.getFileSystem() != null) {
            FileSystem fileSystem = backup.getFileSystem();
            jsonWriter.name("FileSystem");
            FileSystemJsonMarshaller.getInstance().marshall(fileSystem, jsonWriter);
        }
        if (backup.getDirectoryInformation() != null) {
            ActiveDirectoryBackupAttributes directoryInformation = backup.getDirectoryInformation();
            jsonWriter.name("DirectoryInformation");
            ActiveDirectoryBackupAttributesJsonMarshaller.getInstance().marshall(
                    directoryInformation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BackupJsonMarshaller instance;

    public static BackupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupJsonMarshaller();
        return instance;
    }
}
