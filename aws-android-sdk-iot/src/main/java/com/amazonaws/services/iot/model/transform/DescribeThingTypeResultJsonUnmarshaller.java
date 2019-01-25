/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeThingTypeResult
 */
public class DescribeThingTypeResultJsonUnmarshaller implements
        Unmarshaller<DescribeThingTypeResult, JsonUnmarshallerContext> {

    public DescribeThingTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingTypeResult describeThingTypeResult = new DescribeThingTypeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingTypeName")) {
                describeThingTypeResult.setThingTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeId")) {
                describeThingTypeResult.setThingTypeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeArn")) {
                describeThingTypeResult.setThingTypeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeProperties")) {
                describeThingTypeResult.setThingTypeProperties(ThingTypePropertiesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeMetadata")) {
                describeThingTypeResult.setThingTypeMetadata(ThingTypeMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeThingTypeResult;
    }

    private static DescribeThingTypeResultJsonUnmarshaller instance;

    public static DescribeThingTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingTypeResultJsonUnmarshaller();
        return instance;
    }
}
