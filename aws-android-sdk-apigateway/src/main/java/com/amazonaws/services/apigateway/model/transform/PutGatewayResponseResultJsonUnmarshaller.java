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
 * JSON unmarshaller for response PutGatewayResponseResult
 */
public class PutGatewayResponseResultJsonUnmarshaller implements
        Unmarshaller<PutGatewayResponseResult, JsonUnmarshallerContext> {

    public PutGatewayResponseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutGatewayResponseResult putGatewayResponseResult = new PutGatewayResponseResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("responseType")) {
                putGatewayResponseResult.setResponseType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusCode")) {
                putGatewayResponseResult.setStatusCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("responseParameters")) {
                putGatewayResponseResult.setResponseParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("responseTemplates")) {
                putGatewayResponseResult.setResponseTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("defaultResponse")) {
                putGatewayResponseResult.setDefaultResponse(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putGatewayResponseResult;
    }

    private static PutGatewayResponseResultJsonUnmarshaller instance;

    public static PutGatewayResponseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutGatewayResponseResultJsonUnmarshaller();
        return instance;
    }
}
