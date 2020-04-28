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
 * JSON unmarshaller for POJO Multiplex
 */
class MultiplexJsonUnmarshaller implements Unmarshaller<Multiplex, JsonUnmarshallerContext> {

    public Multiplex unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Multiplex multiplex = new Multiplex();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                multiplex.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                multiplex.setAvailabilityZones(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Destinations")) {
                multiplex.setDestinations(new ListUnmarshaller<MultiplexOutputDestination>(
                        MultiplexOutputDestinationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                multiplex.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiplexSettings")) {
                multiplex.setMultiplexSettings(MultiplexSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                multiplex.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PipelinesRunningCount")) {
                multiplex.setPipelinesRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramCount")) {
                multiplex.setProgramCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                multiplex.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                multiplex.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return multiplex;
    }

    private static MultiplexJsonUnmarshaller instance;

    public static MultiplexJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexJsonUnmarshaller();
        return instance;
    }
}
