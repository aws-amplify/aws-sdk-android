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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

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
import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListImagesRequest
 */
public class ListImagesRequestMarshaller implements
        Marshaller<Request<ListImagesRequest>, ListImagesRequest> {

    public Request<ListImagesRequest> marshall(ListImagesRequest listImagesRequest) {
        if (listImagesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListImagesRequest)");
        }

        Request<ListImagesRequest> request = new DefaultRequest<ListImagesRequest>(
                listImagesRequest, "AmazonEC2ContainerRegistry");
        String target = "AmazonEC2ContainerRegistry_V20150921.ListImages";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listImagesRequest.getRegistryId() != null) {
                String registryId = listImagesRequest.getRegistryId();
                jsonWriter.name("registryId");
                jsonWriter.value(registryId);
            }
            if (listImagesRequest.getRepositoryName() != null) {
                String repositoryName = listImagesRequest.getRepositoryName();
                jsonWriter.name("repositoryName");
                jsonWriter.value(repositoryName);
            }
            if (listImagesRequest.getNextToken() != null) {
                String nextToken = listImagesRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (listImagesRequest.getMaxResults() != null) {
                Integer maxResults = listImagesRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (listImagesRequest.getFilter() != null) {
                ListImagesFilter filter = listImagesRequest.getFilter();
                jsonWriter.name("filter");
                ListImagesFilterJsonMarshaller.getInstance().marshall(filter, jsonWriter);
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
