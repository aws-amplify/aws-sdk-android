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
 * JSON unmarshaller for POJO BackupRuleInput
 */
class BackupRuleInputJsonUnmarshaller implements
        Unmarshaller<BackupRuleInput, JsonUnmarshallerContext> {

    public BackupRuleInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BackupRuleInput backupRuleInput = new BackupRuleInput();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RuleName")) {
                backupRuleInput.setRuleName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetBackupVaultName")) {
                backupRuleInput.setTargetBackupVaultName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                backupRuleInput.setScheduleExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartWindowMinutes")) {
                backupRuleInput.setStartWindowMinutes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionWindowMinutes")) {
                backupRuleInput.setCompletionWindowMinutes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                backupRuleInput.setLifecycle(LifecycleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecoveryPointTags")) {
                backupRuleInput.setRecoveryPointTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CopyActions")) {
                backupRuleInput.setCopyActions(new ListUnmarshaller<CopyAction>(
                        CopyActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backupRuleInput;
    }

    private static BackupRuleInputJsonUnmarshaller instance;

    public static BackupRuleInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleInputJsonUnmarshaller();
        return instance;
    }
}
