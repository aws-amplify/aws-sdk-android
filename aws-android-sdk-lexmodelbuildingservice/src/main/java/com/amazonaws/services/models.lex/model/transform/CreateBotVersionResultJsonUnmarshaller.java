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
 * JSON unmarshaller for response CreateBotVersionResult
 */
public class CreateBotVersionResultJsonUnmarshaller implements
        Unmarshaller<CreateBotVersionResult, JsonUnmarshallerContext> {

    public CreateBotVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateBotVersionResult createBotVersionResult = new CreateBotVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                createBotVersionResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createBotVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("intents")) {
                createBotVersionResult.setIntents(new ListUnmarshaller<Intent>(
                        IntentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("clarificationPrompt")) {
                createBotVersionResult.setClarificationPrompt(PromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("abortStatement")) {
                createBotVersionResult.setAbortStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                createBotVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                createBotVersionResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                createBotVersionResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                createBotVersionResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("idleSessionTTLInSeconds")) {
                createBotVersionResult.setIdleSessionTTLInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("voiceId")) {
                createBotVersionResult.setVoiceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                createBotVersionResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                createBotVersionResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("locale")) {
                createBotVersionResult.setLocale(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("childDirected")) {
                createBotVersionResult.setChildDirected(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectSentiment")) {
                createBotVersionResult.setDetectSentiment(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createBotVersionResult;
    }

    private static CreateBotVersionResultJsonUnmarshaller instance;

    public static CreateBotVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBotVersionResultJsonUnmarshaller();
        return instance;
    }
}
