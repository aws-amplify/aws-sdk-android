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
 * JSON request marshaller for RespondToAuthChallengeRequest
 */
public class RespondToAuthChallengeRequestMarshaller implements
        Marshaller<Request<RespondToAuthChallengeRequest>, RespondToAuthChallengeRequest> {

    public Request<RespondToAuthChallengeRequest> marshall(
            RespondToAuthChallengeRequest respondToAuthChallengeRequest) {
        if (respondToAuthChallengeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RespondToAuthChallengeRequest)");
        }

        Request<RespondToAuthChallengeRequest> request = new DefaultRequest<RespondToAuthChallengeRequest>(
                respondToAuthChallengeRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.RespondToAuthChallenge";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (respondToAuthChallengeRequest.getClientId() != null) {
                String clientId = respondToAuthChallengeRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (respondToAuthChallengeRequest.getChallengeName() != null) {
                String challengeName = respondToAuthChallengeRequest.getChallengeName();
                jsonWriter.name("ChallengeName");
                jsonWriter.value(challengeName);
            }
            if (respondToAuthChallengeRequest.getSession() != null) {
                String session = respondToAuthChallengeRequest.getSession();
                jsonWriter.name("Session");
                jsonWriter.value(session);
            }
            if (respondToAuthChallengeRequest.getChallengeResponses() != null) {
                java.util.Map<String, String> challengeResponses = respondToAuthChallengeRequest
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
            if (respondToAuthChallengeRequest.getAnalyticsMetadata() != null) {
                AnalyticsMetadataType analyticsMetadata = respondToAuthChallengeRequest
                        .getAnalyticsMetadata();
                jsonWriter.name("AnalyticsMetadata");
                AnalyticsMetadataTypeJsonMarshaller.getInstance().marshall(analyticsMetadata,
                        jsonWriter);
            }
            if (respondToAuthChallengeRequest.getUserContextData() != null) {
                UserContextDataType userContextData = respondToAuthChallengeRequest
                        .getUserContextData();
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
