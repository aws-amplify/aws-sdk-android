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
 * JSON unmarshaller for response UpdateRouteResponseResult
 */
public class UpdateRouteResponseResultJsonUnmarshaller implements
        Unmarshaller<UpdateRouteResponseResult, JsonUnmarshallerContext> {

    public UpdateRouteResponseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRouteResponseResult updateRouteResponseResult = new UpdateRouteResponseResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ModelSelectionExpression")) {
                updateRouteResponseResult.setModelSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResponseModels")) {
                updateRouteResponseResult.setResponseModels(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResponseParameters")) {
                updateRouteResponseResult
                        .setResponseParameters(new MapUnmarshaller<ParameterConstraints>(
                                ParameterConstraintsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RouteResponseId")) {
                updateRouteResponseResult.setRouteResponseId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteResponseKey")) {
                updateRouteResponseResult.setRouteResponseKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateRouteResponseResult;
    }

    private static UpdateRouteResponseResultJsonUnmarshaller instance;

    public static UpdateRouteResponseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRouteResponseResultJsonUnmarshaller();
        return instance;
    }
}
