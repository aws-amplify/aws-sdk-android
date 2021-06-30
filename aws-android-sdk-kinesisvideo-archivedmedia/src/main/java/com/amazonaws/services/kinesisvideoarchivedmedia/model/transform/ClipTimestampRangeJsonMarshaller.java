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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClipTimestampRange
 */
class ClipTimestampRangeJsonMarshaller {

    public void marshall(ClipTimestampRange clipTimestampRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clipTimestampRange.getStartTimestamp() != null) {
            java.util.Date startTimestamp = clipTimestampRange.getStartTimestamp();
            jsonWriter.name("StartTimestamp");
            jsonWriter.value(startTimestamp);
        }
        if (clipTimestampRange.getEndTimestamp() != null) {
            java.util.Date endTimestamp = clipTimestampRange.getEndTimestamp();
            jsonWriter.name("EndTimestamp");
            jsonWriter.value(endTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ClipTimestampRangeJsonMarshaller instance;

    public static ClipTimestampRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClipTimestampRangeJsonMarshaller();
        return instance;
    }
}
