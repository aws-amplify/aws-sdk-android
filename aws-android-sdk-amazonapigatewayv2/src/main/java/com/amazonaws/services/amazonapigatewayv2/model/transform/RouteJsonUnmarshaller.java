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
 * JSON unmarshaller for POJO Route
 */
class RouteJsonUnmarshaller implements Unmarshaller<Route, JsonUnmarshallerContext> {

    public Route unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Route route = new Route();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiGatewayManaged")) {
                route.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiKeyRequired")) {
                route.setApiKeyRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthorizationScopes")) {
                route.setAuthorizationScopes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AuthorizationType")) {
                route.setAuthorizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthorizerId")) {
                route.setAuthorizerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelSelectionExpression")) {
                route.setModelSelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationName")) {
                route.setOperationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestModels")) {
                route.setRequestModels(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestParameters")) {
                route.setRequestParameters(new MapUnmarshaller<ParameterConstraints>(
                        ParameterConstraintsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RouteId")) {
                route.setRouteId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteKey")) {
                route.setRouteKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteResponseSelectionExpression")) {
                route.setRouteResponseSelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Target")) {
                route.setTarget(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return route;
    }

    private static RouteJsonUnmarshaller instance;

    public static RouteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteJsonUnmarshaller();
        return instance;
    }
}
