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
 * JSON marshaller for POJO ChannelBan
 */
class ChannelBanJsonMarshaller {

    public void marshall(ChannelBan channelBan, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelBan.getMember() != null) {
            Identity member = channelBan.getMember();
            jsonWriter.name("Member");
            IdentityJsonMarshaller.getInstance().marshall(member, jsonWriter);
        }
        if (channelBan.getChannelArn() != null) {
            String channelArn = channelBan.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelBan.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelBan.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelBan.getCreatedBy() != null) {
            Identity createdBy = channelBan.getCreatedBy();
            jsonWriter.name("CreatedBy");
            IdentityJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ChannelBanJsonMarshaller instance;

    public static ChannelBanJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelBanJsonMarshaller();
        return instance;
    }
}
