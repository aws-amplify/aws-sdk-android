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
 * JSON marshaller for POJO DetectMitigationActionsTaskSummary
 */
class DetectMitigationActionsTaskSummaryJsonMarshaller {

    public void marshall(DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectMitigationActionsTaskSummary.getTaskId() != null) {
            String taskId = detectMitigationActionsTaskSummary.getTaskId();
            jsonWriter.name("taskId");
            jsonWriter.value(taskId);
        }
        if (detectMitigationActionsTaskSummary.getTaskStatus() != null) {
            String taskStatus = detectMitigationActionsTaskSummary.getTaskStatus();
            jsonWriter.name("taskStatus");
            jsonWriter.value(taskStatus);
        }
        if (detectMitigationActionsTaskSummary.getTaskStartTime() != null) {
            java.util.Date taskStartTime = detectMitigationActionsTaskSummary.getTaskStartTime();
            jsonWriter.name("taskStartTime");
            jsonWriter.value(taskStartTime);
        }
        if (detectMitigationActionsTaskSummary.getTaskEndTime() != null) {
            java.util.Date taskEndTime = detectMitigationActionsTaskSummary.getTaskEndTime();
            jsonWriter.name("taskEndTime");
            jsonWriter.value(taskEndTime);
        }
        if (detectMitigationActionsTaskSummary.getTarget() != null) {
            DetectMitigationActionsTaskTarget target = detectMitigationActionsTaskSummary
                    .getTarget();
            jsonWriter.name("target");
            DetectMitigationActionsTaskTargetJsonMarshaller.getInstance().marshall(target,
                    jsonWriter);
        }
        if (detectMitigationActionsTaskSummary.getViolationEventOccurrenceRange() != null) {
            ViolationEventOccurrenceRange violationEventOccurrenceRange = detectMitigationActionsTaskSummary
                    .getViolationEventOccurrenceRange();
            jsonWriter.name("violationEventOccurrenceRange");
            ViolationEventOccurrenceRangeJsonMarshaller.getInstance().marshall(
                    violationEventOccurrenceRange, jsonWriter);
        }
        if (detectMitigationActionsTaskSummary.getOnlyActiveViolationsIncluded() != null) {
            Boolean onlyActiveViolationsIncluded = detectMitigationActionsTaskSummary
                    .getOnlyActiveViolationsIncluded();
            jsonWriter.name("onlyActiveViolationsIncluded");
            jsonWriter.value(onlyActiveViolationsIncluded);
        }
        if (detectMitigationActionsTaskSummary.getSuppressedAlertsIncluded() != null) {
            Boolean suppressedAlertsIncluded = detectMitigationActionsTaskSummary
                    .getSuppressedAlertsIncluded();
            jsonWriter.name("suppressedAlertsIncluded");
            jsonWriter.value(suppressedAlertsIncluded);
        }
        if (detectMitigationActionsTaskSummary.getActionsDefinition() != null) {
            java.util.List<MitigationAction> actionsDefinition = detectMitigationActionsTaskSummary
                    .getActionsDefinition();
            jsonWriter.name("actionsDefinition");
            jsonWriter.beginArray();
            for (MitigationAction actionsDefinitionItem : actionsDefinition) {
                if (actionsDefinitionItem != null) {
                    MitigationActionJsonMarshaller.getInstance().marshall(actionsDefinitionItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (detectMitigationActionsTaskSummary.getTaskStatistics() != null) {
            DetectMitigationActionsTaskStatistics taskStatistics = detectMitigationActionsTaskSummary
                    .getTaskStatistics();
            jsonWriter.name("taskStatistics");
            DetectMitigationActionsTaskStatisticsJsonMarshaller.getInstance().marshall(
                    taskStatistics, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DetectMitigationActionsTaskSummaryJsonMarshaller instance;

    public static DetectMitigationActionsTaskSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionsTaskSummaryJsonMarshaller();
        return instance;
    }
}
