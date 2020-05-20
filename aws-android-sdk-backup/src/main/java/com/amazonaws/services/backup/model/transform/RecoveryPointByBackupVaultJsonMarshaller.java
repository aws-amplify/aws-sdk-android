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
 * JSON marshaller for POJO RecoveryPointByBackupVault
 */
class RecoveryPointByBackupVaultJsonMarshaller {

    public void marshall(RecoveryPointByBackupVault recoveryPointByBackupVault,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recoveryPointByBackupVault.getRecoveryPointArn() != null) {
            String recoveryPointArn = recoveryPointByBackupVault.getRecoveryPointArn();
            jsonWriter.name("RecoveryPointArn");
            jsonWriter.value(recoveryPointArn);
        }
        if (recoveryPointByBackupVault.getBackupVaultName() != null) {
            String backupVaultName = recoveryPointByBackupVault.getBackupVaultName();
            jsonWriter.name("BackupVaultName");
            jsonWriter.value(backupVaultName);
        }
        if (recoveryPointByBackupVault.getBackupVaultArn() != null) {
            String backupVaultArn = recoveryPointByBackupVault.getBackupVaultArn();
            jsonWriter.name("BackupVaultArn");
            jsonWriter.value(backupVaultArn);
        }
        if (recoveryPointByBackupVault.getResourceArn() != null) {
            String resourceArn = recoveryPointByBackupVault.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (recoveryPointByBackupVault.getResourceType() != null) {
            String resourceType = recoveryPointByBackupVault.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (recoveryPointByBackupVault.getCreatedBy() != null) {
            RecoveryPointCreator createdBy = recoveryPointByBackupVault.getCreatedBy();
            jsonWriter.name("CreatedBy");
            RecoveryPointCreatorJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (recoveryPointByBackupVault.getIamRoleArn() != null) {
            String iamRoleArn = recoveryPointByBackupVault.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        if (recoveryPointByBackupVault.getStatus() != null) {
            String status = recoveryPointByBackupVault.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (recoveryPointByBackupVault.getCreationDate() != null) {
            java.util.Date creationDate = recoveryPointByBackupVault.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (recoveryPointByBackupVault.getCompletionDate() != null) {
            java.util.Date completionDate = recoveryPointByBackupVault.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (recoveryPointByBackupVault.getBackupSizeInBytes() != null) {
            Long backupSizeInBytes = recoveryPointByBackupVault.getBackupSizeInBytes();
            jsonWriter.name("BackupSizeInBytes");
            jsonWriter.value(backupSizeInBytes);
        }
        if (recoveryPointByBackupVault.getCalculatedLifecycle() != null) {
            CalculatedLifecycle calculatedLifecycle = recoveryPointByBackupVault
                    .getCalculatedLifecycle();
            jsonWriter.name("CalculatedLifecycle");
            CalculatedLifecycleJsonMarshaller.getInstance().marshall(calculatedLifecycle,
                    jsonWriter);
        }
        if (recoveryPointByBackupVault.getLifecycle() != null) {
            Lifecycle lifecycle = recoveryPointByBackupVault.getLifecycle();
            jsonWriter.name("Lifecycle");
            LifecycleJsonMarshaller.getInstance().marshall(lifecycle, jsonWriter);
        }
        if (recoveryPointByBackupVault.getEncryptionKeyArn() != null) {
            String encryptionKeyArn = recoveryPointByBackupVault.getEncryptionKeyArn();
            jsonWriter.name("EncryptionKeyArn");
            jsonWriter.value(encryptionKeyArn);
        }
        if (recoveryPointByBackupVault.getIsEncrypted() != null) {
            Boolean isEncrypted = recoveryPointByBackupVault.getIsEncrypted();
            jsonWriter.name("IsEncrypted");
            jsonWriter.value(isEncrypted);
        }
        if (recoveryPointByBackupVault.getLastRestoreTime() != null) {
            java.util.Date lastRestoreTime = recoveryPointByBackupVault.getLastRestoreTime();
            jsonWriter.name("LastRestoreTime");
            jsonWriter.value(lastRestoreTime);
        }
        jsonWriter.endObject();
    }

    private static RecoveryPointByBackupVaultJsonMarshaller instance;

    public static RecoveryPointByBackupVaultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryPointByBackupVaultJsonMarshaller();
        return instance;
    }
}
