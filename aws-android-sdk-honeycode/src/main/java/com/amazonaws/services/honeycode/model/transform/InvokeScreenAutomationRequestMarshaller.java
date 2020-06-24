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

package com.amazonaws.services.honeycode.model.transform;

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
import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for InvokeScreenAutomationRequest
 */
public class InvokeScreenAutomationRequestMarshaller implements
        Marshaller<Request<InvokeScreenAutomationRequest>, InvokeScreenAutomationRequest> {

    public Request<InvokeScreenAutomationRequest> marshall(
            InvokeScreenAutomationRequest invokeScreenAutomationRequest) {
        if (invokeScreenAutomationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(InvokeScreenAutomationRequest)");
        }

        Request<InvokeScreenAutomationRequest> request = new DefaultRequest<InvokeScreenAutomationRequest>(
                invokeScreenAutomationRequest, "AmazonHoneycode");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/workbooks/{workbookId}/apps/{appId}/screens/{screenId}/automations/{automationId}";
        uriResourcePath = uriResourcePath.replace(
                "{workbookId}",
                (invokeScreenAutomationRequest.getWorkbookId() == null) ? "" : StringUtils
                        .fromString(invokeScreenAutomationRequest.getWorkbookId()));
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (invokeScreenAutomationRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(invokeScreenAutomationRequest.getAppId()));
        uriResourcePath = uriResourcePath.replace(
                "{screenId}",
                (invokeScreenAutomationRequest.getScreenId() == null) ? "" : StringUtils
                        .fromString(invokeScreenAutomationRequest.getScreenId()));
        uriResourcePath = uriResourcePath.replace(
                "{automationId}",
                (invokeScreenAutomationRequest.getScreenAutomationId() == null) ? "" : StringUtils
                        .fromString(invokeScreenAutomationRequest.getScreenAutomationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (invokeScreenAutomationRequest.getVariables() != null) {
                java.util.Map<String, VariableValue> variables = invokeScreenAutomationRequest
                        .getVariables();
                jsonWriter.name("variables");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, VariableValue> variablesEntry : variables
                        .entrySet()) {
                    VariableValue variablesValue = variablesEntry.getValue();
                    if (variablesValue != null) {
                        jsonWriter.name(variablesEntry.getKey());
                        VariableValueJsonMarshaller.getInstance().marshall(variablesValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (invokeScreenAutomationRequest.getRowId() != null) {
                String rowId = invokeScreenAutomationRequest.getRowId();
                jsonWriter.name("rowId");
                jsonWriter.value(rowId);
            }
            if (invokeScreenAutomationRequest.getClientRequestToken() != null) {
                String clientRequestToken = invokeScreenAutomationRequest.getClientRequestToken();
                jsonWriter.name("clientRequestToken");
                jsonWriter.value(clientRequestToken);
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
