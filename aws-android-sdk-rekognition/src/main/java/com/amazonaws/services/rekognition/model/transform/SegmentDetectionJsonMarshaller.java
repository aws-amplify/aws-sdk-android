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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentDetection
 */
class SegmentDetectionJsonMarshaller {

    public void marshall(SegmentDetection segmentDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentDetection.getType() != null) {
            String type = segmentDetection.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (segmentDetection.getStartTimestampMillis() != null) {
            Long startTimestampMillis = segmentDetection.getStartTimestampMillis();
            jsonWriter.name("StartTimestampMillis");
            jsonWriter.value(startTimestampMillis);
        }
        if (segmentDetection.getEndTimestampMillis() != null) {
            Long endTimestampMillis = segmentDetection.getEndTimestampMillis();
            jsonWriter.name("EndTimestampMillis");
            jsonWriter.value(endTimestampMillis);
        }
        if (segmentDetection.getDurationMillis() != null) {
            Long durationMillis = segmentDetection.getDurationMillis();
            jsonWriter.name("DurationMillis");
            jsonWriter.value(durationMillis);
        }
        if (segmentDetection.getStartTimecodeSMPTE() != null) {
            String startTimecodeSMPTE = segmentDetection.getStartTimecodeSMPTE();
            jsonWriter.name("StartTimecodeSMPTE");
            jsonWriter.value(startTimecodeSMPTE);
        }
        if (segmentDetection.getEndTimecodeSMPTE() != null) {
            String endTimecodeSMPTE = segmentDetection.getEndTimecodeSMPTE();
            jsonWriter.name("EndTimecodeSMPTE");
            jsonWriter.value(endTimecodeSMPTE);
        }
        if (segmentDetection.getDurationSMPTE() != null) {
            String durationSMPTE = segmentDetection.getDurationSMPTE();
            jsonWriter.name("DurationSMPTE");
            jsonWriter.value(durationSMPTE);
        }
        if (segmentDetection.getTechnicalCueSegment() != null) {
            TechnicalCueSegment technicalCueSegment = segmentDetection.getTechnicalCueSegment();
            jsonWriter.name("TechnicalCueSegment");
            TechnicalCueSegmentJsonMarshaller.getInstance().marshall(technicalCueSegment,
                    jsonWriter);
        }
        if (segmentDetection.getShotSegment() != null) {
            ShotSegment shotSegment = segmentDetection.getShotSegment();
            jsonWriter.name("ShotSegment");
            ShotSegmentJsonMarshaller.getInstance().marshall(shotSegment, jsonWriter);
        }
        if (segmentDetection.getStartFrameNumber() != null) {
            Long startFrameNumber = segmentDetection.getStartFrameNumber();
            jsonWriter.name("StartFrameNumber");
            jsonWriter.value(startFrameNumber);
        }
        if (segmentDetection.getEndFrameNumber() != null) {
            Long endFrameNumber = segmentDetection.getEndFrameNumber();
            jsonWriter.name("EndFrameNumber");
            jsonWriter.value(endFrameNumber);
        }
        if (segmentDetection.getDurationFrames() != null) {
            Long durationFrames = segmentDetection.getDurationFrames();
            jsonWriter.name("DurationFrames");
            jsonWriter.value(durationFrames);
        }
        jsonWriter.endObject();
    }

    private static SegmentDetectionJsonMarshaller instance;

    public static SegmentDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDetectionJsonMarshaller();
        return instance;
    }
}
