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
 * JSON request marshaller for PutMethodResponseRequest
 */
public class PutMethodResponseRequestMarshaller implements
        Marshaller<Request<PutMethodResponseRequest>, PutMethodResponseRequest> {

    public Request<PutMethodResponseRequest> marshall(
            PutMethodResponseRequest putMethodResponseRequest) {
        if (putMethodResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutMethodResponseRequest)");
        }

        Request<PutMethodResponseRequest> request = new DefaultRequest<PutMethodResponseRequest>(
                putMethodResponseRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putMethodResponseRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(putMethodResponseRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putMethodResponseRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(putMethodResponseRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putMethodResponseRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(putMethodResponseRequest.getHttpMethod()));
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (putMethodResponseRequest.getStatusCode() == null) ? "" : StringUtils
                        .fromString(putMethodResponseRequest.getStatusCode()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putMethodResponseRequest.getResponseParameters() != null) {
                java.util.Map<String, Boolean> responseParameters = putMethodResponseRequest
                        .getResponseParameters();
                jsonWriter.name("responseParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Boolean> responseParametersEntry : responseParameters
                        .entrySet()) {
                    Boolean responseParametersValue = responseParametersEntry.getValue();
                    if (responseParametersValue != null) {
                        jsonWriter.name(responseParametersEntry.getKey());
                        jsonWriter.value(responseParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putMethodResponseRequest.getResponseModels() != null) {
                java.util.Map<String, String> responseModels = putMethodResponseRequest
                        .getResponseModels();
                jsonWriter.name("responseModels");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> responseModelsEntry : responseModels
                        .entrySet()) {
                    String responseModelsValue = responseModelsEntry.getValue();
                    if (responseModelsValue != null) {
                        jsonWriter.name(responseModelsEntry.getKey());
                        jsonWriter.value(responseModelsValue);
                    }
                }
                jsonWriter.endObject();
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
