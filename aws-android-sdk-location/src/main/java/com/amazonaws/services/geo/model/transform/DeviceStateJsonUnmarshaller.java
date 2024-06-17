/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DeviceState
 */
class DeviceStateJsonUnmarshaller implements Unmarshaller<DeviceState, JsonUnmarshallerContext> {

    public DeviceState unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeviceState deviceState = new DeviceState();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeviceId")) {
                deviceState.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleTime")) {
                deviceState.setSampleTime(DateJsonUnmarshaller
                        .getInstance(TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                deviceState.setPosition(new ListUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Accuracy")) {
                deviceState.setAccuracy(PositionalAccuracyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv4Address")) {
                deviceState.setIpv4Address(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WiFiAccessPoints")) {
                deviceState.setWiFiAccessPoints(new ListUnmarshaller<WiFiAccessPoint>(
                        WiFiAccessPointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CellSignals")) {
                deviceState.setCellSignals(CellSignalsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deviceState;
    }

    private static DeviceStateJsonUnmarshaller instance;

    public static DeviceStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceStateJsonUnmarshaller();
        return instance;
    }
}
