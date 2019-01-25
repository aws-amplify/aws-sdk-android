/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserPoolClientType
 */
class UserPoolClientTypeJsonUnmarshaller implements
        Unmarshaller<UserPoolClientType, JsonUnmarshallerContext> {

    public UserPoolClientType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserPoolClientType userPoolClientType = new UserPoolClientType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPoolId")) {
                userPoolClientType.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientName")) {
                userPoolClientType.setClientName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientId")) {
                userPoolClientType.setClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientSecret")) {
                userPoolClientType.setClientSecret(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                userPoolClientType.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                userPoolClientType.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RefreshTokenValidity")) {
                userPoolClientType.setRefreshTokenValidity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReadAttributes")) {
                userPoolClientType.setReadAttributes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WriteAttributes")) {
                userPoolClientType.setWriteAttributes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExplicitAuthFlows")) {
                userPoolClientType.setExplicitAuthFlows(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedIdentityProviders")) {
                userPoolClientType.setSupportedIdentityProviders(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CallbackURLs")) {
                userPoolClientType.setCallbackURLs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LogoutURLs")) {
                userPoolClientType.setLogoutURLs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DefaultRedirectURI")) {
                userPoolClientType.setDefaultRedirectURI(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowedOAuthFlows")) {
                userPoolClientType.setAllowedOAuthFlows(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AllowedOAuthScopes")) {
                userPoolClientType.setAllowedOAuthScopes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AllowedOAuthFlowsUserPoolClient")) {
                userPoolClientType.setAllowedOAuthFlowsUserPoolClient(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AnalyticsConfiguration")) {
                userPoolClientType
                        .setAnalyticsConfiguration(AnalyticsConfigurationTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userPoolClientType;
    }

    private static UserPoolClientTypeJsonUnmarshaller instance;

    public static UserPoolClientTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientTypeJsonUnmarshaller();
        return instance;
    }
}
