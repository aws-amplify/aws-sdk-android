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
            if (name.equals("ApiGatewayManaged")) {
                updateIntegrationResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionId")) {
                updateIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionType")) {
                updateIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentHandlingStrategy")) {
                updateIntegrationResult.setContentHandlingStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CredentialsArn")) {
                updateIntegrationResult.setCredentialsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateIntegrationResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationId")) {
                updateIntegrationResult.setIntegrationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationMethod")) {
                updateIntegrationResult.setIntegrationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationResponseSelectionExpression")) {
                updateIntegrationResult
                        .setIntegrationResponseSelectionExpression(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("IntegrationType")) {
                updateIntegrationResult.setIntegrationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationUri")) {
                updateIntegrationResult.setIntegrationUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PassthroughBehavior")) {
                updateIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PayloadFormatVersion")) {
                updateIntegrationResult.setPayloadFormatVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestParameters")) {
                updateIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestTemplates")) {
                updateIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TemplateSelectionExpression")) {
                updateIntegrationResult.setTemplateSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeoutInMillis")) {
                updateIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TlsConfig")) {
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
