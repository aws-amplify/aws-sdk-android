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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NoiseReducer
 */
class NoiseReducerJsonMarshaller {

    public void marshall(NoiseReducer noiseReducer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (noiseReducer.getFilter() != null) {
            String filter = noiseReducer.getFilter();
            jsonWriter.name("Filter");
            jsonWriter.value(filter);
        }
        if (noiseReducer.getFilterSettings() != null) {
            NoiseReducerFilterSettings filterSettings = noiseReducer.getFilterSettings();
            jsonWriter.name("FilterSettings");
            NoiseReducerFilterSettingsJsonMarshaller.getInstance().marshall(filterSettings,
                    jsonWriter);
        }
        if (noiseReducer.getSpatialFilterSettings() != null) {
            NoiseReducerSpatialFilterSettings spatialFilterSettings = noiseReducer
                    .getSpatialFilterSettings();
            jsonWriter.name("SpatialFilterSettings");
            NoiseReducerSpatialFilterSettingsJsonMarshaller.getInstance().marshall(
                    spatialFilterSettings, jsonWriter);
        }
        if (noiseReducer.getTemporalFilterSettings() != null) {
            NoiseReducerTemporalFilterSettings temporalFilterSettings = noiseReducer
                    .getTemporalFilterSettings();
            jsonWriter.name("TemporalFilterSettings");
            NoiseReducerTemporalFilterSettingsJsonMarshaller.getInstance().marshall(
                    temporalFilterSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NoiseReducerJsonMarshaller instance;

    public static NoiseReducerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NoiseReducerJsonMarshaller();
        return instance;
    }
}
