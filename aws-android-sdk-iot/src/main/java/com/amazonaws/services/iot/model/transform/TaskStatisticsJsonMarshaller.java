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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskStatistics
 */
class TaskStatisticsJsonMarshaller {

    public void marshall(TaskStatistics taskStatistics, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskStatistics.getTotalChecks() != null) {
            Integer totalChecks = taskStatistics.getTotalChecks();
            jsonWriter.name("totalChecks");
            jsonWriter.value(totalChecks);
        }
        if (taskStatistics.getInProgressChecks() != null) {
            Integer inProgressChecks = taskStatistics.getInProgressChecks();
            jsonWriter.name("inProgressChecks");
            jsonWriter.value(inProgressChecks);
        }
        if (taskStatistics.getWaitingForDataCollectionChecks() != null) {
            Integer waitingForDataCollectionChecks = taskStatistics
                    .getWaitingForDataCollectionChecks();
            jsonWriter.name("waitingForDataCollectionChecks");
            jsonWriter.value(waitingForDataCollectionChecks);
        }
        if (taskStatistics.getCompliantChecks() != null) {
            Integer compliantChecks = taskStatistics.getCompliantChecks();
            jsonWriter.name("compliantChecks");
            jsonWriter.value(compliantChecks);
        }
        if (taskStatistics.getNonCompliantChecks() != null) {
            Integer nonCompliantChecks = taskStatistics.getNonCompliantChecks();
            jsonWriter.name("nonCompliantChecks");
            jsonWriter.value(nonCompliantChecks);
        }
        if (taskStatistics.getFailedChecks() != null) {
            Integer failedChecks = taskStatistics.getFailedChecks();
            jsonWriter.name("failedChecks");
            jsonWriter.value(failedChecks);
        }
        if (taskStatistics.getCanceledChecks() != null) {
            Integer canceledChecks = taskStatistics.getCanceledChecks();
            jsonWriter.name("canceledChecks");
            jsonWriter.value(canceledChecks);
        }
        jsonWriter.endObject();
    }

    private static TaskStatisticsJsonMarshaller instance;

    public static TaskStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskStatisticsJsonMarshaller();
        return instance;
    }
}
