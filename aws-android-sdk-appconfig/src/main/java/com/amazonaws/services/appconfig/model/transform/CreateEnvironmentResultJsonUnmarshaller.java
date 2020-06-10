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
 * JSON unmarshaller for response CreateEnvironmentResult
 */
public class CreateEnvironmentResultJsonUnmarshaller implements
        Unmarshaller<CreateEnvironmentResult, JsonUnmarshallerContext> {

    public CreateEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateEnvironmentResult createEnvironmentResult = new CreateEnvironmentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                createEnvironmentResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                createEnvironmentResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createEnvironmentResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createEnvironmentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                createEnvironmentResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitors")) {
                createEnvironmentResult.setMonitors(new ListUnmarshaller<Monitor>(
                        MonitorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createEnvironmentResult;
    }

    private static CreateEnvironmentResultJsonUnmarshaller instance;

    public static CreateEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
