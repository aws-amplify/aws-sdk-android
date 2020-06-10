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
 * JSON request marshaller for CreateEnvironmentRequest
 */
public class CreateEnvironmentRequestMarshaller implements
        Marshaller<Request<CreateEnvironmentRequest>, CreateEnvironmentRequest> {

    public Request<CreateEnvironmentRequest> marshall(
            CreateEnvironmentRequest createEnvironmentRequest) {
        if (createEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEnvironmentRequest)");
        }

        Request<CreateEnvironmentRequest> request = new DefaultRequest<CreateEnvironmentRequest>(
                createEnvironmentRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/applications/{ApplicationId}/environments";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (createEnvironmentRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(createEnvironmentRequest.getApplicationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEnvironmentRequest.getName() != null) {
                String name = createEnvironmentRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createEnvironmentRequest.getDescription() != null) {
                String description = createEnvironmentRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createEnvironmentRequest.getMonitors() != null) {
                java.util.List<Monitor> monitors = createEnvironmentRequest.getMonitors();
                jsonWriter.name("Monitors");
                jsonWriter.beginArray();
                for (Monitor monitorsItem : monitors) {
                    if (monitorsItem != null) {
                        MonitorJsonMarshaller.getInstance().marshall(monitorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEnvironmentRequest.getTags() != null) {
                java.util.Map<String, String> tags = createEnvironmentRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
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
