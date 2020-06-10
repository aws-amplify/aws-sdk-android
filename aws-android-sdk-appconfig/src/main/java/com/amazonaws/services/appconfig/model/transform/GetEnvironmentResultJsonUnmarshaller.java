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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetEnvironmentResult
 */
public class GetEnvironmentResultJsonUnmarshaller implements
        Unmarshaller<GetEnvironmentResult, JsonUnmarshallerContext> {

    public GetEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnvironmentResult getEnvironmentResult = new GetEnvironmentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                getEnvironmentResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                getEnvironmentResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getEnvironmentResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getEnvironmentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                getEnvironmentResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitors")) {
                getEnvironmentResult.setMonitors(new ListUnmarshaller<Monitor>(
                        MonitorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getEnvironmentResult;
    }

    private static GetEnvironmentResultJsonUnmarshaller instance;

    public static GetEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
