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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListChannelMessagesResult
 */
public class ListChannelMessagesResultJsonUnmarshaller implements
        Unmarshaller<ListChannelMessagesResult, JsonUnmarshallerContext> {

    public ListChannelMessagesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListChannelMessagesResult listChannelMessagesResult = new ListChannelMessagesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelArn")) {
                listChannelMessagesResult.setChannelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listChannelMessagesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelMessages")) {
                listChannelMessagesResult
                        .setChannelMessages(new ListUnmarshaller<ChannelMessageSummary>(
                                ChannelMessageSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubChannelId")) {
                listChannelMessagesResult.setSubChannelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listChannelMessagesResult;
    }

    private static ListChannelMessagesResultJsonUnmarshaller instance;

    public static ListChannelMessagesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListChannelMessagesResultJsonUnmarshaller();
        return instance;
    }
}
