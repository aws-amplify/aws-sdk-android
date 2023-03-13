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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LocationAction
 */
class LocationActionJsonUnmarshaller implements
        Unmarshaller<LocationAction, JsonUnmarshallerContext> {

    public LocationAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LocationAction locationAction = new LocationAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                locationAction.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trackerName")) {
                locationAction.setTrackerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deviceId")) {
                locationAction.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timestamp")) {
                locationAction.setTimestamp(LocationTimestampJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("latitude")) {
                locationAction.setLatitude(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("longitude")) {
                locationAction.setLongitude(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return locationAction;
    }

    private static LocationActionJsonUnmarshaller instance;

    public static LocationActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocationActionJsonUnmarshaller();
        return instance;
    }
}
