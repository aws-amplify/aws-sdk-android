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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DeviceData
 */
class DeviceDataJsonUnmarshaller implements Unmarshaller<DeviceData, JsonUnmarshallerContext> {

    public DeviceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeviceData deviceData = new DeviceData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeviceArn")) {
                deviceData.setDeviceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceSerialNumber")) {
                deviceData.setDeviceSerialNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceType")) {
                deviceData.setDeviceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceName")) {
                deviceData.setDeviceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SoftwareVersion")) {
                deviceData.setSoftwareVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MacAddress")) {
                deviceData.setMacAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceStatus")) {
                deviceData.setDeviceStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkProfileArn")) {
                deviceData.setNetworkProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkProfileName")) {
                deviceData.setNetworkProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoomArn")) {
                deviceData.setRoomArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoomName")) {
                deviceData.setRoomName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceStatusInfo")) {
                deviceData.setDeviceStatusInfo(DeviceStatusInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                deviceData.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deviceData;
    }

    private static DeviceDataJsonUnmarshaller instance;

    public static DeviceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceDataJsonUnmarshaller();
        return instance;
    }
}
