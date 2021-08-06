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
 * JSON marshaller for POJO BatchChannelMemberships
 */
class BatchChannelMembershipsJsonMarshaller {

    public void marshall(BatchChannelMemberships batchChannelMemberships, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchChannelMemberships.getInvitedBy() != null) {
            Identity invitedBy = batchChannelMemberships.getInvitedBy();
            jsonWriter.name("InvitedBy");
            IdentityJsonMarshaller.getInstance().marshall(invitedBy, jsonWriter);
        }
        if (batchChannelMemberships.getType() != null) {
            String type = batchChannelMemberships.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (batchChannelMemberships.getMembers() != null) {
            java.util.List<Identity> members = batchChannelMemberships.getMembers();
            jsonWriter.name("Members");
            jsonWriter.beginArray();
            for (Identity membersItem : members) {
                if (membersItem != null) {
                    IdentityJsonMarshaller.getInstance().marshall(membersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (batchChannelMemberships.getChannelArn() != null) {
            String channelArn = batchChannelMemberships.getChannelArn();
            jsonWriter.name("ChannelArn");
            jsonWriter.value(channelArn);
        }
        jsonWriter.endObject();
    }

    private static BatchChannelMembershipsJsonMarshaller instance;

    public static BatchChannelMembershipsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchChannelMembershipsJsonMarshaller();
        return instance;
    }
}
