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
 * JSON marshaller for POJO ForecastedEvent
 */
class ForecastedEventJsonMarshaller {

    public void marshall(ForecastedEvent forecastedEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (forecastedEvent.getEventId() != null) {
            String eventId = forecastedEvent.getEventId();
            jsonWriter.name("EventId");
            jsonWriter.value(eventId);
        }
        if (forecastedEvent.getGeofenceId() != null) {
            String geofenceId = forecastedEvent.getGeofenceId();
            jsonWriter.name("GeofenceId");
            jsonWriter.value(geofenceId);
        }
        if (forecastedEvent.getIsDeviceInGeofence() != null) {
            Boolean isDeviceInGeofence = forecastedEvent.getIsDeviceInGeofence();
            jsonWriter.name("IsDeviceInGeofence");
            jsonWriter.value(isDeviceInGeofence);
        }
        if (forecastedEvent.getNearestDistance() != null) {
            Double nearestDistance = forecastedEvent.getNearestDistance();
            jsonWriter.name("NearestDistance");
            jsonWriter.value(nearestDistance);
        }
        if (forecastedEvent.getEventType() != null) {
            String eventType = forecastedEvent.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (forecastedEvent.getForecastedBreachTime() != null) {
            java.util.Date forecastedBreachTime = forecastedEvent.getForecastedBreachTime();
            jsonWriter.name("ForecastedBreachTime");
            jsonWriter.value(DateUtils.formatISO8601Date(forecastedBreachTime));
        }
        if (forecastedEvent.getGeofenceProperties() != null) {
            java.util.Map<String, String> geofenceProperties = forecastedEvent
                    .getGeofenceProperties();
            jsonWriter.name("GeofenceProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> geofencePropertiesEntry : geofenceProperties
                    .entrySet()) {
                String geofencePropertiesValue = geofencePropertiesEntry.getValue();
                if (geofencePropertiesValue != null) {
                    jsonWriter.name(geofencePropertiesEntry.getKey());
                    jsonWriter.value(geofencePropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ForecastedEventJsonMarshaller instance;

    public static ForecastedEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ForecastedEventJsonMarshaller();
        return instance;
    }
}
