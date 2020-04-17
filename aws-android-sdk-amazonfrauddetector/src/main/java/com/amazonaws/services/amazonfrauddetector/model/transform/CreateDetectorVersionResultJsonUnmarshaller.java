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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDetectorVersionResult
 */
public class CreateDetectorVersionResultJsonUnmarshaller implements
        Unmarshaller<CreateDetectorVersionResult, JsonUnmarshallerContext> {

    public CreateDetectorVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDetectorVersionResult createDetectorVersionResult = new CreateDetectorVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("detectorId")) {
                createDetectorVersionResult.setDetectorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectorVersionId")) {
                createDetectorVersionResult.setDetectorVersionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                createDetectorVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDetectorVersionResult;
    }

    private static CreateDetectorVersionResultJsonUnmarshaller instance;

    public static CreateDetectorVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDetectorVersionResultJsonUnmarshaller();
        return instance;
    }
}
