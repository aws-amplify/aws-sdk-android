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
 * JSON marshaller for POJO RealtimeContactAnalysisSegment
 */
class RealtimeContactAnalysisSegmentJsonMarshaller {

    public void marshall(RealtimeContactAnalysisSegment realtimeContactAnalysisSegment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realtimeContactAnalysisSegment.getTranscript() != null) {
            RealTimeContactAnalysisSegmentTranscript transcript = realtimeContactAnalysisSegment
                    .getTranscript();
            jsonWriter.name("Transcript");
            RealTimeContactAnalysisSegmentTranscriptJsonMarshaller.getInstance().marshall(
                    transcript, jsonWriter);
        }
        if (realtimeContactAnalysisSegment.getCategories() != null) {
            RealTimeContactAnalysisSegmentCategories categories = realtimeContactAnalysisSegment
                    .getCategories();
            jsonWriter.name("Categories");
            RealTimeContactAnalysisSegmentCategoriesJsonMarshaller.getInstance().marshall(
                    categories, jsonWriter);
        }
        if (realtimeContactAnalysisSegment.getIssues() != null) {
            RealTimeContactAnalysisSegmentIssues issues = realtimeContactAnalysisSegment
                    .getIssues();
            jsonWriter.name("Issues");
            RealTimeContactAnalysisSegmentIssuesJsonMarshaller.getInstance().marshall(issues,
                    jsonWriter);
        }
        if (realtimeContactAnalysisSegment.getEvent() != null) {
            RealTimeContactAnalysisSegmentEvent event = realtimeContactAnalysisSegment.getEvent();
            jsonWriter.name("Event");
            RealTimeContactAnalysisSegmentEventJsonMarshaller.getInstance().marshall(event,
                    jsonWriter);
        }
        if (realtimeContactAnalysisSegment.getAttachments() != null) {
            RealTimeContactAnalysisSegmentAttachments attachments = realtimeContactAnalysisSegment
                    .getAttachments();
            jsonWriter.name("Attachments");
            RealTimeContactAnalysisSegmentAttachmentsJsonMarshaller.getInstance().marshall(
                    attachments, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RealtimeContactAnalysisSegmentJsonMarshaller instance;

    public static RealtimeContactAnalysisSegmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeContactAnalysisSegmentJsonMarshaller();
        return instance;
    }
}
