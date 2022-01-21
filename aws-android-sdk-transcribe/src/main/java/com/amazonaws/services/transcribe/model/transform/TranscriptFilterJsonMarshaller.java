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
 * JSON marshaller for POJO TranscriptFilter
 */
class TranscriptFilterJsonMarshaller {

    public void marshall(TranscriptFilter transcriptFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transcriptFilter.getTranscriptFilterType() != null) {
            String transcriptFilterType = transcriptFilter.getTranscriptFilterType();
            jsonWriter.name("TranscriptFilterType");
            jsonWriter.value(transcriptFilterType);
        }
        if (transcriptFilter.getAbsoluteTimeRange() != null) {
            AbsoluteTimeRange absoluteTimeRange = transcriptFilter.getAbsoluteTimeRange();
            jsonWriter.name("AbsoluteTimeRange");
            AbsoluteTimeRangeJsonMarshaller.getInstance().marshall(absoluteTimeRange, jsonWriter);
        }
        if (transcriptFilter.getRelativeTimeRange() != null) {
            RelativeTimeRange relativeTimeRange = transcriptFilter.getRelativeTimeRange();
            jsonWriter.name("RelativeTimeRange");
            RelativeTimeRangeJsonMarshaller.getInstance().marshall(relativeTimeRange, jsonWriter);
        }
        if (transcriptFilter.getParticipantRole() != null) {
            String participantRole = transcriptFilter.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (transcriptFilter.getNegate() != null) {
            Boolean negate = transcriptFilter.getNegate();
            jsonWriter.name("Negate");
            jsonWriter.value(negate);
        }
        if (transcriptFilter.getTargets() != null) {
            java.util.List<String> targets = transcriptFilter.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (String targetsItem : targets) {
                if (targetsItem != null) {
                    jsonWriter.value(targetsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TranscriptFilterJsonMarshaller instance;

    public static TranscriptFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptFilterJsonMarshaller();
        return instance;
    }
}
