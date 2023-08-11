/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetTrafficDistributionResult
 */
public class GetTrafficDistributionResultJsonUnmarshaller implements
        Unmarshaller<GetTrafficDistributionResult, JsonUnmarshallerContext> {

    public GetTrafficDistributionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetTrafficDistributionResult getTrafficDistributionResult = new GetTrafficDistributionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TelephonyConfig")) {
                getTrafficDistributionResult.setTelephonyConfig(TelephonyConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                getTrafficDistributionResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                getTrafficDistributionResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SignInConfig")) {
                getTrafficDistributionResult.setSignInConfig(SignInConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AgentConfig")) {
                getTrafficDistributionResult.setAgentConfig(AgentConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getTrafficDistributionResult;
    }

    private static GetTrafficDistributionResultJsonUnmarshaller instance;

    public static GetTrafficDistributionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTrafficDistributionResultJsonUnmarshaller();
        return instance;
    }
}
