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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputDeviceSummary
 */
class InputDeviceSummaryJsonMarshaller {

    public void marshall(InputDeviceSummary inputDeviceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputDeviceSummary.getArn() != null) {
            String arn = inputDeviceSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (inputDeviceSummary.getConnectionState() != null) {
            String connectionState = inputDeviceSummary.getConnectionState();
            jsonWriter.name("ConnectionState");
            jsonWriter.value(connectionState);
        }
        if (inputDeviceSummary.getDeviceSettingsSyncState() != null) {
            String deviceSettingsSyncState = inputDeviceSummary.getDeviceSettingsSyncState();
            jsonWriter.name("DeviceSettingsSyncState");
            jsonWriter.value(deviceSettingsSyncState);
        }
        if (inputDeviceSummary.getHdDeviceSettings() != null) {
            InputDeviceHdSettings hdDeviceSettings = inputDeviceSummary.getHdDeviceSettings();
            jsonWriter.name("HdDeviceSettings");
            InputDeviceHdSettingsJsonMarshaller.getInstance()
                    .marshall(hdDeviceSettings, jsonWriter);
        }
        if (inputDeviceSummary.getId() != null) {
            String id = inputDeviceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (inputDeviceSummary.getMacAddress() != null) {
            String macAddress = inputDeviceSummary.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (inputDeviceSummary.getName() != null) {
            String name = inputDeviceSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (inputDeviceSummary.getNetworkSettings() != null) {
            InputDeviceNetworkSettings networkSettings = inputDeviceSummary.getNetworkSettings();
            jsonWriter.name("NetworkSettings");
            InputDeviceNetworkSettingsJsonMarshaller.getInstance().marshall(networkSettings,
                    jsonWriter);
        }
        if (inputDeviceSummary.getSerialNumber() != null) {
            String serialNumber = inputDeviceSummary.getSerialNumber();
            jsonWriter.name("SerialNumber");
            jsonWriter.value(serialNumber);
        }
        if (inputDeviceSummary.getType() != null) {
            String type = inputDeviceSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static InputDeviceSummaryJsonMarshaller instance;

    public static InputDeviceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceSummaryJsonMarshaller();
        return instance;
    }
}
