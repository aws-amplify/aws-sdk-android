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
 * JSON unmarshaller for POJO InputDeviceHdSettings
 */
class InputDeviceHdSettingsJsonUnmarshaller implements
        Unmarshaller<InputDeviceHdSettings, JsonUnmarshallerContext> {

    public InputDeviceHdSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InputDeviceHdSettings inputDeviceHdSettings = new InputDeviceHdSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActiveInput")) {
                inputDeviceHdSettings.setActiveInput(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfiguredInput")) {
                inputDeviceHdSettings.setConfiguredInput(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceState")) {
                inputDeviceHdSettings.setDeviceState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Framerate")) {
                inputDeviceHdSettings.setFramerate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Height")) {
                inputDeviceHdSettings.setHeight(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxBitrate")) {
                inputDeviceHdSettings.setMaxBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScanType")) {
                inputDeviceHdSettings.setScanType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Width")) {
                inputDeviceHdSettings.setWidth(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inputDeviceHdSettings;
    }

    private static InputDeviceHdSettingsJsonUnmarshaller instance;

    public static InputDeviceHdSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceHdSettingsJsonUnmarshaller();
        return instance;
    }
}
