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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LogSettingsRequest
 */
class LogSettingsRequestJsonMarshaller {

    public void marshall(LogSettingsRequest logSettingsRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (logSettingsRequest.getLogType() != null) {
            String logType = logSettingsRequest.getLogType();
            jsonWriter.name("logType");
            jsonWriter.value(logType);
        }
        if (logSettingsRequest.getDestination() != null) {
            String destination = logSettingsRequest.getDestination();
            jsonWriter.name("destination");
            jsonWriter.value(destination);
        }
        if (logSettingsRequest.getKmsKeyArn() != null) {
            String kmsKeyArn = logSettingsRequest.getKmsKeyArn();
            jsonWriter.name("kmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        if (logSettingsRequest.getResourceArn() != null) {
            String resourceArn = logSettingsRequest.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        jsonWriter.endObject();
    }

    private static LogSettingsRequestJsonMarshaller instance;

    public static LogSettingsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogSettingsRequestJsonMarshaller();
        return instance;
    }
}
