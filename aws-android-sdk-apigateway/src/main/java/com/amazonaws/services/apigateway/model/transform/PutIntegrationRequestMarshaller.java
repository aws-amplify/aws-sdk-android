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
 * JSON request marshaller for PutIntegrationRequest
 */
public class PutIntegrationRequestMarshaller implements
        Marshaller<Request<PutIntegrationRequest>, PutIntegrationRequest> {

    public Request<PutIntegrationRequest> marshall(PutIntegrationRequest putIntegrationRequest) {
        if (putIntegrationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutIntegrationRequest)");
        }

        Request<PutIntegrationRequest> request = new DefaultRequest<PutIntegrationRequest>(
                putIntegrationRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putIntegrationRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(putIntegrationRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putIntegrationRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(putIntegrationRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putIntegrationRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(putIntegrationRequest.getHttpMethod()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putIntegrationRequest.getType() != null) {
                String type = putIntegrationRequest.getType();
                jsonWriter.name("type");
                jsonWriter.value(type);
            }
            if (putIntegrationRequest.getIntegrationHttpMethod() != null) {
                String integrationHttpMethod = putIntegrationRequest.getIntegrationHttpMethod();
                jsonWriter.name("integrationHttpMethod");
                jsonWriter.value(integrationHttpMethod);
            }
            if (putIntegrationRequest.getUri() != null) {
                String uri = putIntegrationRequest.getUri();
                jsonWriter.name("uri");
                jsonWriter.value(uri);
            }
            if (putIntegrationRequest.getConnectionType() != null) {
                String connectionType = putIntegrationRequest.getConnectionType();
                jsonWriter.name("connectionType");
                jsonWriter.value(connectionType);
            }
            if (putIntegrationRequest.getConnectionId() != null) {
                String connectionId = putIntegrationRequest.getConnectionId();
                jsonWriter.name("connectionId");
                jsonWriter.value(connectionId);
            }
            if (putIntegrationRequest.getCredentials() != null) {
                String credentials = putIntegrationRequest.getCredentials();
                jsonWriter.name("credentials");
                jsonWriter.value(credentials);
            }
            if (putIntegrationRequest.getRequestParameters() != null) {
                java.util.Map<String, String> requestParameters = putIntegrationRequest
                        .getRequestParameters();
                jsonWriter.name("requestParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestParametersEntry : requestParameters
                        .entrySet()) {
                    String requestParametersValue = requestParametersEntry.getValue();
                    if (requestParametersValue != null) {
                        jsonWriter.name(requestParametersEntry.getKey());
                        jsonWriter.value(requestParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putIntegrationRequest.getRequestTemplates() != null) {
                java.util.Map<String, String> requestTemplates = putIntegrationRequest
                        .getRequestTemplates();
                jsonWriter.name("requestTemplates");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> requestTemplatesEntry : requestTemplates
                        .entrySet()) {
                    String requestTemplatesValue = requestTemplatesEntry.getValue();
                    if (requestTemplatesValue != null) {
                        jsonWriter.name(requestTemplatesEntry.getKey());
                        jsonWriter.value(requestTemplatesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putIntegrationRequest.getPassthroughBehavior() != null) {
                String passthroughBehavior = putIntegrationRequest.getPassthroughBehavior();
                jsonWriter.name("passthroughBehavior");
                jsonWriter.value(passthroughBehavior);
            }
            if (putIntegrationRequest.getCacheNamespace() != null) {
                String cacheNamespace = putIntegrationRequest.getCacheNamespace();
                jsonWriter.name("cacheNamespace");
                jsonWriter.value(cacheNamespace);
            }
            if (putIntegrationRequest.getCacheKeyParameters() != null) {
                java.util.List<String> cacheKeyParameters = putIntegrationRequest
                        .getCacheKeyParameters();
                jsonWriter.name("cacheKeyParameters");
                jsonWriter.beginArray();
                for (String cacheKeyParametersItem : cacheKeyParameters) {
                    if (cacheKeyParametersItem != null) {
                        jsonWriter.value(cacheKeyParametersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putIntegrationRequest.getContentHandling() != null) {
                String contentHandling = putIntegrationRequest.getContentHandling();
                jsonWriter.name("contentHandling");
                jsonWriter.value(contentHandling);
            }
            if (putIntegrationRequest.getTimeoutInMillis() != null) {
                Integer timeoutInMillis = putIntegrationRequest.getTimeoutInMillis();
                jsonWriter.name("timeoutInMillis");
                jsonWriter.value(timeoutInMillis);
            }
            if (putIntegrationRequest.getTlsConfig() != null) {
                TlsConfig tlsConfig = putIntegrationRequest.getTlsConfig();
                jsonWriter.name("tlsConfig");
                TlsConfigJsonMarshaller.getInstance().marshall(tlsConfig, jsonWriter);
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
