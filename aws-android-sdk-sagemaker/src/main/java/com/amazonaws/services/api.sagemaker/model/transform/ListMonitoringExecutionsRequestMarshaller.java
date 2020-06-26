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

package com.amazonaws.services.api.sagemaker.model.transform;

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
import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListMonitoringExecutionsRequest
 */
public class ListMonitoringExecutionsRequestMarshaller implements
        Marshaller<Request<ListMonitoringExecutionsRequest>, ListMonitoringExecutionsRequest> {

    public Request<ListMonitoringExecutionsRequest> marshall(
            ListMonitoringExecutionsRequest listMonitoringExecutionsRequest) {
        if (listMonitoringExecutionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListMonitoringExecutionsRequest)");
        }

        Request<ListMonitoringExecutionsRequest> request = new DefaultRequest<ListMonitoringExecutionsRequest>(
                listMonitoringExecutionsRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListMonitoringExecutions";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listMonitoringExecutionsRequest.getMonitoringScheduleName() != null) {
                String monitoringScheduleName = listMonitoringExecutionsRequest
                        .getMonitoringScheduleName();
                jsonWriter.name("MonitoringScheduleName");
                jsonWriter.value(monitoringScheduleName);
            }
            if (listMonitoringExecutionsRequest.getEndpointName() != null) {
                String endpointName = listMonitoringExecutionsRequest.getEndpointName();
                jsonWriter.name("EndpointName");
                jsonWriter.value(endpointName);
            }
            if (listMonitoringExecutionsRequest.getSortBy() != null) {
                String sortBy = listMonitoringExecutionsRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listMonitoringExecutionsRequest.getSortOrder() != null) {
                String sortOrder = listMonitoringExecutionsRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (listMonitoringExecutionsRequest.getNextToken() != null) {
                String nextToken = listMonitoringExecutionsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listMonitoringExecutionsRequest.getMaxResults() != null) {
                Integer maxResults = listMonitoringExecutionsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listMonitoringExecutionsRequest.getScheduledTimeBefore() != null) {
                java.util.Date scheduledTimeBefore = listMonitoringExecutionsRequest
                        .getScheduledTimeBefore();
                jsonWriter.name("ScheduledTimeBefore");
                jsonWriter.value(scheduledTimeBefore);
            }
            if (listMonitoringExecutionsRequest.getScheduledTimeAfter() != null) {
                java.util.Date scheduledTimeAfter = listMonitoringExecutionsRequest
                        .getScheduledTimeAfter();
                jsonWriter.name("ScheduledTimeAfter");
                jsonWriter.value(scheduledTimeAfter);
            }
            if (listMonitoringExecutionsRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listMonitoringExecutionsRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listMonitoringExecutionsRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listMonitoringExecutionsRequest
                        .getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listMonitoringExecutionsRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listMonitoringExecutionsRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listMonitoringExecutionsRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listMonitoringExecutionsRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listMonitoringExecutionsRequest.getStatusEquals() != null) {
                String statusEquals = listMonitoringExecutionsRequest.getStatusEquals();
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
