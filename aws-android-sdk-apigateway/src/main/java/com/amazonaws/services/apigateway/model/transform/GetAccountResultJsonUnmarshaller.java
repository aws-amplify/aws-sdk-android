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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetAccountResult
 */
public class GetAccountResultJsonUnmarshaller implements
        Unmarshaller<GetAccountResult, JsonUnmarshallerContext> {

    public GetAccountResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAccountResult getAccountResult = new GetAccountResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("cloudwatchRoleArn")) {
                getAccountResult.setCloudwatchRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("throttleSettings")) {
                getAccountResult.setThrottleSettings(ThrottleSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("features")) {
                getAccountResult.setFeatures(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("apiKeyVersion")) {
                getAccountResult.setApiKeyVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getAccountResult;
    }

    private static GetAccountResultJsonUnmarshaller instance;

    public static GetAccountResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccountResultJsonUnmarshaller();
        return instance;
    }
}
