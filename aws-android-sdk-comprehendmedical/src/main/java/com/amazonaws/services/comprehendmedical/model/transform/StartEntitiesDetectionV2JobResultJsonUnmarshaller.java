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
 * JSON unmarshaller for response StartEntitiesDetectionV2JobResult
 */
public class StartEntitiesDetectionV2JobResultJsonUnmarshaller implements
        Unmarshaller<StartEntitiesDetectionV2JobResult, JsonUnmarshallerContext> {

    public StartEntitiesDetectionV2JobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StartEntitiesDetectionV2JobResult startEntitiesDetectionV2JobResult = new StartEntitiesDetectionV2JobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                startEntitiesDetectionV2JobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startEntitiesDetectionV2JobResult;
    }

    private static StartEntitiesDetectionV2JobResultJsonUnmarshaller instance;

    public static StartEntitiesDetectionV2JobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartEntitiesDetectionV2JobResultJsonUnmarshaller();
        return instance;
    }
}
