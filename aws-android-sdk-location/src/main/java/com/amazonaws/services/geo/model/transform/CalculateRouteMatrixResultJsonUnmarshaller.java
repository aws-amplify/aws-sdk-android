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
 * JSON unmarshaller for response CalculateRouteMatrixResult
 */
public class CalculateRouteMatrixResultJsonUnmarshaller implements
        Unmarshaller<CalculateRouteMatrixResult, JsonUnmarshallerContext> {

    public CalculateRouteMatrixResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CalculateRouteMatrixResult calculateRouteMatrixResult = new CalculateRouteMatrixResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RouteMatrix")) {
                calculateRouteMatrixResult
                        .setRouteMatrix(new ListUnmarshaller<java.util.List<RouteMatrixEntry>>(
                                new ListUnmarshaller<RouteMatrixEntry>(
                                        RouteMatrixEntryJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("SnappedDeparturePositions")) {
                calculateRouteMatrixResult
                        .setSnappedDeparturePositions(new ListUnmarshaller<java.util.List<Double>>(
                                new ListUnmarshaller<Double>(DoubleJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("SnappedDestinationPositions")) {
                calculateRouteMatrixResult
                        .setSnappedDestinationPositions(new ListUnmarshaller<java.util.List<Double>>(
                                new ListUnmarshaller<Double>(DoubleJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("Summary")) {
                calculateRouteMatrixResult.setSummary(CalculateRouteMatrixSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return calculateRouteMatrixResult;
    }

    private static CalculateRouteMatrixResultJsonUnmarshaller instance;

    public static CalculateRouteMatrixResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CalculateRouteMatrixResultJsonUnmarshaller();
        return instance;
    }
}
