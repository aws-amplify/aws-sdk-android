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
 * JSON marshaller for POJO ChannelMessageSummary
 */
class ChannelMessageSummaryJsonMarshaller {

    public void marshall(ChannelMessageSummary channelMessageSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelMessageSummary.getMessageId() != null) {
            String messageId = channelMessageSummary.getMessageId();
            jsonWriter.name("MessageId");
            jsonWriter.value(messageId);
        }
        if (channelMessageSummary.getContent() != null) {
            String content = channelMessageSummary.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (channelMessageSummary.getMetadata() != null) {
            String metadata = channelMessageSummary.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        if (channelMessageSummary.getType() != null) {
            String type = channelMessageSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (channelMessageSummary.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelMessageSummary.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelMessageSummary.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = channelMessageSummary.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (channelMessageSummary.getLastEditedTimestamp() != null) {
            java.util.Date lastEditedTimestamp = channelMessageSummary.getLastEditedTimestamp();
            jsonWriter.name("LastEditedTimestamp");
            jsonWriter.value(lastEditedTimestamp);
        }
        if (channelMessageSummary.getSender() != null) {
            Identity sender = channelMessageSummary.getSender();
            jsonWriter.name("Sender");
            IdentityJsonMarshaller.getInstance().marshall(sender, jsonWriter);
        }
        if (channelMessageSummary.getRedacted() != null) {
            Boolean redacted = channelMessageSummary.getRedacted();
            jsonWriter.name("Redacted");
            jsonWriter.value(redacted);
        }
        if (channelMessageSummary.getStatus() != null) {
            ChannelMessageStatusStructure status = channelMessageSummary.getStatus();
            jsonWriter.name("Status");
            ChannelMessageStatusStructureJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (channelMessageSummary.getMessageAttributes() != null) {
            java.util.Map<String, MessageAttributeValue> messageAttributes = channelMessageSummary
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

    private static ChannelMessageSummaryJsonMarshaller instance;

    public static ChannelMessageSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageSummaryJsonMarshaller();
        return instance;
    }
}
