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
 * JSON request marshaller for SignUpRequest
 */
public class SignUpRequestMarshaller implements Marshaller<Request<SignUpRequest>, SignUpRequest> {

    public Request<SignUpRequest> marshall(SignUpRequest signUpRequest) {
        if (signUpRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SignUpRequest)");
        }

        Request<SignUpRequest> request = new DefaultRequest<SignUpRequest>(signUpRequest,
                "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.SignUp";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (signUpRequest.getClientId() != null) {
                String clientId = signUpRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (signUpRequest.getSecretHash() != null) {
                String secretHash = signUpRequest.getSecretHash();
                jsonWriter.name("SecretHash");
                jsonWriter.value(secretHash);
            }
            if (signUpRequest.getUsername() != null) {
                String username = signUpRequest.getUsername();
                jsonWriter.name("Username");
                jsonWriter.value(username);
            }
            if (signUpRequest.getPassword() != null) {
                String password = signUpRequest.getPassword();
                jsonWriter.name("Password");
                jsonWriter.value(password);
            }
            if (signUpRequest.getUserAttributes() != null) {
                java.util.List<AttributeType> userAttributes = signUpRequest.getUserAttributes();
                jsonWriter.name("UserAttributes");
                jsonWriter.beginArray();
                for (AttributeType userAttributesItem : userAttributes) {
                    if (userAttributesItem != null) {
                        AttributeTypeJsonMarshaller.getInstance().marshall(userAttributesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (signUpRequest.getValidationData() != null) {
                java.util.List<AttributeType> validationData = signUpRequest.getValidationData();
                jsonWriter.name("ValidationData");
                jsonWriter.beginArray();
                for (AttributeType validationDataItem : validationData) {
                    if (validationDataItem != null) {
                        AttributeTypeJsonMarshaller.getInstance().marshall(validationDataItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (signUpRequest.getAnalyticsMetadata() != null) {
                AnalyticsMetadataType analyticsMetadata = signUpRequest.getAnalyticsMetadata();
                jsonWriter.name("AnalyticsMetadata");
                AnalyticsMetadataTypeJsonMarshaller.getInstance().marshall(analyticsMetadata,
                        jsonWriter);
            }
            if (signUpRequest.getUserContextData() != null) {
                UserContextDataType userContextData = signUpRequest.getUserContextData();
                jsonWriter.name("UserContextData");
                UserContextDataTypeJsonMarshaller.getInstance().marshall(userContextData,
                        jsonWriter);
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
