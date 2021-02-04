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
 * JSON unmarshaller for response DescribeAuditMitigationActionsTaskResult
 */
public class DescribeAuditMitigationActionsTaskResultJsonUnmarshaller implements
        Unmarshaller<DescribeAuditMitigationActionsTaskResult, JsonUnmarshallerContext> {

    public DescribeAuditMitigationActionsTaskResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeAuditMitigationActionsTaskResult describeAuditMitigationActionsTaskResult = new DescribeAuditMitigationActionsTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskStatus")) {
                describeAuditMitigationActionsTaskResult.setTaskStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                describeAuditMitigationActionsTaskResult.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                describeAuditMitigationActionsTaskResult.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStatistics")) {
                describeAuditMitigationActionsTaskResult
                        .setTaskStatistics(new MapUnmarshaller<TaskStatisticsForAuditCheck>(
                                TaskStatisticsForAuditCheckJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("target")) {
                describeAuditMitigationActionsTaskResult
                        .setTarget(AuditMitigationActionsTaskTargetJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("auditCheckToActionsMapping")) {
                describeAuditMitigationActionsTaskResult
                        .setAuditCheckToActionsMapping(new MapUnmarshaller<java.util.List<String>>(
                                new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("actionsDefinition")) {
                describeAuditMitigationActionsTaskResult
                        .setActionsDefinition(new ListUnmarshaller<MitigationAction>(
                                MitigationActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAuditMitigationActionsTaskResult;
    }

    private static DescribeAuditMitigationActionsTaskResultJsonUnmarshaller instance;

    public static DescribeAuditMitigationActionsTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAuditMitigationActionsTaskResultJsonUnmarshaller();
        return instance;
    }
}
