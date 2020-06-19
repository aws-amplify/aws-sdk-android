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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledInstanceRecurrenceRequest
 */
class ScheduledInstanceRecurrenceRequestJsonMarshaller {

    public void marshall(ScheduledInstanceRecurrenceRequest scheduledInstanceRecurrenceRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstanceRecurrenceRequest.getFrequency() != null) {
            String frequency = scheduledInstanceRecurrenceRequest.getFrequency();
            jsonWriter.name("Frequency");
            jsonWriter.value(frequency);
        }
        if (scheduledInstanceRecurrenceRequest.getInterval() != null) {
            Integer interval = scheduledInstanceRecurrenceRequest.getInterval();
            jsonWriter.name("Interval");
            jsonWriter.value(interval);
        }
        if (scheduledInstanceRecurrenceRequest.getOccurrenceDays() != null) {
            java.util.List<Integer> occurrenceDays = scheduledInstanceRecurrenceRequest
                    .getOccurrenceDays();
            jsonWriter.name("OccurrenceDays");
            jsonWriter.beginArray();
            for (Integer occurrenceDaysItem : occurrenceDays) {
                if (occurrenceDaysItem != null) {
                    jsonWriter.value(occurrenceDaysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstanceRecurrenceRequest.getOccurrenceRelativeToEnd() != null) {
            Boolean occurrenceRelativeToEnd = scheduledInstanceRecurrenceRequest
                    .getOccurrenceRelativeToEnd();
            jsonWriter.name("OccurrenceRelativeToEnd");
            jsonWriter.value(occurrenceRelativeToEnd);
        }
        if (scheduledInstanceRecurrenceRequest.getOccurrenceUnit() != null) {
            String occurrenceUnit = scheduledInstanceRecurrenceRequest.getOccurrenceUnit();
            jsonWriter.name("OccurrenceUnit");
            jsonWriter.value(occurrenceUnit);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstanceRecurrenceRequestJsonMarshaller instance;

    public static ScheduledInstanceRecurrenceRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceRecurrenceRequestJsonMarshaller();
        return instance;
    }
}
