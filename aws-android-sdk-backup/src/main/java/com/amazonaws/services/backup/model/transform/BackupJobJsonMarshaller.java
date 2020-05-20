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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BackupJob
 */
class BackupJobJsonMarshaller {

    public void marshall(BackupJob backupJob, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backupJob.getBackupJobId() != null) {
            String backupJobId = backupJob.getBackupJobId();
            jsonWriter.name("BackupJobId");
            jsonWriter.value(backupJobId);
        }
        if (backupJob.getBackupVaultName() != null) {
            String backupVaultName = backupJob.getBackupVaultName();
            jsonWriter.name("BackupVaultName");
            jsonWriter.value(backupVaultName);
        }
        if (backupJob.getBackupVaultArn() != null) {
            String backupVaultArn = backupJob.getBackupVaultArn();
            jsonWriter.name("BackupVaultArn");
            jsonWriter.value(backupVaultArn);
        }
        if (backupJob.getRecoveryPointArn() != null) {
            String recoveryPointArn = backupJob.getRecoveryPointArn();
            jsonWriter.name("RecoveryPointArn");
            jsonWriter.value(recoveryPointArn);
        }
        if (backupJob.getResourceArn() != null) {
            String resourceArn = backupJob.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (backupJob.getCreationDate() != null) {
            java.util.Date creationDate = backupJob.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (backupJob.getCompletionDate() != null) {
            java.util.Date completionDate = backupJob.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (backupJob.getState() != null) {
            String state = backupJob.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (backupJob.getStatusMessage() != null) {
            String statusMessage = backupJob.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (backupJob.getPercentDone() != null) {
            String percentDone = backupJob.getPercentDone();
            jsonWriter.name("PercentDone");
            jsonWriter.value(percentDone);
        }
        if (backupJob.getBackupSizeInBytes() != null) {
            Long backupSizeInBytes = backupJob.getBackupSizeInBytes();
            jsonWriter.name("BackupSizeInBytes");
            jsonWriter.value(backupSizeInBytes);
        }
        if (backupJob.getIamRoleArn() != null) {
            String iamRoleArn = backupJob.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        if (backupJob.getCreatedBy() != null) {
            RecoveryPointCreator createdBy = backupJob.getCreatedBy();
            jsonWriter.name("CreatedBy");
            RecoveryPointCreatorJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (backupJob.getExpectedCompletionDate() != null) {
            java.util.Date expectedCompletionDate = backupJob.getExpectedCompletionDate();
            jsonWriter.name("ExpectedCompletionDate");
            jsonWriter.value(expectedCompletionDate);
        }
        if (backupJob.getStartBy() != null) {
            java.util.Date startBy = backupJob.getStartBy();
            jsonWriter.name("StartBy");
            jsonWriter.value(startBy);
        }
        if (backupJob.getResourceType() != null) {
            String resourceType = backupJob.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (backupJob.getBytesTransferred() != null) {
            Long bytesTransferred = backupJob.getBytesTransferred();
            jsonWriter.name("BytesTransferred");
            jsonWriter.value(bytesTransferred);
        }
        jsonWriter.endObject();
    }

    private static BackupJobJsonMarshaller instance;

    public static BackupJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupJobJsonMarshaller();
        return instance;
    }
}
