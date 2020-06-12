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
 * JSON unmarshaller for POJO IntegrationResponse
 */
class IntegrationResponseJsonUnmarshaller implements
        Unmarshaller<IntegrationResponse, JsonUnmarshallerContext> {

    public IntegrationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IntegrationResponse integrationResponse = new IntegrationResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("statusCode")) {
                integrationResponse.setStatusCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("selectionPattern")) {
                integrationResponse.setSelectionPattern(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("responseParameters")) {
                integrationResponse.setResponseParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("responseTemplates")) {
                integrationResponse.setResponseTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("contentHandling")) {
                integrationResponse.setContentHandling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return integrationResponse;
    }

    private static IntegrationResponseJsonUnmarshaller instance;

    public static IntegrationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationResponseJsonUnmarshaller();
        return instance;
    }
}
