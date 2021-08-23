/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SegmentDetection
 */
class SegmentDetectionJsonUnmarshaller implements
        Unmarshaller<SegmentDetection, JsonUnmarshallerContext> {

    public SegmentDetection unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentDetection segmentDetection = new SegmentDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                segmentDetection.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTimestampMillis")) {
                segmentDetection.setStartTimestampMillis(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTimestampMillis")) {
                segmentDetection.setEndTimestampMillis(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationMillis")) {
                segmentDetection.setDurationMillis(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTimecodeSMPTE")) {
                segmentDetection.setStartTimecodeSMPTE(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTimecodeSMPTE")) {
                segmentDetection.setEndTimecodeSMPTE(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationSMPTE")) {
                segmentDetection.setDurationSMPTE(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TechnicalCueSegment")) {
                segmentDetection.setTechnicalCueSegment(TechnicalCueSegmentJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShotSegment")) {
                segmentDetection.setShotSegment(ShotSegmentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartFrameNumber")) {
                segmentDetection.setStartFrameNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndFrameNumber")) {
                segmentDetection.setEndFrameNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationFrames")) {
                segmentDetection.setDurationFrames(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentDetection;
    }

    private static SegmentDetectionJsonUnmarshaller instance;

    public static SegmentDetectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDetectionJsonUnmarshaller();
        return instance;
    }
}
