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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AbsoluteTimeRange
 */
class AbsoluteTimeRangeJsonMarshaller {

    public void marshall(AbsoluteTimeRange absoluteTimeRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (absoluteTimeRange.getStartTime() != null) {
            Long startTime = absoluteTimeRange.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (absoluteTimeRange.getEndTime() != null) {
            Long endTime = absoluteTimeRange.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (absoluteTimeRange.getFirst() != null) {
            Long first = absoluteTimeRange.getFirst();
            jsonWriter.name("First");
            jsonWriter.value(first);
        }
        if (absoluteTimeRange.getLast() != null) {
            Long last = absoluteTimeRange.getLast();
            jsonWriter.name("Last");
            jsonWriter.value(last);
        }
        jsonWriter.endObject();
    }

    private static AbsoluteTimeRangeJsonMarshaller instance;

    public static AbsoluteTimeRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AbsoluteTimeRangeJsonMarshaller();
        return instance;
    }
}
