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
 * JSON request marshaller for AdminInitiateAuthRequest
 */
public class AdminInitiateAuthRequestMarshaller implements
        Marshaller<Request<AdminInitiateAuthRequest>, AdminInitiateAuthRequest> {

    public Request<AdminInitiateAuthRequest> marshall(
            AdminInitiateAuthRequest adminInitiateAuthRequest) {
        if (adminInitiateAuthRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AdminInitiateAuthRequest)");
        }

        Request<AdminInitiateAuthRequest> request = new DefaultRequest<AdminInitiateAuthRequest>(
                adminInitiateAuthRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.AdminInitiateAuth";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (adminInitiateAuthRequest.getUserPoolId() != null) {
                String userPoolId = adminInitiateAuthRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (adminInitiateAuthRequest.getClientId() != null) {
                String clientId = adminInitiateAuthRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (adminInitiateAuthRequest.getAuthFlow() != null) {
                String authFlow = adminInitiateAuthRequest.getAuthFlow();
                jsonWriter.name("AuthFlow");
                jsonWriter.value(authFlow);
            }
            if (adminInitiateAuthRequest.getAuthParameters() != null) {
                java.util.Map<String, String> authParameters = adminInitiateAuthRequest
                        .getAuthParameters();
                jsonWriter.name("AuthParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> authParametersEntry : authParameters
                        .entrySet()) {
                    String authParametersValue = authParametersEntry.getValue();
                    if (authParametersValue != null) {
                        jsonWriter.name(authParametersEntry.getKey());
                        jsonWriter.value(authParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (adminInitiateAuthRequest.getClientMetadata() != null) {
                java.util.Map<String, String> clientMetadata = adminInitiateAuthRequest
                        .getClientMetadata();
                jsonWriter.name("ClientMetadata");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> clientMetadataEntry : clientMetadata
                        .entrySet()) {
                    String clientMetadataValue = clientMetadataEntry.getValue();
                    if (clientMetadataValue != null) {
                        jsonWriter.name(clientMetadataEntry.getKey());
                        jsonWriter.value(clientMetadataValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (adminInitiateAuthRequest.getAnalyticsMetadata() != null) {
                AnalyticsMetadataType analyticsMetadata = adminInitiateAuthRequest
                        .getAnalyticsMetadata();
                jsonWriter.name("AnalyticsMetadata");
                AnalyticsMetadataTypeJsonMarshaller.getInstance().marshall(analyticsMetadata,
                        jsonWriter);
            }
            if (adminInitiateAuthRequest.getContextData() != null) {
                ContextDataType contextData = adminInitiateAuthRequest.getContextData();
                jsonWriter.name("ContextData");
                ContextDataTypeJsonMarshaller.getInstance().marshall(contextData, jsonWriter);
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
