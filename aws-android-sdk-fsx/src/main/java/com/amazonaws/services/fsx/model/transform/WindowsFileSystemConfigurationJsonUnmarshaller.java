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
 * JSON unmarshaller for POJO WindowsFileSystemConfiguration
 */
class WindowsFileSystemConfigurationJsonUnmarshaller implements
        Unmarshaller<WindowsFileSystemConfiguration, JsonUnmarshallerContext> {

    public WindowsFileSystemConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WindowsFileSystemConfiguration windowsFileSystemConfiguration = new WindowsFileSystemConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActiveDirectoryId")) {
                windowsFileSystemConfiguration.setActiveDirectoryId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SelfManagedActiveDirectoryConfiguration")) {
                windowsFileSystemConfiguration
                        .setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryAttributesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeploymentType")) {
                windowsFileSystemConfiguration.setDeploymentType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemoteAdministrationEndpoint")) {
                windowsFileSystemConfiguration
                        .setRemoteAdministrationEndpoint(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PreferredSubnetId")) {
                windowsFileSystemConfiguration.setPreferredSubnetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreferredFileServerIp")) {
                windowsFileSystemConfiguration.setPreferredFileServerIp(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThroughputCapacity")) {
                windowsFileSystemConfiguration.setThroughputCapacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaintenanceOperationsInProgress")) {
                windowsFileSystemConfiguration
                        .setMaintenanceOperationsInProgress(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WeeklyMaintenanceStartTime")) {
                windowsFileSystemConfiguration.setWeeklyMaintenanceStartTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DailyAutomaticBackupStartTime")) {
                windowsFileSystemConfiguration
                        .setDailyAutomaticBackupStartTime(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("AutomaticBackupRetentionDays")) {
                windowsFileSystemConfiguration
                        .setAutomaticBackupRetentionDays(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CopyTagsToBackups")) {
                windowsFileSystemConfiguration.setCopyTagsToBackups(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return windowsFileSystemConfiguration;
    }

    private static WindowsFileSystemConfigurationJsonUnmarshaller instance;

    public static WindowsFileSystemConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WindowsFileSystemConfigurationJsonUnmarshaller();
        return instance;
    }
}
