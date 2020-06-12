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
 * JSON unmarshaller for response UpdateIntegrationResult
 */
public class UpdateIntegrationResultJsonUnmarshaller implements
        Unmarshaller<UpdateIntegrationResult, JsonUnmarshallerContext> {

    public UpdateIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIntegrationResult updateIntegrationResult = new UpdateIntegrationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                updateIntegrationResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpMethod")) {
                updateIntegrationResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("uri")) {
                updateIntegrationResult.setUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionType")) {
                updateIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                updateIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("credentials")) {
                updateIntegrationResult.setCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                updateIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestTemplates")) {
                updateIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("passthroughBehavior")) {
                updateIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentHandling")) {
                updateIntegrationResult.setContentHandling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMillis")) {
                updateIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheNamespace")) {
                updateIntegrationResult.setCacheNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheKeyParameters")) {
                updateIntegrationResult.setCacheKeyParameters(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("integrationResponses")) {
                updateIntegrationResult
                        .setIntegrationResponses(new MapUnmarshaller<IntegrationResponse>(
                                IntegrationResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tlsConfig")) {
                updateIntegrationResult.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateIntegrationResult;
    }

    private static UpdateIntegrationResultJsonUnmarshaller instance;

    public static UpdateIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
