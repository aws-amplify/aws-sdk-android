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
 * JSON marshaller for POJO RealTimeContactAnalysisSegmentEvent
 */
class RealTimeContactAnalysisSegmentEventJsonMarshaller {

    public void marshall(RealTimeContactAnalysisSegmentEvent realTimeContactAnalysisSegmentEvent,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisSegmentEvent.getId() != null) {
            String id = realTimeContactAnalysisSegmentEvent.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (realTimeContactAnalysisSegmentEvent.getParticipantId() != null) {
            String participantId = realTimeContactAnalysisSegmentEvent.getParticipantId();
            jsonWriter.name("ParticipantId");
            jsonWriter.value(participantId);
        }
        if (realTimeContactAnalysisSegmentEvent.getParticipantRole() != null) {
            String participantRole = realTimeContactAnalysisSegmentEvent.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (realTimeContactAnalysisSegmentEvent.getDisplayName() != null) {
            String displayName = realTimeContactAnalysisSegmentEvent.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (realTimeContactAnalysisSegmentEvent.getEventType() != null) {
            String eventType = realTimeContactAnalysisSegmentEvent.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (realTimeContactAnalysisSegmentEvent.getTime() != null) {
            RealTimeContactAnalysisTimeData time = realTimeContactAnalysisSegmentEvent.getTime();
            jsonWriter.name("Time");
            RealTimeContactAnalysisTimeDataJsonMarshaller.getInstance().marshall(time, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisSegmentEventJsonMarshaller instance;

    public static RealTimeContactAnalysisSegmentEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentEventJsonMarshaller();
        return instance;
    }
}
