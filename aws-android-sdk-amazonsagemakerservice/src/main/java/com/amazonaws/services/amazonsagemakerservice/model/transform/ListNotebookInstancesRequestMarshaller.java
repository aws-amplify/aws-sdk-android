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
 * JSON request marshaller for ListNotebookInstancesRequest
 */
public class ListNotebookInstancesRequestMarshaller implements
        Marshaller<Request<ListNotebookInstancesRequest>, ListNotebookInstancesRequest> {

    public Request<ListNotebookInstancesRequest> marshall(
            ListNotebookInstancesRequest listNotebookInstancesRequest) {
        if (listNotebookInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListNotebookInstancesRequest)");
        }

        Request<ListNotebookInstancesRequest> request = new DefaultRequest<ListNotebookInstancesRequest>(
                listNotebookInstancesRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListNotebookInstances";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listNotebookInstancesRequest.getNextToken() != null) {
                String nextToken = listNotebookInstancesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listNotebookInstancesRequest.getMaxResults() != null) {
                Integer maxResults = listNotebookInstancesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listNotebookInstancesRequest.getSortBy() != null) {
                String sortBy = listNotebookInstancesRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listNotebookInstancesRequest.getSortOrder() != null) {
                String sortOrder = listNotebookInstancesRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (listNotebookInstancesRequest.getNameContains() != null) {
                String nameContains = listNotebookInstancesRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listNotebookInstancesRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listNotebookInstancesRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listNotebookInstancesRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listNotebookInstancesRequest
                        .getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listNotebookInstancesRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listNotebookInstancesRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listNotebookInstancesRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listNotebookInstancesRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listNotebookInstancesRequest.getStatusEquals() != null) {
                String statusEquals = listNotebookInstancesRequest.getStatusEquals();
                jsonWriter.name("StatusEquals");
                jsonWriter.value(statusEquals);
            }
            if (listNotebookInstancesRequest.getNotebookInstanceLifecycleConfigNameContains() != null) {
                String notebookInstanceLifecycleConfigNameContains = listNotebookInstancesRequest
                        .getNotebookInstanceLifecycleConfigNameContains();
                jsonWriter.name("NotebookInstanceLifecycleConfigNameContains");
                jsonWriter.value(notebookInstanceLifecycleConfigNameContains);
            }
            if (listNotebookInstancesRequest.getDefaultCodeRepositoryContains() != null) {
                String defaultCodeRepositoryContains = listNotebookInstancesRequest
                        .getDefaultCodeRepositoryContains();
                jsonWriter.name("DefaultCodeRepositoryContains");
                jsonWriter.value(defaultCodeRepositoryContains);
            }
            if (listNotebookInstancesRequest.getAdditionalCodeRepositoryEquals() != null) {
                String additionalCodeRepositoryEquals = listNotebookInstancesRequest
                        .getAdditionalCodeRepositoryEquals();
                jsonWriter.name("AdditionalCodeRepositoryEquals");
                jsonWriter.value(additionalCodeRepositoryEquals);
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
