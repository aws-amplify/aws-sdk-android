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
 * JSON marshaller for POJO CreateFileSystemWindowsConfiguration
 */
class CreateFileSystemWindowsConfigurationJsonMarshaller {

    public void marshall(CreateFileSystemWindowsConfiguration createFileSystemWindowsConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createFileSystemWindowsConfiguration.getActiveDirectoryId() != null) {
            String activeDirectoryId = createFileSystemWindowsConfiguration.getActiveDirectoryId();
            jsonWriter.name("ActiveDirectoryId");
            jsonWriter.value(activeDirectoryId);
        }
        if (createFileSystemWindowsConfiguration.getSelfManagedActiveDirectoryConfiguration() != null) {
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration = createFileSystemWindowsConfiguration
                    .getSelfManagedActiveDirectoryConfiguration();
            jsonWriter.name("SelfManagedActiveDirectoryConfiguration");
            SelfManagedActiveDirectoryConfigurationJsonMarshaller.getInstance().marshall(
                    selfManagedActiveDirectoryConfiguration, jsonWriter);
        }
        if (createFileSystemWindowsConfiguration.getDeploymentType() != null) {
            String deploymentType = createFileSystemWindowsConfiguration.getDeploymentType();
            jsonWriter.name("DeploymentType");
            jsonWriter.value(deploymentType);
        }
        if (createFileSystemWindowsConfiguration.getPreferredSubnetId() != null) {
            String preferredSubnetId = createFileSystemWindowsConfiguration.getPreferredSubnetId();
            jsonWriter.name("PreferredSubnetId");
            jsonWriter.value(preferredSubnetId);
        }
        if (createFileSystemWindowsConfiguration.getThroughputCapacity() != null) {
            Integer throughputCapacity = createFileSystemWindowsConfiguration
                    .getThroughputCapacity();
            jsonWriter.name("ThroughputCapacity");
            jsonWriter.value(throughputCapacity);
        }
        if (createFileSystemWindowsConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = createFileSystemWindowsConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (createFileSystemWindowsConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = createFileSystemWindowsConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (createFileSystemWindowsConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = createFileSystemWindowsConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        if (createFileSystemWindowsConfiguration.getCopyTagsToBackups() != null) {
            Boolean copyTagsToBackups = createFileSystemWindowsConfiguration.getCopyTagsToBackups();
            jsonWriter.name("CopyTagsToBackups");
            jsonWriter.value(copyTagsToBackups);
        }
        jsonWriter.endObject();
    }

    private static CreateFileSystemWindowsConfigurationJsonMarshaller instance;

    public static CreateFileSystemWindowsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemWindowsConfigurationJsonMarshaller();
        return instance;
    }
}
