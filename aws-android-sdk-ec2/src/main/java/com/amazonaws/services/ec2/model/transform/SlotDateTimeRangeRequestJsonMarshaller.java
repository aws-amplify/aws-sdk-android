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
 * JSON marshaller for POJO SlotDateTimeRangeRequest
 */
class SlotDateTimeRangeRequestJsonMarshaller {

    public void marshall(SlotDateTimeRangeRequest slotDateTimeRangeRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (slotDateTimeRangeRequest.getEarliestTime() != null) {
            java.util.Date earliestTime = slotDateTimeRangeRequest.getEarliestTime();
            jsonWriter.name("EarliestTime");
            jsonWriter.value(earliestTime);
        }
        if (slotDateTimeRangeRequest.getLatestTime() != null) {
            java.util.Date latestTime = slotDateTimeRangeRequest.getLatestTime();
            jsonWriter.name("LatestTime");
            jsonWriter.value(latestTime);
        }
        jsonWriter.endObject();
    }

    private static SlotDateTimeRangeRequestJsonMarshaller instance;

    public static SlotDateTimeRangeRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SlotDateTimeRangeRequestJsonMarshaller();
        return instance;
    }
}
