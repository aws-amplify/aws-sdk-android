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
 * JSON unmarshaller for response CreateDynamicThingGroupResult
 */
public class CreateDynamicThingGroupResultJsonUnmarshaller implements
        Unmarshaller<CreateDynamicThingGroupResult, JsonUnmarshallerContext> {

    public CreateDynamicThingGroupResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateDynamicThingGroupResult createDynamicThingGroupResult = new CreateDynamicThingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingGroupName")) {
                createDynamicThingGroupResult.setThingGroupName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupArn")) {
                createDynamicThingGroupResult.setThingGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupId")) {
                createDynamicThingGroupResult.setThingGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("indexName")) {
                createDynamicThingGroupResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryString")) {
                createDynamicThingGroupResult.setQueryString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("queryVersion")) {
                createDynamicThingGroupResult.setQueryVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDynamicThingGroupResult;
    }

    private static CreateDynamicThingGroupResultJsonUnmarshaller instance;

    public static CreateDynamicThingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDynamicThingGroupResultJsonUnmarshaller();
        return instance;
    }
}
