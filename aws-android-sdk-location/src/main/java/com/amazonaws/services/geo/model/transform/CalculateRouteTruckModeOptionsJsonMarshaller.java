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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CalculateRouteTruckModeOptions
 */
class CalculateRouteTruckModeOptionsJsonMarshaller {

    public void marshall(CalculateRouteTruckModeOptions calculateRouteTruckModeOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (calculateRouteTruckModeOptions.getAvoidFerries() != null) {
            Boolean avoidFerries = calculateRouteTruckModeOptions.getAvoidFerries();
            jsonWriter.name("AvoidFerries");
            jsonWriter.value(avoidFerries);
        }
        if (calculateRouteTruckModeOptions.getAvoidTolls() != null) {
            Boolean avoidTolls = calculateRouteTruckModeOptions.getAvoidTolls();
            jsonWriter.name("AvoidTolls");
            jsonWriter.value(avoidTolls);
        }
        if (calculateRouteTruckModeOptions.getDimensions() != null) {
            TruckDimensions dimensions = calculateRouteTruckModeOptions.getDimensions();
            jsonWriter.name("Dimensions");
            TruckDimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (calculateRouteTruckModeOptions.getWeight() != null) {
            TruckWeight weight = calculateRouteTruckModeOptions.getWeight();
            jsonWriter.name("Weight");
            TruckWeightJsonMarshaller.getInstance().marshall(weight, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CalculateRouteTruckModeOptionsJsonMarshaller instance;

    public static CalculateRouteTruckModeOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CalculateRouteTruckModeOptionsJsonMarshaller();
        return instance;
    }
}
