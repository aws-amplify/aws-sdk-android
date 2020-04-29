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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimeWindow
 */
class TimeWindowJsonMarshaller {

    public void marshall(TimeWindow timeWindow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timeWindow.getStartTime() != null) {
            java.util.Date startTime = timeWindow.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (timeWindow.getEndTime() != null) {
            java.util.Date endTime = timeWindow.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static TimeWindowJsonMarshaller instance;

    public static TimeWindowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimeWindowJsonMarshaller();
        return instance;
    }
}
