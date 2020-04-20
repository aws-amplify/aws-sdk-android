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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

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
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateAuthorizerRequest
 */
public class UpdateAuthorizerRequestMarshaller implements
        Marshaller<Request<UpdateAuthorizerRequest>, UpdateAuthorizerRequest> {

    public Request<UpdateAuthorizerRequest> marshall(UpdateAuthorizerRequest updateAuthorizerRequest) {
        if (updateAuthorizerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAuthorizerRequest)");
        }

        Request<UpdateAuthorizerRequest> request = new DefaultRequest<UpdateAuthorizerRequest>(
                updateAuthorizerRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/authorizers/{authorizerId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateAuthorizerRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateAuthorizerRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{authorizerId}",
                (updateAuthorizerRequest.getAuthorizerId() == null) ? "" : StringUtils
                        .fromString(updateAuthorizerRequest.getAuthorizerId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAuthorizerRequest.getAuthorizerCredentialsArn() != null) {
                String authorizerCredentialsArn = updateAuthorizerRequest
                        .getAuthorizerCredentialsArn();
                jsonWriter.name("AuthorizerCredentialsArn");
                jsonWriter.value(authorizerCredentialsArn);
            }
            if (updateAuthorizerRequest.getAuthorizerResultTtlInSeconds() != null) {
                Integer authorizerResultTtlInSeconds = updateAuthorizerRequest
                        .getAuthorizerResultTtlInSeconds();
                jsonWriter.name("AuthorizerResultTtlInSeconds");
                jsonWriter.value(authorizerResultTtlInSeconds);
            }
            if (updateAuthorizerRequest.getAuthorizerType() != null) {
                String authorizerType = updateAuthorizerRequest.getAuthorizerType();
                jsonWriter.name("AuthorizerType");
                jsonWriter.value(authorizerType);
            }
            if (updateAuthorizerRequest.getAuthorizerUri() != null) {
                String authorizerUri = updateAuthorizerRequest.getAuthorizerUri();
                jsonWriter.name("AuthorizerUri");
                jsonWriter.value(authorizerUri);
            }
            if (updateAuthorizerRequest.getIdentitySource() != null) {
                java.util.List<String> identitySource = updateAuthorizerRequest.getIdentitySource();
                jsonWriter.name("IdentitySource");
                jsonWriter.beginArray();
                for (String identitySourceItem : identitySource) {
                    if (identitySourceItem != null) {
                        jsonWriter.value(identitySourceItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAuthorizerRequest.getIdentityValidationExpression() != null) {
                String identityValidationExpression = updateAuthorizerRequest
                        .getIdentityValidationExpression();
                jsonWriter.name("IdentityValidationExpression");
                jsonWriter.value(identityValidationExpression);
            }
            if (updateAuthorizerRequest.getJwtConfiguration() != null) {
                JWTConfiguration jwtConfiguration = updateAuthorizerRequest.getJwtConfiguration();
                jsonWriter.name("JwtConfiguration");
                JWTConfigurationJsonMarshaller.getInstance().marshall(jwtConfiguration, jsonWriter);
            }
            if (updateAuthorizerRequest.getName() != null) {
                String name = updateAuthorizerRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
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
