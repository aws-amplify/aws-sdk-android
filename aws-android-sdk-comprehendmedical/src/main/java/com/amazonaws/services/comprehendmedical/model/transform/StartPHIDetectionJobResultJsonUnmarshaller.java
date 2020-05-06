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
 * JSON unmarshaller for response StartPHIDetectionJobResult
 */
public class StartPHIDetectionJobResultJsonUnmarshaller implements
        Unmarshaller<StartPHIDetectionJobResult, JsonUnmarshallerContext> {

    public StartPHIDetectionJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartPHIDetectionJobResult startPHIDetectionJobResult = new StartPHIDetectionJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                startPHIDetectionJobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startPHIDetectionJobResult;
    }

    private static StartPHIDetectionJobResultJsonUnmarshaller instance;

    public static StartPHIDetectionJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartPHIDetectionJobResultJsonUnmarshaller();
        return instance;
    }
}
