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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NoiseReducer
 */
class NoiseReducerJsonUnmarshaller implements Unmarshaller<NoiseReducer, JsonUnmarshallerContext> {

    public NoiseReducer unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NoiseReducer noiseReducer = new NoiseReducer();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Filter")) {
                noiseReducer.setFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterSettings")) {
                noiseReducer.setFilterSettings(NoiseReducerFilterSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpatialFilterSettings")) {
                noiseReducer
                        .setSpatialFilterSettings(NoiseReducerSpatialFilterSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TemporalFilterSettings")) {
                noiseReducer
                        .setTemporalFilterSettings(NoiseReducerTemporalFilterSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return noiseReducer;
    }

    private static NoiseReducerJsonUnmarshaller instance;

    public static NoiseReducerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NoiseReducerJsonUnmarshaller();
        return instance;
    }
}
