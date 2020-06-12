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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Device
 */
class DeviceJsonMarshaller {

    public void marshall(Device device, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (device.getHostPath() != null) {
            String hostPath = device.getHostPath();
            jsonWriter.name("hostPath");
            jsonWriter.value(hostPath);
        }
        if (device.getContainerPath() != null) {
            String containerPath = device.getContainerPath();
            jsonWriter.name("containerPath");
            jsonWriter.value(containerPath);
        }
        if (device.getPermissions() != null) {
            java.util.List<String> permissions = device.getPermissions();
            jsonWriter.name("permissions");
            jsonWriter.beginArray();
            for (String permissionsItem : permissions) {
                if (permissionsItem != null) {
                    jsonWriter.value(permissionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DeviceJsonMarshaller instance;

    public static DeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonMarshaller();
        return instance;
    }
}
