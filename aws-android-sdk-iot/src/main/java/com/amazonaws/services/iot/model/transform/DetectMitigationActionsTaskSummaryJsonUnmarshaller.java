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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DetectMitigationActionsTaskSummary
 */
class DetectMitigationActionsTaskSummaryJsonUnmarshaller implements
        Unmarshaller<DetectMitigationActionsTaskSummary, JsonUnmarshallerContext> {

    public DetectMitigationActionsTaskSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary = new DetectMitigationActionsTaskSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                detectMitigationActionsTaskSummary.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStatus")) {
                detectMitigationActionsTaskSummary.setTaskStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStartTime")) {
                detectMitigationActionsTaskSummary.setTaskStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskEndTime")) {
                detectMitigationActionsTaskSummary.setTaskEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("target")) {
                detectMitigationActionsTaskSummary
                        .setTarget(DetectMitigationActionsTaskTargetJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("violationEventOccurrenceRange")) {
                detectMitigationActionsTaskSummary
                        .setViolationEventOccurrenceRange(ViolationEventOccurrenceRangeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("onlyActiveViolationsIncluded")) {
                detectMitigationActionsTaskSummary
                        .setOnlyActiveViolationsIncluded(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("suppressedAlertsIncluded")) {
                detectMitigationActionsTaskSummary
                        .setSuppressedAlertsIncluded(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("actionsDefinition")) {
                detectMitigationActionsTaskSummary
                        .setActionsDefinition(new ListUnmarshaller<MitigationAction>(
                                MitigationActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("taskStatistics")) {
                detectMitigationActionsTaskSummary
                        .setTaskStatistics(DetectMitigationActionsTaskStatisticsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectMitigationActionsTaskSummary;
    }

    private static DetectMitigationActionsTaskSummaryJsonUnmarshaller instance;

    public static DetectMitigationActionsTaskSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionsTaskSummaryJsonUnmarshaller();
        return instance;
    }
}
