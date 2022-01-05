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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetSegmentDetectionResult
 */
public class GetSegmentDetectionResultJsonUnmarshaller implements
        Unmarshaller<GetSegmentDetectionResult, JsonUnmarshallerContext> {

    public GetSegmentDetectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSegmentDetectionResult getSegmentDetectionResult = new GetSegmentDetectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobStatus")) {
                getSegmentDetectionResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getSegmentDetectionResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoMetadata")) {
                getSegmentDetectionResult.setVideoMetadata(new ListUnmarshaller<VideoMetadata>(
                        VideoMetadataJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AudioMetadata")) {
                getSegmentDetectionResult.setAudioMetadata(new ListUnmarshaller<AudioMetadata>(
                        AudioMetadataJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getSegmentDetectionResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Segments")) {
                getSegmentDetectionResult.setSegments(new ListUnmarshaller<SegmentDetection>(
                        SegmentDetectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SelectedSegmentTypes")) {
                getSegmentDetectionResult
                        .setSelectedSegmentTypes(new ListUnmarshaller<SegmentTypeInfo>(
                                SegmentTypeInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getSegmentDetectionResult;
    }

    private static GetSegmentDetectionResultJsonUnmarshaller instance;

    public static GetSegmentDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSegmentDetectionResultJsonUnmarshaller();
        return instance;
    }
}
