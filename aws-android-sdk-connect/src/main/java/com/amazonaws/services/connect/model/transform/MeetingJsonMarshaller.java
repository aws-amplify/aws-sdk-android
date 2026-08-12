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
 * JSON marshaller for POJO Meeting
 */
class MeetingJsonMarshaller {

    public void marshall(Meeting meeting, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (meeting.getMediaRegion() != null) {
            String mediaRegion = meeting.getMediaRegion();
            jsonWriter.name("MediaRegion");
            jsonWriter.value(mediaRegion);
        }
        if (meeting.getMediaPlacement() != null) {
            MediaPlacement mediaPlacement = meeting.getMediaPlacement();
            jsonWriter.name("MediaPlacement");
            MediaPlacementJsonMarshaller.getInstance().marshall(mediaPlacement, jsonWriter);
        }
        if (meeting.getMeetingFeatures() != null) {
            MeetingFeaturesConfiguration meetingFeatures = meeting.getMeetingFeatures();
            jsonWriter.name("MeetingFeatures");
            MeetingFeaturesConfigurationJsonMarshaller.getInstance().marshall(meetingFeatures,
                    jsonWriter);
        }
        if (meeting.getMeetingId() != null) {
            String meetingId = meeting.getMeetingId();
            jsonWriter.name("MeetingId");
            jsonWriter.value(meetingId);
        }
        jsonWriter.endObject();
    }

    private static MeetingJsonMarshaller instance;

    public static MeetingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MeetingJsonMarshaller();
        return instance;
    }
}
