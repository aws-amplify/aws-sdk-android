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
 * JSON marshaller for POJO RoomData
 */
class RoomDataJsonMarshaller {

    public void marshall(RoomData roomData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (roomData.getRoomArn() != null) {
            String roomArn = roomData.getRoomArn();
            jsonWriter.name("RoomArn");
            jsonWriter.value(roomArn);
        }
        if (roomData.getRoomName() != null) {
            String roomName = roomData.getRoomName();
            jsonWriter.name("RoomName");
            jsonWriter.value(roomName);
        }
        if (roomData.getDescription() != null) {
            String description = roomData.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (roomData.getProviderCalendarId() != null) {
            String providerCalendarId = roomData.getProviderCalendarId();
            jsonWriter.name("ProviderCalendarId");
            jsonWriter.value(providerCalendarId);
        }
        if (roomData.getProfileArn() != null) {
            String profileArn = roomData.getProfileArn();
            jsonWriter.name("ProfileArn");
            jsonWriter.value(profileArn);
        }
        if (roomData.getProfileName() != null) {
            String profileName = roomData.getProfileName();
            jsonWriter.name("ProfileName");
            jsonWriter.value(profileName);
        }
        jsonWriter.endObject();
    }

    private static RoomDataJsonMarshaller instance;

    public static RoomDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoomDataJsonMarshaller();
        return instance;
    }
}
