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
 * JSON unmarshaller for response PutMethodResult
 */
public class PutMethodResultJsonUnmarshaller implements
        Unmarshaller<PutMethodResult, JsonUnmarshallerContext> {

    public PutMethodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutMethodResult putMethodResult = new PutMethodResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("httpMethod")) {
                putMethodResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationType")) {
                putMethodResult.setAuthorizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerId")) {
                putMethodResult.setAuthorizerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiKeyRequired")) {
                putMethodResult.setApiKeyRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestValidatorId")) {
                putMethodResult.setRequestValidatorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("operationName")) {
                putMethodResult.setOperationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                putMethodResult.setRequestParameters(new MapUnmarshaller<Boolean>(
                        BooleanJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestModels")) {
                putMethodResult.setRequestModels(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodResponses")) {
                putMethodResult.setMethodResponses(new MapUnmarshaller<MethodResponse>(
                        MethodResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("methodIntegration")) {
                putMethodResult.setMethodIntegration(IntegrationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizationScopes")) {
                putMethodResult.setAuthorizationScopes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putMethodResult;
    }

    private static PutMethodResultJsonUnmarshaller instance;

    public static PutMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutMethodResultJsonUnmarshaller();
        return instance;
    }
}
