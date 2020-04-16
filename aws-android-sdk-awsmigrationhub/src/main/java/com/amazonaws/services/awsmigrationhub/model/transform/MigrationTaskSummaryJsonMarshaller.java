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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MigrationTaskSummary
 */
class MigrationTaskSummaryJsonMarshaller {

    public void marshall(MigrationTaskSummary migrationTaskSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (migrationTaskSummary.getProgressUpdateStream() != null) {
            String progressUpdateStream = migrationTaskSummary.getProgressUpdateStream();
            jsonWriter.name("ProgressUpdateStream");
            jsonWriter.value(progressUpdateStream);
        }
        if (migrationTaskSummary.getMigrationTaskName() != null) {
            String migrationTaskName = migrationTaskSummary.getMigrationTaskName();
            jsonWriter.name("MigrationTaskName");
            jsonWriter.value(migrationTaskName);
        }
        if (migrationTaskSummary.getStatus() != null) {
            String status = migrationTaskSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (migrationTaskSummary.getProgressPercent() != null) {
            Integer progressPercent = migrationTaskSummary.getProgressPercent();
            jsonWriter.name("ProgressPercent");
            jsonWriter.value(progressPercent);
        }
        if (migrationTaskSummary.getStatusDetail() != null) {
            String statusDetail = migrationTaskSummary.getStatusDetail();
            jsonWriter.name("StatusDetail");
            jsonWriter.value(statusDetail);
        }
        if (migrationTaskSummary.getUpdateDateTime() != null) {
            java.util.Date updateDateTime = migrationTaskSummary.getUpdateDateTime();
            jsonWriter.name("UpdateDateTime");
            jsonWriter.value(updateDateTime);
        }
        jsonWriter.endObject();
    }

    private static MigrationTaskSummaryJsonMarshaller instance;

    public static MigrationTaskSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MigrationTaskSummaryJsonMarshaller();
        return instance;
    }
}
