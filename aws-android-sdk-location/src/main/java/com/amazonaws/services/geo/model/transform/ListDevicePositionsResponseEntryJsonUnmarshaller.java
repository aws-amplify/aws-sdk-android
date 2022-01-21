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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ListDevicePositionsResponseEntry
 */
class ListDevicePositionsResponseEntryJsonUnmarshaller implements
        Unmarshaller<ListDevicePositionsResponseEntry, JsonUnmarshallerContext> {

    public ListDevicePositionsResponseEntry unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ListDevicePositionsResponseEntry listDevicePositionsResponseEntry = new ListDevicePositionsResponseEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Accuracy")) {
                listDevicePositionsResponseEntry.setAccuracy(PositionalAccuracyJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceId")) {
                listDevicePositionsResponseEntry.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                listDevicePositionsResponseEntry.setPosition(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PositionProperties")) {
                listDevicePositionsResponseEntry.setPositionProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SampleTime")) {
                listDevicePositionsResponseEntry.setSampleTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listDevicePositionsResponseEntry;
    }

    private static ListDevicePositionsResponseEntryJsonUnmarshaller instance;

    public static ListDevicePositionsResponseEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListDevicePositionsResponseEntryJsonUnmarshaller();
        return instance;
    }
}
