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
 * JSON marshaller for POJO BackupPlanInput
 */
class BackupPlanInputJsonMarshaller {

    public void marshall(BackupPlanInput backupPlanInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupPlanInput.getBackupPlanName() != null) {
            String backupPlanName = backupPlanInput.getBackupPlanName();
            jsonWriter.name("BackupPlanName");
            jsonWriter.value(backupPlanName);
        }
        if (backupPlanInput.getRules() != null) {
            java.util.List<BackupRuleInput> rules = backupPlanInput.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (BackupRuleInput rulesItem : rules) {
                if (rulesItem != null) {
                    BackupRuleInputJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BackupPlanInputJsonMarshaller instance;

    public static BackupPlanInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupPlanInputJsonMarshaller();
        return instance;
    }
}
