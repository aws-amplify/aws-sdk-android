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
 * JSON marshaller for POJO Device
 */
class DeviceJsonMarshaller {

    public void marshall(Device device, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (device.getDeviceArn() != null) {
            String deviceArn = device.getDeviceArn();
            jsonWriter.name("DeviceArn");
            jsonWriter.value(deviceArn);
        }
        if (device.getDeviceSerialNumber() != null) {
            String deviceSerialNumber = device.getDeviceSerialNumber();
            jsonWriter.name("DeviceSerialNumber");
            jsonWriter.value(deviceSerialNumber);
        }
        if (device.getDeviceType() != null) {
            String deviceType = device.getDeviceType();
            jsonWriter.name("DeviceType");
            jsonWriter.value(deviceType);
        }
        if (device.getDeviceName() != null) {
            String deviceName = device.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (device.getSoftwareVersion() != null) {
            String softwareVersion = device.getSoftwareVersion();
            jsonWriter.name("SoftwareVersion");
            jsonWriter.value(softwareVersion);
        }
        if (device.getMacAddress() != null) {
            String macAddress = device.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (device.getRoomArn() != null) {
            String roomArn = device.getRoomArn();
            jsonWriter.name("RoomArn");
            jsonWriter.value(roomArn);
        }
        if (device.getDeviceStatus() != null) {
            String deviceStatus = device.getDeviceStatus();
            jsonWriter.name("DeviceStatus");
            jsonWriter.value(deviceStatus);
        }
        if (device.getDeviceStatusInfo() != null) {
            DeviceStatusInfo deviceStatusInfo = device.getDeviceStatusInfo();
            jsonWriter.name("DeviceStatusInfo");
            DeviceStatusInfoJsonMarshaller.getInstance().marshall(deviceStatusInfo, jsonWriter);
        }
        if (device.getNetworkProfileInfo() != null) {
            DeviceNetworkProfileInfo networkProfileInfo = device.getNetworkProfileInfo();
            jsonWriter.name("NetworkProfileInfo");
            DeviceNetworkProfileInfoJsonMarshaller.getInstance().marshall(networkProfileInfo,
                    jsonWriter);
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
