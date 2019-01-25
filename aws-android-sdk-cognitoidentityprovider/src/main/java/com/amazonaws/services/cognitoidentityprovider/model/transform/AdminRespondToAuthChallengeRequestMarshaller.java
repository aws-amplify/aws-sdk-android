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
 * JSON request marshaller for AdminRespondToAuthChallengeRequest
 */
public class AdminRespondToAuthChallengeRequestMarshaller implements
        Marshaller<Request<AdminRespondToAuthChallengeRequest>, AdminRespondToAuthChallengeRequest> {

    public Request<AdminRespondToAuthChallengeRequest> marshall(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest) {
        if (adminRespondToAuthChallengeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AdminRespondToAuthChallengeRequest)");
        }

        Request<AdminRespondToAuthChallengeRequest> request = new DefaultRequest<AdminRespondToAuthChallengeRequest>(
                adminRespondToAuthChallengeRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.AdminRespondToAuthChallenge";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (adminRespondToAuthChallengeRequest.getUserPoolId() != null) {
                String userPoolId = adminRespondToAuthChallengeRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (adminRespondToAuthChallengeRequest.getClientId() != null) {
                String clientId = adminRespondToAuthChallengeRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (adminRespondToAuthChallengeRequest.getChallengeName() != null) {
                String challengeName = adminRespondToAuthChallengeRequest.getChallengeName();
                jsonWriter.name("ChallengeName");
                jsonWriter.value(challengeName);
            }
            if (adminRespondToAuthChallengeRequest.getChallengeResponses() != null) {
                java.util.Map<String, String> challengeResponses = adminRespondToAuthChallengeRequest
                        .getChallengeResponses();
                jsonWriter.name("ChallengeResponses");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> challengeResponsesEntry : challengeResponses
                        .entrySet()) {
                    String challengeResponsesValue = challengeResponsesEntry.getValue();
                    if (challengeResponsesValue != null) {
                        jsonWriter.name(challengeResponsesEntry.getKey());
                        jsonWriter.value(challengeResponsesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (adminRespondToAuthChallengeRequest.getSession() != null) {
                String session = adminRespondToAuthChallengeRequest.getSession();
                jsonWriter.name("Session");
                jsonWriter.value(session);
            }
            if (adminRespondToAuthChallengeRequest.getAnalyticsMetadata() != null) {
                AnalyticsMetadataType analyticsMetadata = adminRespondToAuthChallengeRequest
                        .getAnalyticsMetadata();
                jsonWriter.name("AnalyticsMetadata");
                AnalyticsMetadataTypeJsonMarshaller.getInstance().marshall(analyticsMetadata,
                        jsonWriter);
            }
            if (adminRespondToAuthChallengeRequest.getContextData() != null) {
                ContextDataType contextData = adminRespondToAuthChallengeRequest.getContextData();
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
