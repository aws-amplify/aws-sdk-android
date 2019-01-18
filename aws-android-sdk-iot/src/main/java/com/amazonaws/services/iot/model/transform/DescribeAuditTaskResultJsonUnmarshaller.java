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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeAuditTaskResult
 */
public class DescribeAuditTaskResultJsonUnmarshaller implements
        Unmarshaller<DescribeAuditTaskResult, JsonUnmarshallerContext> {

    public DescribeAuditTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAuditTaskResult describeAuditTaskResult = new DescribeAuditTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskStatus")) {
                describeAuditTaskResult.setTaskStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskType")) {
                describeAuditTaskResult.setTaskType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStartTime")) {
                describeAuditTaskResult.setTaskStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskStatistics")) {
                describeAuditTaskResult.setTaskStatistics(TaskStatisticsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("scheduledAuditName")) {
                describeAuditTaskResult.setScheduledAuditName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("auditDetails")) {
                describeAuditTaskResult.setAuditDetails(new MapUnmarshaller<AuditCheckDetails>(
                        AuditCheckDetailsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAuditTaskResult;
    }

    private static DescribeAuditTaskResultJsonUnmarshaller instance;

    public static DescribeAuditTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAuditTaskResultJsonUnmarshaller();
        return instance;
    }
}
