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
 * JSON marshaller for POJO InputDeviceHdSettings
 */
class InputDeviceHdSettingsJsonMarshaller {

    public void marshall(InputDeviceHdSettings inputDeviceHdSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputDeviceHdSettings.getActiveInput() != null) {
            String activeInput = inputDeviceHdSettings.getActiveInput();
            jsonWriter.name("ActiveInput");
            jsonWriter.value(activeInput);
        }
        if (inputDeviceHdSettings.getConfiguredInput() != null) {
            String configuredInput = inputDeviceHdSettings.getConfiguredInput();
            jsonWriter.name("ConfiguredInput");
            jsonWriter.value(configuredInput);
        }
        if (inputDeviceHdSettings.getDeviceState() != null) {
            String deviceState = inputDeviceHdSettings.getDeviceState();
            jsonWriter.name("DeviceState");
            jsonWriter.value(deviceState);
        }
        if (inputDeviceHdSettings.getFramerate() != null) {
            Double framerate = inputDeviceHdSettings.getFramerate();
            jsonWriter.name("Framerate");
            jsonWriter.value(framerate);
        }
        if (inputDeviceHdSettings.getHeight() != null) {
            Integer height = inputDeviceHdSettings.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (inputDeviceHdSettings.getMaxBitrate() != null) {
            Integer maxBitrate = inputDeviceHdSettings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (inputDeviceHdSettings.getScanType() != null) {
            String scanType = inputDeviceHdSettings.getScanType();
            jsonWriter.name("ScanType");
            jsonWriter.value(scanType);
        }
        if (inputDeviceHdSettings.getWidth() != null) {
            Integer width = inputDeviceHdSettings.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        jsonWriter.endObject();
    }

    private static InputDeviceHdSettingsJsonMarshaller instance;

    public static InputDeviceHdSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceHdSettingsJsonMarshaller();
        return instance;
    }
}
