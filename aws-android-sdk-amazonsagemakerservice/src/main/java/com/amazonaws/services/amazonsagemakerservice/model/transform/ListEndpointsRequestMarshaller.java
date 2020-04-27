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
 * JSON request marshaller for ListEndpointsRequest
 */
public class ListEndpointsRequestMarshaller implements
        Marshaller<Request<ListEndpointsRequest>, ListEndpointsRequest> {

    public Request<ListEndpointsRequest> marshall(ListEndpointsRequest listEndpointsRequest) {
        if (listEndpointsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListEndpointsRequest)");
        }

        Request<ListEndpointsRequest> request = new DefaultRequest<ListEndpointsRequest>(
                listEndpointsRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListEndpoints";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listEndpointsRequest.getSortBy() != null) {
                String sortBy = listEndpointsRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listEndpointsRequest.getSortOrder() != null) {
                String sortOrder = listEndpointsRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (listEndpointsRequest.getNextToken() != null) {
                String nextToken = listEndpointsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listEndpointsRequest.getMaxResults() != null) {
                Integer maxResults = listEndpointsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listEndpointsRequest.getNameContains() != null) {
                String nameContains = listEndpointsRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listEndpointsRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listEndpointsRequest.getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listEndpointsRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listEndpointsRequest.getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listEndpointsRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listEndpointsRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listEndpointsRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listEndpointsRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listEndpointsRequest.getStatusEquals() != null) {
                String statusEquals = listEndpointsRequest.getStatusEquals();
                jsonWriter.name("StatusEquals");
                jsonWriter.value(statusEquals);
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
