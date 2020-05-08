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
 * JSON unmarshaller for POJO MonitoringScheduleSummary
 */
class MonitoringScheduleSummaryJsonUnmarshaller implements
        Unmarshaller<MonitoringScheduleSummary, JsonUnmarshallerContext> {

    public MonitoringScheduleSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MonitoringScheduleSummary monitoringScheduleSummary = new MonitoringScheduleSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MonitoringScheduleName")) {
                monitoringScheduleSummary.setMonitoringScheduleName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleArn")) {
                monitoringScheduleSummary.setMonitoringScheduleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                monitoringScheduleSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                monitoringScheduleSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringScheduleStatus")) {
                monitoringScheduleSummary.setMonitoringScheduleStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointName")) {
                monitoringScheduleSummary.setEndpointName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return monitoringScheduleSummary;
    }

    private static MonitoringScheduleSummaryJsonUnmarshaller instance;

    public static MonitoringScheduleSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringScheduleSummaryJsonUnmarshaller();
        return instance;
    }
}
