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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCapacityReservationUsageResult
 */
public class GetCapacityReservationUsageResultJsonUnmarshaller implements
        Unmarshaller<GetCapacityReservationUsageResult, JsonUnmarshallerContext> {

    public GetCapacityReservationUsageResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetCapacityReservationUsageResult getCapacityReservationUsageResult = new GetCapacityReservationUsageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NextToken")) {
                getCapacityReservationUsageResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CapacityReservationId")) {
                getCapacityReservationUsageResult.setCapacityReservationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                getCapacityReservationUsageResult.setInstanceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalInstanceCount")) {
                getCapacityReservationUsageResult.setTotalInstanceCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailableInstanceCount")) {
                getCapacityReservationUsageResult.setAvailableInstanceCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                getCapacityReservationUsageResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceUsages")) {
                getCapacityReservationUsageResult
                        .setInstanceUsages(new ListUnmarshaller<InstanceUsage>(
                                InstanceUsageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCapacityReservationUsageResult;
    }

    private static GetCapacityReservationUsageResultJsonUnmarshaller instance;

    public static GetCapacityReservationUsageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCapacityReservationUsageResultJsonUnmarshaller();
        return instance;
    }
}
