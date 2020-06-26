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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MonitoringScheduleSummary
 */
class MonitoringScheduleSummaryJsonMarshaller {

    public void marshall(MonitoringScheduleSummary monitoringScheduleSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (monitoringScheduleSummary.getMonitoringScheduleName() != null) {
            String monitoringScheduleName = monitoringScheduleSummary.getMonitoringScheduleName();
            jsonWriter.name("MonitoringScheduleName");
            jsonWriter.value(monitoringScheduleName);
        }
        if (monitoringScheduleSummary.getMonitoringScheduleArn() != null) {
            String monitoringScheduleArn = monitoringScheduleSummary.getMonitoringScheduleArn();
            jsonWriter.name("MonitoringScheduleArn");
            jsonWriter.value(monitoringScheduleArn);
        }
        if (monitoringScheduleSummary.getCreationTime() != null) {
            java.util.Date creationTime = monitoringScheduleSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (monitoringScheduleSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = monitoringScheduleSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (monitoringScheduleSummary.getMonitoringScheduleStatus() != null) {
            String monitoringScheduleStatus = monitoringScheduleSummary
                    .getMonitoringScheduleStatus();
            jsonWriter.name("MonitoringScheduleStatus");
            jsonWriter.value(monitoringScheduleStatus);
        }
        if (monitoringScheduleSummary.getEndpointName() != null) {
            String endpointName = monitoringScheduleSummary.getEndpointName();
            jsonWriter.name("EndpointName");
            jsonWriter.value(endpointName);
        }
        jsonWriter.endObject();
    }

    private static MonitoringScheduleSummaryJsonMarshaller instance;

    public static MonitoringScheduleSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringScheduleSummaryJsonMarshaller();
        return instance;
    }
}
