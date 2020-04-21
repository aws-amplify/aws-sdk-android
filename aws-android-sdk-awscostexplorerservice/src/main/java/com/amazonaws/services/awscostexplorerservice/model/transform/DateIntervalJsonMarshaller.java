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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DateInterval
 */
class DateIntervalJsonMarshaller {

    public void marshall(DateInterval dateInterval, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dateInterval.getStart() != null) {
            String start = dateInterval.getStart();
            jsonWriter.name("Start");
            jsonWriter.value(start);
        }
        if (dateInterval.getEnd() != null) {
            String end = dateInterval.getEnd();
            jsonWriter.name("End");
            jsonWriter.value(end);
        }
        jsonWriter.endObject();
    }

    private static DateIntervalJsonMarshaller instance;

    public static DateIntervalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DateIntervalJsonMarshaller();
        return instance;
    }
}
