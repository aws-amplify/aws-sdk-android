/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateIdentityPoolRequest
 */
public class UpdateIdentityPoolRequestMarshaller implements
        Marshaller<Request<UpdateIdentityPoolRequest>, UpdateIdentityPoolRequest> {

    public Request<UpdateIdentityPoolRequest> marshall(
            UpdateIdentityPoolRequest updateIdentityPoolRequest) {
        if (updateIdentityPoolRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateIdentityPoolRequest)");
        }

        Request<UpdateIdentityPoolRequest> request = new DefaultRequest<UpdateIdentityPoolRequest>(
                updateIdentityPoolRequest, "AmazonCognitoIdentity");
        String target = "AWSCognitoIdentityService.UpdateIdentityPool";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateIdentityPoolRequest.getIdentityPoolId() != null) {
                String identityPoolId = updateIdentityPoolRequest.getIdentityPoolId();
                jsonWriter.name("IdentityPoolId");
                jsonWriter.value(identityPoolId);
            }
            if (updateIdentityPoolRequest.getIdentityPoolName() != null) {
                String identityPoolName = updateIdentityPoolRequest.getIdentityPoolName();
                jsonWriter.name("IdentityPoolName");
                jsonWriter.value(identityPoolName);
            }
            if (updateIdentityPoolRequest.getAllowUnauthenticatedIdentities() != null) {
                Boolean allowUnauthenticatedIdentities = updateIdentityPoolRequest
                        .getAllowUnauthenticatedIdentities();
                jsonWriter.name("AllowUnauthenticatedIdentities");
                jsonWriter.value(allowUnauthenticatedIdentities);
            }
            if (updateIdentityPoolRequest.getAllowClassicFlow() != null) {
                Boolean allowClassicFlow = updateIdentityPoolRequest.getAllowClassicFlow();
                jsonWriter.name("AllowClassicFlow");
                jsonWriter.value(allowClassicFlow);
            }
            if (updateIdentityPoolRequest.getSupportedLoginProviders() != null) {
                java.util.Map<String, String> supportedLoginProviders = updateIdentityPoolRequest
                        .getSupportedLoginProviders();
                jsonWriter.name("SupportedLoginProviders");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> supportedLoginProvidersEntry : supportedLoginProviders
                        .entrySet()) {
                    String supportedLoginProvidersValue = supportedLoginProvidersEntry.getValue();
                    if (supportedLoginProvidersValue != null) {
                        jsonWriter.name(supportedLoginProvidersEntry.getKey());
                        jsonWriter.value(supportedLoginProvidersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateIdentityPoolRequest.getDeveloperProviderName() != null) {
                String developerProviderName = updateIdentityPoolRequest.getDeveloperProviderName();
                jsonWriter.name("DeveloperProviderName");
                jsonWriter.value(developerProviderName);
            }
            if (updateIdentityPoolRequest.getOpenIdConnectProviderARNs() != null) {
                java.util.List<String> openIdConnectProviderARNs = updateIdentityPoolRequest
                        .getOpenIdConnectProviderARNs();
                jsonWriter.name("OpenIdConnectProviderARNs");
                jsonWriter.beginArray();
                for (String openIdConnectProviderARNsItem : openIdConnectProviderARNs) {
                    if (openIdConnectProviderARNsItem != null) {
                        jsonWriter.value(openIdConnectProviderARNsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateIdentityPoolRequest.getCognitoIdentityProviders() != null) {
                java.util.List<CognitoIdentityProvider> cognitoIdentityProviders = updateIdentityPoolRequest
                        .getCognitoIdentityProviders();
                jsonWriter.name("CognitoIdentityProviders");
                jsonWriter.beginArray();
                for (CognitoIdentityProvider cognitoIdentityProvidersItem : cognitoIdentityProviders) {
                    if (cognitoIdentityProvidersItem != null) {
                        CognitoIdentityProviderJsonMarshaller.getInstance().marshall(
                                cognitoIdentityProvidersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateIdentityPoolRequest.getSamlProviderARNs() != null) {
                java.util.List<String> samlProviderARNs = updateIdentityPoolRequest
                        .getSamlProviderARNs();
                jsonWriter.name("SamlProviderARNs");
                jsonWriter.beginArray();
                for (String samlProviderARNsItem : samlProviderARNs) {
                    if (samlProviderARNsItem != null) {
                        jsonWriter.value(samlProviderARNsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateIdentityPoolRequest.getIdentityPoolTags() != null) {
                java.util.Map<String, String> identityPoolTags = updateIdentityPoolRequest
                        .getIdentityPoolTags();
                jsonWriter.name("IdentityPoolTags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> identityPoolTagsEntry : identityPoolTags
                        .entrySet()) {
                    String identityPoolTagsValue = identityPoolTagsEntry.getValue();
                    if (identityPoolTagsValue != null) {
                        jsonWriter.name(identityPoolTagsEntry.getKey());
                        jsonWriter.value(identityPoolTagsValue);
                    }
                }
                jsonWriter.endObject();
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
