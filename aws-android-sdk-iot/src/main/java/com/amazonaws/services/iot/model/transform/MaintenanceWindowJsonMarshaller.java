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
 * JSON marshaller for POJO MaintenanceWindow
 */
class MaintenanceWindowJsonMarshaller {

    public void marshall(MaintenanceWindow maintenanceWindow, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindow.getStartTime() != null) {
            String startTime = maintenanceWindow.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (maintenanceWindow.getDurationInMinutes() != null) {
            Integer durationInMinutes = maintenanceWindow.getDurationInMinutes();
            jsonWriter.name("durationInMinutes");
            jsonWriter.value(durationInMinutes);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowJsonMarshaller instance;

    public static MaintenanceWindowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowJsonMarshaller();
        return instance;
    }
}
