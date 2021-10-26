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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChannelMessage
 */
class ChannelMessageJsonMarshaller {

    public void marshall(ChannelMessage channelMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelMessage.getChannelArn() != null) {
            String channelArn = channelMessage.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelMessage.getMessageId() != null) {
            String messageId = channelMessage.getMessageId();
            jsonWriter.name("MessageId");
            jsonWriter.value(messageId);
        }
        if (channelMessage.getContent() != null) {
            String content = channelMessage.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (channelMessage.getMetadata() != null) {
            String metadata = channelMessage.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        if (channelMessage.getType() != null) {
            String type = channelMessage.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (channelMessage.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelMessage.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelMessage.getLastEditedTimestamp() != null) {
            java.util.Date lastEditedTimestamp = channelMessage.getLastEditedTimestamp();
            jsonWriter.name("LastEditedTimestamp");
            jsonWriter.value(lastEditedTimestamp);
        }
        if (channelMessage.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = channelMessage.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (channelMessage.getSender() != null) {
            Identity sender = channelMessage.getSender();
            jsonWriter.name("Sender");
            IdentityJsonMarshaller.getInstance().marshall(sender, jsonWriter);
        }
        if (channelMessage.getRedacted() != null) {
            Boolean redacted = channelMessage.getRedacted();
            jsonWriter.name("Redacted");
            jsonWriter.value(redacted);
        }
        if (channelMessage.getPersistence() != null) {
            String persistence = channelMessage.getPersistence();
            jsonWriter.name("Persistence");
            jsonWriter.value(persistence);
        }
        if (channelMessage.getStatus() != null) {
            ChannelMessageStatusStructure status = channelMessage.getStatus();
            jsonWriter.name("Status");
            ChannelMessageStatusStructureJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (channelMessage.getMessageAttributes() != null) {
            java.util.Map<String, MessageAttributeValue> messageAttributes = channelMessage
                    .getMessageAttributes();
            jsonWriter.name("MessageAttributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MessageAttributeValue> messageAttributesEntry : messageAttributes
                    .entrySet()) {
                MessageAttributeValue messageAttributesValue = messageAttributesEntry.getValue();
                if (messageAttributesValue != null) {
                    jsonWriter.name(messageAttributesEntry.getKey());
                    MessageAttributeValueJsonMarshaller.getInstance().marshall(
                            messageAttributesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ChannelMessageJsonMarshaller instance;

    public static ChannelMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageJsonMarshaller();
        return instance;
    }
}
