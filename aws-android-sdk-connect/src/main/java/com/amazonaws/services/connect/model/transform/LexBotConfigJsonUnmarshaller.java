/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO LexBotConfig
 */
class LexBotConfigJsonUnmarshaller implements Unmarshaller<LexBotConfig, JsonUnmarshallerContext> {

    public LexBotConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LexBotConfig lexBotConfig = new LexBotConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LexBot")) {
                lexBotConfig.setLexBot(LexBotJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LexV2Bot")) {
                lexBotConfig.setLexV2Bot(LexV2BotJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lexBotConfig;
    }

    private static LexBotConfigJsonUnmarshaller instance;

    public static LexBotConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LexBotConfigJsonUnmarshaller();
        return instance;
    }
}
