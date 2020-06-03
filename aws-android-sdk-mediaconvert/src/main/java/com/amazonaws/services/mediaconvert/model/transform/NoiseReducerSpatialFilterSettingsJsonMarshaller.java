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
 * JSON marshaller for POJO NoiseReducerSpatialFilterSettings
 */
class NoiseReducerSpatialFilterSettingsJsonMarshaller {

    public void marshall(NoiseReducerSpatialFilterSettings noiseReducerSpatialFilterSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (noiseReducerSpatialFilterSettings.getPostFilterSharpenStrength() != null) {
            Integer postFilterSharpenStrength = noiseReducerSpatialFilterSettings
                    .getPostFilterSharpenStrength();
            jsonWriter.name("PostFilterSharpenStrength");
            jsonWriter.value(postFilterSharpenStrength);
        }
        if (noiseReducerSpatialFilterSettings.getSpeed() != null) {
            Integer speed = noiseReducerSpatialFilterSettings.getSpeed();
            jsonWriter.name("Speed");
            jsonWriter.value(speed);
        }
        if (noiseReducerSpatialFilterSettings.getStrength() != null) {
            Integer strength = noiseReducerSpatialFilterSettings.getStrength();
            jsonWriter.name("Strength");
            jsonWriter.value(strength);
        }
        jsonWriter.endObject();
    }

    private static NoiseReducerSpatialFilterSettingsJsonMarshaller instance;

    public static NoiseReducerSpatialFilterSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NoiseReducerSpatialFilterSettingsJsonMarshaller();
        return instance;
    }
}
