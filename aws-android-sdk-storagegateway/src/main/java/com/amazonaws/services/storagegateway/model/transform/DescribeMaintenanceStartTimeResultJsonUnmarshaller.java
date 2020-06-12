/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeMaintenanceStartTimeResult
 */
public class DescribeMaintenanceStartTimeResultJsonUnmarshaller implements
        Unmarshaller<DescribeMaintenanceStartTimeResult, JsonUnmarshallerContext> {

    public DescribeMaintenanceStartTimeResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeMaintenanceStartTimeResult describeMaintenanceStartTimeResult = new DescribeMaintenanceStartTimeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GatewayARN")) {
                describeMaintenanceStartTimeResult.setGatewayARN(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HourOfDay")) {
                describeMaintenanceStartTimeResult.setHourOfDay(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinuteOfHour")) {
                describeMaintenanceStartTimeResult.setMinuteOfHour(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DayOfWeek")) {
                describeMaintenanceStartTimeResult.setDayOfWeek(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DayOfMonth")) {
                describeMaintenanceStartTimeResult.setDayOfMonth(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                describeMaintenanceStartTimeResult.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeMaintenanceStartTimeResult;
    }

    private static DescribeMaintenanceStartTimeResultJsonUnmarshaller instance;

    public static DescribeMaintenanceStartTimeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMaintenanceStartTimeResultJsonUnmarshaller();
        return instance;
    }
}
