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

package com.amazonaws.services.appconfig.model.transform;

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
import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateEnvironmentRequest
 */
public class UpdateEnvironmentRequestMarshaller implements
        Marshaller<Request<UpdateEnvironmentRequest>, UpdateEnvironmentRequest> {

    public Request<UpdateEnvironmentRequest> marshall(
            UpdateEnvironmentRequest updateEnvironmentRequest) {
        if (updateEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateEnvironmentRequest)");
        }

        Request<UpdateEnvironmentRequest> request = new DefaultRequest<UpdateEnvironmentRequest>(
                updateEnvironmentRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/applications/{ApplicationId}/environments/{EnvironmentId}";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (updateEnvironmentRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(updateEnvironmentRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{EnvironmentId}",
                (updateEnvironmentRequest.getEnvironmentId() == null) ? "" : StringUtils
                        .fromString(updateEnvironmentRequest.getEnvironmentId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateEnvironmentRequest.getName() != null) {
                String name = updateEnvironmentRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateEnvironmentRequest.getDescription() != null) {
                String description = updateEnvironmentRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateEnvironmentRequest.getMonitors() != null) {
                java.util.List<Monitor> monitors = updateEnvironmentRequest.getMonitors();
                jsonWriter.name("Monitors");
                jsonWriter.beginArray();
                for (Monitor monitorsItem : monitors) {
                    if (monitorsItem != null) {
                        MonitorJsonMarshaller.getInstance().marshall(monitorsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
