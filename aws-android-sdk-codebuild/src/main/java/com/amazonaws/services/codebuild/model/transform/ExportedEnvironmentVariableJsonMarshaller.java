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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExportedEnvironmentVariable
 */
class ExportedEnvironmentVariableJsonMarshaller {

    public void marshall(ExportedEnvironmentVariable exportedEnvironmentVariable,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportedEnvironmentVariable.getName() != null) {
            String name = exportedEnvironmentVariable.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (exportedEnvironmentVariable.getValue() != null) {
            String value = exportedEnvironmentVariable.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static ExportedEnvironmentVariableJsonMarshaller instance;

    public static ExportedEnvironmentVariableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportedEnvironmentVariableJsonMarshaller();
        return instance;
    }
}
