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
 * JSON marshaller for POJO BackupSelectionsListMember
 */
class BackupSelectionsListMemberJsonMarshaller {

    public void marshall(BackupSelectionsListMember backupSelectionsListMember,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backupSelectionsListMember.getSelectionId() != null) {
            String selectionId = backupSelectionsListMember.getSelectionId();
            jsonWriter.name("SelectionId");
            jsonWriter.value(selectionId);
        }
        if (backupSelectionsListMember.getSelectionName() != null) {
            String selectionName = backupSelectionsListMember.getSelectionName();
            jsonWriter.name("SelectionName");
            jsonWriter.value(selectionName);
        }
        if (backupSelectionsListMember.getBackupPlanId() != null) {
            String backupPlanId = backupSelectionsListMember.getBackupPlanId();
            jsonWriter.name("BackupPlanId");
            jsonWriter.value(backupPlanId);
        }
        if (backupSelectionsListMember.getCreationDate() != null) {
            java.util.Date creationDate = backupSelectionsListMember.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (backupSelectionsListMember.getCreatorRequestId() != null) {
            String creatorRequestId = backupSelectionsListMember.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        if (backupSelectionsListMember.getIamRoleArn() != null) {
            String iamRoleArn = backupSelectionsListMember.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        jsonWriter.endObject();
    }

    private static BackupSelectionsListMemberJsonMarshaller instance;

    public static BackupSelectionsListMemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupSelectionsListMemberJsonMarshaller();
        return instance;
    }
}
