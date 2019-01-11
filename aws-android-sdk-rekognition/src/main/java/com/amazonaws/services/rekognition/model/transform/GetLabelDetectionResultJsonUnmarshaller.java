/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response GetLabelDetectionResult
 */
public class GetLabelDetectionResultJsonUnmarshaller implements
        Unmarshaller<GetLabelDetectionResult, JsonUnmarshallerContext> {

    public GetLabelDetectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLabelDetectionResult getLabelDetectionResult = new GetLabelDetectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobStatus")) {
                getLabelDetectionResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getLabelDetectionResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoMetadata")) {
                getLabelDetectionResult.setVideoMetadata(VideoMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getLabelDetectionResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Labels")) {
                getLabelDetectionResult.setLabels(new ListUnmarshaller<LabelDetection>(
                        LabelDetectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BillableDurationSeconds")) {
                getLabelDetectionResult.setBillableDurationSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCode")) {
                getLabelDetectionResult.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getLabelDetectionResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getLabelDetectionResult;
    }

    private static GetLabelDetectionResultJsonUnmarshaller instance;

    public static GetLabelDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLabelDetectionResultJsonUnmarshaller();
        return instance;
    }
}
