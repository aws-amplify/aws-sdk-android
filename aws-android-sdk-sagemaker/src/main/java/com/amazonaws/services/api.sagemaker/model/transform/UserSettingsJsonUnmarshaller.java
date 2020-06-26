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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserSettings
 */
class UserSettingsJsonUnmarshaller implements Unmarshaller<UserSettings, JsonUnmarshallerContext> {

    public UserSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserSettings userSettings = new UserSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ExecutionRole")) {
                userSettings.setExecutionRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                userSettings.setSecurityGroups(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SharingSettings")) {
                userSettings.setSharingSettings(SharingSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JupyterServerAppSettings")) {
                userSettings.setJupyterServerAppSettings(JupyterServerAppSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelGatewayAppSettings")) {
                userSettings.setKernelGatewayAppSettings(KernelGatewayAppSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TensorBoardAppSettings")) {
                userSettings.setTensorBoardAppSettings(TensorBoardAppSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userSettings;
    }

    private static UserSettingsJsonUnmarshaller instance;

    public static UserSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserSettingsJsonUnmarshaller();
        return instance;
    }
}
