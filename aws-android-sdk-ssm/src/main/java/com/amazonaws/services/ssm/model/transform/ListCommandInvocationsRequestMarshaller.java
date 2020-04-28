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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListCommandInvocationsRequest
 */
public class ListCommandInvocationsRequestMarshaller implements
        Marshaller<Request<ListCommandInvocationsRequest>, ListCommandInvocationsRequest> {

    public Request<ListCommandInvocationsRequest> marshall(
            ListCommandInvocationsRequest listCommandInvocationsRequest) {
        if (listCommandInvocationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListCommandInvocationsRequest)");
        }

        Request<ListCommandInvocationsRequest> request = new DefaultRequest<ListCommandInvocationsRequest>(
                listCommandInvocationsRequest, "AmazonSSM");
        String target = "AmazonSSM.ListCommandInvocations";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listCommandInvocationsRequest.getCommandId() != null) {
                String commandId = listCommandInvocationsRequest.getCommandId();
                jsonWriter.name("CommandId");
                jsonWriter.value(commandId);
            }
            if (listCommandInvocationsRequest.getInstanceId() != null) {
                String instanceId = listCommandInvocationsRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (listCommandInvocationsRequest.getMaxResults() != null) {
                Integer maxResults = listCommandInvocationsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listCommandInvocationsRequest.getNextToken() != null) {
                String nextToken = listCommandInvocationsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listCommandInvocationsRequest.getFilters() != null) {
                java.util.List<CommandFilter> filters = listCommandInvocationsRequest.getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (CommandFilter filtersItem : filters) {
                    if (filtersItem != null) {
                        CommandFilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (listCommandInvocationsRequest.getDetails() != null) {
                Boolean details = listCommandInvocationsRequest.getDetails();
                jsonWriter.name("Details");
                jsonWriter.value(details);
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
