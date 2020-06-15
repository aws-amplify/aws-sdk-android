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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Room
 */
class RoomJsonMarshaller {

    public void marshall(Room room, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (room.getRoomArn() != null) {
            String roomArn = room.getRoomArn();
            jsonWriter.name("RoomArn");
            jsonWriter.value(roomArn);
        }
        if (room.getRoomName() != null) {
            String roomName = room.getRoomName();
            jsonWriter.name("RoomName");
            jsonWriter.value(roomName);
        }
        if (room.getDescription() != null) {
            String description = room.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (room.getProviderCalendarId() != null) {
            String providerCalendarId = room.getProviderCalendarId();
            jsonWriter.name("ProviderCalendarId");
            jsonWriter.value(providerCalendarId);
        }
        if (room.getProfileArn() != null) {
            String profileArn = room.getProfileArn();
            jsonWriter.name("ProfileArn");
            jsonWriter.value(profileArn);
        }
        jsonWriter.endObject();
    }

    private static RoomJsonMarshaller instance;

    public static RoomJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoomJsonMarshaller();
        return instance;
    }
}
