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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response PutBotAliasResult
 */
public class PutBotAliasResultJsonUnmarshaller implements
        Unmarshaller<PutBotAliasResult, JsonUnmarshallerContext> {

    public PutBotAliasResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutBotAliasResult putBotAliasResult = new PutBotAliasResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                putBotAliasResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                putBotAliasResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botVersion")) {
                putBotAliasResult.setBotVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botName")) {
                putBotAliasResult.setBotName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                putBotAliasResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                putBotAliasResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                putBotAliasResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("conversationLogs")) {
                putBotAliasResult.setConversationLogs(ConversationLogsResponseJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                putBotAliasResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putBotAliasResult;
    }

    private static PutBotAliasResultJsonUnmarshaller instance;

    public static PutBotAliasResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutBotAliasResultJsonUnmarshaller();
        return instance;
    }
}
