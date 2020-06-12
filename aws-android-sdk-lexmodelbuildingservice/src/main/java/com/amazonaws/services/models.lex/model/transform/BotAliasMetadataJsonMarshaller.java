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
 * JSON marshaller for POJO BotAliasMetadata
 */
class BotAliasMetadataJsonMarshaller {

    public void marshall(BotAliasMetadata botAliasMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (botAliasMetadata.getName() != null) {
            String name = botAliasMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (botAliasMetadata.getDescription() != null) {
            String description = botAliasMetadata.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (botAliasMetadata.getBotVersion() != null) {
            String botVersion = botAliasMetadata.getBotVersion();
            jsonWriter.name("botVersion");
            jsonWriter.value(botVersion);
        }
        if (botAliasMetadata.getBotName() != null) {
            String botName = botAliasMetadata.getBotName();
            jsonWriter.name("botName");
            jsonWriter.value(botName);
        }
        if (botAliasMetadata.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = botAliasMetadata.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (botAliasMetadata.getCreatedDate() != null) {
            java.util.Date createdDate = botAliasMetadata.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (botAliasMetadata.getChecksum() != null) {
            String checksum = botAliasMetadata.getChecksum();
            jsonWriter.name("checksum");
            jsonWriter.value(checksum);
        }
        if (botAliasMetadata.getConversationLogs() != null) {
            ConversationLogsResponse conversationLogs = botAliasMetadata.getConversationLogs();
            jsonWriter.name("conversationLogs");
            ConversationLogsResponseJsonMarshaller.getInstance().marshall(conversationLogs,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BotAliasMetadataJsonMarshaller instance;

    public static BotAliasMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BotAliasMetadataJsonMarshaller();
        return instance;
    }
}
