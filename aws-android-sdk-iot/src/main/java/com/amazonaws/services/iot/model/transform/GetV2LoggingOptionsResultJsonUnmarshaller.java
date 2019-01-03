/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetV2LoggingOptionsResult
 */
public class GetV2LoggingOptionsResultJsonUnmarshaller implements
        Unmarshaller<GetV2LoggingOptionsResult, JsonUnmarshallerContext> {

    public GetV2LoggingOptionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetV2LoggingOptionsResult getV2LoggingOptionsResult = new GetV2LoggingOptionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                getV2LoggingOptionsResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultLogLevel")) {
                getV2LoggingOptionsResult.setDefaultLogLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("disableAllLogs")) {
                getV2LoggingOptionsResult.setDisableAllLogs(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getV2LoggingOptionsResult;
    }

    private static GetV2LoggingOptionsResultJsonUnmarshaller instance;

    public static GetV2LoggingOptionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetV2LoggingOptionsResultJsonUnmarshaller();
        return instance;
    }
}
