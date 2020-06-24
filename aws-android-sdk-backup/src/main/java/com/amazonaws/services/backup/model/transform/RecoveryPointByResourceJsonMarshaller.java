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
 * JSON marshaller for POJO RecoveryPointByResource
 */
class RecoveryPointByResourceJsonMarshaller {

    public void marshall(RecoveryPointByResource recoveryPointByResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recoveryPointByResource.getRecoveryPointArn() != null) {
            String recoveryPointArn = recoveryPointByResource.getRecoveryPointArn();
            jsonWriter.name("RecoveryPointArn");
            jsonWriter.value(recoveryPointArn);
        }
        if (recoveryPointByResource.getCreationDate() != null) {
            java.util.Date creationDate = recoveryPointByResource.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (recoveryPointByResource.getStatus() != null) {
            String status = recoveryPointByResource.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (recoveryPointByResource.getEncryptionKeyArn() != null) {
            String encryptionKeyArn = recoveryPointByResource.getEncryptionKeyArn();
            jsonWriter.name("EncryptionKeyArn");
            jsonWriter.value(encryptionKeyArn);
        }
        if (recoveryPointByResource.getBackupSizeBytes() != null) {
            Long backupSizeBytes = recoveryPointByResource.getBackupSizeBytes();
            jsonWriter.name("BackupSizeBytes");
            jsonWriter.value(backupSizeBytes);
        }
        if (recoveryPointByResource.getBackupVaultName() != null) {
            String backupVaultName = recoveryPointByResource.getBackupVaultName();
            jsonWriter.name("BackupVaultName");
            jsonWriter.value(backupVaultName);
        }
        jsonWriter.endObject();
    }

    private static RecoveryPointByResourceJsonMarshaller instance;

    public static RecoveryPointByResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryPointByResourceJsonMarshaller();
        return instance;
    }
}
