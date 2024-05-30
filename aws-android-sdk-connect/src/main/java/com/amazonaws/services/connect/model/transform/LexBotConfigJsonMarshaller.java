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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LexBotConfig
 */
class LexBotConfigJsonMarshaller {

    public void marshall(LexBotConfig lexBotConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lexBotConfig.getLexBot() != null) {
            LexBot lexBot = lexBotConfig.getLexBot();
            jsonWriter.name("LexBot");
            LexBotJsonMarshaller.getInstance().marshall(lexBot, jsonWriter);
        }
        if (lexBotConfig.getLexV2Bot() != null) {
            LexV2Bot lexV2Bot = lexBotConfig.getLexV2Bot();
            jsonWriter.name("LexV2Bot");
            LexV2BotJsonMarshaller.getInstance().marshall(lexV2Bot, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LexBotConfigJsonMarshaller instance;

    public static LexBotConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexBotConfigJsonMarshaller();
        return instance;
    }
}
