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
 * JSON request marshaller for CreateRouteRequest
 */
public class CreateRouteRequestMarshaller implements
        Marshaller<Request<CreateRouteRequest>, CreateRouteRequest> {

    public Request<CreateRouteRequest> marshall(CreateRouteRequest createRouteRequest) {
        if (createRouteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRouteRequest)");
        }

        Request<CreateRouteRequest> request = new DefaultRequest<CreateRouteRequest>(
                createRouteRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v2/apis/{apiId}/routes";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (createRouteRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(createRouteRequest.getApiId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRouteRequest.getApiKeyRequired() != null) {
                Boolean apiKeyRequired = createRouteRequest.getApiKeyRequired();
                jsonWriter.name("ApiKeyRequired");
                jsonWriter.value(apiKeyRequired);
            }
            if (createRouteRequest.getAuthorizationScopes() != null) {
                java.util.List<String> authorizationScopes = createRouteRequest
                        .getAuthorizationScopes();
                jsonWriter.name("AuthorizationScopes");
                jsonWriter.beginArray();
                for (String authorizationScopesItem : authorizationScopes) {
                    if (authorizationScopesItem != null) {
                        jsonWriter.value(authorizationScopesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createRouteRequest.getAuthorizationType() != null) {
                String authorizationType = createRouteRequest.getAuthorizationType();
                jsonWriter.name("AuthorizationType");
                jsonWriter.value(authorizationType);
            }
            if (createRouteRequest.getAuthorizerId() != null) {
                String authorizerId = createRouteRequest.getAuthorizerId();
                jsonWriter.name("AuthorizerId");
                jsonWriter.value(authorizerId);
            }
            if (createRouteRequest.getModelSelectionExpression() != null) {
                String modelSelectionExpression = createRouteRequest.getModelSelectionExpression();
                jsonWriter.name("ModelSelectionExpression");
                jsonWriter.value(modelSelectionExpression);
            }
            if (createRouteRequest.getOperationName() != null) {
                String operationName = createRouteRequest.getOperationName();
                jsonWriter.name("OperationName");
                jsonWriter.value(operationName);
            }
            if (createRouteRequest.getRequestModels() != null) {
                java.util.Map<String, String> requestModels = createRouteRequest.getRequestModels();
                jsonWriter.name("RequestModels");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestModelsEntry : requestModels
                        .entrySet()) {
                    String requestModelsValue = requestModelsEntry.getValue();
                    if (requestModelsValue != null) {
                        jsonWriter.name(requestModelsEntry.getKey());
                        jsonWriter.value(requestModelsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createRouteRequest.getRequestParameters() != null) {
                java.util.Map<String, ParameterConstraints> requestParameters = createRouteRequest
                        .getRequestParameters();
                jsonWriter.name("RequestParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, ParameterConstraints> requestParametersEntry : requestParameters
                        .entrySet()) {
                    ParameterConstraints requestParametersValue = requestParametersEntry.getValue();
                    if (requestParametersValue != null) {
                        jsonWriter.name(requestParametersEntry.getKey());
                        ParameterConstraintsJsonMarshaller.getInstance().marshall(
                                requestParametersValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createRouteRequest.getRouteKey() != null) {
                String routeKey = createRouteRequest.getRouteKey();
                jsonWriter.name("RouteKey");
                jsonWriter.value(routeKey);
            }
            if (createRouteRequest.getRouteResponseSelectionExpression() != null) {
                String routeResponseSelectionExpression = createRouteRequest
                        .getRouteResponseSelectionExpression();
                jsonWriter.name("RouteResponseSelectionExpression");
                jsonWriter.value(routeResponseSelectionExpression);
            }
            if (createRouteRequest.getTarget() != null) {
                String target = createRouteRequest.getTarget();
                jsonWriter.name("Target");
                jsonWriter.value(target);
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
