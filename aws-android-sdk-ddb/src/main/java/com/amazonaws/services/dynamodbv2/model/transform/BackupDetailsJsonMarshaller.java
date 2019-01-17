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
 * JSON marshaller for POJO BackupDetails
 */
class BackupDetailsJsonMarshaller {

    public void marshall(BackupDetails backupDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backupDetails.getBackupArn() != null) {
            String backupArn = backupDetails.getBackupArn();
            jsonWriter.name("BackupArn");
            jsonWriter.value(backupArn);
        }
        if (backupDetails.getBackupName() != null) {
            String backupName = backupDetails.getBackupName();
            jsonWriter.name("BackupName");
            jsonWriter.value(backupName);
        }
        if (backupDetails.getBackupSizeBytes() != null) {
            Long backupSizeBytes = backupDetails.getBackupSizeBytes();
            jsonWriter.name("BackupSizeBytes");
            jsonWriter.value(backupSizeBytes);
        }
        if (backupDetails.getBackupStatus() != null) {
            String backupStatus = backupDetails.getBackupStatus();
            jsonWriter.name("BackupStatus");
            jsonWriter.value(backupStatus);
        }
        if (backupDetails.getBackupType() != null) {
            String backupType = backupDetails.getBackupType();
            jsonWriter.name("BackupType");
            jsonWriter.value(backupType);
        }
        if (backupDetails.getBackupCreationDateTime() != null) {
            java.util.Date backupCreationDateTime = backupDetails.getBackupCreationDateTime();
            jsonWriter.name("BackupCreationDateTime");
            jsonWriter.value(backupCreationDateTime);
        }
        if (backupDetails.getBackupExpiryDateTime() != null) {
            java.util.Date backupExpiryDateTime = backupDetails.getBackupExpiryDateTime();
            jsonWriter.name("BackupExpiryDateTime");
            jsonWriter.value(backupExpiryDateTime);
        }
        jsonWriter.endObject();
    }

    private static BackupDetailsJsonMarshaller instance;

    public static BackupDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupDetailsJsonMarshaller();
        return instance;
    }
}
