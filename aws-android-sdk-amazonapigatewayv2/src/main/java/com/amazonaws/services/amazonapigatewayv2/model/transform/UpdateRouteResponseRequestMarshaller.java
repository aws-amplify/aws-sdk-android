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
 * JSON request marshaller for UpdateRouteResponseRequest
 */
public class UpdateRouteResponseRequestMarshaller implements
        Marshaller<Request<UpdateRouteResponseRequest>, UpdateRouteResponseRequest> {

    public Request<UpdateRouteResponseRequest> marshall(
            UpdateRouteResponseRequest updateRouteResponseRequest) {
        if (updateRouteResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRouteResponseRequest)");
        }

        Request<UpdateRouteResponseRequest> request = new DefaultRequest<UpdateRouteResponseRequest>(
                updateRouteResponseRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/routes/{routeId}/routeresponses/{routeResponseId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateRouteResponseRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateRouteResponseRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{routeId}",
                (updateRouteResponseRequest.getRouteId() == null) ? "" : StringUtils
                        .fromString(updateRouteResponseRequest.getRouteId()));
        uriResourcePath = uriResourcePath.replace(
                "{routeResponseId}",
                (updateRouteResponseRequest.getRouteResponseId() == null) ? "" : StringUtils
                        .fromString(updateRouteResponseRequest.getRouteResponseId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRouteResponseRequest.getModelSelectionExpression() != null) {
                String modelSelectionExpression = updateRouteResponseRequest
                        .getModelSelectionExpression();
                jsonWriter.name("ModelSelectionExpression");
                jsonWriter.value(modelSelectionExpression);
            }
            if (updateRouteResponseRequest.getResponseModels() != null) {
                java.util.Map<String, String> responseModels = updateRouteResponseRequest
                        .getResponseModels();
                jsonWriter.name("ResponseModels");
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
            if (updateRouteResponseRequest.getResponseParameters() != null) {
                java.util.Map<String, ParameterConstraints> responseParameters = updateRouteResponseRequest
                        .getResponseParameters();
                jsonWriter.name("ResponseParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, ParameterConstraints> responseParametersEntry : responseParameters
                        .entrySet()) {
                    ParameterConstraints responseParametersValue = responseParametersEntry
                            .getValue();
                    if (responseParametersValue != null) {
                        jsonWriter.name(responseParametersEntry.getKey());
                        ParameterConstraintsJsonMarshaller.getInstance().marshall(
                                responseParametersValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateRouteResponseRequest.getRouteResponseKey() != null) {
                String routeResponseKey = updateRouteResponseRequest.getRouteResponseKey();
                jsonWriter.name("RouteResponseKey");
                jsonWriter.value(routeResponseKey);
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
