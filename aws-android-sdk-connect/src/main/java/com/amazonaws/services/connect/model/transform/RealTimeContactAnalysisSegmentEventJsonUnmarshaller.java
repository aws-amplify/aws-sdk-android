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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RealTimeContactAnalysisSegmentEvent
 */
class RealTimeContactAnalysisSegmentEventJsonUnmarshaller implements
        Unmarshaller<RealTimeContactAnalysisSegmentEvent, JsonUnmarshallerContext> {

    public RealTimeContactAnalysisSegmentEvent unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealTimeContactAnalysisSegmentEvent realTimeContactAnalysisSegmentEvent = new RealTimeContactAnalysisSegmentEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                realTimeContactAnalysisSegmentEvent.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantId")) {
                realTimeContactAnalysisSegmentEvent.setParticipantId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantRole")) {
                realTimeContactAnalysisSegmentEvent.setParticipantRole(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                realTimeContactAnalysisSegmentEvent.setDisplayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventType")) {
                realTimeContactAnalysisSegmentEvent.setEventType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Time")) {
                realTimeContactAnalysisSegmentEvent
                        .setTime(RealTimeContactAnalysisTimeDataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realTimeContactAnalysisSegmentEvent;
    }

    private static RealTimeContactAnalysisSegmentEventJsonUnmarshaller instance;

    public static RealTimeContactAnalysisSegmentEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentEventJsonUnmarshaller();
        return instance;
    }
}
