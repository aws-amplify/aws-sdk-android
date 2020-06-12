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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BotChannelAssociation
 */
class BotChannelAssociationJsonMarshaller {

    public void marshall(BotChannelAssociation botChannelAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (botChannelAssociation.getName() != null) {
            String name = botChannelAssociation.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (botChannelAssociation.getDescription() != null) {
            String description = botChannelAssociation.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (botChannelAssociation.getBotAlias() != null) {
            String botAlias = botChannelAssociation.getBotAlias();
            jsonWriter.name("botAlias");
            jsonWriter.value(botAlias);
        }
        if (botChannelAssociation.getBotName() != null) {
            String botName = botChannelAssociation.getBotName();
            jsonWriter.name("botName");
            jsonWriter.value(botName);
        }
        if (botChannelAssociation.getCreatedDate() != null) {
            java.util.Date createdDate = botChannelAssociation.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (botChannelAssociation.getType() != null) {
            String type = botChannelAssociation.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (botChannelAssociation.getBotConfiguration() != null) {
            java.util.Map<String, String> botConfiguration = botChannelAssociation
                    .getBotConfiguration();
            jsonWriter.name("botConfiguration");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> botConfigurationEntry : botConfiguration
                    .entrySet()) {
                String botConfigurationValue = botConfigurationEntry.getValue();
                if (botConfigurationValue != null) {
                    jsonWriter.name(botConfigurationEntry.getKey());
                    jsonWriter.value(botConfigurationValue);
                }
            }
            jsonWriter.endObject();
        }
        if (botChannelAssociation.getStatus() != null) {
            String status = botChannelAssociation.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (botChannelAssociation.getFailureReason() != null) {
            String failureReason = botChannelAssociation.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static BotChannelAssociationJsonMarshaller instance;

    public static BotChannelAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BotChannelAssociationJsonMarshaller();
        return instance;
    }
}
