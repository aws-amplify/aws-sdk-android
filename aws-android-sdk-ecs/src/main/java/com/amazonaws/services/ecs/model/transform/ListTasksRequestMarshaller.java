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

package com.amazonaws.services.ecs.model.transform;

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
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListTasksRequest
 */
public class ListTasksRequestMarshaller implements
        Marshaller<Request<ListTasksRequest>, ListTasksRequest> {

    public Request<ListTasksRequest> marshall(ListTasksRequest listTasksRequest) {
        if (listTasksRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListTasksRequest)");
        }

        Request<ListTasksRequest> request = new DefaultRequest<ListTasksRequest>(listTasksRequest,
                "AmazonEC2ContainerService");
        String target = "AmazonEC2ContainerServiceV20141113.ListTasks";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listTasksRequest.getCluster() != null) {
                String cluster = listTasksRequest.getCluster();
                jsonWriter.name("cluster");
                jsonWriter.value(cluster);
            }
            if (listTasksRequest.getContainerInstance() != null) {
                String containerInstance = listTasksRequest.getContainerInstance();
                jsonWriter.name("containerInstance");
                jsonWriter.value(containerInstance);
            }
            if (listTasksRequest.getFamily() != null) {
                String family = listTasksRequest.getFamily();
                jsonWriter.name("family");
                jsonWriter.value(family);
            }
            if (listTasksRequest.getNextToken() != null) {
                String nextToken = listTasksRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (listTasksRequest.getMaxResults() != null) {
                Integer maxResults = listTasksRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (listTasksRequest.getStartedBy() != null) {
                String startedBy = listTasksRequest.getStartedBy();
                jsonWriter.name("startedBy");
                jsonWriter.value(startedBy);
            }
            if (listTasksRequest.getServiceName() != null) {
                String serviceName = listTasksRequest.getServiceName();
                jsonWriter.name("serviceName");
                jsonWriter.value(serviceName);
            }
            if (listTasksRequest.getDesiredStatus() != null) {
                String desiredStatus = listTasksRequest.getDesiredStatus();
                jsonWriter.name("desiredStatus");
                jsonWriter.value(desiredStatus);
            }
            if (listTasksRequest.getLaunchType() != null) {
                String launchType = listTasksRequest.getLaunchType();
                jsonWriter.name("launchType");
                jsonWriter.value(launchType);
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
