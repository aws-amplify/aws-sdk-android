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
 * JSON request marshaller for GetScreenDataRequest
 */
public class GetScreenDataRequestMarshaller implements
        Marshaller<Request<GetScreenDataRequest>, GetScreenDataRequest> {

    public Request<GetScreenDataRequest> marshall(GetScreenDataRequest getScreenDataRequest) {
        if (getScreenDataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetScreenDataRequest)");
        }

        Request<GetScreenDataRequest> request = new DefaultRequest<GetScreenDataRequest>(
                getScreenDataRequest, "AmazonHoneycode");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/screendata";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getScreenDataRequest.getWorkbookId() != null) {
                String workbookId = getScreenDataRequest.getWorkbookId();
                jsonWriter.name("workbookId");
                jsonWriter.value(workbookId);
            }
            if (getScreenDataRequest.getAppId() != null) {
                String appId = getScreenDataRequest.getAppId();
                jsonWriter.name("appId");
                jsonWriter.value(appId);
            }
            if (getScreenDataRequest.getScreenId() != null) {
                String screenId = getScreenDataRequest.getScreenId();
                jsonWriter.name("screenId");
                jsonWriter.value(screenId);
            }
            if (getScreenDataRequest.getVariables() != null) {
                java.util.Map<String, VariableValue> variables = getScreenDataRequest
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
            if (getScreenDataRequest.getMaxResults() != null) {
                Integer maxResults = getScreenDataRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (getScreenDataRequest.getNextToken() != null) {
                String nextToken = getScreenDataRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
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
