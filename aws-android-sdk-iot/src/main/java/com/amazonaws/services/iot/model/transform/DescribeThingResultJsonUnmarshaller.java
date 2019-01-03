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
 * JSON unmarshaller for response DescribeThingResult
 */
public class DescribeThingResultJsonUnmarshaller implements
        Unmarshaller<DescribeThingResult, JsonUnmarshallerContext> {

    public DescribeThingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingResult describeThingResult = new DescribeThingResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("defaultClientId")) {
                describeThingResult.setDefaultClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingName")) {
                describeThingResult.setThingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingId")) {
                describeThingResult.setThingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingArn")) {
                describeThingResult.setThingArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeName")) {
                describeThingResult.setThingTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attributes")) {
                describeThingResult.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("version")) {
                describeThingResult.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("billingGroupName")) {
                describeThingResult.setBillingGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeThingResult;
    }

    private static DescribeThingResultJsonUnmarshaller instance;

    public static DescribeThingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingResultJsonUnmarshaller();
        return instance;
    }
}
