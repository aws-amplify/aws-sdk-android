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
 * JSON request marshaller for PutMethodRequest
 */
public class PutMethodRequestMarshaller implements
        Marshaller<Request<PutMethodRequest>, PutMethodRequest> {

    public Request<PutMethodRequest> marshall(PutMethodRequest putMethodRequest) {
        if (putMethodRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutMethodRequest)");
        }

        Request<PutMethodRequest> request = new DefaultRequest<PutMethodRequest>(putMethodRequest,
                "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putMethodRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putMethodRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putMethodRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getHttpMethod()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putMethodRequest.getAuthorizationType() != null) {
                String authorizationType = putMethodRequest.getAuthorizationType();
                jsonWriter.name("authorizationType");
                jsonWriter.value(authorizationType);
            }
            if (putMethodRequest.getAuthorizerId() != null) {
                String authorizerId = putMethodRequest.getAuthorizerId();
                jsonWriter.name("authorizerId");
                jsonWriter.value(authorizerId);
            }
            if (putMethodRequest.getApiKeyRequired() != null) {
                Boolean apiKeyRequired = putMethodRequest.getApiKeyRequired();
                jsonWriter.name("apiKeyRequired");
                jsonWriter.value(apiKeyRequired);
            }
            if (putMethodRequest.getOperationName() != null) {
                String operationName = putMethodRequest.getOperationName();
                jsonWriter.name("operationName");
                jsonWriter.value(operationName);
            }
            if (putMethodRequest.getRequestParameters() != null) {
                java.util.Map<String, Boolean> requestParameters = putMethodRequest
                        .getRequestParameters();
                jsonWriter.name("requestParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Boolean> requestParametersEntry : requestParameters
                        .entrySet()) {
                    Boolean requestParametersValue = requestParametersEntry.getValue();
                    if (requestParametersValue != null) {
                        jsonWriter.name(requestParametersEntry.getKey());
                        jsonWriter.value(requestParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putMethodRequest.getRequestModels() != null) {
                java.util.Map<String, String> requestModels = putMethodRequest.getRequestModels();
                jsonWriter.name("requestModels");
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
            if (putMethodRequest.getRequestValidatorId() != null) {
                String requestValidatorId = putMethodRequest.getRequestValidatorId();
                jsonWriter.name("requestValidatorId");
                jsonWriter.value(requestValidatorId);
            }
            if (putMethodRequest.getAuthorizationScopes() != null) {
                java.util.List<String> authorizationScopes = putMethodRequest
                        .getAuthorizationScopes();
                jsonWriter.name("authorizationScopes");
                jsonWriter.beginArray();
                for (String authorizationScopesItem : authorizationScopes) {
                    if (authorizationScopesItem != null) {
                        jsonWriter.value(authorizationScopesItem);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
