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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateUserPoolClientRequest
 */
public class UpdateUserPoolClientRequestMarshaller implements
        Marshaller<Request<UpdateUserPoolClientRequest>, UpdateUserPoolClientRequest> {

    public Request<UpdateUserPoolClientRequest> marshall(
            UpdateUserPoolClientRequest updateUserPoolClientRequest) {
        if (updateUserPoolClientRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateUserPoolClientRequest)");
        }

        Request<UpdateUserPoolClientRequest> request = new DefaultRequest<UpdateUserPoolClientRequest>(
                updateUserPoolClientRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.UpdateUserPoolClient";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateUserPoolClientRequest.getUserPoolId() != null) {
                String userPoolId = updateUserPoolClientRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (updateUserPoolClientRequest.getClientId() != null) {
                String clientId = updateUserPoolClientRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (updateUserPoolClientRequest.getClientName() != null) {
                String clientName = updateUserPoolClientRequest.getClientName();
                jsonWriter.name("ClientName");
                jsonWriter.value(clientName);
            }
            if (updateUserPoolClientRequest.getRefreshTokenValidity() != null) {
                Integer refreshTokenValidity = updateUserPoolClientRequest
                        .getRefreshTokenValidity();
                jsonWriter.name("RefreshTokenValidity");
                jsonWriter.value(refreshTokenValidity);
            }
            if (updateUserPoolClientRequest.getReadAttributes() != null) {
                java.util.List<String> readAttributes = updateUserPoolClientRequest
                        .getReadAttributes();
                jsonWriter.name("ReadAttributes");
                jsonWriter.beginArray();
                for (String readAttributesItem : readAttributes) {
                    if (readAttributesItem != null) {
                        jsonWriter.value(readAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getWriteAttributes() != null) {
                java.util.List<String> writeAttributes = updateUserPoolClientRequest
                        .getWriteAttributes();
                jsonWriter.name("WriteAttributes");
                jsonWriter.beginArray();
                for (String writeAttributesItem : writeAttributes) {
                    if (writeAttributesItem != null) {
                        jsonWriter.value(writeAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getExplicitAuthFlows() != null) {
                java.util.List<String> explicitAuthFlows = updateUserPoolClientRequest
                        .getExplicitAuthFlows();
                jsonWriter.name("ExplicitAuthFlows");
                jsonWriter.beginArray();
                for (String explicitAuthFlowsItem : explicitAuthFlows) {
                    if (explicitAuthFlowsItem != null) {
                        jsonWriter.value(explicitAuthFlowsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getSupportedIdentityProviders() != null) {
                java.util.List<String> supportedIdentityProviders = updateUserPoolClientRequest
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
            if (updateUserPoolClientRequest.getCallbackURLs() != null) {
                java.util.List<String> callbackURLs = updateUserPoolClientRequest.getCallbackURLs();
                jsonWriter.name("CallbackURLs");
                jsonWriter.beginArray();
                for (String callbackURLsItem : callbackURLs) {
                    if (callbackURLsItem != null) {
                        jsonWriter.value(callbackURLsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getLogoutURLs() != null) {
                java.util.List<String> logoutURLs = updateUserPoolClientRequest.getLogoutURLs();
                jsonWriter.name("LogoutURLs");
                jsonWriter.beginArray();
                for (String logoutURLsItem : logoutURLs) {
                    if (logoutURLsItem != null) {
                        jsonWriter.value(logoutURLsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getDefaultRedirectURI() != null) {
                String defaultRedirectURI = updateUserPoolClientRequest.getDefaultRedirectURI();
                jsonWriter.name("DefaultRedirectURI");
                jsonWriter.value(defaultRedirectURI);
            }
            if (updateUserPoolClientRequest.getAllowedOAuthFlows() != null) {
                java.util.List<String> allowedOAuthFlows = updateUserPoolClientRequest
                        .getAllowedOAuthFlows();
                jsonWriter.name("AllowedOAuthFlows");
                jsonWriter.beginArray();
                for (String allowedOAuthFlowsItem : allowedOAuthFlows) {
                    if (allowedOAuthFlowsItem != null) {
                        jsonWriter.value(allowedOAuthFlowsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getAllowedOAuthScopes() != null) {
                java.util.List<String> allowedOAuthScopes = updateUserPoolClientRequest
                        .getAllowedOAuthScopes();
                jsonWriter.name("AllowedOAuthScopes");
                jsonWriter.beginArray();
                for (String allowedOAuthScopesItem : allowedOAuthScopes) {
                    if (allowedOAuthScopesItem != null) {
                        jsonWriter.value(allowedOAuthScopesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolClientRequest.getAllowedOAuthFlowsUserPoolClient() != null) {
                Boolean allowedOAuthFlowsUserPoolClient = updateUserPoolClientRequest
                        .getAllowedOAuthFlowsUserPoolClient();
                jsonWriter.name("AllowedOAuthFlowsUserPoolClient");
                jsonWriter.value(allowedOAuthFlowsUserPoolClient);
            }
            if (updateUserPoolClientRequest.getAnalyticsConfiguration() != null) {
                AnalyticsConfigurationType analyticsConfiguration = updateUserPoolClientRequest
                        .getAnalyticsConfiguration();
                jsonWriter.name("AnalyticsConfiguration");
                AnalyticsConfigurationTypeJsonMarshaller.getInstance().marshall(
                        analyticsConfiguration, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
