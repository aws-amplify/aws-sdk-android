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
 * JSON marshaller for POJO ChannelModerator
 */
class ChannelModeratorJsonMarshaller {

    public void marshall(ChannelModerator channelModerator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelModerator.getModerator() != null) {
            Identity moderator = channelModerator.getModerator();
            jsonWriter.name("Moderator");
            IdentityJsonMarshaller.getInstance().marshall(moderator, jsonWriter);
        }
        if (channelModerator.getChannelArn() != null) {
            String channelArn = channelModerator.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelModerator.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelModerator.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelModerator.getCreatedBy() != null) {
            Identity createdBy = channelModerator.getCreatedBy();
            jsonWriter.name("CreatedBy");
            IdentityJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ChannelModeratorJsonMarshaller instance;

    public static ChannelModeratorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelModeratorJsonMarshaller();
        return instance;
    }
}
