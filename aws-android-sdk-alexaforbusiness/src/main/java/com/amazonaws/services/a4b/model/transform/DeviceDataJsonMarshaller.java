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
 * JSON marshaller for POJO DeviceData
 */
class DeviceDataJsonMarshaller {

    public void marshall(DeviceData deviceData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deviceData.getDeviceArn() != null) {
            String deviceArn = deviceData.getDeviceArn();
            jsonWriter.name("DeviceArn");
            jsonWriter.value(deviceArn);
        }
        if (deviceData.getDeviceSerialNumber() != null) {
            String deviceSerialNumber = deviceData.getDeviceSerialNumber();
            jsonWriter.name("DeviceSerialNumber");
            jsonWriter.value(deviceSerialNumber);
        }
        if (deviceData.getDeviceType() != null) {
            String deviceType = deviceData.getDeviceType();
            jsonWriter.name("DeviceType");
            jsonWriter.value(deviceType);
        }
        if (deviceData.getDeviceName() != null) {
            String deviceName = deviceData.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (deviceData.getSoftwareVersion() != null) {
            String softwareVersion = deviceData.getSoftwareVersion();
            jsonWriter.name("SoftwareVersion");
            jsonWriter.value(softwareVersion);
        }
        if (deviceData.getMacAddress() != null) {
            String macAddress = deviceData.getMacAddress();
            jsonWriter.name("MacAddress");
            jsonWriter.value(macAddress);
        }
        if (deviceData.getDeviceStatus() != null) {
            String deviceStatus = deviceData.getDeviceStatus();
            jsonWriter.name("DeviceStatus");
            jsonWriter.value(deviceStatus);
        }
        if (deviceData.getNetworkProfileArn() != null) {
            String networkProfileArn = deviceData.getNetworkProfileArn();
            jsonWriter.name("NetworkProfileArn");
            jsonWriter.value(networkProfileArn);
        }
        if (deviceData.getNetworkProfileName() != null) {
            String networkProfileName = deviceData.getNetworkProfileName();
            jsonWriter.name("NetworkProfileName");
            jsonWriter.value(networkProfileName);
        }
        if (deviceData.getRoomArn() != null) {
            String roomArn = deviceData.getRoomArn();
            jsonWriter.name("RoomArn");
            jsonWriter.value(roomArn);
        }
        if (deviceData.getRoomName() != null) {
            String roomName = deviceData.getRoomName();
            jsonWriter.name("RoomName");
            jsonWriter.value(roomName);
        }
        if (deviceData.getDeviceStatusInfo() != null) {
            DeviceStatusInfo deviceStatusInfo = deviceData.getDeviceStatusInfo();
            jsonWriter.name("DeviceStatusInfo");
            DeviceStatusInfoJsonMarshaller.getInstance().marshall(deviceStatusInfo, jsonWriter);
        }
        if (deviceData.getCreatedTime() != null) {
            java.util.Date createdTime = deviceData.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static DeviceDataJsonMarshaller instance;

    public static DeviceDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceDataJsonMarshaller();
        return instance;
    }
}
