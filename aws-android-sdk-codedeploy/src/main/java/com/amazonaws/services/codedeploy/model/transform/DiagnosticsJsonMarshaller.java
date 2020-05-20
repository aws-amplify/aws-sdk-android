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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Diagnostics
 */
class DiagnosticsJsonMarshaller {

    public void marshall(Diagnostics diagnostics, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (diagnostics.getErrorCode() != null) {
            String errorCode = diagnostics.getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (diagnostics.getScriptName() != null) {
            String scriptName = diagnostics.getScriptName();
            jsonWriter.name("scriptName");
            jsonWriter.value(scriptName);
        }
        if (diagnostics.getMessage() != null) {
            String message = diagnostics.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (diagnostics.getLogTail() != null) {
            String logTail = diagnostics.getLogTail();
            jsonWriter.name("logTail");
            jsonWriter.value(logTail);
        }
        jsonWriter.endObject();
    }

    private static DiagnosticsJsonMarshaller instance;

    public static DiagnosticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiagnosticsJsonMarshaller();
        return instance;
    }
}
