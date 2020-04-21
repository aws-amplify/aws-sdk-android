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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScriptBootstrapActionConfig
 */
class ScriptBootstrapActionConfigJsonMarshaller {

    public void marshall(ScriptBootstrapActionConfig scriptBootstrapActionConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scriptBootstrapActionConfig.getPath() != null) {
            String path = scriptBootstrapActionConfig.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (scriptBootstrapActionConfig.getArgs() != null) {
            java.util.List<String> args = scriptBootstrapActionConfig.getArgs();
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

    private static ScriptBootstrapActionConfigJsonMarshaller instance;

    public static ScriptBootstrapActionConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScriptBootstrapActionConfigJsonMarshaller();
        return instance;
    }
}
