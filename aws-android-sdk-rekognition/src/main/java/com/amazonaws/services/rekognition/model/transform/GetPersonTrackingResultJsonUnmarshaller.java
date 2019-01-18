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
 * JSON unmarshaller for response GetPersonTrackingResult
 */
public class GetPersonTrackingResultJsonUnmarshaller implements
        Unmarshaller<GetPersonTrackingResult, JsonUnmarshallerContext> {

    public GetPersonTrackingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPersonTrackingResult getPersonTrackingResult = new GetPersonTrackingResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobStatus")) {
                getPersonTrackingResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getPersonTrackingResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoMetadata")) {
                getPersonTrackingResult.setVideoMetadata(VideoMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getPersonTrackingResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Persons")) {
                getPersonTrackingResult.setPersons(new ListUnmarshaller<PersonDetection>(
                        PersonDetectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BillableDurationSeconds")) {
                getPersonTrackingResult.setBillableDurationSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCode")) {
                getPersonTrackingResult.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getPersonTrackingResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPersonTrackingResult;
    }

    private static GetPersonTrackingResultJsonUnmarshaller instance;

    public static GetPersonTrackingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPersonTrackingResultJsonUnmarshaller();
        return instance;
    }
}
