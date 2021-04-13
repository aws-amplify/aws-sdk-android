/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteSessionResult
 */
public class DeleteSessionResultJsonUnmarshaller implements
        Unmarshaller<DeleteSessionResult, JsonUnmarshallerContext> {

    public DeleteSessionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteSessionResult deleteSessionResult = new DeleteSessionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("botName")) {
                deleteSessionResult.setBotName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botAlias")) {
                deleteSessionResult.setBotAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("userId")) {
                deleteSessionResult.setUserId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sessionId")) {
                deleteSessionResult.setSessionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteSessionResult;
    }

    private static DeleteSessionResultJsonUnmarshaller instance;

    public static DeleteSessionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteSessionResultJsonUnmarshaller();
        return instance;
    }
}
