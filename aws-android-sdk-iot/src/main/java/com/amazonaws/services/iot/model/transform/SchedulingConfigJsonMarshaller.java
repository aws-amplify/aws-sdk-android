/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SchedulingConfig
 */
class SchedulingConfigJsonMarshaller {

    public void marshall(SchedulingConfig schedulingConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (schedulingConfig.getStartTime() != null) {
            String startTime = schedulingConfig.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (schedulingConfig.getEndTime() != null) {
            String endTime = schedulingConfig.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (schedulingConfig.getEndBehavior() != null) {
            String endBehavior = schedulingConfig.getEndBehavior();
            jsonWriter.name("endBehavior");
            jsonWriter.value(endBehavior);
        }
        if (schedulingConfig.getMaintenanceWindows() != null) {
            java.util.List<MaintenanceWindow> maintenanceWindows = schedulingConfig
                    .getMaintenanceWindows();
            jsonWriter.name("maintenanceWindows");
            jsonWriter.beginArray();
            for (MaintenanceWindow maintenanceWindowsItem : maintenanceWindows) {
                if (maintenanceWindowsItem != null) {
                    MaintenanceWindowJsonMarshaller.getInstance().marshall(maintenanceWindowsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SchedulingConfigJsonMarshaller instance;

    public static SchedulingConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SchedulingConfigJsonMarshaller();
        return instance;
    }
}
