/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response GetTextDetectionResult
 */
public class GetTextDetectionResultJsonUnmarshaller implements
        Unmarshaller<GetTextDetectionResult, JsonUnmarshallerContext> {

    public GetTextDetectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTextDetectionResult getTextDetectionResult = new GetTextDetectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobStatus")) {
                getTextDetectionResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getTextDetectionResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoMetadata")) {
                getTextDetectionResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TextDetections")) {
                getTextDetectionResult.setTextDetections(new ListUnmarshaller<TextDetectionResult>(
                        TextDetectionResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getTextDetectionResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TextModelVersion")) {
                getTextDetectionResult.setTextModelVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getTextDetectionResult;
    }

    private static GetTextDetectionResultJsonUnmarshaller instance;

    public static GetTextDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTextDetectionResultJsonUnmarshaller();
        return instance;
    }
}
