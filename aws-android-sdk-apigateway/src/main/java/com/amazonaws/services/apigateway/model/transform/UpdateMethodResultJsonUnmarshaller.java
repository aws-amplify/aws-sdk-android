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
 * JSON unmarshaller for response UpdateMethodResult
 */
public class UpdateMethodResultJsonUnmarshaller implements
        Unmarshaller<UpdateMethodResult, JsonUnmarshallerContext> {

    public UpdateMethodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateMethodResult updateMethodResult = new UpdateMethodResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("httpMethod")) {
                updateMethodResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationType")) {
                updateMethodResult.setAuthorizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerId")) {
                updateMethodResult.setAuthorizerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiKeyRequired")) {
                updateMethodResult.setApiKeyRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestValidatorId")) {
                updateMethodResult.setRequestValidatorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("operationName")) {
                updateMethodResult.setOperationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                updateMethodResult.setRequestParameters(new MapUnmarshaller<Boolean>(
                        BooleanJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestModels")) {
                updateMethodResult.setRequestModels(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodResponses")) {
                updateMethodResult.setMethodResponses(new MapUnmarshaller<MethodResponse>(
                        MethodResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodIntegration")) {
                updateMethodResult.setMethodIntegration(IntegrationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationScopes")) {
                updateMethodResult.setAuthorizationScopes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateMethodResult;
    }

    private static UpdateMethodResultJsonUnmarshaller instance;

    public static UpdateMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMethodResultJsonUnmarshaller();
        return instance;
    }
}
