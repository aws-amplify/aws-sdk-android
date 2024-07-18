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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response VerifyDevicePositionResult
 */
public class VerifyDevicePositionResultJsonUnmarshaller implements
        Unmarshaller<VerifyDevicePositionResult, JsonUnmarshallerContext> {

    public VerifyDevicePositionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        VerifyDevicePositionResult verifyDevicePositionResult = new VerifyDevicePositionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InferredState")) {
                verifyDevicePositionResult.setInferredState(InferredStateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceId")) {
                verifyDevicePositionResult.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleTime")) {
                verifyDevicePositionResult.setSampleTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("ReceivedTime")) {
                verifyDevicePositionResult.setReceivedTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("DistanceUnit")) {
                verifyDevicePositionResult.setDistanceUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return verifyDevicePositionResult;
    }

    private static VerifyDevicePositionResultJsonUnmarshaller instance;

    public static VerifyDevicePositionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifyDevicePositionResultJsonUnmarshaller();
        return instance;
    }
}
