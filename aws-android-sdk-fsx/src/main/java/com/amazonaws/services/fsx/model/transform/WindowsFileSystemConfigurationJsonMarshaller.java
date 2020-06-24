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
 * JSON marshaller for POJO WindowsFileSystemConfiguration
 */
class WindowsFileSystemConfigurationJsonMarshaller {

    public void marshall(WindowsFileSystemConfiguration windowsFileSystemConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (windowsFileSystemConfiguration.getActiveDirectoryId() != null) {
            String activeDirectoryId = windowsFileSystemConfiguration.getActiveDirectoryId();
            jsonWriter.name("ActiveDirectoryId");
            jsonWriter.value(activeDirectoryId);
        }
        if (windowsFileSystemConfiguration.getSelfManagedActiveDirectoryConfiguration() != null) {
            SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration = windowsFileSystemConfiguration
                    .getSelfManagedActiveDirectoryConfiguration();
            jsonWriter.name("SelfManagedActiveDirectoryConfiguration");
            SelfManagedActiveDirectoryAttributesJsonMarshaller.getInstance().marshall(
                    selfManagedActiveDirectoryConfiguration, jsonWriter);
        }
        if (windowsFileSystemConfiguration.getDeploymentType() != null) {
            String deploymentType = windowsFileSystemConfiguration.getDeploymentType();
            jsonWriter.name("DeploymentType");
            jsonWriter.value(deploymentType);
        }
        if (windowsFileSystemConfiguration.getRemoteAdministrationEndpoint() != null) {
            String remoteAdministrationEndpoint = windowsFileSystemConfiguration
                    .getRemoteAdministrationEndpoint();
            jsonWriter.name("RemoteAdministrationEndpoint");
            jsonWriter.value(remoteAdministrationEndpoint);
        }
        if (windowsFileSystemConfiguration.getPreferredSubnetId() != null) {
            String preferredSubnetId = windowsFileSystemConfiguration.getPreferredSubnetId();
            jsonWriter.name("PreferredSubnetId");
            jsonWriter.value(preferredSubnetId);
        }
        if (windowsFileSystemConfiguration.getPreferredFileServerIp() != null) {
            String preferredFileServerIp = windowsFileSystemConfiguration
                    .getPreferredFileServerIp();
            jsonWriter.name("PreferredFileServerIp");
            jsonWriter.value(preferredFileServerIp);
        }
        if (windowsFileSystemConfiguration.getThroughputCapacity() != null) {
            Integer throughputCapacity = windowsFileSystemConfiguration.getThroughputCapacity();
            jsonWriter.name("ThroughputCapacity");
            jsonWriter.value(throughputCapacity);
        }
        if (windowsFileSystemConfiguration.getMaintenanceOperationsInProgress() != null) {
            java.util.List<String> maintenanceOperationsInProgress = windowsFileSystemConfiguration
                    .getMaintenanceOperationsInProgress();
            jsonWriter.name("MaintenanceOperationsInProgress");
            jsonWriter.beginArray();
            for (String maintenanceOperationsInProgressItem : maintenanceOperationsInProgress) {
                if (maintenanceOperationsInProgressItem != null) {
                    jsonWriter.value(maintenanceOperationsInProgressItem);
                }
            }
            jsonWriter.endArray();
        }
        if (windowsFileSystemConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = windowsFileSystemConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (windowsFileSystemConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = windowsFileSystemConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (windowsFileSystemConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = windowsFileSystemConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        if (windowsFileSystemConfiguration.getCopyTagsToBackups() != null) {
            Boolean copyTagsToBackups = windowsFileSystemConfiguration.getCopyTagsToBackups();
            jsonWriter.name("CopyTagsToBackups");
            jsonWriter.value(copyTagsToBackups);
        }
        jsonWriter.endObject();
    }

    private static WindowsFileSystemConfigurationJsonMarshaller instance;

    public static WindowsFileSystemConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WindowsFileSystemConfigurationJsonMarshaller();
        return instance;
    }
}
