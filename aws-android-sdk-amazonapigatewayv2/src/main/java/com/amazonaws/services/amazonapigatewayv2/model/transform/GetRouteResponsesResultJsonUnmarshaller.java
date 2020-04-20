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
 * JSON unmarshaller for response GetRouteResponsesResult
 */
public class GetRouteResponsesResultJsonUnmarshaller implements
        Unmarshaller<GetRouteResponsesResult, JsonUnmarshallerContext> {

    public GetRouteResponsesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRouteResponsesResult getRouteResponsesResult = new GetRouteResponsesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Items")) {
                getRouteResponsesResult.setItems(new ListUnmarshaller<RouteResponse>(
                        RouteResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getRouteResponsesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRouteResponsesResult;
    }

    private static GetRouteResponsesResultJsonUnmarshaller instance;

    public static GetRouteResponsesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRouteResponsesResultJsonUnmarshaller();
        return instance;
    }
}
