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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response StopEntitiesDetectionV2JobResult
 */
public class StopEntitiesDetectionV2JobResultJsonUnmarshaller implements
        Unmarshaller<StopEntitiesDetectionV2JobResult, JsonUnmarshallerContext> {

    public StopEntitiesDetectionV2JobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2JobResult = new StopEntitiesDetectionV2JobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                stopEntitiesDetectionV2JobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return stopEntitiesDetectionV2JobResult;
    }

    private static StopEntitiesDetectionV2JobResultJsonUnmarshaller instance;

    public static StopEntitiesDetectionV2JobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopEntitiesDetectionV2JobResultJsonUnmarshaller();
        return instance;
    }
}
