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
 * JSON unmarshaller for POJO CommandPlugin
 */
class CommandPluginJsonUnmarshaller implements Unmarshaller<CommandPlugin, JsonUnmarshallerContext> {

    public CommandPlugin unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CommandPlugin commandPlugin = new CommandPlugin();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                commandPlugin.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                commandPlugin.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                commandPlugin.setStatusDetails(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResponseCode")) {
                commandPlugin.setResponseCode(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResponseStartDateTime")) {
                commandPlugin.setResponseStartDateTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResponseFinishDateTime")) {
                commandPlugin.setResponseFinishDateTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Output")) {
                commandPlugin.setOutput(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StandardOutputUrl")) {
                commandPlugin.setStandardOutputUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StandardErrorUrl")) {
                commandPlugin.setStandardErrorUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3Region")) {
                commandPlugin.setOutputS3Region(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3BucketName")) {
                commandPlugin.setOutputS3BucketName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3KeyPrefix")) {
                commandPlugin.setOutputS3KeyPrefix(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return commandPlugin;
    }

    private static CommandPluginJsonUnmarshaller instance;
    public static CommandPluginJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CommandPluginJsonUnmarshaller();
        return instance;
    }
}
