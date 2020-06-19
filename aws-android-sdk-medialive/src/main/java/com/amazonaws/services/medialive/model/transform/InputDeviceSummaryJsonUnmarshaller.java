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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InputDeviceSummary
 */
class InputDeviceSummaryJsonUnmarshaller implements
        Unmarshaller<InputDeviceSummary, JsonUnmarshallerContext> {

    public InputDeviceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InputDeviceSummary inputDeviceSummary = new InputDeviceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                inputDeviceSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionState")) {
                inputDeviceSummary.setConnectionState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceSettingsSyncState")) {
                inputDeviceSummary.setDeviceSettingsSyncState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HdDeviceSettings")) {
                inputDeviceSummary.setHdDeviceSettings(InputDeviceHdSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                inputDeviceSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MacAddress")) {
                inputDeviceSummary.setMacAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                inputDeviceSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkSettings")) {
                inputDeviceSummary.setNetworkSettings(InputDeviceNetworkSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SerialNumber")) {
                inputDeviceSummary.setSerialNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                inputDeviceSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inputDeviceSummary;
    }

    private static InputDeviceSummaryJsonUnmarshaller instance;

    public static InputDeviceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceSummaryJsonUnmarshaller();
        return instance;
    }
}
