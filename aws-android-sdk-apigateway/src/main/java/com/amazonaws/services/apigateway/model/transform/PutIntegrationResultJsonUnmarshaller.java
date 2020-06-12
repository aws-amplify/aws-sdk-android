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
 * JSON unmarshaller for response PutIntegrationResult
 */
public class PutIntegrationResultJsonUnmarshaller implements
        Unmarshaller<PutIntegrationResult, JsonUnmarshallerContext> {

    public PutIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutIntegrationResult putIntegrationResult = new PutIntegrationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                putIntegrationResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpMethod")) {
                putIntegrationResult.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("uri")) {
                putIntegrationResult.setUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionType")) {
                putIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                putIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("credentials")) {
                putIntegrationResult.setCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                putIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestTemplates")) {
                putIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("passthroughBehavior")) {
                putIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentHandling")) {
                putIntegrationResult.setContentHandling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMillis")) {
                putIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheNamespace")) {
                putIntegrationResult.setCacheNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheKeyParameters")) {
                putIntegrationResult.setCacheKeyParameters(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("integrationResponses")) {
                putIntegrationResult
                        .setIntegrationResponses(new MapUnmarshaller<IntegrationResponse>(
                                IntegrationResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tlsConfig")) {
                putIntegrationResult.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putIntegrationResult;
    }

    private static PutIntegrationResultJsonUnmarshaller instance;

    public static PutIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
