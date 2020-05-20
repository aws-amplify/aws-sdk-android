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
 * JSON marshaller for POJO BackupRuleInput
 */
class BackupRuleInputJsonMarshaller {

    public void marshall(BackupRuleInput backupRuleInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupRuleInput.getRuleName() != null) {
            String ruleName = backupRuleInput.getRuleName();
            jsonWriter.name("RuleName");
            jsonWriter.value(ruleName);
        }
        if (backupRuleInput.getTargetBackupVaultName() != null) {
            String targetBackupVaultName = backupRuleInput.getTargetBackupVaultName();
            jsonWriter.name("TargetBackupVaultName");
            jsonWriter.value(targetBackupVaultName);
        }
        if (backupRuleInput.getScheduleExpression() != null) {
            String scheduleExpression = backupRuleInput.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (backupRuleInput.getStartWindowMinutes() != null) {
            Long startWindowMinutes = backupRuleInput.getStartWindowMinutes();
            jsonWriter.name("StartWindowMinutes");
            jsonWriter.value(startWindowMinutes);
        }
        if (backupRuleInput.getCompletionWindowMinutes() != null) {
            Long completionWindowMinutes = backupRuleInput.getCompletionWindowMinutes();
            jsonWriter.name("CompletionWindowMinutes");
            jsonWriter.value(completionWindowMinutes);
        }
        if (backupRuleInput.getLifecycle() != null) {
            Lifecycle lifecycle = backupRuleInput.getLifecycle();
            jsonWriter.name("Lifecycle");
            LifecycleJsonMarshaller.getInstance().marshall(lifecycle, jsonWriter);
        }
        if (backupRuleInput.getRecoveryPointTags() != null) {
            java.util.Map<String, String> recoveryPointTags = backupRuleInput
                    .getRecoveryPointTags();
            jsonWriter.name("RecoveryPointTags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> recoveryPointTagsEntry : recoveryPointTags
                    .entrySet()) {
                String recoveryPointTagsValue = recoveryPointTagsEntry.getValue();
                if (recoveryPointTagsValue != null) {
                    jsonWriter.name(recoveryPointTagsEntry.getKey());
                    jsonWriter.value(recoveryPointTagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (backupRuleInput.getCopyActions() != null) {
            java.util.List<CopyAction> copyActions = backupRuleInput.getCopyActions();
            jsonWriter.name("CopyActions");
            jsonWriter.beginArray();
            for (CopyAction copyActionsItem : copyActions) {
                if (copyActionsItem != null) {
                    CopyActionJsonMarshaller.getInstance().marshall(copyActionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BackupRuleInputJsonMarshaller instance;

    public static BackupRuleInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleInputJsonMarshaller();
        return instance;
    }
}
