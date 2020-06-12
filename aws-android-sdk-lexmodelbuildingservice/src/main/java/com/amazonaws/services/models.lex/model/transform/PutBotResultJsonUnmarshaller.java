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
 * JSON unmarshaller for response PutBotResult
 */
public class PutBotResultJsonUnmarshaller implements
        Unmarshaller<PutBotResult, JsonUnmarshallerContext> {

    public PutBotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutBotResult putBotResult = new PutBotResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                putBotResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                putBotResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("intents")) {
                putBotResult.setIntents(new ListUnmarshaller<Intent>(IntentJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("clarificationPrompt")) {
                putBotResult.setClarificationPrompt(PromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("abortStatement")) {
                putBotResult.setAbortStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                putBotResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                putBotResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                putBotResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                putBotResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("idleSessionTTLInSeconds")) {
                putBotResult.setIdleSessionTTLInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("voiceId")) {
                putBotResult.setVoiceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                putBotResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                putBotResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("locale")) {
                putBotResult.setLocale(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("childDirected")) {
                putBotResult.setChildDirected(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createVersion")) {
                putBotResult.setCreateVersion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectSentiment")) {
                putBotResult.setDetectSentiment(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                putBotResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putBotResult;
    }

    private static PutBotResultJsonUnmarshaller instance;

    public static PutBotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutBotResultJsonUnmarshaller();
        return instance;
    }
}
