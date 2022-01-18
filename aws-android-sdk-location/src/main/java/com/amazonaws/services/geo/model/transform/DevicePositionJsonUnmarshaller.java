/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO DevicePosition
 */
class DevicePositionJsonUnmarshaller implements
        Unmarshaller<DevicePosition, JsonUnmarshallerContext> {

    public DevicePosition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DevicePosition devicePosition = new DevicePosition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Accuracy")) {
                devicePosition.setAccuracy(PositionalAccuracyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceId")) {
                devicePosition.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                devicePosition.setPosition(new ListUnmarshaller<Double>(DoubleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PositionProperties")) {
                devicePosition.setPositionProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReceivedTime")) {
                devicePosition.setReceivedTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("SampleTime")) {
                devicePosition.setSampleTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return devicePosition;
    }

    private static DevicePositionJsonUnmarshaller instance;

    public static DevicePositionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DevicePositionJsonUnmarshaller();
        return instance;
    }
}
