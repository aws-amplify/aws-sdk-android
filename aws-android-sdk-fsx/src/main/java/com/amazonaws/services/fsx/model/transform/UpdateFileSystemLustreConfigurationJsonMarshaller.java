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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateFileSystemLustreConfiguration
 */
class UpdateFileSystemLustreConfigurationJsonMarshaller {

    public void marshall(UpdateFileSystemLustreConfiguration updateFileSystemLustreConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateFileSystemLustreConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = updateFileSystemLustreConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (updateFileSystemLustreConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = updateFileSystemLustreConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (updateFileSystemLustreConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = updateFileSystemLustreConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        jsonWriter.endObject();
    }

    private static UpdateFileSystemLustreConfigurationJsonMarshaller instance;

    public static UpdateFileSystemLustreConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFileSystemLustreConfigurationJsonMarshaller();
        return instance;
    }
}
