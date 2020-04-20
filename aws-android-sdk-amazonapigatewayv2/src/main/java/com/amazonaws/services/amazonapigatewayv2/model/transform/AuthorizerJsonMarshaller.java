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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Authorizer
 */
class AuthorizerJsonMarshaller {

    public void marshall(Authorizer authorizer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authorizer.getAuthorizerCredentialsArn() != null) {
            String authorizerCredentialsArn = authorizer.getAuthorizerCredentialsArn();
            jsonWriter.name("AuthorizerCredentialsArn");
            jsonWriter.value(authorizerCredentialsArn);
        }
        if (authorizer.getAuthorizerId() != null) {
            String authorizerId = authorizer.getAuthorizerId();
            jsonWriter.name("AuthorizerId");
            jsonWriter.value(authorizerId);
        }
        if (authorizer.getAuthorizerResultTtlInSeconds() != null) {
            Integer authorizerResultTtlInSeconds = authorizer.getAuthorizerResultTtlInSeconds();
            jsonWriter.name("AuthorizerResultTtlInSeconds");
            jsonWriter.value(authorizerResultTtlInSeconds);
        }
        if (authorizer.getAuthorizerType() != null) {
            String authorizerType = authorizer.getAuthorizerType();
            jsonWriter.name("AuthorizerType");
            jsonWriter.value(authorizerType);
        }
        if (authorizer.getAuthorizerUri() != null) {
            String authorizerUri = authorizer.getAuthorizerUri();
            jsonWriter.name("AuthorizerUri");
            jsonWriter.value(authorizerUri);
        }
        if (authorizer.getIdentitySource() != null) {
            java.util.List<String> identitySource = authorizer.getIdentitySource();
            jsonWriter.name("IdentitySource");
            jsonWriter.beginArray();
            for (String identitySourceItem : identitySource) {
                if (identitySourceItem != null) {
                    jsonWriter.value(identitySourceItem);
                }
            }
            jsonWriter.endArray();
        }
        if (authorizer.getIdentityValidationExpression() != null) {
            String identityValidationExpression = authorizer.getIdentityValidationExpression();
            jsonWriter.name("IdentityValidationExpression");
            jsonWriter.value(identityValidationExpression);
        }
        if (authorizer.getJwtConfiguration() != null) {
            JWTConfiguration jwtConfiguration = authorizer.getJwtConfiguration();
            jsonWriter.name("JwtConfiguration");
            JWTConfigurationJsonMarshaller.getInstance().marshall(jwtConfiguration, jsonWriter);
        }
        if (authorizer.getName() != null) {
            String name = authorizer.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static AuthorizerJsonMarshaller instance;

    public static AuthorizerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerJsonMarshaller();
        return instance;
    }
}
