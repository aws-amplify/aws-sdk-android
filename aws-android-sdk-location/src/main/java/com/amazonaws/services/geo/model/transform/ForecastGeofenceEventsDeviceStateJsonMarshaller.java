/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ForecastGeofenceEventsDeviceState
 */
class ForecastGeofenceEventsDeviceStateJsonMarshaller {

    public void marshall(ForecastGeofenceEventsDeviceState forecastGeofenceEventsDeviceState,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (forecastGeofenceEventsDeviceState.getPosition() != null) {
            java.util.List<Double> position = forecastGeofenceEventsDeviceState.getPosition();
            jsonWriter.name("Position");
            jsonWriter.beginArray();
            for (Double positionItem : position) {
                if (positionItem != null) {
                    jsonWriter.value(positionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (forecastGeofenceEventsDeviceState.getSpeed() != null) {
            Double speed = forecastGeofenceEventsDeviceState.getSpeed();
            jsonWriter.name("Speed");
            jsonWriter.value(speed);
        }
        jsonWriter.endObject();
    }

    private static ForecastGeofenceEventsDeviceStateJsonMarshaller instance;

    public static ForecastGeofenceEventsDeviceStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ForecastGeofenceEventsDeviceStateJsonMarshaller();
        return instance;
    }
}
