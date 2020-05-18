/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RoomMembership
 */
class RoomMembershipJsonMarshaller {

    public void marshall(RoomMembership roomMembership, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (roomMembership.getRoomId() != null) {
            String roomId = roomMembership.getRoomId();
            jsonWriter.name("RoomId");
            jsonWriter.value(roomId);
        }
        if (roomMembership.getMember() != null) {
            Member member = roomMembership.getMember();
            jsonWriter.name("Member");
            MemberJsonMarshaller.getInstance().marshall(member, jsonWriter);
        }
        if (roomMembership.getRole() != null) {
            String role = roomMembership.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (roomMembership.getInvitedBy() != null) {
            String invitedBy = roomMembership.getInvitedBy();
            jsonWriter.name("InvitedBy");
            jsonWriter.value(invitedBy);
        }
        if (roomMembership.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = roomMembership.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static RoomMembershipJsonMarshaller instance;

    public static RoomMembershipJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoomMembershipJsonMarshaller();
        return instance;
    }
}
