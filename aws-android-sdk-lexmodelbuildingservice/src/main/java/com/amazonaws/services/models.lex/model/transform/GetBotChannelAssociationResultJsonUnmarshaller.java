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
 * JSON unmarshaller for response GetBotChannelAssociationResult
 */
public class GetBotChannelAssociationResultJsonUnmarshaller implements
        Unmarshaller<GetBotChannelAssociationResult, JsonUnmarshallerContext> {

    public GetBotChannelAssociationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetBotChannelAssociationResult getBotChannelAssociationResult = new GetBotChannelAssociationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                getBotChannelAssociationResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getBotChannelAssociationResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botAlias")) {
                getBotChannelAssociationResult.setBotAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botName")) {
                getBotChannelAssociationResult.setBotName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getBotChannelAssociationResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                getBotChannelAssociationResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("botConfiguration")) {
                getBotChannelAssociationResult.setBotConfiguration(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                getBotChannelAssociationResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                getBotChannelAssociationResult.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getBotChannelAssociationResult;
    }

    private static GetBotChannelAssociationResultJsonUnmarshaller instance;

    public static GetBotChannelAssociationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBotChannelAssociationResultJsonUnmarshaller();
        return instance;
    }
}
