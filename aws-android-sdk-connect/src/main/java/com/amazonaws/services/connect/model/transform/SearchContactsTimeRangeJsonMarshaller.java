/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SearchContactsTimeRange
 */
class SearchContactsTimeRangeJsonMarshaller {

    public void marshall(SearchContactsTimeRange searchContactsTimeRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (searchContactsTimeRange.getType() != null) {
            String type = searchContactsTimeRange.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (searchContactsTimeRange.getStartTime() != null) {
            java.util.Date startTime = searchContactsTimeRange.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (searchContactsTimeRange.getEndTime() != null) {
            java.util.Date endTime = searchContactsTimeRange.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static SearchContactsTimeRangeJsonMarshaller instance;

    public static SearchContactsTimeRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchContactsTimeRangeJsonMarshaller();
        return instance;
    }
}
