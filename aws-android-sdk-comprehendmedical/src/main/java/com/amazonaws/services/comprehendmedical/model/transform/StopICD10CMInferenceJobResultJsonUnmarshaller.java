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
 * JSON unmarshaller for response StopICD10CMInferenceJobResult
 */
public class StopICD10CMInferenceJobResultJsonUnmarshaller implements
        Unmarshaller<StopICD10CMInferenceJobResult, JsonUnmarshallerContext> {

    public StopICD10CMInferenceJobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StopICD10CMInferenceJobResult stopICD10CMInferenceJobResult = new StopICD10CMInferenceJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                stopICD10CMInferenceJobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return stopICD10CMInferenceJobResult;
    }

    private static StopICD10CMInferenceJobResultJsonUnmarshaller instance;

    public static StopICD10CMInferenceJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopICD10CMInferenceJobResultJsonUnmarshaller();
        return instance;
    }
}
