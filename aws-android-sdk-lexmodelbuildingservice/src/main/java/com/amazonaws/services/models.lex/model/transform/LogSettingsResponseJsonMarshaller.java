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
 * JSON marshaller for POJO LogSettingsResponse
 */
class LogSettingsResponseJsonMarshaller {

    public void marshall(LogSettingsResponse logSettingsResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (logSettingsResponse.getLogType() != null) {
            String logType = logSettingsResponse.getLogType();
            jsonWriter.name("logType");
            jsonWriter.value(logType);
        }
        if (logSettingsResponse.getDestination() != null) {
            String destination = logSettingsResponse.getDestination();
            jsonWriter.name("destination");
            jsonWriter.value(destination);
        }
        if (logSettingsResponse.getKmsKeyArn() != null) {
            String kmsKeyArn = logSettingsResponse.getKmsKeyArn();
            jsonWriter.name("kmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        if (logSettingsResponse.getResourceArn() != null) {
            String resourceArn = logSettingsResponse.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        if (logSettingsResponse.getResourcePrefix() != null) {
            String resourcePrefix = logSettingsResponse.getResourcePrefix();
            jsonWriter.name("resourcePrefix");
            jsonWriter.value(resourcePrefix);
        }
        jsonWriter.endObject();
    }

    private static LogSettingsResponseJsonMarshaller instance;

    public static LogSettingsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogSettingsResponseJsonMarshaller();
        return instance;
    }
}
