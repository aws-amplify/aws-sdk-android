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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO CommandInvocation
 */
class CommandInvocationJsonUnmarshaller implements Unmarshaller<CommandInvocation, JsonUnmarshallerContext> {

    public CommandInvocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CommandInvocation commandInvocation = new CommandInvocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CommandId")) {
                commandInvocation.setCommandId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceId")) {
                commandInvocation.setInstanceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceName")) {
                commandInvocation.setInstanceName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Comment")) {
                commandInvocation.setComment(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentName")) {
                commandInvocation.setDocumentName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                commandInvocation.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RequestedDateTime")) {
                commandInvocation.setRequestedDateTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                commandInvocation.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                commandInvocation.setStatusDetails(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TraceOutput")) {
                commandInvocation.setTraceOutput(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StandardOutputUrl")) {
                commandInvocation.setStandardOutputUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StandardErrorUrl")) {
                commandInvocation.setStandardErrorUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CommandPlugins")) {
                commandInvocation.setCommandPlugins(new ListUnmarshaller<CommandPlugin>(CommandPluginJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ServiceRole")) {
                commandInvocation.setServiceRole(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("NotificationConfig")) {
                commandInvocation.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CloudWatchOutputConfig")) {
                commandInvocation.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return commandInvocation;
    }

    private static CommandInvocationJsonUnmarshaller instance;
    public static CommandInvocationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CommandInvocationJsonUnmarshaller();
        return instance;
    }
}
