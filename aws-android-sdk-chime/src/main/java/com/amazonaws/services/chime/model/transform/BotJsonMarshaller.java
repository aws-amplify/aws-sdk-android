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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Bot
 */
class BotJsonMarshaller {

    public void marshall(Bot bot, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bot.getBotId() != null) {
            String botId = bot.getBotId();
            jsonWriter.name("BotId");
            jsonWriter.value(botId);
        }
        if (bot.getUserId() != null) {
            String userId = bot.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (bot.getDisplayName() != null) {
            String displayName = bot.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (bot.getBotType() != null) {
            String botType = bot.getBotType();
            jsonWriter.name("BotType");
            jsonWriter.value(botType);
        }
        if (bot.getDisabled() != null) {
            Boolean disabled = bot.getDisabled();
            jsonWriter.name("Disabled");
            jsonWriter.value(disabled);
        }
        if (bot.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = bot.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (bot.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = bot.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        if (bot.getBotEmail() != null) {
            String botEmail = bot.getBotEmail();
            jsonWriter.name("BotEmail");
            jsonWriter.value(botEmail);
        }
        if (bot.getSecurityToken() != null) {
            String securityToken = bot.getSecurityToken();
            jsonWriter.name("SecurityToken");
            jsonWriter.value(securityToken);
        }
        jsonWriter.endObject();
    }

    private static BotJsonMarshaller instance;

    public static BotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BotJsonMarshaller();
        return instance;
    }
}
