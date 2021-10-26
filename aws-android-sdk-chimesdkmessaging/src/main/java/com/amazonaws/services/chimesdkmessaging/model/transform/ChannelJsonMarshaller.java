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
 * JSON marshaller for POJO Channel
 */
class ChannelJsonMarshaller {

    public void marshall(Channel channel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channel.getName() != null) {
            String name = channel.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channel.getChannelArn() != null) {
            String channelArn = channel.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channel.getMode() != null) {
            String mode = channel.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (channel.getPrivacy() != null) {
            String privacy = channel.getPrivacy();
            jsonWriter.name("Privacy");
            jsonWriter.value(privacy);
        }
        if (channel.getMetadata() != null) {
            String metadata = channel.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        if (channel.getCreatedBy() != null) {
            Identity createdBy = channel.getCreatedBy();
            jsonWriter.name("CreatedBy");
            IdentityJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (channel.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channel.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channel.getLastMessageTimestamp() != null) {
            java.util.Date lastMessageTimestamp = channel.getLastMessageTimestamp();
            jsonWriter.name("LastMessageTimestamp");
            jsonWriter.value(lastMessageTimestamp);
        }
        if (channel.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = channel.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (channel.getChannelFlowArn() != null) {
            String channelFlowArn = channel.getChannelFlowArn();
            jsonWriter.name("ChannelFlowArn");
            jsonWriter.value(channelFlowArn);
        }
        jsonWriter.endObject();
    }

    private static ChannelJsonMarshaller instance;

    public static ChannelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonMarshaller();
        return instance;
    }
}
