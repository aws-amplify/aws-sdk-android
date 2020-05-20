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
 * JSON unmarshaller for response DescribeInputDeviceResult
 */
public class DescribeInputDeviceResultJsonUnmarshaller implements
        Unmarshaller<DescribeInputDeviceResult, JsonUnmarshallerContext> {

    public DescribeInputDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInputDeviceResult describeInputDeviceResult = new DescribeInputDeviceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeInputDeviceResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionState")) {
                describeInputDeviceResult.setConnectionState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceSettingsSyncState")) {
                describeInputDeviceResult.setDeviceSettingsSyncState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HdDeviceSettings")) {
                describeInputDeviceResult.setHdDeviceSettings(InputDeviceHdSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                describeInputDeviceResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MacAddress")) {
                describeInputDeviceResult.setMacAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                describeInputDeviceResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkSettings")) {
                describeInputDeviceResult
                        .setNetworkSettings(InputDeviceNetworkSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SerialNumber")) {
                describeInputDeviceResult.setSerialNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                describeInputDeviceResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeInputDeviceResult;
    }

    private static DescribeInputDeviceResultJsonUnmarshaller instance;

    public static DescribeInputDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputDeviceResultJsonUnmarshaller();
        return instance;
    }
}
