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
 * JSON marshaller for POJO BackupVaultListMember
 */
class BackupVaultListMemberJsonMarshaller {

    public void marshall(BackupVaultListMember backupVaultListMember, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupVaultListMember.getBackupVaultName() != null) {
            String backupVaultName = backupVaultListMember.getBackupVaultName();
            jsonWriter.name("BackupVaultName");
            jsonWriter.value(backupVaultName);
        }
        if (backupVaultListMember.getBackupVaultArn() != null) {
            String backupVaultArn = backupVaultListMember.getBackupVaultArn();
            jsonWriter.name("BackupVaultArn");
            jsonWriter.value(backupVaultArn);
        }
        if (backupVaultListMember.getCreationDate() != null) {
            java.util.Date creationDate = backupVaultListMember.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (backupVaultListMember.getEncryptionKeyArn() != null) {
            String encryptionKeyArn = backupVaultListMember.getEncryptionKeyArn();
            jsonWriter.name("EncryptionKeyArn");
            jsonWriter.value(encryptionKeyArn);
        }
        if (backupVaultListMember.getCreatorRequestId() != null) {
            String creatorRequestId = backupVaultListMember.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        if (backupVaultListMember.getNumberOfRecoveryPoints() != null) {
            Long numberOfRecoveryPoints = backupVaultListMember.getNumberOfRecoveryPoints();
            jsonWriter.name("NumberOfRecoveryPoints");
            jsonWriter.value(numberOfRecoveryPoints);
        }
        jsonWriter.endObject();
    }

    private static BackupVaultListMemberJsonMarshaller instance;

    public static BackupVaultListMemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupVaultListMemberJsonMarshaller();
        return instance;
    }
}
