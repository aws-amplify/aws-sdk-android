/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HoursOfOperationConfig
 */
class HoursOfOperationConfigJsonMarshaller {

    public void marshall(HoursOfOperationConfig hoursOfOperationConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hoursOfOperationConfig.getDay() != null) {
            String day = hoursOfOperationConfig.getDay();
            jsonWriter.name("Day");
            jsonWriter.value(day);
        }
        if (hoursOfOperationConfig.getStartTime() != null) {
            HoursOfOperationTimeSlice startTime = hoursOfOperationConfig.getStartTime();
            jsonWriter.name("StartTime");
            HoursOfOperationTimeSliceJsonMarshaller.getInstance().marshall(startTime, jsonWriter);
        }
        if (hoursOfOperationConfig.getEndTime() != null) {
            HoursOfOperationTimeSlice endTime = hoursOfOperationConfig.getEndTime();
            jsonWriter.name("EndTime");
            HoursOfOperationTimeSliceJsonMarshaller.getInstance().marshall(endTime, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HoursOfOperationConfigJsonMarshaller instance;

    public static HoursOfOperationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HoursOfOperationConfigJsonMarshaller();
        return instance;
    }
}
