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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RecoveryPointByBackupVault
 */
class RecoveryPointByBackupVaultJsonUnmarshaller implements
        Unmarshaller<RecoveryPointByBackupVault, JsonUnmarshallerContext> {

    public RecoveryPointByBackupVault unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecoveryPointByBackupVault recoveryPointByBackupVault = new RecoveryPointByBackupVault();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RecoveryPointArn")) {
                recoveryPointByBackupVault.setRecoveryPointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultName")) {
                recoveryPointByBackupVault.setBackupVaultName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultArn")) {
                recoveryPointByBackupVault.setBackupVaultArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceArn")) {
                recoveryPointByBackupVault.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                recoveryPointByBackupVault.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                recoveryPointByBackupVault.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamRoleArn")) {
                recoveryPointByBackupVault.setIamRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                recoveryPointByBackupVault.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                recoveryPointByBackupVault.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionDate")) {
                recoveryPointByBackupVault.setCompletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeInBytes")) {
                recoveryPointByBackupVault.setBackupSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CalculatedLifecycle")) {
                recoveryPointByBackupVault
                        .setCalculatedLifecycle(CalculatedLifecycleJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                recoveryPointByBackupVault.setLifecycle(LifecycleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionKeyArn")) {
                recoveryPointByBackupVault.setEncryptionKeyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsEncrypted")) {
                recoveryPointByBackupVault.setIsEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastRestoreTime")) {
                recoveryPointByBackupVault.setLastRestoreTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recoveryPointByBackupVault;
    }

    private static RecoveryPointByBackupVaultJsonUnmarshaller instance;

    public static RecoveryPointByBackupVaultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryPointByBackupVaultJsonUnmarshaller();
        return instance;
    }
}
