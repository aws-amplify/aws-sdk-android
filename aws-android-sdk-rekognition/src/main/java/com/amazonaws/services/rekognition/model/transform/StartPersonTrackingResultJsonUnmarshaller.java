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
 * JSON unmarshaller for response StartPersonTrackingResult
 */
public class StartPersonTrackingResultJsonUnmarshaller implements
        Unmarshaller<StartPersonTrackingResult, JsonUnmarshallerContext> {

    public StartPersonTrackingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartPersonTrackingResult startPersonTrackingResult = new StartPersonTrackingResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                startPersonTrackingResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startPersonTrackingResult;
    }

    private static StartPersonTrackingResultJsonUnmarshaller instance;

    public static StartPersonTrackingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartPersonTrackingResultJsonUnmarshaller();
        return instance;
    }
}
