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

package com.amazonaws.services.mediaconvert.model.transform;

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
import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateJobTemplateRequest
 */
public class CreateJobTemplateRequestMarshaller implements
        Marshaller<Request<CreateJobTemplateRequest>, CreateJobTemplateRequest> {

    public Request<CreateJobTemplateRequest> marshall(
            CreateJobTemplateRequest createJobTemplateRequest) {
        if (createJobTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateJobTemplateRequest)");
        }

        Request<CreateJobTemplateRequest> request = new DefaultRequest<CreateJobTemplateRequest>(
                createJobTemplateRequest, "AWSElementalMediaConvert");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2017-08-29/jobTemplates";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobTemplateRequest.getAccelerationSettings() != null) {
                AccelerationSettings accelerationSettings = createJobTemplateRequest
                        .getAccelerationSettings();
                jsonWriter.name("AccelerationSettings");
                AccelerationSettingsJsonMarshaller.getInstance().marshall(accelerationSettings,
                        jsonWriter);
            }
            if (createJobTemplateRequest.getCategory() != null) {
                String category = createJobTemplateRequest.getCategory();
                jsonWriter.name("Category");
                jsonWriter.value(category);
            }
            if (createJobTemplateRequest.getDescription() != null) {
                String description = createJobTemplateRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createJobTemplateRequest.getHopDestinations() != null) {
                java.util.List<HopDestination> hopDestinations = createJobTemplateRequest
                        .getHopDestinations();
                jsonWriter.name("HopDestinations");
                jsonWriter.beginArray();
                for (HopDestination hopDestinationsItem : hopDestinations) {
                    if (hopDestinationsItem != null) {
                        HopDestinationJsonMarshaller.getInstance().marshall(hopDestinationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createJobTemplateRequest.getName() != null) {
                String name = createJobTemplateRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createJobTemplateRequest.getPriority() != null) {
                Integer priority = createJobTemplateRequest.getPriority();
                jsonWriter.name("Priority");
                jsonWriter.value(priority);
            }
            if (createJobTemplateRequest.getQueue() != null) {
                String queue = createJobTemplateRequest.getQueue();
                jsonWriter.name("Queue");
                jsonWriter.value(queue);
            }
            if (createJobTemplateRequest.getSettings() != null) {
                JobTemplateSettings settings = createJobTemplateRequest.getSettings();
                jsonWriter.name("Settings");
                JobTemplateSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (createJobTemplateRequest.getStatusUpdateInterval() != null) {
                String statusUpdateInterval = createJobTemplateRequest.getStatusUpdateInterval();
                jsonWriter.name("StatusUpdateInterval");
                jsonWriter.value(statusUpdateInterval);
            }
            if (createJobTemplateRequest.getTags() != null) {
                java.util.Map<String, String> tags = createJobTemplateRequest.getTags();
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
