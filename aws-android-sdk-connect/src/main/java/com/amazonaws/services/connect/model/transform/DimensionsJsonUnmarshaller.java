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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Dimensions
 */
class DimensionsJsonUnmarshaller implements Unmarshaller<Dimensions, JsonUnmarshallerContext> {

    public Dimensions unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Dimensions dimensions = new Dimensions();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Queue")) {
                dimensions.setQueue(QueueReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Channel")) {
                dimensions.setChannel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoutingProfile")) {
                dimensions.setRoutingProfile(RoutingProfileReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoutingStepExpression")) {
                dimensions.setRoutingStepExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dimensions;
    }

    private static DimensionsJsonUnmarshaller instance;

    public static DimensionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DimensionsJsonUnmarshaller();
        return instance;
    }
}
