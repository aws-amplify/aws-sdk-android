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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobScheduleFrequency
 */
class JobScheduleFrequencyJsonMarshaller {

    public void marshall(JobScheduleFrequency jobScheduleFrequency, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobScheduleFrequency.getDailySchedule() != null) {
            DailySchedule dailySchedule = jobScheduleFrequency.getDailySchedule();
            jsonWriter.name("dailySchedule");
            DailyScheduleJsonMarshaller.getInstance().marshall(dailySchedule, jsonWriter);
        }
        if (jobScheduleFrequency.getMonthlySchedule() != null) {
            MonthlySchedule monthlySchedule = jobScheduleFrequency.getMonthlySchedule();
            jsonWriter.name("monthlySchedule");
            MonthlyScheduleJsonMarshaller.getInstance().marshall(monthlySchedule, jsonWriter);
        }
        if (jobScheduleFrequency.getWeeklySchedule() != null) {
            WeeklySchedule weeklySchedule = jobScheduleFrequency.getWeeklySchedule();
            jsonWriter.name("weeklySchedule");
            WeeklyScheduleJsonMarshaller.getInstance().marshall(weeklySchedule, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobScheduleFrequencyJsonMarshaller instance;

    public static JobScheduleFrequencyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobScheduleFrequencyJsonMarshaller();
        return instance;
    }
}
