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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ResolveRoomResult
 */
public class ResolveRoomResultJsonUnmarshaller implements
        Unmarshaller<ResolveRoomResult, JsonUnmarshallerContext> {

    public ResolveRoomResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResolveRoomResult resolveRoomResult = new ResolveRoomResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RoomArn")) {
                resolveRoomResult.setRoomArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoomName")) {
                resolveRoomResult.setRoomName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoomSkillParameters")) {
                resolveRoomResult.setRoomSkillParameters(new ListUnmarshaller<RoomSkillParameter>(
                        RoomSkillParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return resolveRoomResult;
    }

    private static ResolveRoomResultJsonUnmarshaller instance;

    public static ResolveRoomResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResolveRoomResultJsonUnmarshaller();
        return instance;
    }
}
