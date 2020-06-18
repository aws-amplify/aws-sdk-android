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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NexGuardFileMarkerSettings
 */
class NexGuardFileMarkerSettingsJsonMarshaller {

    public void marshall(NexGuardFileMarkerSettings nexGuardFileMarkerSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (nexGuardFileMarkerSettings.getLicense() != null) {
            String license = nexGuardFileMarkerSettings.getLicense();
            jsonWriter.name("License");
            jsonWriter.value(license);
        }
        if (nexGuardFileMarkerSettings.getPayload() != null) {
            Integer payload = nexGuardFileMarkerSettings.getPayload();
            jsonWriter.name("Payload");
            jsonWriter.value(payload);
        }
        if (nexGuardFileMarkerSettings.getPreset() != null) {
            String preset = nexGuardFileMarkerSettings.getPreset();
            jsonWriter.name("Preset");
            jsonWriter.value(preset);
        }
        if (nexGuardFileMarkerSettings.getStrength() != null) {
            String strength = nexGuardFileMarkerSettings.getStrength();
            jsonWriter.name("Strength");
            jsonWriter.value(strength);
        }
        jsonWriter.endObject();
    }

    private static NexGuardFileMarkerSettingsJsonMarshaller instance;

    public static NexGuardFileMarkerSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NexGuardFileMarkerSettingsJsonMarshaller();
        return instance;
    }
}
