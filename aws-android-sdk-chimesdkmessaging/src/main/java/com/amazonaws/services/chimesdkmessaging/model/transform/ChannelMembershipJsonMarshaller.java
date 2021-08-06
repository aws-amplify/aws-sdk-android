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
 * JSON marshaller for POJO ChannelMembership
 */
class ChannelMembershipJsonMarshaller {

    public void marshall(ChannelMembership channelMembership, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelMembership.getInvitedBy() != null) {
            Identity invitedBy = channelMembership.getInvitedBy();
            jsonWriter.name("InvitedBy");
            IdentityJsonMarshaller.getInstance().marshall(invitedBy, jsonWriter);
        }
        if (channelMembership.getType() != null) {
            String type = channelMembership.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (channelMembership.getMember() != null) {
            Identity member = channelMembership.getMember();
            jsonWriter.name("Member");
            IdentityJsonMarshaller.getInstance().marshall(member, jsonWriter);
        }
        if (channelMembership.getChannelArn() != null) {
            String channelArn = channelMembership.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        if (channelMembership.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = channelMembership.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (channelMembership.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = channelMembership.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ChannelMembershipJsonMarshaller instance;

    public static ChannelMembershipJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMembershipJsonMarshaller();
        return instance;
    }
}
