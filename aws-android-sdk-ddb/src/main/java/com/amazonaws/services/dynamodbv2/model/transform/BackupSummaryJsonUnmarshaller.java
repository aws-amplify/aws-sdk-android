/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BackupSummary
 */
class BackupSummaryJsonUnmarshaller implements Unmarshaller<BackupSummary, JsonUnmarshallerContext> {

    public BackupSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BackupSummary backupSummary = new BackupSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TableName")) {
                backupSummary.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableId")) {
                backupSummary.setTableId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableArn")) {
                backupSummary.setTableArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupArn")) {
                backupSummary.setBackupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupName")) {
                backupSummary.setBackupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupCreationDateTime")) {
                backupSummary.setBackupCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupExpiryDateTime")) {
                backupSummary.setBackupExpiryDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupStatus")) {
                backupSummary.setBackupStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupType")) {
                backupSummary.setBackupType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeBytes")) {
                backupSummary.setBackupSizeBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backupSummary;
    }

    private static BackupSummaryJsonUnmarshaller instance;

    public static BackupSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupSummaryJsonUnmarshaller();
        return instance;
    }
}
