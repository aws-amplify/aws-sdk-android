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
 * JSON marshaller for POJO UpdateFileSystemWindowsConfiguration
 */
class UpdateFileSystemWindowsConfigurationJsonMarshaller {

    public void marshall(UpdateFileSystemWindowsConfiguration updateFileSystemWindowsConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateFileSystemWindowsConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = updateFileSystemWindowsConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (updateFileSystemWindowsConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = updateFileSystemWindowsConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (updateFileSystemWindowsConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = updateFileSystemWindowsConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        if (updateFileSystemWindowsConfiguration.getThroughputCapacity() != null) {
            Integer throughputCapacity = updateFileSystemWindowsConfiguration
                    .getThroughputCapacity();
            jsonWriter.name("ThroughputCapacity");
            jsonWriter.value(throughputCapacity);
        }
        if (updateFileSystemWindowsConfiguration.getSelfManagedActiveDirectoryConfiguration() != null) {
            SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration = updateFileSystemWindowsConfiguration
                    .getSelfManagedActiveDirectoryConfiguration();
            jsonWriter.name("SelfManagedActiveDirectoryConfiguration");
            SelfManagedActiveDirectoryConfigurationUpdatesJsonMarshaller.getInstance().marshall(
                    selfManagedActiveDirectoryConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UpdateFileSystemWindowsConfigurationJsonMarshaller instance;

    public static UpdateFileSystemWindowsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFileSystemWindowsConfigurationJsonMarshaller();
        return instance;
    }
}
