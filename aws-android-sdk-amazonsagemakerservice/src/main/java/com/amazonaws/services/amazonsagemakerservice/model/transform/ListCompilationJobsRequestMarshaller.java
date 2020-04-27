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
 * JSON request marshaller for ListCompilationJobsRequest
 */
public class ListCompilationJobsRequestMarshaller implements
        Marshaller<Request<ListCompilationJobsRequest>, ListCompilationJobsRequest> {

    public Request<ListCompilationJobsRequest> marshall(
            ListCompilationJobsRequest listCompilationJobsRequest) {
        if (listCompilationJobsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListCompilationJobsRequest)");
        }

        Request<ListCompilationJobsRequest> request = new DefaultRequest<ListCompilationJobsRequest>(
                listCompilationJobsRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListCompilationJobs";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listCompilationJobsRequest.getNextToken() != null) {
                String nextToken = listCompilationJobsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listCompilationJobsRequest.getMaxResults() != null) {
                Integer maxResults = listCompilationJobsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listCompilationJobsRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listCompilationJobsRequest
                        .getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listCompilationJobsRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listCompilationJobsRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listCompilationJobsRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listCompilationJobsRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listCompilationJobsRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listCompilationJobsRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listCompilationJobsRequest.getNameContains() != null) {
                String nameContains = listCompilationJobsRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listCompilationJobsRequest.getStatusEquals() != null) {
                String statusEquals = listCompilationJobsRequest.getStatusEquals();
                jsonWriter.name("StatusEquals");
                jsonWriter.value(statusEquals);
            }
            if (listCompilationJobsRequest.getSortBy() != null) {
                String sortBy = listCompilationJobsRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listCompilationJobsRequest.getSortOrder() != null) {
                String sortOrder = listCompilationJobsRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
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
