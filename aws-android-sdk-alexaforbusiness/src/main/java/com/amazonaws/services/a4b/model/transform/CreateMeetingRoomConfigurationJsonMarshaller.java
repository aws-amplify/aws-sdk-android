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
 * JSON marshaller for POJO CreateMeetingRoomConfiguration
 */
class CreateMeetingRoomConfigurationJsonMarshaller {

    public void marshall(CreateMeetingRoomConfiguration createMeetingRoomConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createMeetingRoomConfiguration.getRoomUtilizationMetricsEnabled() != null) {
            Boolean roomUtilizationMetricsEnabled = createMeetingRoomConfiguration
                    .getRoomUtilizationMetricsEnabled();
            jsonWriter.name("RoomUtilizationMetricsEnabled");
            jsonWriter.value(roomUtilizationMetricsEnabled);
        }
        if (createMeetingRoomConfiguration.getEndOfMeetingReminder() != null) {
            CreateEndOfMeetingReminder endOfMeetingReminder = createMeetingRoomConfiguration
                    .getEndOfMeetingReminder();
            jsonWriter.name("EndOfMeetingReminder");
            CreateEndOfMeetingReminderJsonMarshaller.getInstance().marshall(endOfMeetingReminder,
                    jsonWriter);
        }
        if (createMeetingRoomConfiguration.getInstantBooking() != null) {
            CreateInstantBooking instantBooking = createMeetingRoomConfiguration
                    .getInstantBooking();
            jsonWriter.name("InstantBooking");
            CreateInstantBookingJsonMarshaller.getInstance().marshall(instantBooking, jsonWriter);
        }
        if (createMeetingRoomConfiguration.getRequireCheckIn() != null) {
            CreateRequireCheckIn requireCheckIn = createMeetingRoomConfiguration
                    .getRequireCheckIn();
            jsonWriter.name("RequireCheckIn");
            CreateRequireCheckInJsonMarshaller.getInstance().marshall(requireCheckIn, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CreateMeetingRoomConfigurationJsonMarshaller instance;

    public static CreateMeetingRoomConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateMeetingRoomConfigurationJsonMarshaller();
        return instance;
    }
}
