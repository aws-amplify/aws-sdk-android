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
 * JSON marshaller for POJO NonTalkTimeFilter
 */
class NonTalkTimeFilterJsonMarshaller {

    public void marshall(NonTalkTimeFilter nonTalkTimeFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (nonTalkTimeFilter.getThreshold() != null) {
            Long threshold = nonTalkTimeFilter.getThreshold();
            jsonWriter.name("Threshold");
            jsonWriter.value(threshold);
        }
        if (nonTalkTimeFilter.getAbsoluteTimeRange() != null) {
            AbsoluteTimeRange absoluteTimeRange = nonTalkTimeFilter.getAbsoluteTimeRange();
            jsonWriter.name("AbsoluteTimeRange");
            AbsoluteTimeRangeJsonMarshaller.getInstance().marshall(absoluteTimeRange, jsonWriter);
        }
        if (nonTalkTimeFilter.getRelativeTimeRange() != null) {
            RelativeTimeRange relativeTimeRange = nonTalkTimeFilter.getRelativeTimeRange();
            jsonWriter.name("RelativeTimeRange");
            RelativeTimeRangeJsonMarshaller.getInstance().marshall(relativeTimeRange, jsonWriter);
        }
        if (nonTalkTimeFilter.getNegate() != null) {
            Boolean negate = nonTalkTimeFilter.getNegate();
            jsonWriter.name("Negate");
            jsonWriter.value(negate);
        }
        jsonWriter.endObject();
    }

    private static NonTalkTimeFilterJsonMarshaller instance;

    public static NonTalkTimeFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NonTalkTimeFilterJsonMarshaller();
        return instance;
    }
}
