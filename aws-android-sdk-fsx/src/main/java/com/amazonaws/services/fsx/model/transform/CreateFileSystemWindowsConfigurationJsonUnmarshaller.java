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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CreateFileSystemWindowsConfiguration
 */
class CreateFileSystemWindowsConfigurationJsonUnmarshaller implements
        Unmarshaller<CreateFileSystemWindowsConfiguration, JsonUnmarshallerContext> {

    public CreateFileSystemWindowsConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateFileSystemWindowsConfiguration createFileSystemWindowsConfiguration = new CreateFileSystemWindowsConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActiveDirectoryId")) {
                createFileSystemWindowsConfiguration.setActiveDirectoryId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SelfManagedActiveDirectoryConfiguration")) {
                createFileSystemWindowsConfiguration
                        .setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeploymentType")) {
                createFileSystemWindowsConfiguration.setDeploymentType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreferredSubnetId")) {
                createFileSystemWindowsConfiguration.setPreferredSubnetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThroughputCapacity")) {
                createFileSystemWindowsConfiguration.setThroughputCapacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeeklyMaintenanceStartTime")) {
                createFileSystemWindowsConfiguration
                        .setWeeklyMaintenanceStartTime(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DailyAutomaticBackupStartTime")) {
                createFileSystemWindowsConfiguration
                        .setDailyAutomaticBackupStartTime(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("AutomaticBackupRetentionDays")) {
                createFileSystemWindowsConfiguration
                        .setAutomaticBackupRetentionDays(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CopyTagsToBackups")) {
                createFileSystemWindowsConfiguration.setCopyTagsToBackups(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createFileSystemWindowsConfiguration;
    }

    private static CreateFileSystemWindowsConfigurationJsonUnmarshaller instance;

    public static CreateFileSystemWindowsConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemWindowsConfigurationJsonUnmarshaller();
        return instance;
    }
}
