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
 * JSON marshaller for POJO ScheduledInstanceRecurrence
 */
class ScheduledInstanceRecurrenceJsonMarshaller {

    public void marshall(ScheduledInstanceRecurrence scheduledInstanceRecurrence,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstanceRecurrence.getFrequency() != null) {
            String frequency = scheduledInstanceRecurrence.getFrequency();
            jsonWriter.name("Frequency");
            jsonWriter.value(frequency);
        }
        if (scheduledInstanceRecurrence.getInterval() != null) {
            Integer interval = scheduledInstanceRecurrence.getInterval();
            jsonWriter.name("Interval");
            jsonWriter.value(interval);
        }
        if (scheduledInstanceRecurrence.getOccurrenceDaySet() != null) {
            java.util.List<Integer> occurrenceDaySet = scheduledInstanceRecurrence
                    .getOccurrenceDaySet();
            jsonWriter.name("OccurrenceDaySet");
            jsonWriter.beginArray();
            for (Integer occurrenceDaySetItem : occurrenceDaySet) {
                if (occurrenceDaySetItem != null) {
                    jsonWriter.value(occurrenceDaySetItem);
                }
            }
            jsonWriter.endArray();
        }
        if (scheduledInstanceRecurrence.getOccurrenceRelativeToEnd() != null) {
            Boolean occurrenceRelativeToEnd = scheduledInstanceRecurrence
                    .getOccurrenceRelativeToEnd();
            jsonWriter.name("OccurrenceRelativeToEnd");
            jsonWriter.value(occurrenceRelativeToEnd);
        }
        if (scheduledInstanceRecurrence.getOccurrenceUnit() != null) {
            String occurrenceUnit = scheduledInstanceRecurrence.getOccurrenceUnit();
            jsonWriter.name("OccurrenceUnit");
            jsonWriter.value(occurrenceUnit);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstanceRecurrenceJsonMarshaller instance;

    public static ScheduledInstanceRecurrenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceRecurrenceJsonMarshaller();
        return instance;
    }
}
