/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateIdentityProviderRequest
 */
public class CreateIdentityProviderRequestMarshaller implements
        Marshaller<Request<CreateIdentityProviderRequest>, CreateIdentityProviderRequest> {

    public Request<CreateIdentityProviderRequest> marshall(
            CreateIdentityProviderRequest createIdentityProviderRequest) {
        if (createIdentityProviderRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateIdentityProviderRequest)");
        }

        Request<CreateIdentityProviderRequest> request = new DefaultRequest<CreateIdentityProviderRequest>(
                createIdentityProviderRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.CreateIdentityProvider";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createIdentityProviderRequest.getUserPoolId() != null) {
                String userPoolId = createIdentityProviderRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (createIdentityProviderRequest.getProviderName() != null) {
                String providerName = createIdentityProviderRequest.getProviderName();
                jsonWriter.name("ProviderName");
                jsonWriter.value(providerName);
            }
            if (createIdentityProviderRequest.getProviderType() != null) {
                String providerType = createIdentityProviderRequest.getProviderType();
                jsonWriter.name("ProviderType");
                jsonWriter.value(providerType);
            }
            if (createIdentityProviderRequest.getProviderDetails() != null) {
                java.util.Map<String, String> providerDetails = createIdentityProviderRequest
                        .getProviderDetails();
                jsonWriter.name("ProviderDetails");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> providerDetailsEntry : providerDetails
                        .entrySet()) {
                    String providerDetailsValue = providerDetailsEntry.getValue();
                    if (providerDetailsValue != null) {
                        jsonWriter.name(providerDetailsEntry.getKey());
                        jsonWriter.value(providerDetailsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createIdentityProviderRequest.getAttributeMapping() != null) {
                java.util.Map<String, String> attributeMapping = createIdentityProviderRequest
                        .getAttributeMapping();
                jsonWriter.name("AttributeMapping");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> attributeMappingEntry : attributeMapping
                        .entrySet()) {
                    String attributeMappingValue = attributeMappingEntry.getValue();
                    if (attributeMappingValue != null) {
                        jsonWriter.name(attributeMappingEntry.getKey());
                        jsonWriter.value(attributeMappingValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createIdentityProviderRequest.getIdpIdentifiers() != null) {
                java.util.List<String> idpIdentifiers = createIdentityProviderRequest
                        .getIdpIdentifiers();
                jsonWriter.name("IdpIdentifiers");
                jsonWriter.beginArray();
                for (String idpIdentifiersItem : idpIdentifiers) {
                    if (idpIdentifiersItem != null) {
                        jsonWriter.value(idpIdentifiersItem);
                    }
                }
                jsonWriter.endArray();
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
