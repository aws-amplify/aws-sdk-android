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
 * JSON unmarshaller for response GetAuthorizerResult
 */
public class GetAuthorizerResultJsonUnmarshaller implements
        Unmarshaller<GetAuthorizerResult, JsonUnmarshallerContext> {

    public GetAuthorizerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAuthorizerResult getAuthorizerResult = new GetAuthorizerResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                getAuthorizerResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                getAuthorizerResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                getAuthorizerResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("providerARNs")) {
                getAuthorizerResult.setProviderARNs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("authType")) {
                getAuthorizerResult.setAuthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerUri")) {
                getAuthorizerResult.setAuthorizerUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerCredentials")) {
                getAuthorizerResult.setAuthorizerCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("identitySource")) {
                getAuthorizerResult.setIdentitySource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("identityValidationExpression")) {
                getAuthorizerResult.setIdentityValidationExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerResultTtlInSeconds")) {
                getAuthorizerResult.setAuthorizerResultTtlInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getAuthorizerResult;
    }

    private static GetAuthorizerResultJsonUnmarshaller instance;

    public static GetAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
