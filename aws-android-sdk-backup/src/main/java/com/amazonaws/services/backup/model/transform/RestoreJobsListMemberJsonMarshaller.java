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
 * JSON marshaller for POJO RestoreJobsListMember
 */
class RestoreJobsListMemberJsonMarshaller {

    public void marshall(RestoreJobsListMember restoreJobsListMember, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (restoreJobsListMember.getRestoreJobId() != null) {
            String restoreJobId = restoreJobsListMember.getRestoreJobId();
            jsonWriter.name("RestoreJobId");
            jsonWriter.value(restoreJobId);
        }
        if (restoreJobsListMember.getRecoveryPointArn() != null) {
            String recoveryPointArn = restoreJobsListMember.getRecoveryPointArn();
            jsonWriter.name("RecoveryPointArn");
            jsonWriter.value(recoveryPointArn);
        }
        if (restoreJobsListMember.getCreationDate() != null) {
            java.util.Date creationDate = restoreJobsListMember.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (restoreJobsListMember.getCompletionDate() != null) {
            java.util.Date completionDate = restoreJobsListMember.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (restoreJobsListMember.getStatus() != null) {
            String status = restoreJobsListMember.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (restoreJobsListMember.getStatusMessage() != null) {
            String statusMessage = restoreJobsListMember.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (restoreJobsListMember.getPercentDone() != null) {
            String percentDone = restoreJobsListMember.getPercentDone();
            jsonWriter.name("PercentDone");
            jsonWriter.value(percentDone);
        }
        if (restoreJobsListMember.getBackupSizeInBytes() != null) {
            Long backupSizeInBytes = restoreJobsListMember.getBackupSizeInBytes();
            jsonWriter.name("BackupSizeInBytes");
            jsonWriter.value(backupSizeInBytes);
        }
        if (restoreJobsListMember.getIamRoleArn() != null) {
            String iamRoleArn = restoreJobsListMember.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        if (restoreJobsListMember.getExpectedCompletionTimeMinutes() != null) {
            Long expectedCompletionTimeMinutes = restoreJobsListMember
                    .getExpectedCompletionTimeMinutes();
            jsonWriter.name("ExpectedCompletionTimeMinutes");
            jsonWriter.value(expectedCompletionTimeMinutes);
        }
        if (restoreJobsListMember.getCreatedResourceArn() != null) {
            String createdResourceArn = restoreJobsListMember.getCreatedResourceArn();
            jsonWriter.name("CreatedResourceArn");
            jsonWriter.value(createdResourceArn);
        }
        jsonWriter.endObject();
    }

    private static RestoreJobsListMemberJsonMarshaller instance;

    public static RestoreJobsListMemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RestoreJobsListMemberJsonMarshaller();
        return instance;
    }
}
