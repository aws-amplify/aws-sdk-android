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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeMonitoringScheduleResult
 */
public class DescribeMonitoringScheduleResultJsonUnmarshaller implements
        Unmarshaller<DescribeMonitoringScheduleResult, JsonUnmarshallerContext> {

    public DescribeMonitoringScheduleResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeMonitoringScheduleResult describeMonitoringScheduleResult = new DescribeMonitoringScheduleResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MonitoringScheduleArn")) {
                describeMonitoringScheduleResult.setMonitoringScheduleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleName")) {
                describeMonitoringScheduleResult.setMonitoringScheduleName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleStatus")) {
                describeMonitoringScheduleResult.setMonitoringScheduleStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeMonitoringScheduleResult.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeMonitoringScheduleResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeMonitoringScheduleResult.setLastModifiedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleConfig")) {
                describeMonitoringScheduleResult
                        .setMonitoringScheduleConfig(MonitoringScheduleConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EndpointName")) {
                describeMonitoringScheduleResult.setEndpointName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastMonitoringExecutionSummary")) {
                describeMonitoringScheduleResult
                        .setLastMonitoringExecutionSummary(MonitoringExecutionSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeMonitoringScheduleResult;
    }

    private static DescribeMonitoringScheduleResultJsonUnmarshaller instance;

    public static DescribeMonitoringScheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMonitoringScheduleResultJsonUnmarshaller();
        return instance;
    }
}
