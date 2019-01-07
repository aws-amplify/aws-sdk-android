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
 * JSON request marshaller for CreateUserPoolClientRequest
 */
public class CreateUserPoolClientRequestMarshaller implements
        Marshaller<Request<CreateUserPoolClientRequest>, CreateUserPoolClientRequest> {

    public Request<CreateUserPoolClientRequest> marshall(
            CreateUserPoolClientRequest createUserPoolClientRequest) {
        if (createUserPoolClientRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUserPoolClientRequest)");
        }

        Request<CreateUserPoolClientRequest> request = new DefaultRequest<CreateUserPoolClientRequest>(
                createUserPoolClientRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.CreateUserPoolClient";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUserPoolClientRequest.getUserPoolId() != null) {
                String userPoolId = createUserPoolClientRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (createUserPoolClientRequest.getClientName() != null) {
                String clientName = createUserPoolClientRequest.getClientName();
                jsonWriter.name("ClientName");
                jsonWriter.value(clientName);
            }
            if (createUserPoolClientRequest.getGenerateSecret() != null) {
                Boolean generateSecret = createUserPoolClientRequest.getGenerateSecret();
                jsonWriter.name("GenerateSecret");
                jsonWriter.value(generateSecret);
            }
            if (createUserPoolClientRequest.getRefreshTokenValidity() != null) {
                Integer refreshTokenValidity = createUserPoolClientRequest
                        .getRefreshTokenValidity();
                jsonWriter.name("RefreshTokenValidity");
                jsonWriter.value(refreshTokenValidity);
            }
            if (createUserPoolClientRequest.getReadAttributes() != null) {
                java.util.List<String> readAttributes = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getWriteAttributes() != null) {
                java.util.List<String> writeAttributes = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getExplicitAuthFlows() != null) {
                java.util.List<String> explicitAuthFlows = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getSupportedIdentityProviders() != null) {
                java.util.List<String> supportedIdentityProviders = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getCallbackURLs() != null) {
                java.util.List<String> callbackURLs = createUserPoolClientRequest.getCallbackURLs();
                jsonWriter.name("CallbackURLs");
                jsonWriter.beginArray();
                for (String callbackURLsItem : callbackURLs) {
                    if (callbackURLsItem != null) {
                        jsonWriter.value(callbackURLsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolClientRequest.getLogoutURLs() != null) {
                java.util.List<String> logoutURLs = createUserPoolClientRequest.getLogoutURLs();
                jsonWriter.name("LogoutURLs");
                jsonWriter.beginArray();
                for (String logoutURLsItem : logoutURLs) {
                    if (logoutURLsItem != null) {
                        jsonWriter.value(logoutURLsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolClientRequest.getDefaultRedirectURI() != null) {
                String defaultRedirectURI = createUserPoolClientRequest.getDefaultRedirectURI();
                jsonWriter.name("DefaultRedirectURI");
                jsonWriter.value(defaultRedirectURI);
            }
            if (createUserPoolClientRequest.getAllowedOAuthFlows() != null) {
                java.util.List<String> allowedOAuthFlows = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getAllowedOAuthScopes() != null) {
                java.util.List<String> allowedOAuthScopes = createUserPoolClientRequest
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
            if (createUserPoolClientRequest.getAllowedOAuthFlowsUserPoolClient() != null) {
                Boolean allowedOAuthFlowsUserPoolClient = createUserPoolClientRequest
                        .getAllowedOAuthFlowsUserPoolClient();
                jsonWriter.name("AllowedOAuthFlowsUserPoolClient");
                jsonWriter.value(allowedOAuthFlowsUserPoolClient);
            }
            if (createUserPoolClientRequest.getAnalyticsConfiguration() != null) {
                AnalyticsConfigurationType analyticsConfiguration = createUserPoolClientRequest
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
