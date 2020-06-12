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
 * JSON unmarshaller for POJO Integration
 */
class IntegrationJsonUnmarshaller implements Unmarshaller<Integration, JsonUnmarshallerContext> {

    public Integration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Integration integration = new Integration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                integration.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpMethod")) {
                integration.setHttpMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("uri")) {
                integration.setUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionType")) {
                integration.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                integration.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("credentials")) {
                integration.setCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requestParameters")) {
                integration.setRequestParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestTemplates")) {
                integration.setRequestTemplates(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("passthroughBehavior")) {
                integration.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentHandling")) {
                integration.setContentHandling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutInMillis")) {
                integration.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheNamespace")) {
                integration.setCacheNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheKeyParameters")) {
                integration.setCacheKeyParameters(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("integrationResponses")) {
                integration.setIntegrationResponses(new MapUnmarshaller<IntegrationResponse>(
                        IntegrationResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tlsConfig")) {
                integration.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return integration;
    }

    private static IntegrationJsonUnmarshaller instance;

    public static IntegrationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationJsonUnmarshaller();
        return instance;
    }
}
