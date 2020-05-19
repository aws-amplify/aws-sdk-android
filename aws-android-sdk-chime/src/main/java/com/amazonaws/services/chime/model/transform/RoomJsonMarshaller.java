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
 * JSON marshaller for POJO Room
 */
class RoomJsonMarshaller {

    public void marshall(Room room, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (room.getRoomId() != null) {
            String roomId = room.getRoomId();
            jsonWriter.name("RoomId");
            jsonWriter.value(roomId);
        }
        if (room.getName() != null) {
            String name = room.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (room.getAccountId() != null) {
            String accountId = room.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (room.getCreatedBy() != null) {
            String createdBy = room.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (room.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = room.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (room.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = room.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
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
