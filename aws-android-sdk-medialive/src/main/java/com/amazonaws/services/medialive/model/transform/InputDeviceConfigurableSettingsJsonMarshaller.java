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
 * JSON marshaller for POJO InputDeviceConfigurableSettings
 */
class InputDeviceConfigurableSettingsJsonMarshaller {

    public void marshall(InputDeviceConfigurableSettings inputDeviceConfigurableSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputDeviceConfigurableSettings.getConfiguredInput() != null) {
            String configuredInput = inputDeviceConfigurableSettings.getConfiguredInput();
            jsonWriter.name("ConfiguredInput");
            jsonWriter.value(configuredInput);
        }
        if (inputDeviceConfigurableSettings.getMaxBitrate() != null) {
            Integer maxBitrate = inputDeviceConfigurableSettings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        jsonWriter.endObject();
    }

    private static InputDeviceConfigurableSettingsJsonMarshaller instance;

    public static InputDeviceConfigurableSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceConfigurableSettingsJsonMarshaller();
        return instance;
    }
}
