/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskStatisticsForAuditCheck
 */
class TaskStatisticsForAuditCheckJsonMarshaller {

    public void marshall(TaskStatisticsForAuditCheck taskStatisticsForAuditCheck,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskStatisticsForAuditCheck.getTotalFindingsCount() != null) {
            Long totalFindingsCount = taskStatisticsForAuditCheck.getTotalFindingsCount();
            jsonWriter.name("totalFindingsCount");
            jsonWriter.value(totalFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getFailedFindingsCount() != null) {
            Long failedFindingsCount = taskStatisticsForAuditCheck.getFailedFindingsCount();
            jsonWriter.name("failedFindingsCount");
            jsonWriter.value(failedFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getSucceededFindingsCount() != null) {
            Long succeededFindingsCount = taskStatisticsForAuditCheck.getSucceededFindingsCount();
            jsonWriter.name("succeededFindingsCount");
            jsonWriter.value(succeededFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getSkippedFindingsCount() != null) {
            Long skippedFindingsCount = taskStatisticsForAuditCheck.getSkippedFindingsCount();
            jsonWriter.name("skippedFindingsCount");
            jsonWriter.value(skippedFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getCanceledFindingsCount() != null) {
            Long canceledFindingsCount = taskStatisticsForAuditCheck.getCanceledFindingsCount();
            jsonWriter.name("canceledFindingsCount");
            jsonWriter.value(canceledFindingsCount);
        }
        jsonWriter.endObject();
    }

    private static TaskStatisticsForAuditCheckJsonMarshaller instance;

    public static TaskStatisticsForAuditCheckJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskStatisticsForAuditCheckJsonMarshaller();
        return instance;
    }
}
