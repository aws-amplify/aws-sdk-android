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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserImportJobType
 */
class UserImportJobTypeJsonMarshaller {

    public void marshall(UserImportJobType userImportJobType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userImportJobType.getJobName() != null) {
            String jobName = userImportJobType.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (userImportJobType.getJobId() != null) {
            String jobId = userImportJobType.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (userImportJobType.getUserPoolId() != null) {
            String userPoolId = userImportJobType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (userImportJobType.getPreSignedUrl() != null) {
            String preSignedUrl = userImportJobType.getPreSignedUrl();
            jsonWriter.name("PreSignedUrl");
            jsonWriter.value(preSignedUrl);
        }
        if (userImportJobType.getCreationDate() != null) {
            java.util.Date creationDate = userImportJobType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (userImportJobType.getStartDate() != null) {
            java.util.Date startDate = userImportJobType.getStartDate();
            jsonWriter.name("StartDate");
            jsonWriter.value(startDate);
        }
        if (userImportJobType.getCompletionDate() != null) {
            java.util.Date completionDate = userImportJobType.getCompletionDate();
            jsonWriter.name("CompletionDate");
            jsonWriter.value(completionDate);
        }
        if (userImportJobType.getStatus() != null) {
            String status = userImportJobType.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (userImportJobType.getCloudWatchLogsRoleArn() != null) {
            String cloudWatchLogsRoleArn = userImportJobType.getCloudWatchLogsRoleArn();
            jsonWriter.name("CloudWatchLogsRoleArn");
            jsonWriter.value(cloudWatchLogsRoleArn);
        }
        if (userImportJobType.getImportedUsers() != null) {
            Long importedUsers = userImportJobType.getImportedUsers();
            jsonWriter.name("ImportedUsers");
            jsonWriter.value(importedUsers);
        }
        if (userImportJobType.getSkippedUsers() != null) {
            Long skippedUsers = userImportJobType.getSkippedUsers();
            jsonWriter.name("SkippedUsers");
            jsonWriter.value(skippedUsers);
        }
        if (userImportJobType.getFailedUsers() != null) {
            Long failedUsers = userImportJobType.getFailedUsers();
            jsonWriter.name("FailedUsers");
            jsonWriter.value(failedUsers);
        }
        if (userImportJobType.getCompletionMessage() != null) {
            String completionMessage = userImportJobType.getCompletionMessage();
            jsonWriter.name("CompletionMessage");
            jsonWriter.value(completionMessage);
        }
        jsonWriter.endObject();
    }

    private static UserImportJobTypeJsonMarshaller instance;

    public static UserImportJobTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserImportJobTypeJsonMarshaller();
        return instance;
    }
}
