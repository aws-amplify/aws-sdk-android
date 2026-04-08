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
 * JSON marshaller for POJO RealTimeContactAnalysisSegmentAttachments
 */
class RealTimeContactAnalysisSegmentAttachmentsJsonMarshaller {

    public void marshall(
            RealTimeContactAnalysisSegmentAttachments realTimeContactAnalysisSegmentAttachments,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisSegmentAttachments.getId() != null) {
            String id = realTimeContactAnalysisSegmentAttachments.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (realTimeContactAnalysisSegmentAttachments.getParticipantId() != null) {
            String participantId = realTimeContactAnalysisSegmentAttachments.getParticipantId();
            jsonWriter.name("ParticipantId");
            jsonWriter.value(participantId);
        }
        if (realTimeContactAnalysisSegmentAttachments.getParticipantRole() != null) {
            String participantRole = realTimeContactAnalysisSegmentAttachments.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (realTimeContactAnalysisSegmentAttachments.getDisplayName() != null) {
            String displayName = realTimeContactAnalysisSegmentAttachments.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (realTimeContactAnalysisSegmentAttachments.getAttachments() != null) {
            java.util.List<RealTimeContactAnalysisAttachment> attachments = realTimeContactAnalysisSegmentAttachments
                    .getAttachments();
            jsonWriter.name("Attachments");
            jsonWriter.beginArray();
            for (RealTimeContactAnalysisAttachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    RealTimeContactAnalysisAttachmentJsonMarshaller.getInstance().marshall(
                            attachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (realTimeContactAnalysisSegmentAttachments.getTime() != null) {
            RealTimeContactAnalysisTimeData time = realTimeContactAnalysisSegmentAttachments
                    .getTime();
            jsonWriter.name("Time");
            RealTimeContactAnalysisTimeDataJsonMarshaller.getInstance().marshall(time, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisSegmentAttachmentsJsonMarshaller instance;

    public static RealTimeContactAnalysisSegmentAttachmentsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentAttachmentsJsonMarshaller();
        return instance;
    }
}
