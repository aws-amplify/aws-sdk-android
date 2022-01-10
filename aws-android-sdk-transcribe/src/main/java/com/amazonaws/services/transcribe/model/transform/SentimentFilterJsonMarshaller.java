/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SentimentFilter
 */
class SentimentFilterJsonMarshaller {

    public void marshall(SentimentFilter sentimentFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sentimentFilter.getSentiments() != null) {
            java.util.List<String> sentiments = sentimentFilter.getSentiments();
            jsonWriter.name("Sentiments");
            jsonWriter.beginArray();
            for (String sentimentsItem : sentiments) {
                if (sentimentsItem != null) {
                    jsonWriter.value(sentimentsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (sentimentFilter.getAbsoluteTimeRange() != null) {
            AbsoluteTimeRange absoluteTimeRange = sentimentFilter.getAbsoluteTimeRange();
            jsonWriter.name("AbsoluteTimeRange");
            AbsoluteTimeRangeJsonMarshaller.getInstance().marshall(absoluteTimeRange, jsonWriter);
        }
        if (sentimentFilter.getRelativeTimeRange() != null) {
            RelativeTimeRange relativeTimeRange = sentimentFilter.getRelativeTimeRange();
            jsonWriter.name("RelativeTimeRange");
            RelativeTimeRangeJsonMarshaller.getInstance().marshall(relativeTimeRange, jsonWriter);
        }
        if (sentimentFilter.getParticipantRole() != null) {
            String participantRole = sentimentFilter.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (sentimentFilter.getNegate() != null) {
            Boolean negate = sentimentFilter.getNegate();
            jsonWriter.name("Negate");
            jsonWriter.value(negate);
        }
        jsonWriter.endObject();
    }

    private static SentimentFilterJsonMarshaller instance;

    public static SentimentFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SentimentFilterJsonMarshaller();
        return instance;
    }
}
