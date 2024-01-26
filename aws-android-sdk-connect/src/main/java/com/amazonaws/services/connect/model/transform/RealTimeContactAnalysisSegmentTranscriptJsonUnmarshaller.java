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
 * JSON unmarshaller for POJO RealTimeContactAnalysisSegmentTranscript
 */
class RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller implements
        Unmarshaller<RealTimeContactAnalysisSegmentTranscript, JsonUnmarshallerContext> {

    public RealTimeContactAnalysisSegmentTranscript unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealTimeContactAnalysisSegmentTranscript realTimeContactAnalysisSegmentTranscript = new RealTimeContactAnalysisSegmentTranscript();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                realTimeContactAnalysisSegmentTranscript.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantId")) {
                realTimeContactAnalysisSegmentTranscript.setParticipantId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantRole")) {
                realTimeContactAnalysisSegmentTranscript.setParticipantRole(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                realTimeContactAnalysisSegmentTranscript.setDisplayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                realTimeContactAnalysisSegmentTranscript.setContent(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentType")) {
                realTimeContactAnalysisSegmentTranscript.setContentType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Time")) {
                realTimeContactAnalysisSegmentTranscript
                        .setTime(RealTimeContactAnalysisTimeDataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Redaction")) {
                realTimeContactAnalysisSegmentTranscript
                        .setRedaction(RealTimeContactAnalysisTranscriptItemRedactionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Sentiment")) {
                realTimeContactAnalysisSegmentTranscript.setSentiment(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realTimeContactAnalysisSegmentTranscript;
    }

    private static RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller instance;

    public static RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller();
        return instance;
    }
}
