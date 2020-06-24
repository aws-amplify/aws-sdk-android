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
 * JSON marshaller for POJO CopyJob
 */
class CopyJobJsonMarshaller {

    public void marshall(CopyJob copyJob, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (copyJob.getAccountId() != null) {
            String accountId = copyJob.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (copyJob.getCopyJobId() != null) {
            String copyJobId = copyJob.getCopyJobId();
            jsonWriter.name("CopyJobId");
            jsonWriter.value(copyJobId);
        }
        if (copyJob.getSourceBackupVaultArn() != null) {
            String sourceBackupVaultArn = copyJob.getSourceBackupVaultArn();
            jsonWriter.name("SourceBackupVaultArn");
            jsonWriter.value(sourceBackupVaultArn);
        }
        if (copyJob.getSourceRecoveryPointArn() != null) {
            String sourceRecoveryPointArn = copyJob.getSourceRecoveryPointArn();
            jsonWriter.name("SourceRecoveryPointArn");
            jsonWriter.value(sourceRecoveryPointArn);
        }
        if (copyJob.getDestinationBackupVaultArn() != null) {
            String destinationBackupVaultArn = copyJob.getDestinationBackupVaultArn();
            jsonWriter.name("DestinationBackupVaultArn");
            jsonWriter.value(destinationBackupVaultArn);
        }
        if (copyJob.getDestinationRecoveryPointArn() != null) {
            String destinationRecoveryPointArn = copyJob.getDestinationRecoveryPointArn();
            jsonWriter.name("DestinationRecoveryPointArn");
            jsonWriter.value(destinationRecoveryPointArn);
        }
        if (copyJob.getResourceArn() != null) {
            String resourceArn = copyJob.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (copyJob.getCreationDate() != null) {
            java.util.Date creationDate = copyJob.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (copyJob.getCompletionDate() != null) {
            java.util.Date completionDate = copyJob.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (copyJob.getState() != null) {
            String state = copyJob.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (copyJob.getStatusMessage() != null) {
            String statusMessage = copyJob.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (copyJob.getBackupSizeInBytes() != null) {
            Long backupSizeInBytes = copyJob.getBackupSizeInBytes();
            jsonWriter.name("BackupSizeInBytes");
            jsonWriter.value(backupSizeInBytes);
        }
        if (copyJob.getIamRoleArn() != null) {
            String iamRoleArn = copyJob.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        if (copyJob.getCreatedBy() != null) {
            RecoveryPointCreator createdBy = copyJob.getCreatedBy();
            jsonWriter.name("CreatedBy");
            RecoveryPointCreatorJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (copyJob.getResourceType() != null) {
            String resourceType = copyJob.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static CopyJobJsonMarshaller instance;

    public static CopyJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CopyJobJsonMarshaller();
        return instance;
    }
}
