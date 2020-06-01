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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Command
 */
class CommandJsonMarshaller {

    public void marshall(Command command, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (command.getName() != null) {
            String name = command.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (command.getScriptPath() != null) {
            String scriptPath = command.getScriptPath();
            jsonWriter.name("ScriptPath");
            jsonWriter.value(scriptPath);
        }
        if (command.getArgs() != null) {
            java.util.List<String> args = command.getArgs();
            jsonWriter.name("Args");
            jsonWriter.beginArray();
            for (String argsItem : args) {
                if (argsItem != null) {
                    jsonWriter.value(argsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CommandJsonMarshaller instance;

    public static CommandJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonMarshaller();
        return instance;
    }
}
