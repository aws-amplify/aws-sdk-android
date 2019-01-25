/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChannelsResponse
 */
class ChannelsResponseJsonMarshaller {

    public void marshall(ChannelsResponse channelsResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelsResponse.getChannels() != null) {
            java.util.Map<String, ChannelResponse> channels = channelsResponse.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, ChannelResponse> channelsEntry : channels.entrySet()) {
                ChannelResponse channelsValue = channelsEntry.getValue();
                if (channelsValue != null) {
                    jsonWriter.name(channelsEntry.getKey());
                    ChannelResponseJsonMarshaller.getInstance().marshall(channelsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ChannelsResponseJsonMarshaller instance;

    public static ChannelsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelsResponseJsonMarshaller();
        return instance;
    }
}
