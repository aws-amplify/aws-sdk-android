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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserPoolClientType
 */
class UserPoolClientTypeJsonMarshaller {

    public void marshall(UserPoolClientType userPoolClientType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userPoolClientType.getUserPoolId() != null) {
            String userPoolId = userPoolClientType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (userPoolClientType.getClientName() != null) {
            String clientName = userPoolClientType.getClientName();
            jsonWriter.name("ClientName");
            jsonWriter.value(clientName);
        }
        if (userPoolClientType.getClientId() != null) {
            String clientId = userPoolClientType.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (userPoolClientType.getClientSecret() != null) {
            String clientSecret = userPoolClientType.getClientSecret();
            jsonWriter.name("ClientSecret");
            jsonWriter.value(clientSecret);
        }
        if (userPoolClientType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = userPoolClientType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (userPoolClientType.getCreationDate() != null) {
            java.util.Date creationDate = userPoolClientType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (userPoolClientType.getRefreshTokenValidity() != null) {
            Integer refreshTokenValidity = userPoolClientType.getRefreshTokenValidity();
            jsonWriter.name("RefreshTokenValidity");
            jsonWriter.value(refreshTokenValidity);
        }
        if (userPoolClientType.getReadAttributes() != null) {
            java.util.List<String> readAttributes = userPoolClientType.getReadAttributes();
            jsonWriter.name("ReadAttributes");
            jsonWriter.beginArray();
            for (String readAttributesItem : readAttributes) {
                if (readAttributesItem != null) {
                    jsonWriter.value(readAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getWriteAttributes() != null) {
            java.util.List<String> writeAttributes = userPoolClientType.getWriteAttributes();
            jsonWriter.name("WriteAttributes");
            jsonWriter.beginArray();
            for (String writeAttributesItem : writeAttributes) {
                if (writeAttributesItem != null) {
                    jsonWriter.value(writeAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getExplicitAuthFlows() != null) {
            java.util.List<String> explicitAuthFlows = userPoolClientType.getExplicitAuthFlows();
            jsonWriter.name("ExplicitAuthFlows");
            jsonWriter.beginArray();
            for (String explicitAuthFlowsItem : explicitAuthFlows) {
                if (explicitAuthFlowsItem != null) {
                    jsonWriter.value(explicitAuthFlowsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getSupportedIdentityProviders() != null) {
            java.util.List<String> supportedIdentityProviders = userPoolClientType
                    .getSupportedIdentityProviders();
            jsonWriter.name("SupportedIdentityProviders");
            jsonWriter.beginArray();
            for (String supportedIdentityProvidersItem : supportedIdentityProviders) {
                if (supportedIdentityProvidersItem != null) {
                    jsonWriter.value(supportedIdentityProvidersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getCallbackURLs() != null) {
            java.util.List<String> callbackURLs = userPoolClientType.getCallbackURLs();
            jsonWriter.name("CallbackURLs");
            jsonWriter.beginArray();
            for (String callbackURLsItem : callbackURLs) {
                if (callbackURLsItem != null) {
                    jsonWriter.value(callbackURLsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getLogoutURLs() != null) {
            java.util.List<String> logoutURLs = userPoolClientType.getLogoutURLs();
            jsonWriter.name("LogoutURLs");
            jsonWriter.beginArray();
            for (String logoutURLsItem : logoutURLs) {
                if (logoutURLsItem != null) {
                    jsonWriter.value(logoutURLsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getDefaultRedirectURI() != null) {
            String defaultRedirectURI = userPoolClientType.getDefaultRedirectURI();
            jsonWriter.name("DefaultRedirectURI");
            jsonWriter.value(defaultRedirectURI);
        }
        if (userPoolClientType.getAllowedOAuthFlows() != null) {
            java.util.List<String> allowedOAuthFlows = userPoolClientType.getAllowedOAuthFlows();
            jsonWriter.name("AllowedOAuthFlows");
            jsonWriter.beginArray();
            for (String allowedOAuthFlowsItem : allowedOAuthFlows) {
                if (allowedOAuthFlowsItem != null) {
                    jsonWriter.value(allowedOAuthFlowsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getAllowedOAuthScopes() != null) {
            java.util.List<String> allowedOAuthScopes = userPoolClientType.getAllowedOAuthScopes();
            jsonWriter.name("AllowedOAuthScopes");
            jsonWriter.beginArray();
            for (String allowedOAuthScopesItem : allowedOAuthScopes) {
                if (allowedOAuthScopesItem != null) {
                    jsonWriter.value(allowedOAuthScopesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolClientType.getAllowedOAuthFlowsUserPoolClient() != null) {
            Boolean allowedOAuthFlowsUserPoolClient = userPoolClientType
                    .getAllowedOAuthFlowsUserPoolClient();
            jsonWriter.name("AllowedOAuthFlowsUserPoolClient");
            jsonWriter.value(allowedOAuthFlowsUserPoolClient);
        }
        if (userPoolClientType.getAnalyticsConfiguration() != null) {
            AnalyticsConfigurationType analyticsConfiguration = userPoolClientType
                    .getAnalyticsConfiguration();
            jsonWriter.name("AnalyticsConfiguration");
            AnalyticsConfigurationTypeJsonMarshaller.getInstance().marshall(analyticsConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UserPoolClientTypeJsonMarshaller instance;

    public static UserPoolClientTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientTypeJsonMarshaller();
        return instance;
    }
}
