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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCommandInvocationResult
 */
public class GetCommandInvocationResultJsonUnmarshaller implements
        Unmarshaller<GetCommandInvocationResult, JsonUnmarshallerContext> {

    public GetCommandInvocationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCommandInvocationResult getCommandInvocationResult = new GetCommandInvocationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CommandId")) {
                getCommandInvocationResult.setCommandId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                getCommandInvocationResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Comment")) {
                getCommandInvocationResult.setComment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentName")) {
                getCommandInvocationResult.setDocumentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                getCommandInvocationResult.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PluginName")) {
                getCommandInvocationResult.setPluginName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResponseCode")) {
                getCommandInvocationResult.setResponseCode(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionStartDateTime")) {
                getCommandInvocationResult.setExecutionStartDateTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionElapsedTime")) {
                getCommandInvocationResult.setExecutionElapsedTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionEndDateTime")) {
                getCommandInvocationResult.setExecutionEndDateTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getCommandInvocationResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                getCommandInvocationResult.setStatusDetails(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardOutputContent")) {
                getCommandInvocationResult.setStandardOutputContent(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardOutputUrl")) {
                getCommandInvocationResult.setStandardOutputUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardErrorContent")) {
                getCommandInvocationResult.setStandardErrorContent(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardErrorUrl")) {
                getCommandInvocationResult.setStandardErrorUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudWatchOutputConfig")) {
                getCommandInvocationResult
                        .setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCommandInvocationResult;
    }

    private static GetCommandInvocationResultJsonUnmarshaller instance;

    public static GetCommandInvocationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCommandInvocationResultJsonUnmarshaller();
        return instance;
    }
}
