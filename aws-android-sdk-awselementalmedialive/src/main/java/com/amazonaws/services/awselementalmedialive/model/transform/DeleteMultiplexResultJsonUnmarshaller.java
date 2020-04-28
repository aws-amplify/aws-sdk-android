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
 * JSON unmarshaller for response DeleteMultiplexResult
 */
public class DeleteMultiplexResultJsonUnmarshaller implements
        Unmarshaller<DeleteMultiplexResult, JsonUnmarshallerContext> {

    public DeleteMultiplexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteMultiplexResult deleteMultiplexResult = new DeleteMultiplexResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                deleteMultiplexResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                deleteMultiplexResult.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Destinations")) {
                deleteMultiplexResult
                        .setDestinations(new ListUnmarshaller<MultiplexOutputDestination>(
                                MultiplexOutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                deleteMultiplexResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiplexSettings")) {
                deleteMultiplexResult.setMultiplexSettings(MultiplexSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                deleteMultiplexResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                deleteMultiplexResult.setPipelinesRunningCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramCount")) {
                deleteMultiplexResult.setProgramCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                deleteMultiplexResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                deleteMultiplexResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteMultiplexResult;
    }

    private static DeleteMultiplexResultJsonUnmarshaller instance;

    public static DeleteMultiplexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMultiplexResultJsonUnmarshaller();
        return instance;
    }
}
