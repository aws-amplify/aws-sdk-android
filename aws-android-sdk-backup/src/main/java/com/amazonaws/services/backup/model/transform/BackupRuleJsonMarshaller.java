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
 * JSON marshaller for POJO BackupRule
 */
class BackupRuleJsonMarshaller {

    public void marshall(BackupRule backupRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backupRule.getRuleName() != null) {
            String ruleName = backupRule.getRuleName();
            jsonWriter.name("RuleName");
            jsonWriter.value(ruleName);
        }
        if (backupRule.getTargetBackupVaultName() != null) {
            String targetBackupVaultName = backupRule.getTargetBackupVaultName();
            jsonWriter.name("TargetBackupVaultName");
            jsonWriter.value(targetBackupVaultName);
        }
        if (backupRule.getScheduleExpression() != null) {
            String scheduleExpression = backupRule.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (backupRule.getStartWindowMinutes() != null) {
            Long startWindowMinutes = backupRule.getStartWindowMinutes();
            jsonWriter.name("StartWindowMinutes");
            jsonWriter.value(startWindowMinutes);
        }
        if (backupRule.getCompletionWindowMinutes() != null) {
            Long completionWindowMinutes = backupRule.getCompletionWindowMinutes();
            jsonWriter.name("CompletionWindowMinutes");
            jsonWriter.value(completionWindowMinutes);
        }
        if (backupRule.getLifecycle() != null) {
            Lifecycle lifecycle = backupRule.getLifecycle();
            jsonWriter.name("Lifecycle");
            LifecycleJsonMarshaller.getInstance().marshall(lifecycle, jsonWriter);
        }
        if (backupRule.getRecoveryPointTags() != null) {
            java.util.Map<String, String> recoveryPointTags = backupRule.getRecoveryPointTags();
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
        if (backupRule.getRuleId() != null) {
            String ruleId = backupRule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (backupRule.getCopyActions() != null) {
            java.util.List<CopyAction> copyActions = backupRule.getCopyActions();
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

    private static BackupRuleJsonMarshaller instance;

    public static BackupRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleJsonMarshaller();
        return instance;
    }
}
