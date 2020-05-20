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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetBotResult
 */
public class GetBotResultJsonUnmarshaller implements
        Unmarshaller<GetBotResult, JsonUnmarshallerContext> {

    public GetBotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBotResult getBotResult = new GetBotResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bot")) {
                getBotResult.setBot(BotJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getBotResult;
    }

    private static GetBotResultJsonUnmarshaller instance;

    public static GetBotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBotResultJsonUnmarshaller();
        return instance;
    }
}
