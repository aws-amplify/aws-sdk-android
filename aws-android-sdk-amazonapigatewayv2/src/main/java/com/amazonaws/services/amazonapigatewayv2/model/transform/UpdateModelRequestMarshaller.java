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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

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
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateModelRequest
 */
public class UpdateModelRequestMarshaller implements
        Marshaller<Request<UpdateModelRequest>, UpdateModelRequest> {

    public Request<UpdateModelRequest> marshall(UpdateModelRequest updateModelRequest) {
        if (updateModelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateModelRequest)");
        }

        Request<UpdateModelRequest> request = new DefaultRequest<UpdateModelRequest>(
                updateModelRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/apis/{apiId}/models/{modelId}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (updateModelRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(updateModelRequest.getApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{modelId}",
                (updateModelRequest.getModelId() == null) ? "" : StringUtils
                        .fromString(updateModelRequest.getModelId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateModelRequest.getContentType() != null) {
                String contentType = updateModelRequest.getContentType();
                jsonWriter.name("ContentType");
                jsonWriter.value(contentType);
            }
            if (updateModelRequest.getDescription() != null) {
                String description = updateModelRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateModelRequest.getName() != null) {
                String name = updateModelRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateModelRequest.getSchema() != null) {
                String schema = updateModelRequest.getSchema();
                jsonWriter.name("Schema");
                jsonWriter.value(schema);
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
