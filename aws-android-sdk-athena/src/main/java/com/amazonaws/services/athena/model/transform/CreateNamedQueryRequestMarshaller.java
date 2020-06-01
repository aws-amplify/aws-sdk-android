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

package com.amazonaws.services.athena.model.transform;

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
import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateNamedQueryRequest
 */
public class CreateNamedQueryRequestMarshaller implements
        Marshaller<Request<CreateNamedQueryRequest>, CreateNamedQueryRequest> {

    public Request<CreateNamedQueryRequest> marshall(CreateNamedQueryRequest createNamedQueryRequest) {
        if (createNamedQueryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateNamedQueryRequest)");
        }

        Request<CreateNamedQueryRequest> request = new DefaultRequest<CreateNamedQueryRequest>(
                createNamedQueryRequest, "AmazonAthena");
        String target = "AmazonAthena.CreateNamedQuery";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createNamedQueryRequest.getName() != null) {
                String name = createNamedQueryRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createNamedQueryRequest.getDescription() != null) {
                String description = createNamedQueryRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createNamedQueryRequest.getDatabase() != null) {
                String database = createNamedQueryRequest.getDatabase();
                jsonWriter.name("Database");
                jsonWriter.value(database);
            }
            if (createNamedQueryRequest.getQueryString() != null) {
                String queryString = createNamedQueryRequest.getQueryString();
                jsonWriter.name("QueryString");
                jsonWriter.value(queryString);
            }
            if (createNamedQueryRequest.getClientRequestToken() != null) {
                String clientRequestToken = createNamedQueryRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createNamedQueryRequest.getWorkGroup() != null) {
                String workGroup = createNamedQueryRequest.getWorkGroup();
                jsonWriter.name("WorkGroup");
                jsonWriter.value(workGroup);
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
