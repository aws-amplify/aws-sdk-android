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
 * JSON request marshaller for ListModelPackagesRequest
 */
public class ListModelPackagesRequestMarshaller implements
        Marshaller<Request<ListModelPackagesRequest>, ListModelPackagesRequest> {

    public Request<ListModelPackagesRequest> marshall(
            ListModelPackagesRequest listModelPackagesRequest) {
        if (listModelPackagesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListModelPackagesRequest)");
        }

        Request<ListModelPackagesRequest> request = new DefaultRequest<ListModelPackagesRequest>(
                listModelPackagesRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListModelPackages";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listModelPackagesRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listModelPackagesRequest.getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listModelPackagesRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listModelPackagesRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listModelPackagesRequest.getMaxResults() != null) {
                Integer maxResults = listModelPackagesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listModelPackagesRequest.getNameContains() != null) {
                String nameContains = listModelPackagesRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listModelPackagesRequest.getNextToken() != null) {
                String nextToken = listModelPackagesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listModelPackagesRequest.getSortBy() != null) {
                String sortBy = listModelPackagesRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listModelPackagesRequest.getSortOrder() != null) {
                String sortOrder = listModelPackagesRequest.getSortOrder();
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
