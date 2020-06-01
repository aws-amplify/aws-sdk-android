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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CompletionReport
 */
class CompletionReportJsonMarshaller {

    public void marshall(CompletionReport completionReport, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (completionReport.getEnabled() != null) {
            Boolean enabled = completionReport.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (completionReport.getPath() != null) {
            String path = completionReport.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (completionReport.getFormat() != null) {
            String format = completionReport.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (completionReport.getScope() != null) {
            String scope = completionReport.getScope();
            jsonWriter.name("Scope");
            jsonWriter.value(scope);
        }
        jsonWriter.endObject();
    }

    private static CompletionReportJsonMarshaller instance;

    public static CompletionReportJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompletionReportJsonMarshaller();
        return instance;
    }
}
