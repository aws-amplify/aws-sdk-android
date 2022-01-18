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
 * JSON unmarshaller for response GetGeofenceResult
 */
public class GetGeofenceResultJsonUnmarshaller implements
        Unmarshaller<GetGeofenceResult, JsonUnmarshallerContext> {

    public GetGeofenceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetGeofenceResult getGeofenceResult = new GetGeofenceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreateTime")) {
                getGeofenceResult.setCreateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("GeofenceId")) {
                getGeofenceResult.setGeofenceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Geometry")) {
                getGeofenceResult.setGeometry(GeofenceGeometryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getGeofenceResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                getGeofenceResult.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getGeofenceResult;
    }

    private static GetGeofenceResultJsonUnmarshaller instance;

    public static GetGeofenceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGeofenceResultJsonUnmarshaller();
        return instance;
    }
}
