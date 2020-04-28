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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeMultiplexResult
 */
public class DescribeMultiplexResultJsonUnmarshaller implements
        Unmarshaller<DescribeMultiplexResult, JsonUnmarshallerContext> {

    public DescribeMultiplexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMultiplexResult describeMultiplexResult = new DescribeMultiplexResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeMultiplexResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                describeMultiplexResult.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Destinations")) {
                describeMultiplexResult
                        .setDestinations(new ListUnmarshaller<MultiplexOutputDestination>(
                                MultiplexOutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                describeMultiplexResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiplexSettings")) {
                describeMultiplexResult.setMultiplexSettings(MultiplexSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                describeMultiplexResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                describeMultiplexResult.setPipelinesRunningCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramCount")) {
                describeMultiplexResult.setProgramCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeMultiplexResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeMultiplexResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeMultiplexResult;
    }

    private static DescribeMultiplexResultJsonUnmarshaller instance;

    public static DescribeMultiplexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMultiplexResultJsonUnmarshaller();
        return instance;
    }
}
