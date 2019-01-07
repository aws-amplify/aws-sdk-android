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
 * JSON unmarshaller for response DescribeThingGroupResult
 */
public class DescribeThingGroupResultJsonUnmarshaller implements
        Unmarshaller<DescribeThingGroupResult, JsonUnmarshallerContext> {

    public DescribeThingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingGroupResult describeThingGroupResult = new DescribeThingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingGroupName")) {
                describeThingGroupResult.setThingGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupId")) {
                describeThingGroupResult.setThingGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupArn")) {
                describeThingGroupResult.setThingGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                describeThingGroupResult.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupProperties")) {
                describeThingGroupResult
                        .setThingGroupProperties(ThingGroupPropertiesJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("thingGroupMetadata")) {
                describeThingGroupResult.setThingGroupMetadata(ThingGroupMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("indexName")) {
                describeThingGroupResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryString")) {
                describeThingGroupResult.setQueryString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryVersion")) {
                describeThingGroupResult.setQueryVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                describeThingGroupResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeThingGroupResult;
    }

    private static DescribeThingGroupResultJsonUnmarshaller instance;

    public static DescribeThingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingGroupResultJsonUnmarshaller();
        return instance;
    }
}
