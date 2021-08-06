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
 * JSON marshaller for POJO ChannelSummary
 */
class ChannelSummaryJsonMarshaller {

    public void marshall(ChannelSummary channelSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelSummary.getName() != null) {
            String name = channelSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelSummary.getChannelArn() != null) {
            String channelArn = channelSummary.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelSummary.getMode() != null) {
            String mode = channelSummary.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (channelSummary.getPrivacy() != null) {
            String privacy = channelSummary.getPrivacy();
            jsonWriter.name("Privacy");
            jsonWriter.value(privacy);
        }
        if (channelSummary.getMetadata() != null) {
            String metadata = channelSummary.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        if (channelSummary.getLastMessageTimestamp() != null) {
            java.util.Date lastMessageTimestamp = channelSummary.getLastMessageTimestamp();
            jsonWriter.name("LastMessageTimestamp");
            jsonWriter.value(lastMessageTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ChannelSummaryJsonMarshaller instance;

    public static ChannelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelSummaryJsonMarshaller();
        return instance;
    }
}
