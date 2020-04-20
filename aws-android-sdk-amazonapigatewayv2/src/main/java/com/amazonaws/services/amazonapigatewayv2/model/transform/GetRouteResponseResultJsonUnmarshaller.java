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
 * JSON unmarshaller for response GetRouteResponseResult
 */
public class GetRouteResponseResultJsonUnmarshaller implements
        Unmarshaller<GetRouteResponseResult, JsonUnmarshallerContext> {

    public GetRouteResponseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRouteResponseResult getRouteResponseResult = new GetRouteResponseResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ModelSelectionExpression")) {
                getRouteResponseResult.setModelSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResponseModels")) {
                getRouteResponseResult.setResponseModels(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResponseParameters")) {
                getRouteResponseResult
                        .setResponseParameters(new MapUnmarshaller<ParameterConstraints>(
                                ParameterConstraintsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RouteResponseId")) {
                getRouteResponseResult.setRouteResponseId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteResponseKey")) {
                getRouteResponseResult.setRouteResponseKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRouteResponseResult;
    }

    private static GetRouteResponseResultJsonUnmarshaller instance;

    public static GetRouteResponseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRouteResponseResultJsonUnmarshaller();
        return instance;
    }
}
