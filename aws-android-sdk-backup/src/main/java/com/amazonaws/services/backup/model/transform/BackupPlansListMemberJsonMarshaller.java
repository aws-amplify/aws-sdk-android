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
 * JSON marshaller for POJO BackupPlansListMember
 */
class BackupPlansListMemberJsonMarshaller {

    public void marshall(BackupPlansListMember backupPlansListMember, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupPlansListMember.getBackupPlanArn() != null) {
            String backupPlanArn = backupPlansListMember.getBackupPlanArn();
            jsonWriter.name("BackupPlanArn");
            jsonWriter.value(backupPlanArn);
        }
        if (backupPlansListMember.getBackupPlanId() != null) {
            String backupPlanId = backupPlansListMember.getBackupPlanId();
            jsonWriter.name("BackupPlanId");
            jsonWriter.value(backupPlanId);
        }
        if (backupPlansListMember.getCreationDate() != null) {
            java.util.Date creationDate = backupPlansListMember.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (backupPlansListMember.getDeletionDate() != null) {
            java.util.Date deletionDate = backupPlansListMember.getDeletionDate();
            jsonWriter.name("DeletionDate");
            jsonWriter.value(deletionDate);
        }
        if (backupPlansListMember.getVersionId() != null) {
            String versionId = backupPlansListMember.getVersionId();
            jsonWriter.name("VersionId");
            jsonWriter.value(versionId);
        }
        if (backupPlansListMember.getBackupPlanName() != null) {
            String backupPlanName = backupPlansListMember.getBackupPlanName();
            jsonWriter.name("BackupPlanName");
            jsonWriter.value(backupPlanName);
        }
        if (backupPlansListMember.getCreatorRequestId() != null) {
            String creatorRequestId = backupPlansListMember.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        if (backupPlansListMember.getLastExecutionDate() != null) {
            java.util.Date lastExecutionDate = backupPlansListMember.getLastExecutionDate();
            jsonWriter.name("LastExecutionDate");
            jsonWriter.value(lastExecutionDate);
        }
        jsonWriter.endObject();
    }

    private static BackupPlansListMemberJsonMarshaller instance;

    public static BackupPlansListMemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupPlansListMemberJsonMarshaller();
        return instance;
    }
}
