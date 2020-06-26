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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserSettings
 */
class UserSettingsJsonMarshaller {

    public void marshall(UserSettings userSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userSettings.getExecutionRole() != null) {
            String executionRole = userSettings.getExecutionRole();
            jsonWriter.name("ExecutionRole");
            jsonWriter.value(executionRole);
        }
        if (userSettings.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = userSettings.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userSettings.getSharingSettings() != null) {
            SharingSettings sharingSettings = userSettings.getSharingSettings();
            jsonWriter.name("SharingSettings");
            SharingSettingsJsonMarshaller.getInstance().marshall(sharingSettings, jsonWriter);
        }
        if (userSettings.getJupyterServerAppSettings() != null) {
            JupyterServerAppSettings jupyterServerAppSettings = userSettings
                    .getJupyterServerAppSettings();
            jsonWriter.name("JupyterServerAppSettings");
            JupyterServerAppSettingsJsonMarshaller.getInstance().marshall(jupyterServerAppSettings,
                    jsonWriter);
        }
        if (userSettings.getKernelGatewayAppSettings() != null) {
            KernelGatewayAppSettings kernelGatewayAppSettings = userSettings
                    .getKernelGatewayAppSettings();
            jsonWriter.name("KernelGatewayAppSettings");
            KernelGatewayAppSettingsJsonMarshaller.getInstance().marshall(kernelGatewayAppSettings,
                    jsonWriter);
        }
        if (userSettings.getTensorBoardAppSettings() != null) {
            TensorBoardAppSettings tensorBoardAppSettings = userSettings
                    .getTensorBoardAppSettings();
            jsonWriter.name("TensorBoardAppSettings");
            TensorBoardAppSettingsJsonMarshaller.getInstance().marshall(tensorBoardAppSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UserSettingsJsonMarshaller instance;

    public static UserSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserSettingsJsonMarshaller();
        return instance;
    }
}
