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
 * JSON marshaller for POJO LustreFileSystemConfiguration
 */
class LustreFileSystemConfigurationJsonMarshaller {

    public void marshall(LustreFileSystemConfiguration lustreFileSystemConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lustreFileSystemConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = lustreFileSystemConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (lustreFileSystemConfiguration.getDataRepositoryConfiguration() != null) {
            DataRepositoryConfiguration dataRepositoryConfiguration = lustreFileSystemConfiguration
                    .getDataRepositoryConfiguration();
            jsonWriter.name("DataRepositoryConfiguration");
            DataRepositoryConfigurationJsonMarshaller.getInstance().marshall(
                    dataRepositoryConfiguration, jsonWriter);
        }
        if (lustreFileSystemConfiguration.getDeploymentType() != null) {
            String deploymentType = lustreFileSystemConfiguration.getDeploymentType();
            jsonWriter.name("DeploymentType");
            jsonWriter.value(deploymentType);
        }
        if (lustreFileSystemConfiguration.getPerUnitStorageThroughput() != null) {
            Integer perUnitStorageThroughput = lustreFileSystemConfiguration
                    .getPerUnitStorageThroughput();
            jsonWriter.name("PerUnitStorageThroughput");
            jsonWriter.value(perUnitStorageThroughput);
        }
        if (lustreFileSystemConfiguration.getMountName() != null) {
            String mountName = lustreFileSystemConfiguration.getMountName();
            jsonWriter.name("MountName");
            jsonWriter.value(mountName);
        }
        if (lustreFileSystemConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = lustreFileSystemConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (lustreFileSystemConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = lustreFileSystemConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        if (lustreFileSystemConfiguration.getCopyTagsToBackups() != null) {
            Boolean copyTagsToBackups = lustreFileSystemConfiguration.getCopyTagsToBackups();
            jsonWriter.name("CopyTagsToBackups");
            jsonWriter.value(copyTagsToBackups);
        }
        jsonWriter.endObject();
    }

    private static LustreFileSystemConfigurationJsonMarshaller instance;

    public static LustreFileSystemConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LustreFileSystemConfigurationJsonMarshaller();
        return instance;
    }
}
