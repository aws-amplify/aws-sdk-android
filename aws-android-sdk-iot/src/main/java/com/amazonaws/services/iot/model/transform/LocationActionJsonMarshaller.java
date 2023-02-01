/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LocationAction
 */
class LocationActionJsonMarshaller {

    public void marshall(LocationAction locationAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (locationAction.getRoleArn() != null) {
            String roleArn = locationAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (locationAction.getTrackerName() != null) {
            String trackerName = locationAction.getTrackerName();
            jsonWriter.name("trackerName");
            jsonWriter.value(trackerName);
        }
        if (locationAction.getDeviceId() != null) {
            String deviceId = locationAction.getDeviceId();
            jsonWriter.name("deviceId");
            jsonWriter.value(deviceId);
        }
        if (locationAction.getTimestamp() != null) {
            LocationTimestamp timestamp = locationAction.getTimestamp();
            jsonWriter.name("timestamp");
            LocationTimestampJsonMarshaller.getInstance().marshall(timestamp, jsonWriter);
        }
        if (locationAction.getLatitude() != null) {
            String latitude = locationAction.getLatitude();
            jsonWriter.name("latitude");
            jsonWriter.value(latitude);
        }
        if (locationAction.getLongitude() != null) {
            String longitude = locationAction.getLongitude();
            jsonWriter.name("longitude");
            jsonWriter.value(longitude);
        }
        jsonWriter.endObject();
    }

    private static LocationActionJsonMarshaller instance;

    public static LocationActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocationActionJsonMarshaller();
        return instance;
    }
}
