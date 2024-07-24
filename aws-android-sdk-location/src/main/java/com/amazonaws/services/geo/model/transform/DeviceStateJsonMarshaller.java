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
 * JSON marshaller for POJO DeviceState
 */
class DeviceStateJsonMarshaller {

    public void marshall(DeviceState deviceState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deviceState.getDeviceId() != null) {
            String deviceId = deviceState.getDeviceId();
            jsonWriter.name("DeviceId");
            jsonWriter.value(deviceId);
        }
        if (deviceState.getSampleTime() != null) {
            java.util.Date sampleTime = deviceState.getSampleTime();
            jsonWriter.name("SampleTime");
            jsonWriter.value(DateUtils.formatISO8601Date(sampleTime));
        }
        if (deviceState.getPosition() != null) {
            java.util.List<Double> position = deviceState.getPosition();
            jsonWriter.name("Position");
            jsonWriter.beginArray();
            for (Double positionItem : position) {
                if (positionItem != null) {
                    jsonWriter.value(positionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (deviceState.getAccuracy() != null) {
            PositionalAccuracy accuracy = deviceState.getAccuracy();
            jsonWriter.name("Accuracy");
            PositionalAccuracyJsonMarshaller.getInstance().marshall(accuracy, jsonWriter);
        }
        if (deviceState.getIpv4Address() != null) {
            String ipv4Address = deviceState.getIpv4Address();
            jsonWriter.name("Ipv4Address");
            jsonWriter.value(ipv4Address);
        }
        if (deviceState.getWiFiAccessPoints() != null) {
            java.util.List<WiFiAccessPoint> wiFiAccessPoints = deviceState.getWiFiAccessPoints();
            jsonWriter.name("WiFiAccessPoints");
            jsonWriter.beginArray();
            for (WiFiAccessPoint wiFiAccessPointsItem : wiFiAccessPoints) {
                if (wiFiAccessPointsItem != null) {
                    WiFiAccessPointJsonMarshaller.getInstance().marshall(wiFiAccessPointsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deviceState.getCellSignals() != null) {
            CellSignals cellSignals = deviceState.getCellSignals();
            jsonWriter.name("CellSignals");
            CellSignalsJsonMarshaller.getInstance().marshall(cellSignals, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DeviceStateJsonMarshaller instance;

    public static DeviceStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceStateJsonMarshaller();
        return instance;
    }
}
