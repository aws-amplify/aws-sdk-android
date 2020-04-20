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
 * JSON unmarshaller for response CreateIntegrationResult
 */
public class CreateIntegrationResultJsonUnmarshaller implements
        Unmarshaller<CreateIntegrationResult, JsonUnmarshallerContext> {

    public CreateIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntegrationResult createIntegrationResult = new CreateIntegrationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiGatewayManaged")) {
                createIntegrationResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionId")) {
                createIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionType")) {
                createIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentHandlingStrategy")) {
                createIntegrationResult.setContentHandlingStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CredentialsArn")) {
                createIntegrationResult.setCredentialsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createIntegrationResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationId")) {
                createIntegrationResult.setIntegrationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationMethod")) {
                createIntegrationResult.setIntegrationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationResponseSelectionExpression")) {
                createIntegrationResult
                        .setIntegrationResponseSelectionExpression(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("IntegrationType")) {
                createIntegrationResult.setIntegrationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationUri")) {
                createIntegrationResult.setIntegrationUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PassthroughBehavior")) {
                createIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PayloadFormatVersion")) {
                createIntegrationResult.setPayloadFormatVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestParameters")) {
                createIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestTemplates")) {
                createIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TemplateSelectionExpression")) {
                createIntegrationResult.setTemplateSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeoutInMillis")) {
                createIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TlsConfig")) {
                createIntegrationResult.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createIntegrationResult;
    }

    private static CreateIntegrationResultJsonUnmarshaller instance;

    public static CreateIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
