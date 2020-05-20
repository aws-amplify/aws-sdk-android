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
 * JSON marshaller for POJO RecoveryPointCreator
 */
class RecoveryPointCreatorJsonMarshaller {

    public void marshall(RecoveryPointCreator recoveryPointCreator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recoveryPointCreator.getBackupPlanId() != null) {
            String backupPlanId = recoveryPointCreator.getBackupPlanId();
            jsonWriter.name("BackupPlanId");
            jsonWriter.value(backupPlanId);
        }
        if (recoveryPointCreator.getBackupPlanArn() != null) {
            String backupPlanArn = recoveryPointCreator.getBackupPlanArn();
            jsonWriter.name("BackupPlanArn");
            jsonWriter.value(backupPlanArn);
        }
        if (recoveryPointCreator.getBackupPlanVersion() != null) {
            String backupPlanVersion = recoveryPointCreator.getBackupPlanVersion();
            jsonWriter.name("BackupPlanVersion");
            jsonWriter.value(backupPlanVersion);
        }
        if (recoveryPointCreator.getBackupRuleId() != null) {
            String backupRuleId = recoveryPointCreator.getBackupRuleId();
            jsonWriter.name("BackupRuleId");
            jsonWriter.value(backupRuleId);
        }
        jsonWriter.endObject();
    }

    private static RecoveryPointCreatorJsonMarshaller instance;

    public static RecoveryPointCreatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryPointCreatorJsonMarshaller();
        return instance;
    }
}
