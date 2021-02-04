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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ViolationEventOccurrenceRange
 */
class ViolationEventOccurrenceRangeJsonMarshaller {

    public void marshall(ViolationEventOccurrenceRange violationEventOccurrenceRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (violationEventOccurrenceRange.getStartTime() != null) {
            java.util.Date startTime = violationEventOccurrenceRange.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (violationEventOccurrenceRange.getEndTime() != null) {
            java.util.Date endTime = violationEventOccurrenceRange.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static ViolationEventOccurrenceRangeJsonMarshaller instance;

    public static ViolationEventOccurrenceRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViolationEventOccurrenceRangeJsonMarshaller();
        return instance;
    }
}
