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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

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
import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListEndpointConfigsRequest
 */
public class ListEndpointConfigsRequestMarshaller implements
        Marshaller<Request<ListEndpointConfigsRequest>, ListEndpointConfigsRequest> {

    public Request<ListEndpointConfigsRequest> marshall(
            ListEndpointConfigsRequest listEndpointConfigsRequest) {
        if (listEndpointConfigsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListEndpointConfigsRequest)");
        }

        Request<ListEndpointConfigsRequest> request = new DefaultRequest<ListEndpointConfigsRequest>(
                listEndpointConfigsRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListEndpointConfigs";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listEndpointConfigsRequest.getSortBy() != null) {
                String sortBy = listEndpointConfigsRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listEndpointConfigsRequest.getSortOrder() != null) {
                String sortOrder = listEndpointConfigsRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (listEndpointConfigsRequest.getNextToken() != null) {
                String nextToken = listEndpointConfigsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listEndpointConfigsRequest.getMaxResults() != null) {
                Integer maxResults = listEndpointConfigsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listEndpointConfigsRequest.getNameContains() != null) {
                String nameContains = listEndpointConfigsRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listEndpointConfigsRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listEndpointConfigsRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listEndpointConfigsRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listEndpointConfigsRequest
                        .getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
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
