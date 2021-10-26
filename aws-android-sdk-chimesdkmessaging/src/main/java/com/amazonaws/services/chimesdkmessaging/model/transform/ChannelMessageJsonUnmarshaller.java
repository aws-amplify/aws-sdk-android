/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO ChannelMessage
 */
class ChannelMessageJsonUnmarshaller implements
        Unmarshaller<ChannelMessage, JsonUnmarshallerContext> {

    public ChannelMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChannelMessage channelMessage = new ChannelMessage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelArn")) {
                channelMessage.setChannelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageId")) {
                channelMessage.setMessageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                channelMessage.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metadata")) {
                channelMessage.setMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                channelMessage.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                channelMessage.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastEditedTimestamp")) {
                channelMessage.setLastEditedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimestamp")) {
                channelMessage.setLastUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sender")) {
                channelMessage.setSender(IdentityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Redacted")) {
                channelMessage.setRedacted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Persistence")) {
                channelMessage.setPersistence(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                channelMessage.setStatus(ChannelMessageStatusStructureJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageAttributes")) {
                channelMessage.setMessageAttributes(new MapUnmarshaller<MessageAttributeValue>(
                        MessageAttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channelMessage;
    }

    private static ChannelMessageJsonUnmarshaller instance;

    public static ChannelMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageJsonUnmarshaller();
        return instance;
    }
}
