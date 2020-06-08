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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimeRange
 */
class TimeRangeJsonMarshaller {

    public void marshall(TimeRange timeRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timeRange.getFromInclusive() != null) {
            java.util.Date fromInclusive = timeRange.getFromInclusive();
            jsonWriter.name("FromInclusive");
            jsonWriter.value(fromInclusive);
        }
        if (timeRange.getToExclusive() != null) {
            java.util.Date toExclusive = timeRange.getToExclusive();
            jsonWriter.name("ToExclusive");
            jsonWriter.value(toExclusive);
        }
        jsonWriter.endObject();
    }

    private static TimeRangeJsonMarshaller instance;

    public static TimeRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimeRangeJsonMarshaller();
        return instance;
    }
}
