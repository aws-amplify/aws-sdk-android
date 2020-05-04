/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateAuthorizerRequest
 */
public class CreateAuthorizerRequestMarshaller implements
        Marshaller<Request<CreateAuthorizerRequest>, CreateAuthorizerRequest> {

    public Request<CreateAuthorizerRequest> marshall(CreateAuthorizerRequest createAuthorizerRequest) {
        if (createAuthorizerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAuthorizerRequest)");
        }

        Request<CreateAuthorizerRequest> request = new DefaultRequest<CreateAuthorizerRequest>(
                createAuthorizerRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/authorizers";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (createAuthorizerRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(createAuthorizerRequest.getRestApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAuthorizerRequest.getName() != null) {
                String name = createAuthorizerRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createAuthorizerRequest.getType() != null) {
                String type = createAuthorizerRequest.getType();
                jsonWriter.name("type");
                jsonWriter.value(type);
            }
            if (createAuthorizerRequest.getProviderARNs() != null) {
                java.util.List<String> providerARNs = createAuthorizerRequest.getProviderARNs();
                jsonWriter.name("providerARNs");
                jsonWriter.beginArray();
                for (String providerARNsItem : providerARNs) {
                    if (providerARNsItem != null) {
                        jsonWriter.value(providerARNsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAuthorizerRequest.getAuthType() != null) {
                String authType = createAuthorizerRequest.getAuthType();
                jsonWriter.name("authType");
                jsonWriter.value(authType);
            }
            if (createAuthorizerRequest.getAuthorizerUri() != null) {
                String authorizerUri = createAuthorizerRequest.getAuthorizerUri();
                jsonWriter.name("authorizerUri");
                jsonWriter.value(authorizerUri);
            }
            if (createAuthorizerRequest.getAuthorizerCredentials() != null) {
                String authorizerCredentials = createAuthorizerRequest.getAuthorizerCredentials();
                jsonWriter.name("authorizerCredentials");
                jsonWriter.value(authorizerCredentials);
            }
            if (createAuthorizerRequest.getIdentitySource() != null) {
                String identitySource = createAuthorizerRequest.getIdentitySource();
                jsonWriter.name("identitySource");
                jsonWriter.value(identitySource);
            }
            if (createAuthorizerRequest.getIdentityValidationExpression() != null) {
                String identityValidationExpression = createAuthorizerRequest
                        .getIdentityValidationExpression();
                jsonWriter.name("identityValidationExpression");
                jsonWriter.value(identityValidationExpression);
            }
            if (createAuthorizerRequest.getAuthorizerResultTtlInSeconds() != null) {
                Integer authorizerResultTtlInSeconds = createAuthorizerRequest
                        .getAuthorizerResultTtlInSeconds();
                jsonWriter.name("authorizerResultTtlInSeconds");
                jsonWriter.value(authorizerResultTtlInSeconds);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
