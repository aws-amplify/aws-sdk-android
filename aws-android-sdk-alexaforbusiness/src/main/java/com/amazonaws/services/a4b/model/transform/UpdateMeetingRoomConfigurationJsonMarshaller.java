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
 * JSON marshaller for POJO UpdateMeetingRoomConfiguration
 */
class UpdateMeetingRoomConfigurationJsonMarshaller {

    public void marshall(UpdateMeetingRoomConfiguration updateMeetingRoomConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateMeetingRoomConfiguration.getRoomUtilizationMetricsEnabled() != null) {
            Boolean roomUtilizationMetricsEnabled = updateMeetingRoomConfiguration
                    .getRoomUtilizationMetricsEnabled();
            jsonWriter.name("RoomUtilizationMetricsEnabled");
            jsonWriter.value(roomUtilizationMetricsEnabled);
        }
        if (updateMeetingRoomConfiguration.getEndOfMeetingReminder() != null) {
            UpdateEndOfMeetingReminder endOfMeetingReminder = updateMeetingRoomConfiguration
                    .getEndOfMeetingReminder();
            jsonWriter.name("EndOfMeetingReminder");
            UpdateEndOfMeetingReminderJsonMarshaller.getInstance().marshall(endOfMeetingReminder,
                    jsonWriter);
        }
        if (updateMeetingRoomConfiguration.getInstantBooking() != null) {
            UpdateInstantBooking instantBooking = updateMeetingRoomConfiguration
                    .getInstantBooking();
            jsonWriter.name("InstantBooking");
            UpdateInstantBookingJsonMarshaller.getInstance().marshall(instantBooking, jsonWriter);
        }
        if (updateMeetingRoomConfiguration.getRequireCheckIn() != null) {
            UpdateRequireCheckIn requireCheckIn = updateMeetingRoomConfiguration
                    .getRequireCheckIn();
            jsonWriter.name("RequireCheckIn");
            UpdateRequireCheckInJsonMarshaller.getInstance().marshall(requireCheckIn, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UpdateMeetingRoomConfigurationJsonMarshaller instance;

    public static UpdateMeetingRoomConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMeetingRoomConfigurationJsonMarshaller();
        return instance;
    }
}
