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
 * JSON unmarshaller for response GetIntegrationResult
 */
public class GetIntegrationResultJsonUnmarshaller implements
        Unmarshaller<GetIntegrationResult, JsonUnmarshallerContext> {

    public GetIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIntegrationResult getIntegrationResult = new GetIntegrationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                getIntegrationResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpMethod")) {
                getIntegrationResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("uri")) {
                getIntegrationResult.setUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionType")) {
                getIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                getIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("credentials")) {
                getIntegrationResult.setCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                getIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestTemplates")) {
                getIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("passthroughBehavior")) {
                getIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentHandling")) {
                getIntegrationResult.setContentHandling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMillis")) {
                getIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheNamespace")) {
                getIntegrationResult.setCacheNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheKeyParameters")) {
                getIntegrationResult.setCacheKeyParameters(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("integrationResponses")) {
                getIntegrationResult
                        .setIntegrationResponses(new MapUnmarshaller<IntegrationResponse>(
                                IntegrationResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getIntegrationResult;
    }

    private static GetIntegrationResultJsonUnmarshaller instance;

    public static GetIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
