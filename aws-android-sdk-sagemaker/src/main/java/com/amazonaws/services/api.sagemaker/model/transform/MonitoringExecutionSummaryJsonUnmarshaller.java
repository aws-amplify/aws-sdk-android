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
 * JSON unmarshaller for POJO MonitoringExecutionSummary
 */
class MonitoringExecutionSummaryJsonUnmarshaller implements
        Unmarshaller<MonitoringExecutionSummary, JsonUnmarshallerContext> {

    public MonitoringExecutionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MonitoringExecutionSummary monitoringExecutionSummary = new MonitoringExecutionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MonitoringScheduleName")) {
                monitoringExecutionSummary.setMonitoringScheduleName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduledTime")) {
                monitoringExecutionSummary.setScheduledTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                monitoringExecutionSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                monitoringExecutionSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringExecutionStatus")) {
                monitoringExecutionSummary.setMonitoringExecutionStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessingJobArn")) {
                monitoringExecutionSummary.setProcessingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointName")) {
                monitoringExecutionSummary.setEndpointName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                monitoringExecutionSummary.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return monitoringExecutionSummary;
    }

    private static MonitoringExecutionSummaryJsonUnmarshaller instance;

    public static MonitoringExecutionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringExecutionSummaryJsonUnmarshaller();
        return instance;
    }
}
