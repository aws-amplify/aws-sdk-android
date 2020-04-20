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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Schedule
 */
class ScheduleJsonMarshaller {

    public void marshall(Schedule schedule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (schedule.getScheduleExpression() != null) {
            String scheduleExpression = schedule.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (schedule.getState() != null) {
            String state = schedule.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static ScheduleJsonMarshaller instance;

    public static ScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleJsonMarshaller();
        return instance;
    }
}
