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
 * JSON marshaller for POJO CalculateRouteCarModeOptions
 */
class CalculateRouteCarModeOptionsJsonMarshaller {

    public void marshall(CalculateRouteCarModeOptions calculateRouteCarModeOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (calculateRouteCarModeOptions.getAvoidFerries() != null) {
            Boolean avoidFerries = calculateRouteCarModeOptions.getAvoidFerries();
            jsonWriter.name("AvoidFerries");
            jsonWriter.value(avoidFerries);
        }
        if (calculateRouteCarModeOptions.getAvoidTolls() != null) {
            Boolean avoidTolls = calculateRouteCarModeOptions.getAvoidTolls();
            jsonWriter.name("AvoidTolls");
            jsonWriter.value(avoidTolls);
        }
        jsonWriter.endObject();
    }

    private static CalculateRouteCarModeOptionsJsonMarshaller instance;

    public static CalculateRouteCarModeOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CalculateRouteCarModeOptionsJsonMarshaller();
        return instance;
    }
}
