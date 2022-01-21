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
 * JSON unmarshaller for response GetDevicePositionResult
 */
public class GetDevicePositionResultJsonUnmarshaller implements
        Unmarshaller<GetDevicePositionResult, JsonUnmarshallerContext> {

    public GetDevicePositionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDevicePositionResult getDevicePositionResult = new GetDevicePositionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Accuracy")) {
                getDevicePositionResult.setAccuracy(PositionalAccuracyJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceId")) {
                getDevicePositionResult.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                getDevicePositionResult.setPosition(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PositionProperties")) {
                getDevicePositionResult.setPositionProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReceivedTime")) {
                getDevicePositionResult.setReceivedTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("SampleTime")) {
                getDevicePositionResult.setSampleTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDevicePositionResult;
    }

    private static GetDevicePositionResultJsonUnmarshaller instance;

    public static GetDevicePositionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDevicePositionResultJsonUnmarshaller();
        return instance;
    }
}
