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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BackupSummary
 */
class BackupSummaryJsonMarshaller {

    public void marshall(BackupSummary backupSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backupSummary.getTableName() != null) {
            String tableName = backupSummary.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (backupSummary.getTableId() != null) {
            String tableId = backupSummary.getTableId();
            jsonWriter.name("TableId");
            jsonWriter.value(tableId);
        }
        if (backupSummary.getTableArn() != null) {
            String tableArn = backupSummary.getTableArn();
            jsonWriter.name("TableArn");
            jsonWriter.value(tableArn);
        }
        if (backupSummary.getBackupArn() != null) {
            String backupArn = backupSummary.getBackupArn();
            jsonWriter.name("BackupArn");
            jsonWriter.value(backupArn);
        }
        if (backupSummary.getBackupName() != null) {
            String backupName = backupSummary.getBackupName();
            jsonWriter.name("BackupName");
            jsonWriter.value(backupName);
        }
        if (backupSummary.getBackupCreationDateTime() != null) {
            java.util.Date backupCreationDateTime = backupSummary.getBackupCreationDateTime();
            jsonWriter.name("BackupCreationDateTime");
            jsonWriter.value(backupCreationDateTime);
        }
        if (backupSummary.getBackupExpiryDateTime() != null) {
            java.util.Date backupExpiryDateTime = backupSummary.getBackupExpiryDateTime();
            jsonWriter.name("BackupExpiryDateTime");
            jsonWriter.value(backupExpiryDateTime);
        }
        if (backupSummary.getBackupStatus() != null) {
            String backupStatus = backupSummary.getBackupStatus();
            jsonWriter.name("BackupStatus");
            jsonWriter.value(backupStatus);
        }
        if (backupSummary.getBackupType() != null) {
            String backupType = backupSummary.getBackupType();
            jsonWriter.name("BackupType");
            jsonWriter.value(backupType);
        }
        if (backupSummary.getBackupSizeBytes() != null) {
            Long backupSizeBytes = backupSummary.getBackupSizeBytes();
            jsonWriter.name("BackupSizeBytes");
            jsonWriter.value(backupSizeBytes);
        }
        jsonWriter.endObject();
    }

    private static BackupSummaryJsonMarshaller instance;

    public static BackupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupSummaryJsonMarshaller();
        return instance;
    }
}
