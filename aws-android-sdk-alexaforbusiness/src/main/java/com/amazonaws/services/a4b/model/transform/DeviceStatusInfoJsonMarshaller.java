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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeviceStatusInfo
 */
class DeviceStatusInfoJsonMarshaller {

    public void marshall(DeviceStatusInfo deviceStatusInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deviceStatusInfo.getDeviceStatusDetails() != null) {
            java.util.List<DeviceStatusDetail> deviceStatusDetails = deviceStatusInfo
                    .getDeviceStatusDetails();
            jsonWriter.name("DeviceStatusDetails");
            jsonWriter.beginArray();
            for (DeviceStatusDetail deviceStatusDetailsItem : deviceStatusDetails) {
                if (deviceStatusDetailsItem != null) {
                    DeviceStatusDetailJsonMarshaller.getInstance().marshall(
                            deviceStatusDetailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deviceStatusInfo.getConnectionStatus() != null) {
            String connectionStatus = deviceStatusInfo.getConnectionStatus();
            jsonWriter.name("ConnectionStatus");
            jsonWriter.value(connectionStatus);
        }
        if (deviceStatusInfo.getConnectionStatusUpdatedTime() != null) {
            java.util.Date connectionStatusUpdatedTime = deviceStatusInfo
                    .getConnectionStatusUpdatedTime();
            jsonWriter.name("ConnectionStatusUpdatedTime");
            jsonWriter.value(connectionStatusUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static DeviceStatusInfoJsonMarshaller instance;

    public static DeviceStatusInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceStatusInfoJsonMarshaller();
        return instance;
    }
}
