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
 * JSON unmarshaller for POJO RealtimeContactAnalysisSegment
 */
class RealtimeContactAnalysisSegmentJsonUnmarshaller implements
        Unmarshaller<RealtimeContactAnalysisSegment, JsonUnmarshallerContext> {

    public RealtimeContactAnalysisSegment unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealtimeContactAnalysisSegment realtimeContactAnalysisSegment = new RealtimeContactAnalysisSegment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Transcript")) {
                realtimeContactAnalysisSegment
                        .setTranscript(RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Categories")) {
                realtimeContactAnalysisSegment
                        .setCategories(RealTimeContactAnalysisSegmentCategoriesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Issues")) {
                realtimeContactAnalysisSegment
                        .setIssues(RealTimeContactAnalysisSegmentIssuesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Event")) {
                realtimeContactAnalysisSegment
                        .setEvent(RealTimeContactAnalysisSegmentEventJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Attachments")) {
                realtimeContactAnalysisSegment
                        .setAttachments(RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realtimeContactAnalysisSegment;
    }

    private static RealtimeContactAnalysisSegmentJsonUnmarshaller instance;

    public static RealtimeContactAnalysisSegmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeContactAnalysisSegmentJsonUnmarshaller();
        return instance;
    }
}
