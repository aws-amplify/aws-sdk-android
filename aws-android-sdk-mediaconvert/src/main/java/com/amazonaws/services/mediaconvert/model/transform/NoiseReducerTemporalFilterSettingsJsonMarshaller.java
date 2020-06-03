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
 * JSON marshaller for POJO NoiseReducerTemporalFilterSettings
 */
class NoiseReducerTemporalFilterSettingsJsonMarshaller {

    public void marshall(NoiseReducerTemporalFilterSettings noiseReducerTemporalFilterSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (noiseReducerTemporalFilterSettings.getAggressiveMode() != null) {
            Integer aggressiveMode = noiseReducerTemporalFilterSettings.getAggressiveMode();
            jsonWriter.name("AggressiveMode");
            jsonWriter.value(aggressiveMode);
        }
        if (noiseReducerTemporalFilterSettings.getPostTemporalSharpening() != null) {
            String postTemporalSharpening = noiseReducerTemporalFilterSettings
                    .getPostTemporalSharpening();
            jsonWriter.name("PostTemporalSharpening");
            jsonWriter.value(postTemporalSharpening);
        }
        if (noiseReducerTemporalFilterSettings.getSpeed() != null) {
            Integer speed = noiseReducerTemporalFilterSettings.getSpeed();
            jsonWriter.name("Speed");
            jsonWriter.value(speed);
        }
        if (noiseReducerTemporalFilterSettings.getStrength() != null) {
            Integer strength = noiseReducerTemporalFilterSettings.getStrength();
            jsonWriter.name("Strength");
            jsonWriter.value(strength);
        }
        jsonWriter.endObject();
    }

    private static NoiseReducerTemporalFilterSettingsJsonMarshaller instance;

    public static NoiseReducerTemporalFilterSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NoiseReducerTemporalFilterSettingsJsonMarshaller();
        return instance;
    }
}
