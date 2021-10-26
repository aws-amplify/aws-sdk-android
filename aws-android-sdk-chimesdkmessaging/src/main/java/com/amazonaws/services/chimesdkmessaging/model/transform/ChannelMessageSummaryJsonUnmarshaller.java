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
 * JSON unmarshaller for POJO ChannelMessageSummary
 */
class ChannelMessageSummaryJsonUnmarshaller implements
        Unmarshaller<ChannelMessageSummary, JsonUnmarshallerContext> {

    public ChannelMessageSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ChannelMessageSummary channelMessageSummary = new ChannelMessageSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MessageId")) {
                channelMessageSummary.setMessageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                channelMessageSummary.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metadata")) {
                channelMessageSummary.setMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                channelMessageSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                channelMessageSummary.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimestamp")) {
                channelMessageSummary.setLastUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastEditedTimestamp")) {
                channelMessageSummary.setLastEditedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sender")) {
                channelMessageSummary.setSender(IdentityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Redacted")) {
                channelMessageSummary.setRedacted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                channelMessageSummary.setStatus(ChannelMessageStatusStructureJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageAttributes")) {
                channelMessageSummary
                        .setMessageAttributes(new MapUnmarshaller<MessageAttributeValue>(
                                MessageAttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channelMessageSummary;
    }

    private static ChannelMessageSummaryJsonUnmarshaller instance;

    public static ChannelMessageSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageSummaryJsonUnmarshaller();
        return instance;
    }
}
