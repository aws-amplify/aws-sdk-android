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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Authorizer
 */
class AuthorizerJsonMarshaller {

    public void marshall(Authorizer authorizer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authorizer.getId() != null) {
            String id = authorizer.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (authorizer.getName() != null) {
            String name = authorizer.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (authorizer.getType() != null) {
            String type = authorizer.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (authorizer.getProviderARNs() != null) {
            java.util.List<String> providerARNs = authorizer.getProviderARNs();
            jsonWriter.name("providerARNs");
            jsonWriter.beginArray();
            for (String providerARNsItem : providerARNs) {
                if (providerARNsItem != null) {
                    jsonWriter.value(providerARNsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (authorizer.getAuthType() != null) {
            String authType = authorizer.getAuthType();
            jsonWriter.name("authType");
            jsonWriter.value(authType);
        }
        if (authorizer.getAuthorizerUri() != null) {
            String authorizerUri = authorizer.getAuthorizerUri();
            jsonWriter.name("authorizerUri");
            jsonWriter.value(authorizerUri);
        }
        if (authorizer.getAuthorizerCredentials() != null) {
            String authorizerCredentials = authorizer.getAuthorizerCredentials();
            jsonWriter.name("authorizerCredentials");
            jsonWriter.value(authorizerCredentials);
        }
        if (authorizer.getIdentitySource() != null) {
            String identitySource = authorizer.getIdentitySource();
            jsonWriter.name("identitySource");
            jsonWriter.value(identitySource);
        }
        if (authorizer.getIdentityValidationExpression() != null) {
            String identityValidationExpression = authorizer.getIdentityValidationExpression();
            jsonWriter.name("identityValidationExpression");
            jsonWriter.value(identityValidationExpression);
        }
        if (authorizer.getAuthorizerResultTtlInSeconds() != null) {
            Integer authorizerResultTtlInSeconds = authorizer.getAuthorizerResultTtlInSeconds();
            jsonWriter.name("authorizerResultTtlInSeconds");
            jsonWriter.value(authorizerResultTtlInSeconds);
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
