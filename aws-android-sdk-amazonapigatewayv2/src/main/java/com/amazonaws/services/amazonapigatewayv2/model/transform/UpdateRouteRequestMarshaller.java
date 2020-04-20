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
 * JSON request marshaller for UpdateRouteRequest
 */
public class UpdateRouteRequestMarshaller implements
        Marshaller<Request<UpdateRouteRequest>, UpdateRouteRequest> {

    public Request<UpdateRouteRequest> marshall(UpdateRouteRequest updateRouteRequest) {
        if (updateRouteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRouteRequest)");
        }

        Request<UpdateRouteRequest> request = new DefaultRequest<UpdateRouteRequest>(
                updateRouteRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/routes/{routeId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateRouteRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateRouteRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{routeId}",
                (updateRouteRequest.getRouteId() == null) ? "" : StringUtils
                        .fromString(updateRouteRequest.getRouteId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRouteRequest.getApiKeyRequired() != null) {
                Boolean apiKeyRequired = updateRouteRequest.getApiKeyRequired();
                jsonWriter.name("ApiKeyRequired");
                jsonWriter.value(apiKeyRequired);
            }
            if (updateRouteRequest.getAuthorizationScopes() != null) {
                java.util.List<String> authorizationScopes = updateRouteRequest
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
            if (updateRouteRequest.getAuthorizationType() != null) {
                String authorizationType = updateRouteRequest.getAuthorizationType();
                jsonWriter.name("AuthorizationType");
                jsonWriter.value(authorizationType);
            }
            if (updateRouteRequest.getAuthorizerId() != null) {
                String authorizerId = updateRouteRequest.getAuthorizerId();
                jsonWriter.name("AuthorizerId");
                jsonWriter.value(authorizerId);
            }
            if (updateRouteRequest.getModelSelectionExpression() != null) {
                String modelSelectionExpression = updateRouteRequest.getModelSelectionExpression();
                jsonWriter.name("ModelSelectionExpression");
                jsonWriter.value(modelSelectionExpression);
            }
            if (updateRouteRequest.getOperationName() != null) {
                String operationName = updateRouteRequest.getOperationName();
                jsonWriter.name("OperationName");
                jsonWriter.value(operationName);
            }
            if (updateRouteRequest.getRequestModels() != null) {
                java.util.Map<String, String> requestModels = updateRouteRequest.getRequestModels();
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
            if (updateRouteRequest.getRequestParameters() != null) {
                java.util.Map<String, ParameterConstraints> requestParameters = updateRouteRequest
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
            if (updateRouteRequest.getRouteKey() != null) {
                String routeKey = updateRouteRequest.getRouteKey();
                jsonWriter.name("RouteKey");
                jsonWriter.value(routeKey);
            }
            if (updateRouteRequest.getRouteResponseSelectionExpression() != null) {
                String routeResponseSelectionExpression = updateRouteRequest
                        .getRouteResponseSelectionExpression();
                jsonWriter.name("RouteResponseSelectionExpression");
                jsonWriter.value(routeResponseSelectionExpression);
            }
            if (updateRouteRequest.getTarget() != null) {
                String target = updateRouteRequest.getTarget();
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
