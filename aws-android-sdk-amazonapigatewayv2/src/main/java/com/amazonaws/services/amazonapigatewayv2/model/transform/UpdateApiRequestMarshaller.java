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
 * JSON request marshaller for UpdateApiRequest
 */
public class UpdateApiRequestMarshaller implements
        Marshaller<Request<UpdateApiRequest>, UpdateApiRequest> {

    public Request<UpdateApiRequest> marshall(UpdateApiRequest updateApiRequest) {
        if (updateApiRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateApiRequest)");
        }

        Request<UpdateApiRequest> request = new DefaultRequest<UpdateApiRequest>(updateApiRequest,
                "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateApiRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateApiRequest.getApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateApiRequest.getApiKeySelectionExpression() != null) {
                String apiKeySelectionExpression = updateApiRequest.getApiKeySelectionExpression();
                jsonWriter.name("ApiKeySelectionExpression");
                jsonWriter.value(apiKeySelectionExpression);
            }
            if (updateApiRequest.getCorsConfiguration() != null) {
                Cors corsConfiguration = updateApiRequest.getCorsConfiguration();
                jsonWriter.name("CorsConfiguration");
                CorsJsonMarshaller.getInstance().marshall(corsConfiguration, jsonWriter);
            }
            if (updateApiRequest.getCredentialsArn() != null) {
                String credentialsArn = updateApiRequest.getCredentialsArn();
                jsonWriter.name("CredentialsArn");
                jsonWriter.value(credentialsArn);
            }
            if (updateApiRequest.getDescription() != null) {
                String description = updateApiRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateApiRequest.getDisableSchemaValidation() != null) {
                Boolean disableSchemaValidation = updateApiRequest.getDisableSchemaValidation();
                jsonWriter.name("DisableSchemaValidation");
                jsonWriter.value(disableSchemaValidation);
            }
            if (updateApiRequest.getName() != null) {
                String name = updateApiRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateApiRequest.getRouteKey() != null) {
                String routeKey = updateApiRequest.getRouteKey();
                jsonWriter.name("RouteKey");
                jsonWriter.value(routeKey);
            }
            if (updateApiRequest.getRouteSelectionExpression() != null) {
                String routeSelectionExpression = updateApiRequest.getRouteSelectionExpression();
                jsonWriter.name("RouteSelectionExpression");
                jsonWriter.value(routeSelectionExpression);
            }
            if (updateApiRequest.getTarget() != null) {
                String target = updateApiRequest.getTarget();
                jsonWriter.name("Target");
                jsonWriter.value(target);
            }
            if (updateApiRequest.getVersion() != null) {
                String version = updateApiRequest.getVersion();
                jsonWriter.name("Version");
                jsonWriter.value(version);
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
