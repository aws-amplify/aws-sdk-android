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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobCommand
 */
class JobCommandJsonMarshaller {

    public void marshall(JobCommand jobCommand, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobCommand.getName() != null) {
            String name = jobCommand.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (jobCommand.getScriptLocation() != null) {
            String scriptLocation = jobCommand.getScriptLocation();
            jsonWriter.name("ScriptLocation");
            jsonWriter.value(scriptLocation);
        }
        if (jobCommand.getPythonVersion() != null) {
            String pythonVersion = jobCommand.getPythonVersion();
            jsonWriter.name("PythonVersion");
            jsonWriter.value(pythonVersion);
        }
        jsonWriter.endObject();
    }

    private static JobCommandJsonMarshaller instance;

    public static JobCommandJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobCommandJsonMarshaller();
        return instance;
    }
}
