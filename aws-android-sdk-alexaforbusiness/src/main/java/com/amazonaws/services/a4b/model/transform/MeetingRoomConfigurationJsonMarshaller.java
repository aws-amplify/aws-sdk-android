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
 * JSON marshaller for POJO MeetingRoomConfiguration
 */
class MeetingRoomConfigurationJsonMarshaller {

    public void marshall(MeetingRoomConfiguration meetingRoomConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (meetingRoomConfiguration.getRoomUtilizationMetricsEnabled() != null) {
            Boolean roomUtilizationMetricsEnabled = meetingRoomConfiguration
                    .getRoomUtilizationMetricsEnabled();
            jsonWriter.name("RoomUtilizationMetricsEnabled");
            jsonWriter.value(roomUtilizationMetricsEnabled);
        }
        if (meetingRoomConfiguration.getEndOfMeetingReminder() != null) {
            EndOfMeetingReminder endOfMeetingReminder = meetingRoomConfiguration
                    .getEndOfMeetingReminder();
            jsonWriter.name("EndOfMeetingReminder");
            EndOfMeetingReminderJsonMarshaller.getInstance().marshall(endOfMeetingReminder,
                    jsonWriter);
        }
        if (meetingRoomConfiguration.getInstantBooking() != null) {
            InstantBooking instantBooking = meetingRoomConfiguration.getInstantBooking();
            jsonWriter.name("InstantBooking");
            InstantBookingJsonMarshaller.getInstance().marshall(instantBooking, jsonWriter);
        }
        if (meetingRoomConfiguration.getRequireCheckIn() != null) {
            RequireCheckIn requireCheckIn = meetingRoomConfiguration.getRequireCheckIn();
            jsonWriter.name("RequireCheckIn");
            RequireCheckInJsonMarshaller.getInstance().marshall(requireCheckIn, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MeetingRoomConfigurationJsonMarshaller instance;

    public static MeetingRoomConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MeetingRoomConfigurationJsonMarshaller();
        return instance;
    }
}
