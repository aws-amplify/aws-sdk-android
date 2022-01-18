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
 * JSON unmarshaller for response GetDevicePositionHistoryResult
 */
public class GetDevicePositionHistoryResultJsonUnmarshaller implements
        Unmarshaller<GetDevicePositionHistoryResult, JsonUnmarshallerContext> {

    public GetDevicePositionHistoryResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetDevicePositionHistoryResult getDevicePositionHistoryResult = new GetDevicePositionHistoryResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DevicePositions")) {
                getDevicePositionHistoryResult
                        .setDevicePositions(new ListUnmarshaller<DevicePosition>(
                                DevicePositionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getDevicePositionHistoryResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDevicePositionHistoryResult;
    }

    private static GetDevicePositionHistoryResultJsonUnmarshaller instance;

    public static GetDevicePositionHistoryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDevicePositionHistoryResultJsonUnmarshaller();
        return instance;
    }
}
