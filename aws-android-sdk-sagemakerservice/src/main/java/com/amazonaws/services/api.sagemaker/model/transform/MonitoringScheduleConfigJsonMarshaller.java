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
 * JSON marshaller for POJO MonitoringScheduleConfig
 */
class MonitoringScheduleConfigJsonMarshaller {

    public void marshall(MonitoringScheduleConfig monitoringScheduleConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (monitoringScheduleConfig.getScheduleConfig() != null) {
            ScheduleConfig scheduleConfig = monitoringScheduleConfig.getScheduleConfig();
            jsonWriter.name("ScheduleConfig");
            ScheduleConfigJsonMarshaller.getInstance().marshall(scheduleConfig, jsonWriter);
        }
        if (monitoringScheduleConfig.getMonitoringJobDefinition() != null) {
            MonitoringJobDefinition monitoringJobDefinition = monitoringScheduleConfig
                    .getMonitoringJobDefinition();
            jsonWriter.name("MonitoringJobDefinition");
            MonitoringJobDefinitionJsonMarshaller.getInstance().marshall(monitoringJobDefinition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MonitoringScheduleConfigJsonMarshaller instance;

    public static MonitoringScheduleConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringScheduleConfigJsonMarshaller();
        return instance;
    }
}
