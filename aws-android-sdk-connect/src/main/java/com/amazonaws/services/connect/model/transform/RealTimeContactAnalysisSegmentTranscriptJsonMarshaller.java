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
 * JSON marshaller for POJO RealTimeContactAnalysisSegmentTranscript
 */
class RealTimeContactAnalysisSegmentTranscriptJsonMarshaller {

    public void marshall(
            RealTimeContactAnalysisSegmentTranscript realTimeContactAnalysisSegmentTranscript,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisSegmentTranscript.getId() != null) {
            String id = realTimeContactAnalysisSegmentTranscript.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (realTimeContactAnalysisSegmentTranscript.getParticipantId() != null) {
            String participantId = realTimeContactAnalysisSegmentTranscript.getParticipantId();
            jsonWriter.name("ParticipantId");
            jsonWriter.value(participantId);
        }
        if (realTimeContactAnalysisSegmentTranscript.getParticipantRole() != null) {
            String participantRole = realTimeContactAnalysisSegmentTranscript.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (realTimeContactAnalysisSegmentTranscript.getDisplayName() != null) {
            String displayName = realTimeContactAnalysisSegmentTranscript.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (realTimeContactAnalysisSegmentTranscript.getContent() != null) {
            String content = realTimeContactAnalysisSegmentTranscript.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (realTimeContactAnalysisSegmentTranscript.getContentType() != null) {
            String contentType = realTimeContactAnalysisSegmentTranscript.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (realTimeContactAnalysisSegmentTranscript.getTime() != null) {
            RealTimeContactAnalysisTimeData time = realTimeContactAnalysisSegmentTranscript
                    .getTime();
            jsonWriter.name("Time");
            RealTimeContactAnalysisTimeDataJsonMarshaller.getInstance().marshall(time, jsonWriter);
        }
        if (realTimeContactAnalysisSegmentTranscript.getRedaction() != null) {
            RealTimeContactAnalysisTranscriptItemRedaction redaction = realTimeContactAnalysisSegmentTranscript
                    .getRedaction();
            jsonWriter.name("Redaction");
            RealTimeContactAnalysisTranscriptItemRedactionJsonMarshaller.getInstance().marshall(
                    redaction, jsonWriter);
        }
        if (realTimeContactAnalysisSegmentTranscript.getSentiment() != null) {
            String sentiment = realTimeContactAnalysisSegmentTranscript.getSentiment();
            jsonWriter.name("Sentiment");
            jsonWriter.value(sentiment);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisSegmentTranscriptJsonMarshaller instance;

    public static RealTimeContactAnalysisSegmentTranscriptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentTranscriptJsonMarshaller();
        return instance;
    }
}
