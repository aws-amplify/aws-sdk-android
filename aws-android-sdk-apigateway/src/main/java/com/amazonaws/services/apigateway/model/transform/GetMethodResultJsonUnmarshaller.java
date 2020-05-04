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
 * JSON unmarshaller for response GetMethodResult
 */
public class GetMethodResultJsonUnmarshaller implements
        Unmarshaller<GetMethodResult, JsonUnmarshallerContext> {

    public GetMethodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMethodResult getMethodResult = new GetMethodResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("httpMethod")) {
                getMethodResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationType")) {
                getMethodResult.setAuthorizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerId")) {
                getMethodResult.setAuthorizerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiKeyRequired")) {
                getMethodResult.setApiKeyRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestValidatorId")) {
                getMethodResult.setRequestValidatorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("operationName")) {
                getMethodResult.setOperationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                getMethodResult.setRequestParameters(new MapUnmarshaller<Boolean>(
                        BooleanJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestModels")) {
                getMethodResult.setRequestModels(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodResponses")) {
                getMethodResult.setMethodResponses(new MapUnmarshaller<MethodResponse>(
                        MethodResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodIntegration")) {
                getMethodResult.setMethodIntegration(IntegrationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationScopes")) {
                getMethodResult.setAuthorizationScopes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMethodResult;
    }

    private static GetMethodResultJsonUnmarshaller instance;

    public static GetMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMethodResultJsonUnmarshaller();
        return instance;
    }
}
