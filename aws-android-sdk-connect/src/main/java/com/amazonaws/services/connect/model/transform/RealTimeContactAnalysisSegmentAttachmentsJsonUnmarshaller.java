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
 * JSON unmarshaller for POJO RealTimeContactAnalysisSegmentAttachments
 */
class RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller implements
        Unmarshaller<RealTimeContactAnalysisSegmentAttachments, JsonUnmarshallerContext> {

    public RealTimeContactAnalysisSegmentAttachments unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RealTimeContactAnalysisSegmentAttachments realTimeContactAnalysisSegmentAttachments = new RealTimeContactAnalysisSegmentAttachments();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                realTimeContactAnalysisSegmentAttachments.setId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantId")) {
                realTimeContactAnalysisSegmentAttachments.setParticipantId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantRole")) {
                realTimeContactAnalysisSegmentAttachments.setParticipantRole(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                realTimeContactAnalysisSegmentAttachments.setDisplayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attachments")) {
                realTimeContactAnalysisSegmentAttachments
                        .setAttachments(new ListUnmarshaller<RealTimeContactAnalysisAttachment>(
                                RealTimeContactAnalysisAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Time")) {
                realTimeContactAnalysisSegmentAttachments
                        .setTime(RealTimeContactAnalysisTimeDataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realTimeContactAnalysisSegmentAttachments;
    }

    private static RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller instance;

    public static RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller();
        return instance;
    }
}
