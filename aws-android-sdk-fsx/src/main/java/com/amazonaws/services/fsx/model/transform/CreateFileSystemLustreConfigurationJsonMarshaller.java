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
 * JSON marshaller for POJO CreateFileSystemLustreConfiguration
 */
class CreateFileSystemLustreConfigurationJsonMarshaller {

    public void marshall(CreateFileSystemLustreConfiguration createFileSystemLustreConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createFileSystemLustreConfiguration.getWeeklyMaintenanceStartTime() != null) {
            String weeklyMaintenanceStartTime = createFileSystemLustreConfiguration
                    .getWeeklyMaintenanceStartTime();
            jsonWriter.name("WeeklyMaintenanceStartTime");
            jsonWriter.value(weeklyMaintenanceStartTime);
        }
        if (createFileSystemLustreConfiguration.getImportPath() != null) {
            String importPath = createFileSystemLustreConfiguration.getImportPath();
            jsonWriter.name("ImportPath");
            jsonWriter.value(importPath);
        }
        if (createFileSystemLustreConfiguration.getExportPath() != null) {
            String exportPath = createFileSystemLustreConfiguration.getExportPath();
            jsonWriter.name("ExportPath");
            jsonWriter.value(exportPath);
        }
        if (createFileSystemLustreConfiguration.getImportedFileChunkSize() != null) {
            Integer importedFileChunkSize = createFileSystemLustreConfiguration
                    .getImportedFileChunkSize();
            jsonWriter.name("ImportedFileChunkSize");
            jsonWriter.value(importedFileChunkSize);
        }
        if (createFileSystemLustreConfiguration.getDeploymentType() != null) {
            String deploymentType = createFileSystemLustreConfiguration.getDeploymentType();
            jsonWriter.name("DeploymentType");
            jsonWriter.value(deploymentType);
        }
        if (createFileSystemLustreConfiguration.getPerUnitStorageThroughput() != null) {
            Integer perUnitStorageThroughput = createFileSystemLustreConfiguration
                    .getPerUnitStorageThroughput();
            jsonWriter.name("PerUnitStorageThroughput");
            jsonWriter.value(perUnitStorageThroughput);
        }
        if (createFileSystemLustreConfiguration.getDailyAutomaticBackupStartTime() != null) {
            String dailyAutomaticBackupStartTime = createFileSystemLustreConfiguration
                    .getDailyAutomaticBackupStartTime();
            jsonWriter.name("DailyAutomaticBackupStartTime");
            jsonWriter.value(dailyAutomaticBackupStartTime);
        }
        if (createFileSystemLustreConfiguration.getAutomaticBackupRetentionDays() != null) {
            Integer automaticBackupRetentionDays = createFileSystemLustreConfiguration
                    .getAutomaticBackupRetentionDays();
            jsonWriter.name("AutomaticBackupRetentionDays");
            jsonWriter.value(automaticBackupRetentionDays);
        }
        if (createFileSystemLustreConfiguration.getCopyTagsToBackups() != null) {
            Boolean copyTagsToBackups = createFileSystemLustreConfiguration.getCopyTagsToBackups();
            jsonWriter.name("CopyTagsToBackups");
            jsonWriter.value(copyTagsToBackups);
        }
        jsonWriter.endObject();
    }

    private static CreateFileSystemLustreConfigurationJsonMarshaller instance;

    public static CreateFileSystemLustreConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemLustreConfigurationJsonMarshaller();
        return instance;
    }
}
