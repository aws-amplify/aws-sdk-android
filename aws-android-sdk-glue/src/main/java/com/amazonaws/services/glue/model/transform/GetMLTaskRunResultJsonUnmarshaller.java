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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetMLTaskRunResult
 */
public class GetMLTaskRunResultJsonUnmarshaller implements
        Unmarshaller<GetMLTaskRunResult, JsonUnmarshallerContext> {

    public GetMLTaskRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLTaskRunResult getMLTaskRunResult = new GetMLTaskRunResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransformId")) {
                getMLTaskRunResult.setTransformId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskRunId")) {
                getMLTaskRunResult.setTaskRunId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getMLTaskRunResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogGroupName")) {
                getMLTaskRunResult.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Properties")) {
                getMLTaskRunResult.setProperties(TaskRunPropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorString")) {
                getMLTaskRunResult.setErrorString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedOn")) {
                getMLTaskRunResult.setStartedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedOn")) {
                getMLTaskRunResult.setLastModifiedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedOn")) {
                getMLTaskRunResult.setCompletedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionTime")) {
                getMLTaskRunResult.setExecutionTime(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMLTaskRunResult;
    }

    private static GetMLTaskRunResultJsonUnmarshaller instance;

    public static GetMLTaskRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLTaskRunResultJsonUnmarshaller();
        return instance;
    }
}
