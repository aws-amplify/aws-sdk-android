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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateMethodResponseRequest
 */
public class UpdateMethodResponseRequestMarshaller implements
        Marshaller<Request<UpdateMethodResponseRequest>, UpdateMethodResponseRequest> {

    public Request<UpdateMethodResponseRequest> marshall(
            UpdateMethodResponseRequest updateMethodResponseRequest) {
        if (updateMethodResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateMethodResponseRequest)");
        }

        Request<UpdateMethodResponseRequest> request = new DefaultRequest<UpdateMethodResponseRequest>(
                updateMethodResponseRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (updateMethodResponseRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(updateMethodResponseRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (updateMethodResponseRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(updateMethodResponseRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (updateMethodResponseRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(updateMethodResponseRequest.getHttpMethod()));
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (updateMethodResponseRequest.getStatusCode() == null) ? "" : StringUtils
                        .fromString(updateMethodResponseRequest.getStatusCode()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateMethodResponseRequest.getPatchOperations() != null) {
                java.util.List<PatchOperation> patchOperations = updateMethodResponseRequest
                        .getPatchOperations();
                jsonWriter.name("patchOperations");
                jsonWriter.beginArray();
                for (PatchOperation patchOperationsItem : patchOperations) {
                    if (patchOperationsItem != null) {
                        PatchOperationJsonMarshaller.getInstance().marshall(patchOperationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
