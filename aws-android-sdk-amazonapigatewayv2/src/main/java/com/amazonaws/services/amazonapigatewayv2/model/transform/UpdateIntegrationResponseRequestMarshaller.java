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
 * JSON request marshaller for UpdateIntegrationResponseRequest
 */
public class UpdateIntegrationResponseRequestMarshaller implements
        Marshaller<Request<UpdateIntegrationResponseRequest>, UpdateIntegrationResponseRequest> {

    public Request<UpdateIntegrationResponseRequest> marshall(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest) {
        if (updateIntegrationResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateIntegrationResponseRequest)");
        }

        Request<UpdateIntegrationResponseRequest> request = new DefaultRequest<UpdateIntegrationResponseRequest>(
                updateIntegrationResponseRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/integrations/{integrationId}/integrationresponses/{integrationResponseId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateIntegrationResponseRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateIntegrationResponseRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{integrationId}",
                (updateIntegrationResponseRequest.getIntegrationId() == null) ? "" : StringUtils
                        .fromString(updateIntegrationResponseRequest.getIntegrationId()));
        uriResourcePath = uriResourcePath.replace(
                "{integrationResponseId}",
                (updateIntegrationResponseRequest.getIntegrationResponseId() == null) ? ""
                        : StringUtils.fromString(updateIntegrationResponseRequest
                                .getIntegrationResponseId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateIntegrationResponseRequest.getContentHandlingStrategy() != null) {
                String contentHandlingStrategy = updateIntegrationResponseRequest
                        .getContentHandlingStrategy();
                jsonWriter.name("ContentHandlingStrategy");
                jsonWriter.value(contentHandlingStrategy);
            }
            if (updateIntegrationResponseRequest.getIntegrationResponseKey() != null) {
                String integrationResponseKey = updateIntegrationResponseRequest
                        .getIntegrationResponseKey();
                jsonWriter.name("IntegrationResponseKey");
                jsonWriter.value(integrationResponseKey);
            }
            if (updateIntegrationResponseRequest.getResponseParameters() != null) {
                java.util.Map<String, String> responseParameters = updateIntegrationResponseRequest
                        .getResponseParameters();
                jsonWriter.name("ResponseParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> responseParametersEntry : responseParameters
                        .entrySet()) {
                    String responseParametersValue = responseParametersEntry.getValue();
                    if (responseParametersValue != null) {
                        jsonWriter.name(responseParametersEntry.getKey());
                        jsonWriter.value(responseParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateIntegrationResponseRequest.getResponseTemplates() != null) {
                java.util.Map<String, String> responseTemplates = updateIntegrationResponseRequest
                        .getResponseTemplates();
                jsonWriter.name("ResponseTemplates");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> responseTemplatesEntry : responseTemplates
                        .entrySet()) {
                    String responseTemplatesValue = responseTemplatesEntry.getValue();
                    if (responseTemplatesValue != null) {
                        jsonWriter.name(responseTemplatesEntry.getKey());
                        jsonWriter.value(responseTemplatesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateIntegrationResponseRequest.getTemplateSelectionExpression() != null) {
                String templateSelectionExpression = updateIntegrationResponseRequest
                        .getTemplateSelectionExpression();
                jsonWriter.name("TemplateSelectionExpression");
                jsonWriter.value(templateSelectionExpression);
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
