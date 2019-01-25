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
 * JSON unmarshaller for response GetContentModerationResult
 */
public class GetContentModerationResultJsonUnmarshaller implements
        Unmarshaller<GetContentModerationResult, JsonUnmarshallerContext> {

    public GetContentModerationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetContentModerationResult getContentModerationResult = new GetContentModerationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobStatus")) {
                getContentModerationResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getContentModerationResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoMetadata")) {
                getContentModerationResult.setVideoMetadata(VideoMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModerationLabels")) {
                getContentModerationResult
                        .setModerationLabels(new ListUnmarshaller<ContentModerationDetection>(
                                ContentModerationDetectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getContentModerationResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BillableDurationSeconds")) {
                getContentModerationResult.setBillableDurationSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCode")) {
                getContentModerationResult.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getContentModerationResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getContentModerationResult;
    }

    private static GetContentModerationResultJsonUnmarshaller instance;

    public static GetContentModerationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetContentModerationResultJsonUnmarshaller();
        return instance;
    }
}
