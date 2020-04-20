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
            if (name.equals("ApiGatewayManaged")) {
                getIntegrationResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionId")) {
                getIntegrationResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionType")) {
                getIntegrationResult.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentHandlingStrategy")) {
                getIntegrationResult.setContentHandlingStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CredentialsArn")) {
                getIntegrationResult.setCredentialsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getIntegrationResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationId")) {
                getIntegrationResult.setIntegrationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationMethod")) {
                getIntegrationResult.setIntegrationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationResponseSelectionExpression")) {
                getIntegrationResult
                        .setIntegrationResponseSelectionExpression(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("IntegrationType")) {
                getIntegrationResult.setIntegrationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationUri")) {
                getIntegrationResult.setIntegrationUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PassthroughBehavior")) {
                getIntegrationResult.setPassthroughBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PayloadFormatVersion")) {
                getIntegrationResult.setPayloadFormatVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestParameters")) {
                getIntegrationResult.setRequestParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestTemplates")) {
                getIntegrationResult.setRequestTemplates(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TemplateSelectionExpression")) {
                getIntegrationResult.setTemplateSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeoutInMillis")) {
                getIntegrationResult.setTimeoutInMillis(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TlsConfig")) {
                getIntegrationResult.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance()
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
