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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetRouteResult
 */
public class GetRouteResultJsonUnmarshaller implements
        Unmarshaller<GetRouteResult, JsonUnmarshallerContext> {

    public GetRouteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRouteResult getRouteResult = new GetRouteResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiGatewayManaged")) {
                getRouteResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiKeyRequired")) {
                getRouteResult.setApiKeyRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthorizationScopes")) {
                getRouteResult.setAuthorizationScopes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AuthorizationType")) {
                getRouteResult.setAuthorizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthorizerId")) {
                getRouteResult.setAuthorizerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelSelectionExpression")) {
                getRouteResult.setModelSelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationName")) {
                getRouteResult.setOperationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestModels")) {
                getRouteResult.setRequestModels(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestParameters")) {
                getRouteResult.setRequestParameters(new MapUnmarshaller<ParameterConstraints>(
                        ParameterConstraintsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RouteId")) {
                getRouteResult.setRouteId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteKey")) {
                getRouteResult.setRouteKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteResponseSelectionExpression")) {
                getRouteResult.setRouteResponseSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Target")) {
                getRouteResult.setTarget(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRouteResult;
    }

    private static GetRouteResultJsonUnmarshaller instance;

    public static GetRouteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRouteResultJsonUnmarshaller();
        return instance;
    }
}
