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
 * JSON marshaller for POJO CreateEndOfMeetingReminder
 */
class CreateEndOfMeetingReminderJsonMarshaller {

    public void marshall(CreateEndOfMeetingReminder createEndOfMeetingReminder,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createEndOfMeetingReminder.getReminderAtMinutes() != null) {
            java.util.List<Integer> reminderAtMinutes = createEndOfMeetingReminder
                    .getReminderAtMinutes();
            jsonWriter.name("ReminderAtMinutes");
            jsonWriter.beginArray();
            for (Integer reminderAtMinutesItem : reminderAtMinutes) {
                if (reminderAtMinutesItem != null) {
                    jsonWriter.value(reminderAtMinutesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (createEndOfMeetingReminder.getReminderType() != null) {
            String reminderType = createEndOfMeetingReminder.getReminderType();
            jsonWriter.name("ReminderType");
            jsonWriter.value(reminderType);
        }
        if (createEndOfMeetingReminder.getEnabled() != null) {
            Boolean enabled = createEndOfMeetingReminder.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static CreateEndOfMeetingReminderJsonMarshaller instance;

    public static CreateEndOfMeetingReminderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateEndOfMeetingReminderJsonMarshaller();
        return instance;
    }
}
