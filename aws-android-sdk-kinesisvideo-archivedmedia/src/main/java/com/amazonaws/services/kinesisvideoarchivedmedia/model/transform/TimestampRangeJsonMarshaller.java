/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimestampRange
 */
class TimestampRangeJsonMarshaller {

    public void marshall(TimestampRange timestampRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timestampRange.getStartTimestamp() != null) {
            java.util.Date startTimestamp = timestampRange.getStartTimestamp();
            jsonWriter.name("StartTimestamp");
            jsonWriter.value(startTimestamp);
        }
        if (timestampRange.getEndTimestamp() != null) {
            java.util.Date endTimestamp = timestampRange.getEndTimestamp();
            jsonWriter.name("EndTimestamp");
            jsonWriter.value(endTimestamp);
        }
        jsonWriter.endObject();
    }

    private static TimestampRangeJsonMarshaller instance;

    public static TimestampRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimestampRangeJsonMarshaller();
        return instance;
    }
}
