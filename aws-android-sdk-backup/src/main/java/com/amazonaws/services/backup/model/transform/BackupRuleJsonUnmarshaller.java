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
 * JSON unmarshaller for POJO BackupRule
 */
class BackupRuleJsonUnmarshaller implements Unmarshaller<BackupRule, JsonUnmarshallerContext> {

    public BackupRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BackupRule backupRule = new BackupRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RuleName")) {
                backupRule.setRuleName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetBackupVaultName")) {
                backupRule.setTargetBackupVaultName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                backupRule.setScheduleExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartWindowMinutes")) {
                backupRule.setStartWindowMinutes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionWindowMinutes")) {
                backupRule.setCompletionWindowMinutes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                backupRule.setLifecycle(LifecycleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecoveryPointTags")) {
                backupRule.setRecoveryPointTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RuleId")) {
                backupRule.setRuleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CopyActions")) {
                backupRule.setCopyActions(new ListUnmarshaller<CopyAction>(
                        CopyActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backupRule;
    }

    private static BackupRuleJsonUnmarshaller instance;

    public static BackupRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleJsonUnmarshaller();
        return instance;
    }
}
