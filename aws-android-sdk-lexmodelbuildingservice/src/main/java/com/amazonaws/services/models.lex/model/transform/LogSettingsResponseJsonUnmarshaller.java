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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LogSettingsResponse
 */
class LogSettingsResponseJsonUnmarshaller implements
        Unmarshaller<LogSettingsResponse, JsonUnmarshallerContext> {

    public LogSettingsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LogSettingsResponse logSettingsResponse = new LogSettingsResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("logType")) {
                logSettingsResponse.setLogType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destination")) {
                logSettingsResponse.setDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kmsKeyArn")) {
                logSettingsResponse.setKmsKeyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceArn")) {
                logSettingsResponse.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourcePrefix")) {
                logSettingsResponse.setResourcePrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return logSettingsResponse;
    }

    private static LogSettingsResponseJsonUnmarshaller instance;

    public static LogSettingsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogSettingsResponseJsonUnmarshaller();
        return instance;
    }
}
