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
 * JSON marshaller for POJO ListDevicePositionsResponseEntry
 */
class ListDevicePositionsResponseEntryJsonMarshaller {

    public void marshall(ListDevicePositionsResponseEntry listDevicePositionsResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listDevicePositionsResponseEntry.getAccuracy() != null) {
            PositionalAccuracy accuracy = listDevicePositionsResponseEntry.getAccuracy();
            jsonWriter.name("Accuracy");
            PositionalAccuracyJsonMarshaller.getInstance().marshall(accuracy, jsonWriter);
        }
        if (listDevicePositionsResponseEntry.getDeviceId() != null) {
            String deviceId = listDevicePositionsResponseEntry.getDeviceId();
            jsonWriter.name("DeviceId");
            jsonWriter.value(deviceId);
        }
        if (listDevicePositionsResponseEntry.getPosition() != null) {
            java.util.List<Double> position = listDevicePositionsResponseEntry.getPosition();
            jsonWriter.name("Position");
            jsonWriter.beginArray();
            for (Double positionItem : position) {
                if (positionItem != null) {
                    jsonWriter.value(positionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (listDevicePositionsResponseEntry.getPositionProperties() != null) {
            java.util.Map<String, String> positionProperties = listDevicePositionsResponseEntry
                    .getPositionProperties();
            jsonWriter.name("PositionProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> positionPropertiesEntry : positionProperties
                    .entrySet()) {
                String positionPropertiesValue = positionPropertiesEntry.getValue();
                if (positionPropertiesValue != null) {
                    jsonWriter.name(positionPropertiesEntry.getKey());
                    jsonWriter.value(positionPropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (listDevicePositionsResponseEntry.getSampleTime() != null) {
            java.util.Date sampleTime = listDevicePositionsResponseEntry.getSampleTime();
            jsonWriter.name("SampleTime");
            jsonWriter.value(DateUtils.formatISO8601Date(sampleTime));
        }
        jsonWriter.endObject();
    }

    private static ListDevicePositionsResponseEntryJsonMarshaller instance;

    public static ListDevicePositionsResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListDevicePositionsResponseEntryJsonMarshaller();
        return instance;
    }
}
